package ToString_Biblioteca;

import ToString_Libro.Libro;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private ArrayList<Libros> listalibros;

    public Biblioteca() {
    }

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.listalibros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libros> getListalibros() {
        return listalibros;
    }

    public void setListalibros(ArrayList<Libros> listalibros) {
        this.listalibros = listalibros;
    }

    public void agregarLibro(Libros libro) {
        listalibros.add(libro);

    }

    public String toString() {

        String Biblioteca= "Nombre Biblioteca : " +nombre +"\n";

        for(Libros libro : listalibros){
            Biblioteca += "- " +libro.getTitulo() +"\n";
        }

        return Biblioteca;
    }
}
