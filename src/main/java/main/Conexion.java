package main;
// @author amdtr
//

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection conectando = null;
    private static Conexion instancia = null;

    private Conexion() {
    }

    //Abrir conexion
    private Connection conectandoBase() {
        String user = "root";
        String password = "";
        String nameBase = "POO_grados"; //Nombre de la base de datos
        String ip = "localhost";
        String port = "3306"; // Puerto que usa xampp
        String url = "jdbc:mysql://" + ip + ":" + port + "/" + nameBase;

        try {
            this.conectando = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos");
        }

        return conectando;
    }

    //Cerrar conexion
    public void cerrarBase() {
        try {
            if (conectando != null && !conectando.isClosed()) {
                conectando.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }

    }

    public static Conexion getInstaciaConexion() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    public Connection getConexion() {
        try {
            if (conectando == null || conectando.isClosed()) {
            conectandoBase();
        }
        return conectando;
        } catch (SQLException e) {
        }
        return conectando;
    }
}
