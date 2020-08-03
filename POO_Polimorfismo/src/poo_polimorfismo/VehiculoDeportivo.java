/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_polimorfismo;

/**
 *
 * @author Ara-PC
 */
public class VehiculoDeportivo extends Vehiculo {

    private int cilindrada;

    public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    @Override
    public String mostrarDatos() {
        return "\nMatricula: " + matricula
                + "\nMarca: " + marca
                + "\nModelo: " + modelo
                + "\nCilindrada: " + cilindrada;
    }

}
