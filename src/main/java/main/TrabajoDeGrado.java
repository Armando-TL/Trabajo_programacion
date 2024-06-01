package main;
// @author armando

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

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
    
    public void mostrarTabla(JTable tabla) {
        String sql = """
                    SELECT t.id, 
                           t.titulo, 
                           t.fecha_creacion, 
                           IF(t.docenteDirector IS NULL, 
                              'Ninguno',
                              (SELECT u.nombre 
                               FROM usuario u
                               WHERE u.id = t.docenteDirector)) AS docente, 
                           IF(t.aprobado > 0, 'Si', 'No') AS aprobado, 
                           tp.nombre AS tipo 
                    FROM trabajo_de_grado t
                    LEFT JOIN desarrollo_tecnologico d ON t.id = d.id_trabajo_grado
                    LEFT JOIN investigacion i ON t.id = i.id_trabajo_grado
                    LEFT JOIN practica_empresarial p ON t.id = p.id_trabajo_grado
                    INNER JOIN tipo_trabajo_grado tp ON t.id_tipo_trabajo = tp.id
                    WHERE t.estado = 1;""";
        DefaultTableModel modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };

        modelo.addColumn("ID");
        modelo.addColumn("Titulo");
        modelo.addColumn("Fecha de creación");
        modelo.addColumn("Docente asignado");
        modelo.addColumn("Tipo");
        modelo.addColumn("Aprobado");

        try {
            Statement ps = openConexion().createStatement();
            ResultSet rs = ps.executeQuery(sql);

            while (rs.next()) {
                String i = rs.getString("id");
                String t = rs.getString("titulo");
                String f = rs.getString("fecha_creacion");
                String d = rs.getString("docente");
                String tp = rs.getString("tipo");
                String e = rs.getString("aprobado");

                modelo.addRow(new Object[]{i, t, f, d, tp, e});
                tabla.setModel(modelo);

            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } finally {
            closeConexion();
        }
    }

    public abstract void crear(String ccIntegranteOne);

    public abstract void modificar(int id_trabajo);

    public void eliminar(int id_trabajo){
    
    
    try {
            String sql = """
                         UPDATE trabajo_de_grado SET estado = 0 WHERE id = ?;""";
            PreparedStatement ps = openConexion().prepareStatement(sql);
            ps.setInt(1, id_trabajo);
            ps.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error SQL: " + e.getMessage());
        } finally {
            closeConexion();
        }
    };
    
    public void seleccionar(JTable tabla) {
        int fila = tabla.getSelectedRow();

        if (fila >= 0) {
            id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            titulo = tabla.getValueAt(fila, 1).toString();

        }
    }
    
   

}
