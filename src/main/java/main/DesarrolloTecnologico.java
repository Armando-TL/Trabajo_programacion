package main;
// @author armando

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    public void modificar() {
        
    }

    @Override
    public void eliminar() {
        
    }

}
