package ToString_Biblioteca;

public class Entrada3 {

    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca("Cervantes");
        Libros libro1 = new Libros("Quijote",455);
        Libros libro2 = new Libros("Parque Jurásico",676);
        Libros libro3 = new Libros("La Cenicienta",123);


        biblio.agregarLibro(libro1);
        biblio.agregarLibro(libro2);
        biblio.agregarLibro(libro3);

        System.out.println(biblio.toString());

    }
}
