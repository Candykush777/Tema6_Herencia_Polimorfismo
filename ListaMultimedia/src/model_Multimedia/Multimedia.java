package model_Multimedia;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor



public class Multimedia {

    private String titulo,formato;
    private int tamaño,id;
    private Persona autor;

    public Multimedia() {
    }
//xq no pone ID aqui
    public Multimedia(String titulo, String formato, int tamaño, int id, Persona autor) {
        this.titulo = titulo;
        this.formato = formato;
        this.tamaño = tamaño;
        this.id = id;
        this.autor = autor;
    }




    public void mostrarDatos(){
        System.out.println("Los datos son : ");
        System.out.println("Título : " +titulo);
        System.out.println(autor.getNombre());
        System.out.println("Formato : " +formato);
        System.out.println("Tamaño " +tamaño);
        System.out.println("ID : " +id);





    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Persona getAutor() {
        return autor;
    }

    public void setAutor(Persona autor) {
        this.autor = autor;
    }}

