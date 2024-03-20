package controller_Multimedia;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import model_Multimedia.Libro;
import model_Multimedia.Multimedia;
import model_Multimedia.Persona;
import model_Multimedia.Video;

import java.util.ArrayList;
import java.util.Scanner;

@Getter
@NoArgsConstructor
@Setter
@AllArgsConstructor
public class Coleccion {
    Scanner scanner = new Scanner(System.in);
    private ArrayList<Multimedia> listaMultimedia;
    private int id; /* esto ya lo tenemos en multimedia, no entiendo muy bien, será para buscarlo por id y xq no se coge de
    multimedia*/

    private Multimedia existeMultiumedia(int id) {
        for (Multimedia item : listaMultimedia) {
            if (item.getId() == id) return item;
        }
        return null;
    }

    //  String titulo, String formato, int tamaño, int id, Persona autor, int ISBN, int numeroPaginas)
    public void agregarLibro() {
        System.out.println("Has escogido libro");
        System.out.println("Introduce el identificador: ");
        id = scanner.nextInt();
        scanner.nextLine();
        if (existeMultiumedia(id) == null) {
            Libro libro = new Libro();
            Persona persona = new Persona();
            libro.setId(id);
            System.out.println("Introduce el título:");
            libro.setTitulo(scanner.nextLine());
            System.out.println("Introduce formato:");
            libro.setFormato(scanner.nextLine());
            System.out.println("Introduce tamaño:");
            libro.setTamaño(scanner.nextInt());
            scanner.nextLine(); // Consumir la nueva línea pendiente después de nextInt(), pero abajo no ahce falta xq biene otro int y no line
            System.out.println("Introduce nombre:");
            persona.setNombre(scanner.nextLine());
            System.out.println("Introduce DNI:");
            persona.setDni(scanner.nextLine());
            System.out.println("Introduce ISBN:");
            libro.setISBN(scanner.nextInt());
            System.out.println("Introduce número de páginas:");
            libro.setNumeroPaginas(scanner.nextInt());
            scanner.nextLine();
            libro.setAutor(persona);
            listaMultimedia.add(libro);
            System.out.println("Libro agregado correctamente");
        } else {
            System.out.println("EL ID introducido ya existe en la colección");
        }
    }

    //(String titulo, String formato, int tamaño, int id, Persona autor, Persona director, ArrayList<Persona> actores)
    public void agregarVideo() {
        System.out.println("Has escogido Vídeo");
        System.out.println("Introduce el identificador: ");
        id = scanner.nextInt();
        if (existeMultiumedia(id) == null) {
            Video video = new Video();
            Persona director = new Persona();// no sé si tengo que poner persona o director.
            Persona autor = new Persona();
            video.setId(id);
            System.out.println("Introduce el título:");
            video.setTitulo(scanner.nextLine());
            System.out.println("Introduce formato:");
            video.setFormato(scanner.nextLine());
            System.out.println("Introduce tamaño:");
            video.setTamaño(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Introduce nombre:");
            autor.setNombre(scanner.nextLine());
            System.out.println("Introduce DNI:");
            autor.setDni(scanner.nextLine());
            System.out.println("Introduce nombre:");
            director.setNombre(scanner.nextLine());
            System.out.println("Introduce DNI:");
            director.setDni(scanner.nextLine());
            video.setAutor(autor);
            video.setDirector(director);
            listaMultimedia.add(video);
            //no se que hay que hacer con los actores o como añadirlos
        }
    }

    public void agregarAudio() {
        System.out.println("Has escogido Audio");
        System.out.println("Introduce el identificador: ");
        id = scanner.nextInt();
        if(existeMultiumedia(id)==null){}
}}
