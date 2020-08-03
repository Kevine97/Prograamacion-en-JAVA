/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_empleados;

/**
 *
 * @author Ara-PC
 */
public class Repartidor extends Empleado {

    private String zona;

    public Repartidor(String zona, String nombre, int edad, double salario) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    @Override
    public String toString() {
        return "\n\nRepartidor: " + super.toString() + "\nZona: " + zona;
    }

    @Override
    public double plus() {
        double dinero=0;
        if (super.getEdad() < 25 && this.zona.equalsIgnoreCase("zona 3")) {

           dinero = super.getSalario() + super.PLUS;
            super.setSalario(dinero);
            // return true;
        }

        return dinero;
    }

}
