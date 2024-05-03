package Ejerciciofiguras.model;

import java.util.ArrayList;

public abstract class Figura2D implements FiguraGeometrica {

    private String nombre;
    private double perimetro;
    private ArrayList<Figura2D> listaFiguras=new ArrayList<>();


    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public Figura2D() {
    }

    public void añadirFigura(Figura2D figura){
        listaFiguras.add(figura);
    }


    public void mostrarDatos() {
        System.out.println("Mostrar lista de figuras y sus datos:");
        for (Figura2D figura : listaFiguras) {
            System.out.println("Nombre: " +getNombre());

        }
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

    @Override
    public String toString() {
        return "Figura2D{" +
                "nombre='" + nombre + '\'' +
                ", perimetro=" + perimetro +
                '}';
    }
}
