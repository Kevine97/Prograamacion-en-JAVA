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
public class Sucursal {

    private int numeroSucursal;
    private String direccion;
    private String ciudad;

    public Sucursal(int numeroSucursal, String direccion, String ciudad) {
        this.numeroSucursal = numeroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }

    public int getNumeroSucursal() {
        return numeroSucursal;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String mostarSucursal() {

        return "\nNumero Sucursal: " + numeroSucursal
                + "\tDireccion: " + direccion
                + "\tCiudad: " + ciudad;
    }

    public double calcularPrecio(Paquete t) {
        double precio;

        precio = t.getPeso();

        if (t.getPrioridad() == 1) {
            precio += 10;
        }
        if (t.getPrioridad() == 2) {
            precio += 20;
        }

        return precio;
    }

}
