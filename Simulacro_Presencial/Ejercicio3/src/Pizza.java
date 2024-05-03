import java.util.ArrayList;
import java.util.Scanner;

public class Pizza {

    private String nombre;
    private int precio;
    private ArrayList<Ingrediente> listaIngredientes;

    public Pizza() {
    }

    public Pizza(String nombre) {
        this.nombre = nombre;
        this.precio = 0;
        this.listaIngredientes = new ArrayList<>();
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        listaIngredientes.add(ingrediente);
        precio += ingrediente.getPrecio();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getListaIngredientes() {
        return listaIngredientes;
    }

    public void setListaIngredientes(ArrayList<Ingrediente> listaIngredientes) {
        this.listaIngredientes = listaIngredientes;
    }
}


