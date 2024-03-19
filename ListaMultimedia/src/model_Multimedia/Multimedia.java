package model_Multimedia;

public class Multimedia {

    private String titulo,autor,formato;
    private int tamaño;

    public Multimedia() {
    }

    public Multimedia(String titulo, String autor, int tamaño, String formato) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamaño = tamaño;
        this.formato = formato;
    }

    public void mostrarDatos(){
        System.out.println("Los datos son : ");
        System.out.println("Título : " +titulo);
        System.out.println("Autor " +autor);
        System.out.println("Tamaño " +tamaño);
        System.out.println("Formato : " +formato);


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

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }
}
