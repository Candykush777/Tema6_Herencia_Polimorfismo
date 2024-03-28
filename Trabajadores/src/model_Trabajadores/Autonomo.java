package model_Trabajadores;

public class Autonomo extends Trabajador{

    protected int sueldo;
    protected boolean contratado;

    public Autonomo() {
    }

    public Autonomo(String nombre, String apellido, String dni, int sueldo, boolean contratado) {
        super(nombre, apellido, dni);
        this.sueldo = sueldo;
        this.contratado = contratado;
    }


}
