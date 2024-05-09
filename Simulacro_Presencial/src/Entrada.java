import java.util.Scanner;

public class Entrada {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Pizza pizza = null;

        int option;
        do {

            System.out.println("\nElige una opcion : ");

            System.out.println("""
                    \n    1.-Añadir nombre de la pizza
                        2.-Añadir ingrediente y precio
                        3.-Mostrar datos y precio de la pizza
                        4.-Salir del programa""");


            System.out.println();
            System.out.println("------------Ristorante Luigui-----------------");
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {


                case 1:
                    System.out.println("Introduce el nombre de la pizza");
                    String nombre = scanner.nextLine();
                    pizza = new Pizza(nombre);

                    break;

                case 2:
                    System.out.println("Añade un ingrediente a la pizza");
                    String ingredientes = scanner.nextLine();
                    System.out.println("Añade un precio al ingrediente");
                    int precio = scanner.nextInt();
                    scanner.nextLine();
                    Ingrediente ingrediente = new Ingrediente(ingredientes, precio);
                    pizza.añadirIngrediente(ingrediente);
                    break;

                case 3:
                    if (pizza == null) {

                        System.out.println("No hay una pizza creada");
                    }
                    System.out.println("Los datos de la pizza creada son : ");

                    System.out.println("Nombre de la pizza " + pizza.getNombre());
                    System.out.println("El precio de la pizza es : " + pizza.getPrecio());
                    System.out.println("La lista de ingredientes es : ");
                    for (Ingrediente item : pizza.getListaIngredientes()) {
                        System.out.println("(- " + item.getNombre() + ": " + item.getPrecio() + ")");
                    }
                    break;
                case 4:
                    System.out.println("Hasta luego");

                    break;
                default:
                    System.out.println("Elección incorrecta");

            }


        } while (option != 4);
    }
}
