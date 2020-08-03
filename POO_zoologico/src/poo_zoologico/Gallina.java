package poo_zoologico;

import java.util.ArrayList;

public class Gallina implements Animal {

    private String nombre;
    private String raza;

    public Gallina(String nombre, String raza) {
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
        System.out.print("La Gallina esta comiendo ...");
    }

    @Override
    public void sonido() {
        System.out.print("PIIIOOOO PIOOOOOO ");
    }

    @Override
    public String toString() {
        return "\tAnimal Gallina"
                + "\nNombre: " + nombre
                + "\nRaza: " + raza;
    }

    //Declarando el arrayList dentro de la misma clase
    static ArrayList<Gallina> g = new ArrayList<>();

    public void escuchar_gallina() {

        for (Gallina ga : g) {

            System.out.println("");
            System.out.print("\t\t" + ga.getNombre() + " -> ");
            ga.sonido();
            System.out.println("");
        }

    }

    public void alimentar_gallina() {

        for (Gallina ga : g) {
            System.out.println("");
            System.out.print("\t\t" + ga.getNombre() + " -> ");
            ga.comer();
            System.out.println("");
        }

    }

}
