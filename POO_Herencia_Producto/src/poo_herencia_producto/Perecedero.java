/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_producto;

public class Perecedero extends Producto {

    private int diasCaducar;

    public Perecedero(int diasCaducar, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.diasCaducar = diasCaducar;
    }

    public int getDiasCaducar() {
        return diasCaducar;
    }

    public void setDiasCaducar(int diasCaducar) {
        this.diasCaducar = diasCaducar;
    }

    @Override
    public String toString() {
        return "\nPerecedero"
                + super.toString() + "\tDias a Caducar: " + diasCaducar;
    }

    @Override
    public double calcular() {

        double precioFinal = super.calcular();

        switch (diasCaducar) {
            case 1:
                precioFinal /= 4;
                break;

            case 2:
                precioFinal /= 3;
                break;

            case 3:
                precioFinal /= 2;
                break;
        }

        return precioFinal;
    }

}
