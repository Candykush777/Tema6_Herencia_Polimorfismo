package model_Trabajadores;

public class Asalariados extends Trabajador{

    protected int sueldo, numeroPagas;
    protected boolean contratado;

    public Asalariados() {
    }

    public Asalariados(String nombre, String apellido, String dni, int sueldo, int numeroPagas, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.numeroPagas = numeroPagas;
        this.contratado = contratado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getNumeroPagas() {
        return numeroPagas;
    }

    public void setNumeroPagas(int numeroPagas) {
        this.numeroPagas = numeroPagas;
    }

    public boolean isContratado() {
        return contratado;
    }

    public void setContratado(boolean contratado) {
        this.contratado = contratado;
    }
}
