/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author ESTUDIANTE
 */
public class Categoria {
    
   private final String id = "123456";
   private final String nombre = "rambo"; 
   private ArrayList<Libro> libros;
   
   public Categoria(){
   }

    public Categoria(ArrayList<Libro> libros) {
        this.libros = libros;
    }
   

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
   
   
   
   
}
