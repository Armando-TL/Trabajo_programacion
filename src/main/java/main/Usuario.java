package main;
// @author armando

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Usuario extends Entidad {

    String cedula;
    String clave;
    String correo;
    String telefono;
    int id_alumno;

    //Aqui abro la conexion
    private Connection openConexion() {
        return Conexion.getInstaciaConexion().getConexion();
    }

    //Aqui llamo al metodo de cerrar la conexion
    private void closeConexion() {
        Conexion.getInstaciaConexion().cerrarBase();
    }

    public Usuario(String cedula, String clave, String correo, String telefono, int id, String nombre) {
        super(id, nombre);
        this.cedula = cedula;
        this.clave = clave;
        this.correo = correo;
        this.telefono = telefono;
    }

    public Usuario(String cedula, String clave) {
        this.cedula = cedula;
        this.clave = clave;
    }

    public Usuario() {
    }

    @Override
    public void crear() {

    }

    @Override
    public void modificar() {
        try {
            String sql = "UPDATE usuarios SET nombres = ?, cedula = ?, clave = ?, correo = ?, telefono = ? WHERE id = ?;";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, nombre);
            ps.setString(2, cedula);
            ps.setString(3, clave);
            ps.setString(4, correo);
            ps.setString(5, telefono);
            ps.setInt(6, id);
            ps.execute();
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            closeConexion();
        }
    }

    @Override
    public void eliminar() {
        try {
            String sql = "UPDATE usuario SET estado = false WHERE id = ?;";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setInt(1, id);
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            closeConexion();
        }

    }

    private ViewLogin viewLogin;

    public void setViewLogin(ViewLogin login) {
        this.viewLogin = login;
    }

    public void logIn() {

        try {
            String sql = """
                     SELECT u.id ,u.cedula, u.clave, roles.nombre AS rol from usuario u
                     INNER JOIN roles ON u.id_rol = roles.id
                     WHERE u.cedula = ? AND u.clave = ? AND u.estado = TRUE;
                    """;
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, cedula);
            ps.setString(2, clave);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String rol = rs.getString("rol");
                int i = rs.getInt("id");
                viewLogin.setVisible(false);
                switch (rol) {
                    case "Estudiante" -> {
                        ViewTrabajos v = new ViewTrabajos();
                        v.setVisible(true);
                        v.setLocationRelativeTo(viewLogin);
                    }
                    case "Coordinador" -> {
                        ViewAsignarTrabajos vt = new ViewAsignarTrabajos();
                        vt.setVisible(true);
                        vt.setLocationRelativeTo(viewLogin);
                    }
                    case "Docente" -> {

                        ViewDocente viewDocente = new ViewDocente(i);
                        viewDocente.setVisible(true);
                        viewDocente.setLocationRelativeTo(viewLogin);

                    }
                    default -> {
                    }
                }

            } else {
                JOptionPane.showMessageDialog(null, "Error en el usuario o contraseña");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            closeConexion();
        }

    }

    public void cargarBoxTTG(JComboBox comboBox) {

        try {
            String sql = "SELECT * FROM `tipo_trabajo_grado` WHERE estado = true ORDER BY id ASC;";
            Statement st = openConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            comboBox.removeAllItems();

            while (rs.next()) {
                comboBox.addItem(rs.getString("nombre"));
            }

        } catch (SQLException ex) {

        }

    }

    public void cargarBoxEstado(JComboBox comboBox) {

        try {
            String sql = "SELECT * FROM `tipo_trabajo_grado` WHERE estado = true ORDER BY id ASC;";
            Statement st = openConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            comboBox.removeAllItems();

            while (rs.next()) {
                comboBox.addItem(rs.getString("nombre"));
            }

        } catch (SQLException ex) {

        }

    }

    public void cargarBoxDocentes(JComboBox comboBox) {

        try {
            String sql = """
                     SELECT u.id, u.nombre from usuario u
                     INNER JOIN roles ON u.id_rol = roles.id
                     WHERE u.estado = 1 AND roles.nombre = 'Docente';
                    """;
            Statement st = openConexion().createStatement();
            ResultSet rs = st.executeQuery(sql);

            comboBox.removeAllItems();

            while (rs.next()) {
                comboBox.addItem(rs.getString("nombre"));
            }

        } catch (SQLException ex) {

        }

    }

    public void descargarPdf(int id, String trabajo) {
        String tipoTrabajo = null;
        switch (trabajo) {
            case "Investigaciones" ->
                tipoTrabajo = "investigacion";
            case "Desarrollo tecnológico" ->
                tipoTrabajo = "desarrollo_tecnologico";
            case "Práctica profesional" ->
                tipoTrabajo = "practica_empresarial";
            default -> {
                System.out.println("Error en el tipo de trabajo");
            }
        }

        String sql = "SELECT adjunto FROM " + tipoTrabajo + " WHERE id_trabajo_grado = ?";
        try (PreparedStatement ps = openConexion().prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Obtiene el InputStream del blob
                    InputStream inputStream = rs.getBinaryStream("adjunto");
                    // Guarda el archivo en el sistema de archivos local
                    guardarArchivo(inputStream);
                    JOptionPane.showMessageDialog(null, "Operacion realizada");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un PDF con el ID especificado");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e.getMessage());
        }
    }

    private void guardarArchivo(InputStream inputStream) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        fileChooser.setSelectedFile(new File("archivo.pdf"));
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try (FileOutputStream outputStream = new FileOutputStream(fileChooser.getSelectedFile())) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage());
            }
        }
    }

//    //cargar combobox de docente
//      public void cargarBoxDocente(JComboBox comboBox) {
//          comboBox.addItem("");
//                  
//
//        try {
//            String sql = "SELECT id,nombre  FROM usuario  where id_rol=3 order by id ASC";
//            Statement st = openConexion().createStatement();
//            ResultSet rs = st.executeQuery(sql);
//
//            comboBox.removeAllItems();
//           
//            
//
//            while (rs.next()) {
//                comboBox.addItem(rs.getString("id")+":"+rs.getString("nombre"));
//            }
//
//        } catch (SQLException ex) {
//            
//        }
//
//    }
//    
}
