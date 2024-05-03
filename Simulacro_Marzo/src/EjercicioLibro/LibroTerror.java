package EjercicioLibro;

public class LibroTerror extends Libro{

    private int nivelMiedo;


    public LibroTerror() {
    }



    public LibroTerror(String titulo, String autor, int añoPublicacion, int numeroPaginas, int nivelMiedo) {
        super(titulo, autor, añoPublicacion, numeroPaginas);
        this.nivelMiedo = nivelMiedo;
    }

    @Override
    public int numeroPaginas() {
        return getNumeroPaginas();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LibroTerror that)) return false;
        return nivelMiedo == that.nivelMiedo;
    }



    @Override
    public String toString() {
        return super.toString() +"LibroTerror{" +
                "nivelMiedo=" + nivelMiedo +
                '}';
    }

    public int getNivelMiedo() {
        return nivelMiedo;
    }

    public void setNivelMiedo(int nivelMiedo) {
        this.nivelMiedo = nivelMiedo;
    }
}
