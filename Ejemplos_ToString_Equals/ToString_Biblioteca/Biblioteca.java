package ToString_Biblioteca;

import ToString_Libro.Libro;

import java.util.ArrayList;
import java.util.Objects;

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
@Override
    public String toString() {

        String Biblioteca= "Nombre Biblioteca : " +nombre +"\n";

        for(Libros libro : listalibros){
            Biblioteca += "- " +libro.getTitulo() +"\n";
        }

        return Biblioteca;
    }
    /*   @Override
    public String toString() {
        return "Biblioteca{" +
                "nombre='" + nombre + '\'' +
                ", listalibros=" + listalibros +
                '}';
    }  Esto es lo que me hace generate*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Biblioteca that)) return false;
        return Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
}
