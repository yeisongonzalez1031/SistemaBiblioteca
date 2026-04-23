/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author ESTUDIANTE
 */
public class Autor {
    private static int id;
    private final String nombre = "Juan";
    private String pais;
    private final int anioNacimiento = 2007;

    public Autor() {
    }

    public Autor(String pais, int nombre) {
        this.pais = pais;
        this.nombre= nombre;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Autor.id = id;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

  
}
