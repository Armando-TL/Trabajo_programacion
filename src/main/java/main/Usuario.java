package main;
// @author armando

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nombre", length = 255)
    private String nombre;
    @Column(name = "apellido", length = 255)
    private String apellido;
    @Column(name = "dni", length = 30)
    private String dni;
    @Column(name = "password", length = 255)
    String password;
    @Column(name = "email", length = 255)
    private String email;
    @Enumerated(EnumType.STRING)
    private TipoUsuario tipo;

    public enum TipoUsuario {
        DOCENTE,
        ESTUDIANTE,
        COORDINADOR,
        ADMINISTRADOR
    }

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String dni, String password, String email) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.password = password;
        this.email = email;
    }

    /*
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
    }*/
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TipoUsuario getTipo() {
        return tipo;
    }

    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    
    

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", email=" + email + '}';
    }

}
