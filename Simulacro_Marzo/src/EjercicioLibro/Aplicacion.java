package EjercicioLibro;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Libro libro1=new LibroComedia("Viajes","Pedro",1945,275,5);
        Libro libro2=new LibroTerror("Negro","Joan",1977,655,7);
        Libro libro3=new LibroEnsayo("Dias","Pepe",1999,345,"La vida");

        System.out.println(libro1.toString());
    }
}
