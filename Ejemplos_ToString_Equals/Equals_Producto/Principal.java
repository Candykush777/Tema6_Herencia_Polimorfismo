package Equals_Producto;
/*
¡Por supuesto! Aquí tienes un enunciado para un ejercicio que implica la implementación del método equals() en una clase:
Enunciado del Ejercicio
Escribe una clase llamada Producto que represente un producto en un inventario. La clase debe tener los siguientes atributos:
nombre (String): Representa el nombre del producto.
codigo (int): Representa el código único del producto.
precio (double): Representa el precio del producto.
La clase Producto debe tener un constructor para inicializar estos atributos y un método equals() sobrescrito para verificar
la igualdad entre dos productos. Dos productos se consideran iguales si tienen el mismo código y el mismo nombre, ignorando las diferencias de mayúsculas y minúsculas.
Escribe un programa principal (Main) que cree al menos dos objetos Producto, los inicialice con valores diferentes y
 luego verifique si son iguales utilizando el método equals(). Imprime el resultado de la comparación.
*/

public class Principal {

    public static void main(String[] args) {

        Producto producto1=new Producto("Revista",10,10.50);
        Producto producto2=new Producto("REVISTA",10,15.50);

//mostrar los datos con toString

        System.out.println(producto1.toString());
        System.out.println(producto2.toString());

        //Comparar los dos productor e imprimir el resultado
        boolean sonIguales = producto1.equals(producto2);
        // Imprimir resultado de la comparación
        if (sonIguales){
            System.out.println("Los productos son iguales");
        }else {
            System.out.println("Los productos no son iguales");
        }
    }
}
