import java.util.Scanner;

public class Entrada {



    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        Pizza pizza = null; // Pizza inicialmente nula

        // Menú principal
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Crear nueva pizza");
            System.out.println("2. Agregar ingrediente");
            System.out.println("3. Ver información de la pizza");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1:
                    // Crear nueva pizza
                    System.out.print("Ingrese el nombre de la pizza: ");
                    String nombrePizza = scanner.nextLine();
                    pizza = new Pizza(nombrePizza);
                    System.out.println("Pizza creada con éxito.");
                    break;
                case 2:
                    // Agregar ingrediente
                  System.out.print("Ingrese el nombre del ingrediente: ");
                    String nombreIngrediente = scanner.nextLine();
                    System.out.print("Ingrese el precio del ingrediente: ");
                    int precioIngrediente = scanner.nextInt();
                    scanner.nextLine(); // Consumir la nueva línea
                    Ingrediente ingrediente = new Ingrediente(nombreIngrediente, precioIngrediente);
                    pizza.agregarIngrediente(ingrediente);
                    System.out.println("Ingrediente agregado con éxito.");
                    break;
                case 3:
                    // Ver información de la pizza
                    if (pizza == null) {
                        System.out.println("No hay una pizza creada.");
                        break;
                    }
                    System.out.println("Información de la pizza:");
                    System.out.println("Nombre: " + pizza.getNombre());
                    System.out.println("Precio: " + pizza.getPrecio());
                    System.out.println("Ingredientes:");
                    for (Ingrediente i : pizza.getListaIngredientes()) {
                        System.out.println("- " + i.getNombre() + " (precio: " + i.getPrecio() + ")");
                    }
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 4);

        scanner.close();
    }
    }



