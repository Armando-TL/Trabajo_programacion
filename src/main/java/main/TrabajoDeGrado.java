package main;
// @author armando

public class TrabajoDeGrado extends Graduaciones{
   
    String fecha_creacion;
    String aprobado;
    String problema;
    String justificacion;
    String objetivos_generales;
    String objetivos_especificos;
    int adjuntos ;

    public TrabajoDeGrado(String fecha_creacion, String aprobado, String problema, String justificacion, String objetivos_generales, String objetivos_especificos, int adjuntos, int id, String nombre, boolean estado) {
        super(id, nombre, estado);
        this.fecha_creacion = fecha_creacion;
        this.aprobado = aprobado;
        this.problema = problema;
        this.justificacion = justificacion;
        this.objetivos_generales = objetivos_generales;
        this.objetivos_especificos = objetivos_especificos;
        this.adjuntos = adjuntos;
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
    
    
    
}
