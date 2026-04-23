/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ESTUDIANTE
 */
public class Libro {

    private final int isbn = 123456;
    private final String titulo = "cien anios de seriedad";
    private Autor autor;
    private Categoria categoria;
    
    public Libro(){
    }

    public Libro(Autor autor, Categoria categoria) {
        this.autor = autor;
        this.categoria= categoria;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
    
    
    
}
