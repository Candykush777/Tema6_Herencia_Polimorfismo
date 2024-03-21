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
public final class  Video extends Multimedia{

private Persona director;
private ArrayList<Persona>actores;


    public Video() {
        actores = new ArrayList<>();
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
        director.mostrarDatos();
        for(Persona item : actores){
            System.out.println(item.getNombre());
        }

    }
}
