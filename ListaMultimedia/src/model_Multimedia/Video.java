package model_Multimedia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
public class Video extends Multimedia{

private Persona director;
ArrayList<Persona>actores;


    public Video() {
    }

    public Video(String titulo, String formato, int tamaño, int id, Persona autor, Persona director, ArrayList<Persona> actores) {
        super(titulo, formato, tamaño, id, autor);
        this.director = director;
        this.actores = actores;
    }

    public ArrayList<Persona> getActores() {
        return actores;
    }

    public void setActores(ArrayList<Persona> actores) {
        this.actores = actores;
    }

    public Persona getDirector() {
        return director;
    }

    public void setDirector(Persona director) {
        this.director = director;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println(director.getNombre());
        for(Persona item : actores){
            System.out.println(item.getNombre());
        }

    }
}
