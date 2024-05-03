package EjercicioLibro;

import java.util.Objects;

public class LibroEnsayo extends Libro{

    private String tema;


    public LibroEnsayo() {
    }

    public LibroEnsayo(String titulo, String autor, int añoPublicacion, int numeroPaginas, String tema) {
        super(titulo, autor, añoPublicacion, numeroPaginas);
        this.tema = tema;
    }

    @Override
    public String toString() {
        return super.toString() +"LibroEnsayo{" +
                "tema='" + tema + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroEnsayo that)) return false;
        return Objects.equals(tema, that.tema);
    }



    @Override
    public int numeroPaginas() {
        return getNumeroPaginas();
    }
}
