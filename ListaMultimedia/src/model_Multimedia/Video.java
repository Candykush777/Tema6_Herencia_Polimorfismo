package model_Multimedia;

public class Video extends Multimedia{

    private String director, actor;


    public Video() {
    }

    public Video(String titulo, String autor, int tamaño, String formato, String director, String actor) {
        super(titulo, autor, tamaño, formato);
        this.director = director;
        this.actor = actor;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Director : " +director);
        System.out.println("Actor : " +actor);
    }
}
