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
public class Clases_1 extends Persona {

    private Integer carnet;
    
    public Clases_1(Integer carnet, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido);
        this.carnet = carnet;
    }

    public Clases_1(Integer carnet, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String sexo, String direccion, Date fechaNacimiento, Integer telefono) {
        super(primerNombre, segundoNombre, primerApellido, segundoApellido, sexo, direccion, fechaNacimiento, telefono);
        this.carnet = carnet;
    }

    public Integer getCarnet() {
        return carnet;
    }

    public void setCarnet(Integer carnet) {
        this.carnet = carnet;
    }

    public Clases_1() {
    }


}
