/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_polimorfismo;

public class VehiculoTurismo extends Vehiculo {

    private int nPuertas;

    public VehiculoTurismo(int nPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.nPuertas = nPuertas;
    }

    public int getnPuertas() {
        return nPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "\nMatricula: " + matricula
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nNumero de puertas: " + nPuertas;
    }

}
