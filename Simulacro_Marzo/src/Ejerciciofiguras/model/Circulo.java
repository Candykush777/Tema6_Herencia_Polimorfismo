package Ejerciciofiguras.model;

public class Circulo extends Figura2D {

    private int radio;

    public Circulo() {
    }



    public Circulo(String nombre, int radio) {
        super(nombre);
        this.radio = radio;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    @Override
    public void calcularPerimetro() {

        double perimetro=2*Math.PI*radio;
        System.out.println("El perimetro del circulo es " +perimetro);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circulo circulo)) return false;
        return radio == circulo.radio;
    }


}


