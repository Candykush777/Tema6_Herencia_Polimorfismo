package model_Multimedia;

public class Libro extends Multimedia{

    private int ISBN;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(String titulo, String autor, int tamaño, String formato, int ISBN, int numeroPaginas) {
        super(titulo, autor, tamaño, formato);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El código del libro es : " +ISBN);
        System.out.println("El número de páginas es : " +numeroPaginas);
    }

}
