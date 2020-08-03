/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_estudiantes;

/**
 *
 * @author Ara-PC
 */
public class Estudiantes extends Persona {

    private int codigoEstudiante;
    private float notaFinal;

    public Estudiantes(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal = notaFinal;

    }

    public void mostrarDatos() {

        System.out.println("\nCodigo: " + codigoEstudiante
                + "\nNombre: " + getNombre()
                + "\nApellido: " + getApellido()
                + "\nEdad: " + getEdad()
                + "\nNota Final: " + notaFinal);
    }

}
