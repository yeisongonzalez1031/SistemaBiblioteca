/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vista;
import modelos.Autor;
import modelos.Biblioteca;
import modelos.Categoria;
import modelos.Libro;
import modelos.Prestamo;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
/**
 *
 * @author ESCRITORIO
 */
public class SistemaBiblioteca {

    public static void main(String[] args) {
       Scanner Leer = new Scanner(System.in);
       int respuesta;
     do{
       System.out.println("===== SISTEMA DE GESTIÓN DE BIBLIOTECA=====");
       System.out.println("1.  CREAR NUEVA CATEGORIA");
       System.out.println("2.  AGREGAR NUEVO LIBRO");
       System.out.println("3.  AGREGAR NUEVO LIBRO");
       System.out.println("4.  REALIZAR PRESTAMO");
       System.out.println("5.  DEVOLVER LIBRO PRESTADO");
       System.out.println("6.  VER LIBROS DISPONIBLES");
       System.out.println("7.  VER DETALLER DEL AUTOR");
       System.out.println("8.  VER LIBROS DE UNA CATEGORIA");
       System.out.println("9.  VER MULTAS ACUMULADAS");
       System.out.println("10. VER ESTADISTICAS");
       System.out.println("11. SALIR");
       respuesta = Leer.nextInt();
     
          switch(respuesta){
       
           case 1:{
               //Datos para la categoria
               System.out.println("digite el id: ");
               int idC = Leer.nextInt(); // id Categoria
               Leer.nextLine();//limpiar buffer
               System.out.println("digite el nombre: ");
               String nombreC = Leer.nextLine();//nombre categoria 
               
               //datos libro
               System.out.println("=================================");
               int x = 0; 
               ArrayList<Libro> libros = new ArrayList<>(); //para poder usar en libros
               Categoria categoria = new Categoria(idC, libros , nombreC);//se declara despues para pasarle lista vacia
               System.out.println("Necesitamos los datos de los libros que va a agregar a dicha categoria");
               do{
                   System.out.println("digite el isbn del libro: ");
               int isbn = Leer.nextInt();
               Leer.nextLine();//impiar buffer
               
               //datos autor
               System.out.println("Necsitamos lo datos el autor");
               System.out.println("Digite elnombre del autor del libro: ");
               String nombreA = Leer.nextLine();
               System.out.println("Digite el id del autor "+ nombreA + ":");
               int idA = Leer.nextInt();// id Autor
               Leer.nextLine(); //limpiar buffer
               System.out.println("DIigte la nacionalidad del autor: ");
               String pais = Leer.nextLine();
               System.out.print("Digite año de nacimiento del autor: ");
               int anio = Leer.nextInt();
               Leer.nextLine();
               
               //creacion de autor
               Autor autor = new Autor(nombreA, pais, anio, idA);
               //continuacion datos libro
               System.out.println("Digite el titulo del libro asociado al autor " + nombreA + ":");
               String tituloL = Leer.nextLine();
               
               //creación de objeto libro
               
               Libro libro = new Libro(autor, categoria, isbn, tituloL);
               libros.add(libro);
               
               //validación para continuar registrando
               do{
                   System.out.println("Desea registrar mas libros?\n0. Si\n1. No");
               x = Leer.nextInt();
               Leer.nextLine();
               if(x == 1){
                   System.out.println("ok, saliendo");
               }else if (x != 0 ){
                   System.out.println("vuelva a digitar, numero erroneo");
               }
                }while(x != 1 && x != 0);
               }while(x != 1);
               
               //creacion de nueva categoria
              
           break;
           }
           case 2:{
               break;
           }
       
    }
      }while(respuesta != 11);
}
}
