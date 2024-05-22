package main;
// @author armando

public abstract class Graduaciones {

    int id;
    String nombre;
    boolean estado;

    public Graduaciones() {
    }
    
    

    public Graduaciones(int id, String nombre, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.estado = estado;
    }

    public abstract void crear();

    public abstract void modificar();

    public abstract void eliminar();
}
