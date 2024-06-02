package main;
// @author armando

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class PracticaEmpresarial extends TrabajoDeGrado {

    String nombreEmpresa;
    String direccionEmpresa;
    String telefono;
    String correo;
    String delegadoEmpresa;

    public PracticaEmpresarial() {
    }
    
    

    public PracticaEmpresarial(String nombreEmpresa, String direccionEmpresa, String telefono, String correo, String delegadoEmpresa, String titulo, String fecha_creacion, String problema, String justificacion, String objetivos_generales, String objetivos_especificos) {
        super(titulo, fecha_creacion, problema, justificacion, objetivos_generales, objetivos_especificos);
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefono = telefono;
        this.correo = correo;
        this.delegadoEmpresa = delegadoEmpresa;
    }

    public PracticaEmpresarial(String nombreEmpresa, String direccionEmpresa, String telefono, String correo, String delegadoEmpresa, String titulo, String problema, String justificacion, String objetivos_generales, String objetivos_especificos) {
        super(titulo, problema, justificacion, objetivos_generales, objetivos_especificos);
        this.nombreEmpresa = nombreEmpresa;
        this.direccionEmpresa = direccionEmpresa;
        this.telefono = telefono;
        this.correo = correo;
        this.delegadoEmpresa = delegadoEmpresa;
    }

    @Override
    public void crear(String ccIntegranteOne) {
        String sqlInsertTrabajo = """
        INSERT INTO trabajo_de_grado (titulo, fecha_creacion, id_tipo_trabajo) VALUES (?, ?, 3)
    """;

        String sqlInsertPractica = """
        INSERT INTO practica_empresarial (titulo, id_alumno, problema, justificacion, objetivos_especificos, objetivos_generales, nombre_empresa, direccion, nombre_delegado, correo, telefono, id_trabajo_grado)
        VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?, (SELECT id FROM trabajo_de_grado WHERE estado = true ORDER BY id DESC LIMIT 1))
    """;

        String sqlSelectUsuario = "SELECT id FROM usuario WHERE cedula = ? AND estado = true AND id_rol = 2";

        try (Connection conn = openConexion(); PreparedStatement psTrabajo = conn.prepareStatement(sqlInsertTrabajo); PreparedStatement psPractica = conn.prepareStatement(sqlInsertPractica); PreparedStatement psSelectUsuario = conn.prepareStatement(sqlSelectUsuario)) {

            // Insertar trabajo_de_grado
            psTrabajo.setString(1, titulo);
            psTrabajo.setString(2, fecha_creacion);
            int rowsInserted = psTrabajo.executeUpdate();

            if (rowsInserted > 0) {
                // Preparar desarrollo_tecnologico
                psPractica.setString(1, titulo);
                psPractica.setInt(2, getIdUsuario(psSelectUsuario, ccIntegranteOne));
                psPractica.setString(3, problema);
                psPractica.setString(4, justificacion);
                psPractica.setString(5, objetivos_especificos);
                psPractica.setString(6, objetivos_generales);
                psPractica.setString(7, nombreEmpresa);
                psPractica.setString(8, direccionEmpresa);
                psPractica.setString(9, delegadoEmpresa);
                psPractica.setString(10, correo);
                psPractica.setString(11, telefono);

                int desarrolloInserted = psPractica.executeUpdate();

                if (desarrolloInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Registrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Error al registrar trabajo de grado");
            }

        } catch (SQLException e) {
            e.printStackTrace();  // Imprimir la excepción para depuración
            JOptionPane.showMessageDialog(null, "Error en la base de datos: " + e.getMessage());
        } finally {
            closeConexion();
        }
    }

    private int getIdUsuario(PreparedStatement ps, String cedula) throws SQLException {
        if (cedula == null || cedula.isEmpty()) {
            return 0;
        }

        ps.setString(1, cedula);
        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("id");
            }
        }

        return 0;
    }

    @Override
    public void modificar(int id_trabajo) {
        try {
            String sql = """
                         UPDATE practica_empresarial i
                         INNER JOIN trabajo_de_grado t ON i.id_trabajo_grado = t.id
                         SET i.titulo = ?, i.problema = ?, i.justificacion = ?, i.objetivos_generales = ?, i.objetivos_especificos = ?, t.titulo = ?, i.correo = ?, i.telefono = ?
                         WHERE i.id_trabajo_grado = ?;
""";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, titulo);
            ps.setString(2, problema);
            ps.setString(3, justificacion);
            ps.setString(4, objetivos_generales);
            ps.setString(5, objetivos_especificos);
            ps.setString(6, titulo); // Este valor actualiza tanto i.titulo como t.titulo
            ps.setString(7, correo);
            ps.setString(8, telefono);
            ps.setInt(9, id_trabajo);
            ps.execute();
            JOptionPane.showMessageDialog(null, "NO olvides selecionar el tipo de proyecto");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
        } finally {
            closeConexion();
        }
    }
    
    private File getRutaPdf() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF", "pdf");
        fileChooser.setFileFilter(filter); // solo mostrara PDF
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null;
        }
    }

    public void subirPdf(int id_trabajo) {
        FileInputStream inputStream = null;

        try {
            String sql = "UPDATE practica_empresarial SET adjunto = ? WHERE id_trabajo_grado = ?";
            PreparedStatement ps = openConexion().prepareStatement(sql);

            File pdfFile = getRutaPdf();

            if (pdfFile != null && pdfFile.exists()) {
                inputStream = new FileInputStream(pdfFile);
                ps.setBlob(1, inputStream);
                ps.setInt(2, id_trabajo);

                ps.execute();
                JOptionPane.showMessageDialog(null, "Archivo subido exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se cargó ningún archivo");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProyectoInvestigacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Logger.getLogger(ProyectoInvestigacion.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            closeConexion();
        }
    }
}
