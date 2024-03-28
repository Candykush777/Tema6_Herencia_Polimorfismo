import controller_Trabajadores.Empresa;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Empresa empresa = new Empresa(new ArrayList<>());

        System.out.println("1.- Registrar trabajador ");
        System.out.println("2.- Listar trabajadores ");
        System.out.println("3.- Mostrar Datos ");

        int option= scanner.nextInt();
        scanner.nextLine();
         switch (option){

             case 1 : empresa.registrarTrabajadores();
             break;
             case 2:
         }


    }

}
