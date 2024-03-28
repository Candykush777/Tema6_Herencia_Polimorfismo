package controller_Trabajadores;

import model_Trabajadores.Asalariados;
import model_Trabajadores.Autonomo;
import model_Trabajadores.Jefes;
import model_Trabajadores.Trabajador;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    Scanner scanner = new Scanner(System.in);
    protected ArrayList<Trabajador> listaTrabajadores;

    public Empresa(ArrayList<Trabajador> listaTrabajadores) {
        this.listaTrabajadores = listaTrabajadores;
    }

    public void registrarTrabajador(Trabajador trabajador) {

        listaTrabajadores.add(trabajador);
    }

    public void listarTrabajador() {

        System.out.println("1.- Listar asalariados ");
        System.out.println("2.- Listar Autónomos ");
        System.out.println("3.- Listar todos ");


    }

    public void listarAsalariados() {
        System.out.println("Listado de asalariados:");
        System.out.println(toString()); //manera implicita

    }

    public void listarAutónomos() {
        System.out.println("Listado de autónomos:");
        System.out.println(toString());
    }

    public void listarJefes() {
        System.out.println("Listado de jefes: ");
        System.out.println(toString());
    }

    public void listarTodos() {
        System.out.println("Listado de todos: ");
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String listaTrabajadoresToString = "";

        for (Trabajador trabajador : listaTrabajadores) {

            listaTrabajadoresToString += "- " + trabajador.toString() + "\n";

        }

        return listaTrabajadoresToString;
    }

    public void registrarTrabajadores() {
        System.out.println("¿Que trabajador quieres registrar?");
        System.out.println("1.- Asalariado ");
        System.out.println("2.- Autónomo ");
        System.out.println("3.- Jefe ");
        int option = scanner.nextInt();
        scanner.nextLine();
        Trabajador trabajador = null;
        switch (option) {

            case 1:
                trabajador = registrarAsalariado();
                break;
            case 2:
                trabajador = registrarAutonomo();
                break;
            case 3:
                trabajador = registrarJefes();
                break;
            default:
                System.out.println("Opción no válida");
        }
        if (trabajador != null) ;

        listaTrabajadores.add(trabajador);
        System.out.println(" El trabajador se ha registrado con éxito ");
    }

    public static Trabajador registrarAsalariado() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre : ");

        String nombre = scanner.nextLine();
        System.out.println("Ingrese apellido : ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese DNI : ");
        String dni = scanner.nextLine();
        System.out.println("Ingrese sueldo : ");
        int sueldo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese número de pagas ");
        int numeroPagas = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Contratado? (si/no):");
        String respuesta = scanner.nextLine();
        boolean contratado;
        if (respuesta.equalsIgnoreCase("si")) {
            contratado = true;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contratado = false;


        } else {
            System.out.println("Respuesta no válida. Por favor, ingrese 'si' o 'no'.");
            return null;
        }


        return new Asalariados(nombre, apellido, dni, sueldo, numeroPagas, contratado);
    }

    public static Trabajador registrarAutonomo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre : ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese apellido : ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese DNI : ");
        String dni = scanner.nextLine();
        System.out.println("Ingrese sueldo : ");
        int sueldo = scanner.nextInt();
        scanner.nextLine();
        System.out.println("¿Contratado? (si/no):");
        String respuesta = scanner.nextLine();
        boolean contratado;
        if (respuesta.equalsIgnoreCase("si")) {
            contratado = true;
        } else if (respuesta.equalsIgnoreCase("no")) {
            contratado = false;


        } else {
            System.out.println("Respuesta no válida. Por favor, ingrese 'si' o 'no'.");
            return null;
        }

        return new Autonomo(nombre, apellido, dni, sueldo, contratado);
    }

    public static Trabajador registrarJefes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre : ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese apellido : ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese DNI : ");
        String dni = scanner.nextLine();
        System.out.println("Ingrese nº acciones ");
        int acciones = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el beneficio : ");
        int beneficio = scanner.nextInt();
        return new Jefes(nombre, apellido, dni, acciones, beneficio);
    }
}
