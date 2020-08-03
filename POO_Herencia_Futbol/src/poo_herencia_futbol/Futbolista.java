/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_futbol;

/**
 *
 * @author Ara-PC
 */
public class Futbolista extends Persona {

    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public void partidoFutbol() {
        System.out.println("Juega un partido de futbol");
    }

    @Override
    public void entrenamiento() {
        System.out.print("\tEl futbolista entrena");
    }

    public void entrevista() {
        System.out.println("El futbolista da una entrevista");
    }

}
