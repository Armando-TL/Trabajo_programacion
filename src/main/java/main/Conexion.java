package main;
// @author armando

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // Instancia única de la clase
    private static Conexion instance;
    // Conexión a la base de datos
    private Connection connection;
    // Detalles de conexión
    private String name = "work";
    private String port = "3306";
    private String username = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:" + port + "/" + name;

    // Constructor privado para evitar la instanciación
    private Conexion() throws SQLException {
        try {
            // Cargar el controlador de la base de datos
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Establecer la conexión
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            throw new SQLException(ex);
        }
    }

    // Método público para obtener la instancia única
    public static Conexion getInstanceConexion() throws SQLException {
        if (instance == null) {
            instance = new Conexion();
        } else if (instance.getConexion().isClosed()) {
            instance = new Conexion();
        }
        return instance;
    }

    // Método para obtener la conexión
    public Connection getConexion() {
        return connection;
    }
}
