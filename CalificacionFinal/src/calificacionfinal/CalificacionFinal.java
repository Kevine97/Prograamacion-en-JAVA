/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calificacionfinal;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class CalificacionFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        float participacion, parcial, parcial2, examenFinal, notaFinal;
        
        System.out.println("Digite la nota de participacion: ");
        participacion = entrada.nextFloat();
        System.out.println("Digite la nota del primer parcial: ");
        parcial = entrada.nextFloat();
        System.out.println("Digite la nota del parcial II: ");
        parcial2 = entrada.nextFloat();
        System.out.println("Digite la nota del examen final");
        examenFinal = entrada.nextFloat();
        
        participacion *= 0.1f;
        parcial *= 0.25f;
        parcial2 *= 0.25f;
        examenFinal *= 0.40f;
        
        notaFinal= participacion + parcial + parcial2 + examenFinal;
        
        System.out.println("La nota final es: "+notaFinal);
     
        
    }
    
}
