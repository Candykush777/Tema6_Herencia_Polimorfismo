package model_Multimedia;


public class Audio extends Multimedia {

    private String soporte;
    private int duracion;

    public Audio() {
    }

    public Audio(String titulo, String formato, int tamaño, int id, Persona autor, String soporte, int duracion) {
        super(titulo, formato, tamaño, id, autor);
        this.soporte = soporte;
        this.duracion = duracion;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("El soporte del audio es : " +soporte);
        System.out.println("La duración es  : " +duracion);
    }

    public String getSoporte() {
        return soporte;
    }

    public void setSoporte(String soporte) {
        this.soporte = soporte;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
