/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horasemanadias;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class HoraSemanaDias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        int horasTotales, semanas,dias,horas;
        
        System.out.println("Digite el numero de horas totales: ");
        horasTotales = entrada.nextInt();
        
        semanas = horasTotales / 165;
        dias = horasTotales%165 /24;
        horas= horasTotales%24;
        
        System.out.println("Semanas: "+semanas+" dias: "+dias +" horas: "+horas);
        
        
    }
    
}
