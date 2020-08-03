/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        System.out.println("**** Guardando los datos en el arreglo ****");

            //Llenando el arreglo
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.print((i+1)+" Digite los datos del arreglo: ");
            numeros[i] = entrada.nextFloat();
            
        }
        
        //Bucle For Ech
        
        System.out.println("***** Imprimiendo los elementos del arreglo *****");
        
        for(float i:numeros){
            
            System.out.println("numeros: "+i);
            
        }

    }

}
