/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_poligono;

public abstract class Polligono {

    protected int numeroLados;

    public Polligono(int numeroLados) {
        this.numeroLados = numeroLados;
    }

    public int getNumeroLados() {
        return numeroLados;
    }

    @Override
    public String toString() {
        return "Numero de Lados: " + numeroLados;
    }

    //Declarando el meteodo Area como abstracto
    public abstract double area();

}
