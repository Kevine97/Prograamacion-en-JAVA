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
public class Vehiculo {

    protected String matricula;
    protected String marca;
    protected String modelo;
    
    public Vehiculo(){
        
    }

    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String mostrarDatos() {

        return "\nMatricula: " + matricula
                + "\nMarca: " + marca
                + "\nModelo: " + modelo;
    }
}
