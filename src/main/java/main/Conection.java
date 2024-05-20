package main;
// @author amdtr
//
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Conection {

    private Connection conectando = null;
    
    //Abrir conexion
    public  Connection openConexion() {
        String user = "root";
        String password = "";
        String nameBase = "work"; //Nombre de la base de datos
        String ip = "localhost";
        String port = "3306"; // Puerto que usa xampp
        String url = "jdbc:mysql://" + ip + ":" + port + "/" + nameBase;

        try {
            conectando = DriverManager.getConnection(url, user, password);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar la base de datos");
        }

        return conectando;
    }
    
    //Cerrar conexion
    public void closeConexion() {
        try {
            if (conectando != null && !conectando.isClosed()) {
                conectando.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "error: "+e);
        }

    }

}
