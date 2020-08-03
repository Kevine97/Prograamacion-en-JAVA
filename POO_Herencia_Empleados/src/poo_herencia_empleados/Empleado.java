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
public abstract class Empleado {

    private String nombre;
    private int edad;
    private double salario;

    public final double PLUS = 300;

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public abstract double plus();

    @Override
    public String toString() {
        return "Empleado" + "\nNombre: " + nombre + "\nEdad: " + edad + "\nSalario: " + salario;
    }

}
