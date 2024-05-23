package main;
// @author armando

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TipoTrabajoGrado extends Graduaciones {

    String descripcion;

    private Connection openConexion() {
        return Conexion.getInstaciaConexion().getConexion();
    }

    //Aqui llamo al metodo de cerrar la conexion
    private void closeConexion() {
        Conexion.getInstaciaConexion().cerrarBase();
    }

    public TipoTrabajoGrado(String descripcion, int id, String nombre, boolean estado) {
        super(id, nombre, estado);
        this.descripcion = descripcion;
    }

    @Override
    public void crear() {
        try {
            String sql = "INSERT INTO `tipo_trabajo_grado` (nombre, descripcion) VALUES (?, ?);";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            int i = ps.executeUpdate();
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No se pudo crear el tipo de trabajo");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            closeConexion();
        }
    }

    @Override
    public void modificar() {
        try {
            String sql = "UPDATE tipo_trabajo_grado SET nombre = ?, descripcion = ? WHERE id = ?;";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, descripcion);
            ps.setInt(3, id);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            closeConexion();
        }
    }

    @Override
    public void eliminar() {
        try {
            String sql = "UPDATE tipo_trabajo_grado SET estado = false WHERE id = ?;";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setInt(1, id);
            int i = ps.executeUpdate();
            if (i < 1) {
                JOptionPane.showMessageDialog(null, "No se pudo modificar tipo de trabajo");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            closeConexion();
        }
    }

}
