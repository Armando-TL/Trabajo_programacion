package main;
// @author armando

public abstract class Entidad {

    int id;
    String nombre;

    public Entidad() {
    }
    
    

    public Entidad(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public abstract void crear();

    public abstract void modificar();

    public abstract void eliminar();
}
