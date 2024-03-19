import model_Multimedia.Libro;
import model_Multimedia.Video;
public class Entrada {

    public static void main(String[] args) {

        Libro libro=new Libro("Lolita","Nabokop",200,"Papel",6996, 457);
        Video video=new Video("X", "Rocco",130,"HD","Steven OH","Megan Fox");
        libro.mostrarDatos();
        System.out.println("-----------------------------");
        video.mostrarDatos();
    }
}
