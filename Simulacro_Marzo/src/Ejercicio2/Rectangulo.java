package Ejercicio2;

import java.util.Objects;

public class Rectangulo extends Figura2D{

    private String nombre;
    private int base,altura;

    public Rectangulo() {
    }

    public Rectangulo(String nombre, int base, int altura) {
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    public String toString() {
        return "Rectangulo{" +
                "nombre='" + nombre + '\'' +
                ", base=" + base +
                ", altura=" + altura +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangulo that)) return false;
        return base == that.base && altura == that.altura && Objects.equals(nombre, that.nombre);
    }

    @Override
    public void calcularPerimetro() {
        super.calcularPerimetro();
        double perimetro=(base*2)+(altura*2);
    }
}
