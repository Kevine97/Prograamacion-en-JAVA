/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author Ara-PC
 */
public class Fecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Date fecha = new Date(Calendar.getInstance().getTimeInMillis());
       
        System.out.println(fecha);
    }
    
}
