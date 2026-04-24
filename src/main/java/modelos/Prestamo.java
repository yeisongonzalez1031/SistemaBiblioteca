/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ESTUDIANTE
 */
public class Prestamo {

  
    private final int id;
    private String libro;
    private String usuario;
    private String fecha;
    
      public Prestamo(final int id, String libro,String usuario , String fecha) {
        this.id = id;
        this.libro = libro;
        this.usuario = usuario;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public String getLibro() {
        return libro;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
      
}
