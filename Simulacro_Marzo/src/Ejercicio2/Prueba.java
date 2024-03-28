package Ejercicio2;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {

        Circulo circulo=new Circulo("circulo",5);
        Triangulo triangulo=new Triangulo("equílatero",3,3,3);
        Rectangulo rectangulo=new Rectangulo("rectangulo",6,4);

        System.out.println(circulo.toString());
        System.out.println(triangulo.toString());
        System.out.println(rectangulo.toString());

        boolean sonIguales=(circulo.equals(triangulo) && circulo.equals(rectangulo) && triangulo.equals(rectangulo) );

        if(sonIguales){

            System.out.println("Todos los objetos son iguales");
        }else {
            System.out.println("Los objetos no son iguales ");
        }
//Figura2D figura=new Figura2D() {}
        ArrayList<Figura2D>listaFiguras;


    }
}



