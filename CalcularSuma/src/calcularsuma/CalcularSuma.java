/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularsuma;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class CalcularSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada= new Scanner(System.in);
        float n1,n2,n3;
        float suma;
        
        //pidiendo las calificaciones al usuario
        System.out.println("Digite 3 calificaciones: ");
        n1 = entrada.nextFloat();
        n2 = entrada.nextFloat();
        n3 = entrada.nextFloat();
        
        
        //calculando la suma de las calificaciones
        suma=n1+n2+n3;
        
        System.out.println("\n la suma es: "+suma);
    }
    
}
