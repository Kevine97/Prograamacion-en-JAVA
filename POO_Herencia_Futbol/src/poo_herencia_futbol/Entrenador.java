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
public class Entrenador extends Persona {

    private String estrategia;

    public Entrenador(String estrategia, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.estrategia = estrategia;
    }

    public String getEstrategia() {
        return estrategia;
    }

    public void setEstrategia(String estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public void partidoFutbol() {
        System.out.println("El entrenado dirige un partido de futbol");
    }

    @Override
    public void entrenamiento() {
        System.out.print("\tEl entrenador dirige el entrenamiento");
    }

    public void planificarEntrenamiento() {
        System.out.println("Planificando el entrenamiento 4-4-2");
    }

}
