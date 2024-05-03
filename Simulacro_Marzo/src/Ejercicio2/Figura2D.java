package Ejercicio2;

import java.util.ArrayList;

public abstract class Figura2D implements FiguraGeometrica {

    private String nombre;

    private ArrayList<Figura2D>listafiguras;

    public Figura2D(ArrayList<FiguraGeometrica> listafiguras) {
        this.listafiguras = new ArrayList<>();
    }
    public void añadirFigura(FiguraGeometrica figura){
       // listafiguras.add();

    }

    public Figura2D() {
    }

    public Figura2D(String nombre) {
        this.nombre = nombre;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
