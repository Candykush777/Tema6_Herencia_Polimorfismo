package EjercicioLibro;

import EjercicioLibro.Controller.Biblioteca;

import java.util.ArrayList;
import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        ArrayList<Libro>listaLibros=new ArrayList<>();
        Biblioteca biblioteca=new Biblioteca("Biblio","Edu");

        Libro libro1=new LibroComedia("Viajes","Pedro",1945,275,5);
        Libro libro2=new LibroTerror("Negro","Joan",1977,655,7);
        Libro libro3=new LibroEnsayo("Dias","Pepe",1999,345,"La vida");



        System.out.println("Mostar libros : ");
        System.out.println(libro1.toString());

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
biblioteca.mostrarBiblioteca();

      /*  do {
            System.out.println("""
                    1.-Añadir libros comedia a la lista
                    2.-Añadir libros terror a la lista
                    3.-Añadir libros ensayo a la lista
                    4.-Borrar libros de la lista
                    5.-Mostrar libro de la lista
                    6.-buscar libro de la lista
                    8.-Numero de libros en la biblioteca
                    7.-Salir del menu
                    """);
            int option;
            option= scanner.nextInt();
            scanner.nextLine();

            switch (option) {



                case 1:
                    System.out.println("Introducir titulo : ");
                    String titulo= scanner.nextLine();
                    System.out.println("Introduce autor");
                    String autor= scanner.nextLine();
                    System.out.println("Introduce año");
                    int año= scanner.nextInt();
                    System.out.println("Introduce numero paginas");
                    int numeroPaginas= scanner.nextInt();
                    System.out.println("Introduce nivel humor");
                    int nivelhumor= scanner.nextInt();


Libro nuevolibro=new LibroComedia();
listaLibros.add(nuevolibro);


                    break;
                case 2:
                    System.out.println("Introducir titulo : ");
                    String titulo1= scanner.nextLine();
                    System.out.println("Introduce autor");
                    String autor2= scanner.nextLine();
                    System.out.println("Introduce año");
                    int año3= scanner.nextInt();
                    System.out.println("Introduce numero paginas");
                    int numeroPaginas1= scanner.nextInt();
                    System.out.println("Introduce nivel humor");
                    int nivelMiedo= scanner.nextInt();
                    Libro nuevoLibro=new LibroTerror();
                    listaLibros.add(nuevoLibro);

                    break;
                case 3:
                    System.out.println("Introducir titulo : ");
                    String titulo2= scanner.nextLine();
                    System.out.println("Introduce autor");
                    String autor3= scanner.nextLine();
                    System.out.println("Introduce año");
                    int año4= scanner.nextInt();
                    System.out.println("Introduce numero paginas");
                    int numeroPaginas5= scanner.nextInt();
                    System.out.println("Introduce nivel humor");
                    String tema= scanner.nextLine();
                    Libro nuevoLibros=new LibroEnsayo();
                    listaLibros.add(nuevoLibros);

                    break;
                case 4:
                    System.out.println("Introduce el libro que quieres borrar : ");
                    String titulo3= scanner.nextLine();
                    biblioteca.borrarLibro(ge);



                    break;
                case 5:

                    break;

                default:
                    System.out.println("Numero incorrecto ");


            }

            while (option != 7) {
                System.out.println("Error elección");
            }*/
        }
}
