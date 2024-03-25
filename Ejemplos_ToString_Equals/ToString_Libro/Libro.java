package ToString_Libro;

import java.time.Year;

public class Libro {

    private String titulo, autor;
    private int añopublicacion,edadlibro;

    public Libro() {
    }

    public Libro(String titulo, String autor, int añopublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añopublicacion = añopublicacion;
        this.edadlibro=obtenerEdadLibro();
    }

   public String toString(){

        return "Título : " +titulo +"\nAutor : " +autor +"\nAño publicación : " +añopublicacion;
    }

    public int obtenerEdadLibro() {
        int añoActual = Year.now().getValue();
        int edadlibro=añoActual - añopublicacion;

        return edadlibro;
    }

    public int getEdadlibro() {
        return edadlibro;
    }

    public void setEdadlibro(int edadlibro) {
        this.edadlibro = edadlibro;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñopublicacion() {
        return añopublicacion;
    }

    public void setAñopublicacion(int añopublicacion) {
        this.añopublicacion = añopublicacion;
    }
}
