
import controller_Multimedia.Coleccion;
import model_Multimedia.Audio;
import model_Multimedia.Libro;
import model_Multimedia.Persona;
import model_Multimedia.Video;

import java.util.Scanner;


public class Entrada {

    public static void main(String[] args) {
        Coleccion coleccion = new Coleccion();
        Scanner scanner = new Scanner(System.in);
        int option;


        do {
            System.out.println("\nElige una opción del Menú :");

            System.out.println(""" 
                                        
                    1.- Añadir a la colección
                    2.- Eliminar de la colección
                    3.- Listar elementos
                    4.- Salir
                    """);
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    coleccion.añadirColeccion();
                    break;
                case 2:
                    coleccion.eliminarMultimedia(scanner.nextInt());
                case 3:
                    coleccion.listarMultimedia();
                default:
                    System.out.println("Has elegido una opción erronea");

            }


        } while (option != 4);


    }
}
