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
    private int id;
    private final String nombre;
    private String pais;
    private final int anioNacimiento;


    public Autor(final String nombre, String pais, final int anioNacimiento, int id) {
        this.nombre = nombre;
        this.pais = pais;
        this.anioNacimiento = anioNacimiento;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
   
}
