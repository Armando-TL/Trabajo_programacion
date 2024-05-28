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
    int id_alumno;
    int adjuntos;

    public TrabajoDeGrado() {
    }

    public TrabajoDeGrado(String titulo, String fecha_creacion, String problema, String justificacion, String objetivos_generales, String objetivos_especificos, int adjuntos) {
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.problema = problema;
        this.justificacion = justificacion;
        this.objetivos_generales = objetivos_generales;
        this.objetivos_especificos = objetivos_especificos;
        this.adjuntos = adjuntos;
    }
    
    
    
    public TrabajoDeGrado(int id, String titulo, String fecha_creacion, String aprobado, String docenteDirector, String problema, String justificacion, String objetivos_generales, String objetivos_especificos, int adjuntos) {
        this.id = id;
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.aprobado = aprobado;
        this.docenteDirector = docenteDirector;
        this.problema = problema;
        this.justificacion = justificacion;
        this.objetivos_generales = objetivos_generales;
        this.objetivos_especificos = objetivos_especificos;
        this.adjuntos = adjuntos;
    }
    
    public Connection openConexion() {
        return Conexion.getInstaciaConexion().getConexion();
    }

    //Aqui llamo al metodo de cerrar la conexion
    public  void closeConexion() {
        Conexion.getInstaciaConexion().cerrarBase();
    }

    public abstract void crear();

    public abstract void modificar();

    public abstract void eliminar();

}
