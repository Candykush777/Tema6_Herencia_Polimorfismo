package Ejerciciofiguras.model;

import Ejerciciofiguras.model.Figura2D;

public class Triangulo extends Figura2D {

    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo() {
    }



    public Triangulo(String nombre, int lado1, int lado2, int lado3) {
        super(nombre);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void calcularPerimetro() {
        double perimetro=lado1+lado2+lado3;
        System.out.println("El perimetro del triangulos es " +perimetro);
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "lado1=" + lado1 +
                ", lado2=" + lado2 +
                ", lado3=" + lado3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangulo triangulo)) return false;
        return lado1 == triangulo.lado1 && lado2 == triangulo.lado2 && lado3 == triangulo.lado3;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
