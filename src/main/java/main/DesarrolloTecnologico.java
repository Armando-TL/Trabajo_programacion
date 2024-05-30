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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

public class DesarrolloTecnologico extends TrabajoDeGrado {

    String ccIntegranteTwo;
    String ccIntegranteThree;

    public DesarrolloTecnologico() {
    }

    public DesarrolloTecnologico(String ccIntegranteTwo, String ccIntegranteThree, String titulo, String fecha_creacion, String problema, String justificacion, String objetivos_generales, String objetivos_especificos) {
        super(titulo, fecha_creacion, problema, justificacion, objetivos_generales, objetivos_especificos);
        this.ccIntegranteTwo = ccIntegranteTwo;
        this.ccIntegranteThree = ccIntegranteThree;
    }

    public DesarrolloTecnologico(String titulo, String problema, String justificacion, String objetivos_generales, String objetivos_especificos) {
        super(titulo, problema, justificacion, objetivos_generales, objetivos_especificos);
    }
    
    
    
    @Override
    public void crear(String ccIntegranteOne) {
        String sqlInsertTrabajo = """
        INSERT INTO trabajo_de_grado (titulo, fecha_creacion, id_tipo_trabajo) VALUES (?, ?, 1)
    """;

        String sqlInsertDesarrollo = """
        INSERT INTO desarrollo_tecnologico (titulo, id_alumnoOne, id_alumnoTwo, id_alumnoThree, problema, justificacion, objetivos_especificos, objetivos_generales, id_trabajo_grado)
        VALUES (?, ?, ?, ?, ?, ?, ?, ?, (SELECT id FROM trabajo_de_grado WHERE estado = true ORDER BY id DESC LIMIT 1))
    """;

        String sqlSelectUsuario = "SELECT id FROM usuario WHERE cedula = ? AND estado = true AND id_rol = 2";
        
        

        try (Connection conn = openConexion(); PreparedStatement psTrabajo = conn.prepareStatement(sqlInsertTrabajo); PreparedStatement psDesarrollo = conn.prepareStatement(sqlInsertDesarrollo); PreparedStatement psSelectUsuario = conn.prepareStatement(sqlSelectUsuario)) {

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
                    JOptionPane.showMessageDialog(null, "Error al registrar desarrollo tecnológico");
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
                         UPDATE desarrollo_tecnologico d
                         INNER JOIN trabajo_de_grado t ON d.id_trabajo_grado = t.id
                         SET d.titulo = ?, d.problema = ?, d.justificacion = ?, d.objetivos_generales = ?, d.objetivos_especificos = ?, t.titulo = ?
                         WHERE d.id_trabajo_grado = ?;""";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, titulo);
            ps.setString(2, problema);
            ps.setString(3, justificacion);
            ps.setString(4, objetivos_generales);
            ps.setString(5, objetivos_especificos);
            ps.setString(6, titulo);
            ps.setInt(7, id_trabajo);
            ps.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
        } finally {
        }
    }

    @Override
    public void eliminar(int id_trabajo) {
        try {
            String sql = """
                         UPDATE trabajo_de_grado t
                         INNER JOIN desarrollo_tecnologico d ON d.id_trabajo_grado = t.id
                         SET t.estado = 0
                         WHERE d.id_trabajo_grado = ?;""";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setInt(1, id_trabajo);
            ps.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
        } finally {
            closeConexion();
        }
    }

    public File getRutaPdf() {
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
            String sql = "UPDATE desarrollo_tecnologico SET adjuntos = ? WHERE id_trabajo_grado = ?";
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

    public void mostrarTabla(JTable tabla) {
        String sql = """
                     SELECT t.id, t.titulo, t.fecha_creacion, IF(d.docenteDirector=null,'Ninguno','')AS docente, IF(d.aprobado>0,'Si','No')AS aprobado, tp.nombre AS tipo FROM  desarrollo_tecnologico d 
                     INNER JOIN trabajo_de_grado t ON d.id_trabajo_grado = t.id
                     INNER JOIN tipo_trabajo_grado tp ON t.id_tipo_trabajo = tp.id
                     WHERE t.estado = 1;""";
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        modelo.addColumn("ID");
        modelo.addColumn("Titulo");
        modelo.addColumn("Fecha de creación");
        modelo.addColumn("Docente asignado");
        modelo.addColumn("Tipo");
        modelo.addColumn("Estado");

        try {
            Statement ps = openConexion().createStatement();
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                String i = rs.getString("id");
                String t = rs.getString("titulo");
                String f = rs.getString("fecha_creacion");
                String d = rs.getString("docente");
                String tp = rs.getString("tipo");
                String e = rs.getString("aprobado");

                modelo.addRow(new Object[]{i, t, f, d, tp, e});
                tabla.setModel(modelo);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            closeConexion();
        }
    }

    public void seleccionar(JTable tabla) {
        int fila = tabla.getSelectedRow();

        if (fila >= 0) {
            id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            titulo = tabla.getValueAt(fila, 1).toString();

        }
    }
}
