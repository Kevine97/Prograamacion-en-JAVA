/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_sucursal;

/**
 *
 * @author Ara-PC
 */
public class Paquete {

    private int numeroPaquete;
    private String dni;
    private double peso;
    private int prioridad;

    public Paquete(int numeroPaquete, String dni, double peso, int prioridad) {
        this.numeroPaquete = numeroPaquete;
        this.dni = dni;
        this.peso = peso;
        this.prioridad = prioridad;
    }

    public int getNumeroPaquete() {
        return numeroPaquete;
    }

    public String getDni() {
        return dni;
    }

    public double getPeso() {
        return peso;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public String MostrarPaquetes() {

        return "\nNumero paquete: " + numeroPaquete
                + "\tDNI: " + dni
                + "\tPeso: " + peso
                + "\tPrioridad: " + prioridad;

    }

}
