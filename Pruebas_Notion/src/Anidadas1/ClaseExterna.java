package Anidadas1;

public class ClaseExterna {
    private String dato;
    private int numero;

    public ClaseExterna(String dato, int numero) {
        this.dato = dato;
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "ClaseExterna{" +
                "dato='" + dato + '\'' +
                ", numero=" + numero +
                '}';
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}

