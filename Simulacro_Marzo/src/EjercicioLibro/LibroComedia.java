package EjercicioLibro;

public class LibroComedia extends Libro {

    private int nivelHumor;

    @Override
    public int numeroPaginas() {
        return getNumeroPaginas();
    }

    public LibroComedia() {
    }

    public LibroComedia(String titulo, String autor, int añoPublicacion, int numeroPaginas, int nivelHumor) {
        super(titulo, autor, añoPublicacion, numeroPaginas);
        this.nivelHumor = nivelHumor;
    }

    public int getNivelHumor() {
        return nivelHumor;
    }

    public void setNivelHumor(int nivelHumor) {
        this.nivelHumor = nivelHumor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroComedia that)) return false;
        return nivelHumor == that.nivelHumor;
    }

    @Override
    public String toString() {
        return super.toString() +"LibroComedia{" +
                "nivelHumor=" + nivelHumor +
                '}';
    }
}


