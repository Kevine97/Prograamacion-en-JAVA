package poo_zoologico;

import java.util.ArrayList;
import static poo_zoologico.Gallina.g;

public class Leon implements Animal {

    private String nombre;
    private String raza;

    public Leon(String nombre, String raza) {
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
        System.out.print("El Leon esta comiendo ...");
    }

    @Override
    public void sonido() {
        System.out.print("El Leon esta rugiendo ...");
    }

    @Override
    public String toString() {
        return "Animal Leon"
                + "Nombre: " + nombre
                + "Raza: " + raza;
    }

    static ArrayList<Leon> l = new ArrayList<>();

    public void escuchar_Leon() {

        for (Leon ga : l) {
            System.out.println("");
            System.out.print("\t\t" + ga.getNombre() + " -> ");
            ga.sonido();
            System.out.println("");
        }

    }

    public void alimentar_Leon() {

        for (Leon ga : l) {
            System.out.println("");
            System.out.print("\t\t" + ga.getNombre() + " -> ");
            ga.comer();
            System.out.println("");
        }

    }
}
