package Equals_Producto;

public class Producto {

    private String nombre;
    private int codigo;
    private double precio;

    public Producto() {
    }

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
    public boolean equals(Producto producto) {

        return this.nombre.equalsIgnoreCase(producto.nombre) && this.codigo == producto.codigo;


    }
}
