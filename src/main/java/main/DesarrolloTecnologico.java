package main;
// @author armando

import com.mysql.cj.protocol.Resultset;
import com.mysql.cj.xdevapi.PreparableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DesarrolloTecnologico extends TrabajoDeGrado {

    String ccIntegranteOne;
    String ccIntegranteTwo;

    public DesarrolloTecnologico(String ccIntegranteOne, String ccIntegranteTwo, int id, String titulo, String fecha_creacion, String aprobado, String docenteDirector, String problema, String justificacion, String objetivos_generales, String objetivos_especificos, int adjuntos) {
        super(id, titulo, fecha_creacion, aprobado, docenteDirector, problema, justificacion, objetivos_generales, objetivos_especificos, adjuntos);
        this.ccIntegranteOne = ccIntegranteOne;
        this.ccIntegranteTwo = ccIntegranteTwo;
    }
    
    
    
    @Override
    public void crear() {
        try {
            String sqlT = """
                          INSERT INTO `trabajo_de_grado`(titulo, fecha_creacion, id_tipo_trabajo)VALUES
                          (?,?,1)
                          """;
            PreparedStatement pS = openConexion().prepareStatement(sqlT);
            pS.setString(1, titulo);
            pS.setString(2, fecha_creacion);
            int i = pS.executeUpdate();
            if (i > 1) {
                String sql = """
                         INSERT INTO `desarrollo_tecnologico` (titulo, id_alumnoOne, id_alumnoTwo, id_alumnoThree, aprobado, docenteDirector, problema, justificacion,objetivos_especificos, objetivos_generales, adjuntos, id_trabajo_grado)VALUES
                         (?,?,?,?,?,?,?,?,?,?)
                            """;
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setString(1, titulo);
            ps.setInt(2, id_alumno);
                if (!ccIntegranteOne.equals("")) {
                    String c = "SELECT id FROM usuario WHERE cedula = ? AND estado = true AND id_rol = 1";
                    PreparedStatement pss = openConexion().prepareStatement(sql);
                    pss.setString(1, ccIntegranteOne);
                    ResultSet rss= pss.executeQuery();
                    if (rss.next()) {
                        int idA = rss.getInt("id");
                        ps.setInt(3, idA);
                    }
                }
            
            }
            
            
            
            
            
            
            
            
        } catch (SQLException e) {
        } finally {
        }
    }

    @Override
    public void modificar() {
        
    }

    @Override
    public void eliminar() {
        
    }

}
