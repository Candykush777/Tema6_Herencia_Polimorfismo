package ToString_Libro;

import ToString_Libro.Libro;

public class Entrada1 {
    /*Enunciado del Ejercicio
Escribe una clase ToString_Libro.Libro que represente un libro con los siguientes atributos:
titulo (String): Representa el título del libro.
autor (String): Representa el autor del libro.
anioPublicacion (int): Representa el año de publicación del libro.
La clase ToString_Libro.Libro debe tener un constructor que tome el título, el autor y el año de publicación como parámetros,
así como un método toString() sobrescrito que devuelva una cadena que incluya el título,
 el autor y el año de publicación del libro.
Además, añade un método obtenerEdadLibro() que calcule la edad del libro en años, es decir,
la diferencia entre el año actual y el año de publicación del libro.
Escribe un programa principal que cree una instancia de ToString_Libro.Libro, la inicialice con un título,
autor y año de publicación a elección, y luego imprima la representación de cadena del libro y su edad.
    */
    public static void main(String[] args) {

        Libro libro =new Libro("Cien años de Soledad","Garcia Marquez",1975);
        //System.out.println(libro); seria de manera implicita
        System.out.println(libro.toString()); //esto de manera explicita y llamando a un método sobreescrito
        libro.obtenerEdadLibro();
        System.out.println("La edad del libro es : " +libro.getEdadlibro());
    }
}
