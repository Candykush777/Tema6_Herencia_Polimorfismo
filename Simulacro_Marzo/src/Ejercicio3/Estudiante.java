package Ejercicio3;

import java.util.Objects;

public class Estudiante {

    private String nombre;
    private int edad;
    private double nota1,nota2,nota3;

    public static void main(String[] args) {
        Estudiante estudiante1=new Estudiante("Juan",27,3.2,5.6,8.3);
        Estudiante estudiante2=new Estudiante("Ana",35,7.4,6.5,9);

        System.out.println(estudiante1.toString());
        System.out.println(estudiante2.toString());

        boolean sonIguales=estudiante1.equals(estudiante2);


        if(sonIguales){
            System.out.println("Son iguales los objetos");

        }else{
            System.out.println("Son diferente los objetos");
        }

    }

    public Estudiante() {
    }

    public Estudiante(String nombre, int edad, double nota1, double nota2, double nota3) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double calcularNotamedia(){
        double notamedia= (nota1+nota2+nota3)/3;
        return notamedia;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante that)) return false;
        return edad == that.edad && Double.compare(nota1, that.nota1) == 0 && Double.compare(nota2, that.nota2) == 0 && Double.compare(nota3, that.nota3) == 0 && Objects.equals(nombre, that.nombre);
    }


}
