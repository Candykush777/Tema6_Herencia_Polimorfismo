package EjercicioLibro.Controller;

import EjercicioLibro.Libro;

import java.util.ArrayList;

public class Biblioteca {

    private String nombre;
    private String director;
    ArrayList<Libro>listaLibros=new ArrayList<>();

    public Biblioteca() {
    }

    public Biblioteca(String nombre, String director) {
        this.nombre = nombre;
        this.director = director;
    }


    public void agregarLibro(Libro libro){

        listaLibros.add(libro);
    }
    public void borrarLibro(Libro libro){
        listaLibros.remove(libro);
    }
    public void numeroLibros(Libro libro){
        for (int i = 0; i < listaLibros.size(); i++) {

            Libro libroActual = listaLibros.get(i);

            if (libroActual.getTitulo().equalsIgnoreCase(libroActual.getTitulo())) {

                listaLibros.remove(i);
                System.out.println("Libro '" + libroActual.getTitulo() + "' borrado correctamente.");
                return;
            }

        }

        System.out.println("No se encontró ningún libro con el título '" + libro.getTitulo() + "'.");
    }

    public void mostrarBiblioteca(){
        System.out.println("Mostrar los libros : ");
        for (Libro libro:listaLibros){

            System.out.println(libro);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
}
