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
    
   private final String id;
   private final String nombre; 
   private ArrayList<Libro> libros;
   
   public Categoria(){
   }
   
   public Categoria(String id, String nombre, ArrayList<Libro> libros){
   this.id = id;
   this.libros = libros;
   this.nombre = nombre;
   
   }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
   
   
   
   
}
