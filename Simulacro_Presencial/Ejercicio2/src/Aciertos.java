import java.lang.reflect.Array;
import java.util.Scanner;

public class Aciertos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Comienza el programa : ");

        int[] array =new int[10];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Introduce numero  " +(i+1) +": ");
            array[i]= scanner.nextInt();

        }
        System.out.println(" Contenido el array : " );
        for(int item:array){

            System.out.printf(item+ " ");
        }

        int[] array1=new int[5];

        for (int i = 0; i < array.length ; i++) {
            //i=Math.random()

        }





}}
