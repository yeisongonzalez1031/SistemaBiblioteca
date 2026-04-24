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
      //lista de autores
      List<Autor> autores = new ArrayList<>();
      ArrayList<Libro> libros = new ArrayList<>(); //para poder agregar libros
      List<Categoria> categorias = new ArrayList<>();
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
               
               
               //creacion de nueva categoria
               Categoria categoria = new Categoria(idC, libros , nombreC);//se declara despues para pasarle lista vacia
               
               categorias.add(categoria); // añadir categorias a una lista, por si acaso
               System.out.println("Necesitamos los datos de los libros que va a agregar a dicha categoria");
               do{
                   System.out.println("Digite el isbn del libro: ");
               int isbn = Leer.nextInt();
               Leer.nextLine();//impiar buffer
               
               //datos autor
               System.out.println("Necesitamos lo datos el autor");
               System.out.println("Digite el nombre del autor del libro: ");
               String nombreA = Leer.nextLine();
               System.out.println("Digite el id del autor "+ nombreA + ":");
               int idA = Leer.nextInt();// id Autor
               Leer.nextLine(); //limpiar buffer
               System.out.println("Diigte la nacionalidad del autor: ");
               String pais = Leer.nextLine();
               System.out.print("Digite año de nacimiento del autor: ");
               int anio = Leer.nextInt();
               Leer.nextLine();
               
               //creacion de autor
               Autor autor = new Autor(nombreA, pais, anio, idA);
               autores.add(autor);//agregar autor a la lista
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
              
           break;
           }
           case 2:{
               //datos autor
               System.out.println("Digite el nombre del autor que desea: ");
               String nombreA = Leer.nextLine();
               System.out.println("Digite el id del autor "+ nombreA + ":");
               int idA = Leer.nextInt();// id Autor
               Leer.nextLine(); //limpiar buffer
               System.out.println("Diigte la nacionalidad del autor: ");
               String pais = Leer.nextLine();
               System.out.print("Digite año de nacimiento del autor: ");
               int anio = Leer.nextInt();
               Leer.nextLine();
               
               //creacion de autor
               Autor autor = new Autor(nombreA, pais, anio, idA);
               break;
           }
           case 3: {
    int x = 0;
    boolean encontrado = false;
    Autor autorBuscado = null;

    System.out.println("Digite el isbn del libro: ");
    int isbn = Leer.nextInt();
    Leer.nextLine();

    do {
        System.out.println("el autor ya existe en el sistema? \n0. si\n1. no");
        x = Leer.nextInt();
        Leer.nextLine();

        if (x != 0 && x != 1) {
            System.out.println("No se digito un numero adecuado, por favor repetir");
        }

    } while (x != 0 && x != 1);

    // no está en el sistema
    if (x == 1) {

        System.out.println("Necesitamos los datos del autor");
        System.out.println("Digite el nombre del autor del libro: ");
        String nombreA = Leer.nextLine();

        System.out.println("Digite el id del autor " + nombreA + ":");
        int idA = Leer.nextInt();
        Leer.nextLine();

        System.out.println("Digite la nacionalidad del autor: ");
        String pais = Leer.nextLine();

        System.out.print("Digite año de nacimiento del autor: ");
        int anio = Leer.nextInt();
        Leer.nextLine();

        Autor autor = new Autor(nombreA, pais, anio, idA);
        autores.add(autor);

        autorBuscado = autor;

    } 
    // sí está en el sistema
    else {

        System.out.println("Digite el nombre del autor");
        String nombre = Leer.nextLine();

        for (int i = 0; i < autores.size(); i++) {
            if (nombre.equals(autores.get(i).getNombre())) {
                System.out.println("autor encontrado");
                autorBuscado = autores.get(i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("autor no encontrado");
        }
    }

    if (encontrado || x == 1) {
        System.out.println("Digite el titulo del libro asociado al autor " 
                + autorBuscado.getNombre() + ":");
        String tituloL = Leer.nextLine();

        Libro libro = new Libro(autorBuscado, categoria, isbn, tituloL);
        libros.add(libro);
    }

    break;
}
               
}
}while(respuesta != 11);
}
}