package Ejercicio2;

import java.util.Objects;

public class Triangulo extends Figura2D{

    private String nombre;
    private int lado1,lado2,lado3;

    public Triangulo() {
    }

    public Triangulo(String nombre, int lado1, int lado2, int lado3) {
        this.nombre = nombre;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "nombre='" + nombre + '\'' +
                ", lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo triangulo)) return false;
        return lado1 == triangulo.lado1 && lado2 == triangulo.lado2 && lado3 == triangulo.lado3 && Objects.equals(nombre, triangulo.nombre);
    }

    @Override
    public double calcularPerimetro() {

        double perimetro=(lado1+lado2+lado3);
        return perimetro;
    }
}
