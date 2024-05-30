package main;
// @author armando

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class ProyectoInvestigacion extends TrabajoDeGrado {

    String ccIntegranteTwo;
    String ccIntegranteThree;

    @Override
    public void crear(String cc) {
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

    public File getRutaPdf() {
        JFileChooser fileChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF", "pdf");
        fileChooser.setFileFilter(filter); // solo mostrara PDF
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            return fileChooser.getSelectedFile();
        } else {
            return null;
        }
    }

    public void subirPdf() {
        FileInputStream inputStream = null;

        try {
            String sql = "INSERT INTO investigacion (adjunto) VALUES (?)";
            PreparedStatement ps = openConexion().prepareStatement(sql);

            File pdfFile = getRutaPdf();

            if (pdfFile != null && pdfFile.exists()) {
                inputStream = new FileInputStream(pdfFile);
                ps.setBlob(1, inputStream);
                ps.execute();
                JOptionPane.showMessageDialog(null, "Archivo subido exitosamente");
            } else {
                JOptionPane.showMessageDialog(null, "No se cargó ningún archivo");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ProyectoInvestigacion.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    Logger.getLogger(ProyectoInvestigacion.class.getName()).log(Level.SEVERE, null, e);
                }
            }
            closeConexion();
        }
    }
    
    
    public void descargarPdf(int id, String trabajo) {
        String sql = "SELECT adjunto FROM"+ trabajo +" WHERE id = ?";
        try (PreparedStatement ps = openConexion().prepareStatement(sql)) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Obtiene el InputStream del blob
                    InputStream inputStream = rs.getBinaryStream("adjunto");
                    // Guarda el archivo en el sistema de archivos local
                    guardarArchivo(inputStream);
                    JOptionPane.showMessageDialog(null, "Operacion realizada");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró un PDF con el ID especificado");
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error en SQL: " + e.getMessage());
        }
    }
    
    
    private void guardarArchivo(InputStream inputStream) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        fileChooser.setSelectedFile(new File("archivo.pdf"));
        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            try (FileOutputStream outputStream = new FileOutputStream(fileChooser.getSelectedFile())) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error al guardar el archivo: " + e.getMessage());
            }
        }
    }


}
