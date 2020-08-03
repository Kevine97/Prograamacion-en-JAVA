package poo_zoologico;

import java.util.ArrayList;
import static poo_zoologico.Gallina.g;

public class Perro implements Animal {

    private String nombre;
    private String raza;

    public Perro() {

    }

    public Perro(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public void comer() {
        System.out.print("El Perro esta comiendo ...");
    }

    @Override
    public void sonido() {
        System.out.print("GUAAUU GUAAUU");
    }

    @Override
    public String toString() {
        return "\tAnimal Perro"
                + "\nNombre: " + nombre
                + "\nRaza: " + raza;
    }

    static ArrayList<Perro> p = new ArrayList<>();

    public void escuchar_perro() {

        for (Perro ga : p) {

            System.out.println("");
            System.out.print("\t\t"+ga.getNombre() + " ->  ");
            ga.sonido();
            System.out.println("");
        }

    }

    public void alimentar_perro() {

        for (Perro ga : p) {
            System.out.println("");
            System.out.print("\t\t"+ga.getNombre() + " -> ");
            ga.comer();
            System.out.println("");
        }

    }
}
