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
    
   private final int id;
   private final String nombre; 
   private ArrayList<Libro> libros;
   
    public Categoria(final int id, ArrayList<Libro> libros, final String nombre) {
        this.libros = libros;
        this.id = id;
        this.nombre = nombre;
    }
   

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
   
   
   
   
}
