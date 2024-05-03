package Ejercicio2;

import java.util.Objects;

public class Circulo extends Figura2D{
//No entiendo pr que en el ejercicio en el punto 2 te hace poner
// la herencia cuando me fastidia el ejericico, eso me lo tiene que decir de primeras.
    private String nombre;//no puedo quitarlo
    private int radio;

    public Circulo() {
    }

    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "nombre='" + nombre + '\'' +
                ", radio=" + radio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;
        return radio == circulo.radio && Objects.equals(nombre, circulo.nombre);
    }

    @Override
    public double calcularPerimetro() {

        double perimetro=2*Math.PI*radio;
        return perimetro;
    }
}
