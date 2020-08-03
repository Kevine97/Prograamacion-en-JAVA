/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases_1;

import java.util.Date;

/**
 *
 * @author Ara-PC
 */
  class Profesor extends Persona {
    
    
     private Integer numeroEmpleado;

    public Profesor() {
    }

     
    public Profesor(Integer numeroEmpleado, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido);
        this.numeroEmpleado = numeroEmpleado;
    }

    public Profesor(Integer numeroEmpleado, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String sexo, String direccion, Date fechaNacimiento, Integer telefono) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, sexo, direccion, fechaNacimiento, telefono);
        this.numeroEmpleado = numeroEmpleado;
    }

    public Integer getNumeroEmpleado() {
        return numeroEmpleado;
    }

    public void setNumeroEmpleado(Integer numeroEmpleado) {
        this.numeroEmpleado = numeroEmpleado;
    } 
       
    
}
