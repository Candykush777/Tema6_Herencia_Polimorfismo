package ToString_Biblioteca;

public class Libros {

private String titulo;
private int nPaginas;

    public Libros() {
    }

    public Libros(String titulo, int nPaginas) {
        this.titulo = titulo;
        this.nPaginas = nPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
}
