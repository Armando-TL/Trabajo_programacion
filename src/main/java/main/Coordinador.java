package main;
// @author armando

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Coordinador {

    String id;
    String titulo;
    String tipoTrabajo;
    String problema;
    String objetivoGe;
    String objetivoEs;
    String justificacion;
    //String alumnoOne;
    //String alumnotwo;
    //String alumnoThree;

    //Aqui abro la conexion
    private Connection openConexion() {
        return Conexion.getInstaciaConexion().getConexion();
    }

    //Aqui llamo al metodo de cerrar la conexion
    private void closeConexion() {
        Conexion.getInstaciaConexion().cerrarBase();
    }

    public void mostrarTabla(JTable tabla) {
        String sql = """
                    SELECT t.id, 
                           t.titulo, 
                           t.fecha_creacion, 
                           IF(t.docenteDirector IS NULL, 
                              'Ninguno',
                              (SELECT u.nombre 
                               FROM usuario u
                               WHERE u.id = t.docenteDirector)) AS docente, 
                           IF(t.aprobado > 0, 'Si', 'No') AS aprobado, 
                           tp.nombre AS tipo 
                    FROM trabajo_de_grado t
                    LEFT JOIN desarrollo_tecnologico d ON t.id = d.id_trabajo_grado
                    LEFT JOIN investigacion i ON t.id = i.id_trabajo_grado
                    LEFT JOIN practica_empresarial p ON t.id = p.id_trabajo_grado
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
        modelo.addColumn("Aprobado");

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

    public void AsignarTrabajo(int estado, int idTrabajo, String docente) {
        try {

            String sql = "UPDATE trabajo_de_grado SET docenteDirector = ?, aprobado = ? WHERE id = ?;";

            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setInt(1, getIdUsuario(docente));
            ps.setInt(2, estado);
            ps.setInt(3, idTrabajo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Trabajo asignado con exito");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e);
        } finally {
            closeConexion();
        }

    }

    private int getIdUsuario(String docente) throws SQLException {
        if (docente == null || docente.isEmpty()) {
            return 0;
        }
        String sql = " SELECT id FROM usuario WHERE nombre = ? ";
        PreparedStatement ps = openConexion().prepareStatement(sql);
        ps.setString(1, docente);

        try (ResultSet rs = ps.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("id");
            }
        }

        return 0;
    }

    public void seleccionar(JTable tabla) {
        int fila = tabla.getSelectedRow();

        if (fila >= 0) {
            id = tabla.getValueAt(fila, 0).toString();
            titulo = tabla.getValueAt(fila, 1).toString();
            tipoTrabajo = tabla.getValueAt(fila, 4).toString();
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
            closeConexion();
        }

    }
}
