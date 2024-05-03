package Ejerciciofiguras.model;

import Ejerciciofiguras.model.Figura2D;

public class Rectangulo extends Figura2D {

    private int base;
    private int altura;

    public Rectangulo() {
    }



    public Rectangulo(String nombre, int base, int altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        double perimetro=base +altura;
        System.out.println("El perimetro del rectangulo es : " +perimetro);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo that)) return false;
        return base == that.base && altura == that.altura;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
