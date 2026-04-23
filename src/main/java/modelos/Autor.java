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
    private final String nombre;
    private String pais;
    private final int anioNacimiento;


    public Autor(final String nombre, String pais, final int anioNacimiento) {
        this.nombre = nombre;
        this.pais = pais;
        this.anioNacimiento = anioNacimiento;
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
