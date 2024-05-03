package Ejerciciofiguras.model;

import Ejerciciofiguras.model.Circulo;
import Ejerciciofiguras.model.Figura2D;
import Ejerciciofiguras.model.Rectangulo;
import Ejerciciofiguras.model.Triangulo;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Circulo circulo=new Circulo("circulo",5);
        Triangulo triangulo=new Triangulo("equilatero",5,5,5);
        Rectangulo rectangulo=new Rectangulo("rectangulo",6,4);



        System.out.println(" ¿ Son iguales alguno de las figuras ? ");
        boolean esigual=(circulo.equals(triangulo) && circulo.equals(rectangulo) && rectangulo.equals(triangulo));

        if(esigual){
            System.out.println("\nLas figuras son iguales");
        }else {
            System.out.println("\nLos figuras no son iguales");
        }

        System.out.println("Mostrando los datos de las figuras");
        System.out.println(circulo.toString());
        System.out.println(rectangulo.toString());
        System.out.println(triangulo.toString());
circulo.calcularPerimetro();
rectangulo.calcularPerimetro();
triangulo.calcularPerimetro();

Figura2D figura1=new Circulo("circulo",5);
Figura2D figura2=new Rectangulo("rectangulo",6,4);
Figura2D figura3=new Triangulo("triangulo",5,5,5);
figura1.añadirFigura(figura1);
figura2.añadirFigura(figura2);
figura3.añadirFigura(figura3);
        System.out.println("Mostrar lista figuras y sus datos");

figura1.mostrarDatos();
figura2.mostrarDatos();
figura3.mostrarDatos();
figura1.calcularPerimetro();
figura2.calcularPerimetro();
figura3.calcularPerimetro();
    }

}
