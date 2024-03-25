package ToString_Persona;

import ToString_Persona.Persona;

import java.util.Scanner;
/*Enunciado del Ejercicio
Escribe una clase ToString_Persona.Persona que tenga los siguientes atributos:
nombre (String): Representa el nombre de la persona.
edad (int): Representa la edad de la persona.
La clase ToString_Persona.Persona debe tener un constructor que tome el nombre y la edad como parámetros,
 así como un método toString() sobrescrito que devuelva una cadena que incluya el nombre y la edad de la persona.
Escribe un programa principal que cree una instancia de ToString_Persona.Persona, la inicialice con el nombre "Juan" y la edad 30,
 y luego imprima la representación de cadena de la persona utilizando el método toString().
*/
public class Entrada {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Persona persona=new Persona("Juan",30);
       // persona.toString();
        System.out.println(persona.toString());
}}
