package poo_zoologico;

import java.util.ArrayList;
import static poo_zoologico.Leon.l;
import static poo_zoologico.Perro.p;

public class Gato implements Animal {

    private String nombre;
    private String raza;

    public Gato(String nombre, String raza) {
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
        System.out.print("El Gato esta comiendo ...");

    }

    @Override
    public void sonido() {
        System.out.print("MIAOOO MIAOOO");
    }

    @Override
    public String toString() {
        return "\tAnimal Gato"
                + "\nNombre: " + nombre
                + "\nRaza: " + raza;
    }

    static ArrayList<Gato> gat = new ArrayList<>();

    public void alimentar_Gato() {

       for (Gato ga : gat) {
            System.out.println("");
            System.out.print("\t\t"+ga.getNombre() + " -> ");
            ga.comer();
            System.out.println("");
        }

    }

    public void escuchar_Gato() {

        for (Gato ga : gat) {
            System.out.println("");
            System.out.print("\t\t" + ga.getNombre() + " -> ");
            ga.sonido();
            System.out.println("");
        }

    }
}
