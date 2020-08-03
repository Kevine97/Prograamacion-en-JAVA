/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_futbol;

/**
 *
 * @author Ara-PC
 */
public class Doctor extends Persona {
    
    private String titulacion;
    private int añoExp;


    public Doctor(String titulacion, int añoExp, String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.titulacion = titulacion;
        this.añoExp = añoExp;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñoExp() {
        return añoExp;
    }

    public void setAñoExp(int añoExp) {
        this.añoExp = añoExp;
    }
    
      @Override
    public void partidoFutbol() {
        System.out.println("Da asistencia medica en un partido");
    }

    @Override
    public void entrenamiento() {
        System.out.print("\tDa asistencia en un entranamiento");
    }
    
    public void curarLesion(){
        System.out.println("Curando lesion");
    }
    
    
    
    
}
