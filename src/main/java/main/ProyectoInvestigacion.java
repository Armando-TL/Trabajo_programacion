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

public class ProyectoInvestigacion extends TrabajoDeGrado {

    String ccIntegranteTwo;
    String ccIntegranteThree;

    public ProyectoInvestigacion() {
    }

    public ProyectoInvestigacion(String ccIntegranteTwo, String ccIntegranteThree, String titulo, String fecha_creacion, String problema, String justificacion, String objetivos_generales, String objetivos_especificos) {
        super(titulo, fecha_creacion, problema, justificacion, objetivos_generales, objetivos_especificos);
        this.ccIntegranteTwo = ccIntegranteTwo;
        this.ccIntegranteThree = ccIntegranteThree;
    }

    public ProyectoInvestigacion(String titulo, String problema, String justificacion, String objetivos_generales, String objetivos_especificos) {
        super(titulo, problema, justificacion, objetivos_generales, objetivos_especificos);
    }

    @Override
    public void crear(String ccIntegranteOne) {
        String sqlInsertTrabajo = """
        INSERT INTO trabajo_de_grado (titulo, fecha_creacion, id_tipo_trabajo) VALUES (?, ?, 2)
    """;

        String sqlInsertInvestigacion = """
        INSERT INTO investigacion (titulo, id_alumnoOne, id_alumnoTwo, id_alumnoThree, problema, justificacion, objetivos_especificos, objetivos_generales, id_trabajo_grado)
        VALUES (?, ?, ?, ?, ?, ?, ?, ?, (SELECT id FROM trabajo_de_grado WHERE estado = true ORDER BY id DESC LIMIT 1))
    """;

        String sqlSelectUsuario = "SELECT id FROM usuario WHERE cedula = ? AND estado = true AND id_rol = 2";

        try (Connection conn = openConexion(); PreparedStatement psTrabajo = conn.prepareStatement(sqlInsertTrabajo); PreparedStatement psDesarrollo = conn.prepareStatement(sqlInsertInvestigacion); PreparedStatement psSelectUsuario = conn.prepareStatement(sqlSelectUsuario)) {

            // Insertar trabajo_de_grado
            psTrabajo.setString(1, titulo);
            psTrabajo.setString(2, fecha_creacion);
            int rowsInserted = psTrabajo.executeUpdate();

            if (rowsInserted > 0) {
                // Preparar desarrollo_tecnologico
                psDesarrollo.setString(1, titulo);
                psDesarrollo.setInt(2, getIdUsuario(psSelectUsuario, ccIntegranteOne));
                psDesarrollo.setInt(3, getIdUsuario(psSelectUsuario, ccIntegranteTwo));
                psDesarrollo.setInt(4, getIdUsuario(psSelectUsuario, ccIntegranteThree));
                psDesarrollo.setString(5, problema);
                psDesarrollo.setString(6, justificacion);
                psDesarrollo.setString(7, objetivos_especificos);
                psDesarrollo.setString(8, objetivos_generales);

                int desarrolloInserted = psDesarrollo.executeUpdate();

                if (desarrolloInserted > 0) {
                    JOptionPane.showMessageDialog(null, "Registrado con éxito");
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar Investigacion");
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
                         UPDATE investigacion i
                         INNER JOIN trabajo_de_grado t ON i.id_trabajo_grado = t.id
                         SET i.titulo = ?, i.problema = ?, i.justificacion = ?, i.objetivos_generales = ?, i.objetivos_especificos = ?, t.titulo = ?
                         WHERE i.id_trabajo_grado = ?;""";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, titulo);
            ps.setString(2, problema);
            ps.setString(3, justificacion);
            ps.setString(4, objetivos_generales);
            ps.setString(5, objetivos_especificos);
            ps.setString(6, titulo);
            ps.setInt(7, id_trabajo);
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

    public void subirPdf() {
        FileInputStream inputStream = null;

        try {
            String sql = "INSERT INTO investigacion (adjunto) VALUES (?)";
            PreparedStatement ps = openConexion().prepareStatement(sql);

            File pdfFile = getRutaPdf();

            if (pdfFile != null && pdfFile.exists()) {
                inputStream = new FileInputStream(pdfFile);
                ps.setBlob(1, inputStream);
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
