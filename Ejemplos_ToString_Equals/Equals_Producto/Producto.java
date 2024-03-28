package Equals_Producto;

import java.util.Objects;

public class Producto {

    private String nombre;
    private int codigo;
    private double precio;

    public Producto() {
    }
@Override
    public String toString(){


        return "Nombre : " +nombre +"\nCódigo : " +codigo;
    }

    public Producto(String nombre, int codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //Método equals

    /*public boolean equals(Producto producto) {

        return this.nombre.equalsIgnoreCase(producto.nombre) && this.codigo == producto.codigo;


    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto producto)) return false;
        return codigo == producto.codigo && nombre.equalsIgnoreCase(producto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, codigo);
    }
}
