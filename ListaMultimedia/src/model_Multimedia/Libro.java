package model_Multimedia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor

public class Libro extends Multimedia{

    private int ISBN;
    private int numeroPaginas;

    public Libro() {
    }

    public Libro(String titulo, String formato, int tamaño, int id, Persona autor, int ISBN, int numeroPaginas) {
        super(titulo, formato, tamaño, id, autor);
        this.ISBN = ISBN;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El código del libro es : " +ISBN);
        System.out.println("El número de páginas es : " +numeroPaginas);
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
