package main;
// @author armando

import java.sql.Connection;

public abstract class TrabajoDeGrado {

    int id;
    String titulo;
    String fecha_creacion;
    String aprobado;
    String docenteDirector;
    String problema;
    String justificacion;
    String objetivos_generales;
    String objetivos_especificos;
    int adjuntos;

    public TrabajoDeGrado() {
    }
    //Usado en crear
    public TrabajoDeGrado(String titulo, String fecha_creacion, String problema, String justificacion, String objetivos_generales, String objetivos_especificos) {
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.problema = problema;
        this.justificacion = justificacion;
        this.objetivos_generales = objetivos_generales;
        this.objetivos_especificos = objetivos_especificos;
    }

    public TrabajoDeGrado(String titulo, String problema, String justificacion, String objetivos_generales, String objetivos_especificos) {
        this.titulo = titulo;
        this.problema = problema;
        this.justificacion = justificacion;
        this.objetivos_generales = objetivos_generales;
        this.objetivos_especificos = objetivos_especificos;
    }
    
    
    
    
    
    public Connection openConexion() {
        return Conexion.getInstaciaConexion().getConexion();
    }

    //Aqui llamo al metodo de cerrar la conexion
    public void closeConexion() {
        Conexion.getInstaciaConexion().cerrarBase();
    }

    public abstract void crear(String ccIntegranteOne);

    public abstract void modificar(int id_trabajo);

    public abstract void eliminar(int id_trabajo);

}
