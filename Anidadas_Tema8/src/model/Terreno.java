package model;

public class Terreno {

    private int metros;
    private Casa casa;

    public Terreno() {
    }

    public Terreno(int metros) {

        this.metros = metros;
    }

    public void construircasa(){
        this.casa=new Casa(4,false);
    }

    public void realizarObras(){

        casa.construirPiscina();
    }

    public void mostrarDatos(){
        //casa.construirPiscina();
        System.out.println("Mostrando datos de la Terreno");
        System.out.println("metros = " + metros);
        getCasa().mostrarDatos();
        
    }

    @Override
    public String toString() {
        return "Terreno{" +
                "metros=" + metros +
                ", casa=" + casa +
                '}';
    }

    public int getMetros() {
        return metros;
    }

    public void setMetros(int metros) {
        this.metros = metros;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }

    class Casa{
//no hace falta poner private xq no es publico
int numeroHabitaciones;
boolean piscina;
int metros;
     public Casa() {
     }

     public void construirAnexo(int metros){
         System.out.println("Construyendo anexo en la casa ");
     }
     public void construirPiscina(){
         if (Terreno.this.metros<100)//para coger el de terreno y no el de class casa
         System.out.println("Construyendo una piscina");
         piscina=true;
     }

     public Casa(int numeroHabitaciones, boolean piscina) {
         this.numeroHabitaciones = numeroHabitaciones;
         this.piscina = piscina;
     }

     public void mostrarDatos(){
         System.out.println("Sacando datos de la casa");
         System.out.println("numeroHabitaciones = " + numeroHabitaciones);
         System.out.println("piscina = " + piscina);
     }

        @Override
        public String toString() {
            return "Casa{" +
                    "numeroHabitaciones=" + numeroHabitaciones +
                    ", piscina=" + piscina +
                    '}';
        }

        public int getNumeroHabitaciones() {
         return numeroHabitaciones;
     }

     public void setNumeroHabitaciones(int numeroHabitaciones) {
         this.numeroHabitaciones = numeroHabitaciones;
     }

     public boolean isPiscina() {
         return piscina;
     }

     public void setPiscina(boolean piscina) {
         this.piscina = piscina;
     }
 }
}
