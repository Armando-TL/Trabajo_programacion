package main;
// @author armando

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
            String Sql = "";
            
        } catch (Exception e) {
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
