package main;
// @author armando

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Docentes {

    String id;
    String titulo;
    String tipoTrabajo;
    String problema;
    String objetivoGe;
    String objetivoEs;
    String justificacion;

    public Connection openConexion() {
        return Conexion.getInstaciaConexion().getConexion();
    }

    public void closeConexion() {
        Conexion.getInstaciaConexion().cerrarBase();
    }

    public void cargarTabla(JTable tabla, int idDocente) {
        String sql = """
                    SELECT t.id, 
                           t.titulo, 
                           t.fecha_creacion, 
                           tp.nombre AS tipo
                           FROM trabajo_de_grado t
                           LEFT JOIN desarrollo_tecnologico d ON t.id = d.id_trabajo_grado
                           LEFT JOIN investigacion i ON t.id = i.id_trabajo_grado
                           LEFT JOIN practica_empresarial p ON t.id = p.id_trabajo_grado
                           INNER JOIN tipo_trabajo_grado tp ON t.id_tipo_trabajo = tp.id
                           WHERE t.estado = 1 AND t.docenteDirector = ?;""";
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        modelo.addColumn("ID");
        modelo.addColumn("Titulo");
        modelo.addColumn("Fecha de creación");
        modelo.addColumn("Tipo");

        try {
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setInt(1, idDocente);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                String i = rs.getString("id");
                String t = rs.getString("titulo");
                String f = rs.getString("fecha_creacion");
                String tp = rs.getString("tipo");

                modelo.addRow(new Object[]{i, t, f, tp});
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
            id = tabla.getValueAt(fila, 0).toString();
            titulo = tabla.getValueAt(fila, 1).toString();
            tipoTrabajo = tabla.getValueAt(fila, 3).toString();
        }
    }

    public void vistaPrevia(String trabajo, int idTrabajo) {

        String tabla = null;
        switch (trabajo) {
            case "Investigaciones" ->
                tabla = "investigacion";
            case "Desarrollo tecnológico" ->
                tabla = "desarrollo_tecnologico";
            case "Práctica profesional" ->
                tabla = "practica_empresarial";
            default -> {
            }
        }
        try {
            String sql = "SELECT problema, objetivos_generales, objetivos_especificos , justificacion FROM " + tabla + " d\n"
                  + "                         INNER JOIN trabajo_de_grado t ON d.id_trabajo_grado = t.id\n"
                  + "                         WHERE t.id = ?";

            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setInt(1, idTrabajo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                problema = rs.getString("problema");
                objetivoGe = rs.getString("objetivos_generales");
                objetivoEs = rs.getString("objetivos_especificos");
                justificacion = rs.getString("justificacion");
            }

        } catch (SQLException e) {
        } finally {
        }

    }

}
