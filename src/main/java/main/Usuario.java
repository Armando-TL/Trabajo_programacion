package main;
// @author armando

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario extends Graduaciones {

    String cedula;
    String clave;
    String correo;
    String telefono;

    //Aqui abro la conexion
    private Connection openConexion() {
        return Conexion.getInstaciaConexion().getConexion();
    }

    //Aqui llamo al metodo de cerrar la conexion
    private void closeConexion() {
        Conexion.getInstaciaConexion().cerrarBase();
    }

    public Usuario(String cedula, String clave, String correo, String telefono, int id, String nombre, boolean estado) {
        super(id, nombre, estado);
        this.cedula = cedula;
        this.clave = clave;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Usuario(String cedula, String clave) {
        this.cedula = cedula;
        this.clave = clave;
    }

    @Override
    public void crear() {

    }

    @Override
    public void modificar() {

    }

    @Override
    public void eliminar() {

    }

    public void logIn() {

        try {
            String sql = """
                     SELECT cedula, clave
                     FROM usuario
                     WHERE cedula = ? AND clave = ? and estado = 1
                    """;
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, cedula);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                System.out.println("entro");

            } else {
                System.out.println("no existe");
            }

        } catch (SQLException e) {
            System.out.println(e);
        } finally {
            closeConexion();
        }

    }

}
