/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_2;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];

        //******* llenando el arreglo *******
        System.out.println("*** Guardando los datos del arrelgo ***");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + " Digite el numero a guardar: ");
            numeros[i] = entrada.nextFloat();

        }

          //*** Los elementos del arreglo
          
          System.out.println("\n*** Los elementos del arreglo en orden inverso ***");
          
          for(int i=4; i>=0; i--){
              
              System.out.println("\t"+numeros[i]);
              
          }
    }

}
