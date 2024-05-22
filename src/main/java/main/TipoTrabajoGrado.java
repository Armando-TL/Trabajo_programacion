package main;
// @author armando

public class TipoTrabajoGrado extends Graduaciones{
   
    String descripcion;

    public TipoTrabajoGrado(String descripcion, int id, String nombre, boolean estado) {
        super(id, nombre, estado);
        this.descripcion = descripcion;
    }
    
    

    @Override
    public void crear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
