/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_7;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];
        boolean creciente = false, decreciente = false;
        //llenando el arreglo
        System.out.println("***** Llenando el arrelgo");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + ". Digite un numero: ");
            numeros[i] = entrada.nextInt();

        }
        
        //recorriendo el bucle
         for (int j = 0; j < 9; j++) {

                //determinando si los numeros son creciete
                if (numeros[j] < numeros[j + 1]) {
                    creciente = true;
                }
                
                if (numeros[j] > numeros[j + 1]) {
                    decreciente = true;
                }

            }

        if (creciente == true && decreciente == false) {

            System.out.println("El arreglo esta de forma creciente");

        } else if (creciente == false && decreciente == true) {

            System.out.println("El arreglo esta de forma descreciente");

        } else if (creciente == true && decreciente == true) {

            System.out.println("El arreglo esta desordenado");
            
        } else if (creciente == false && decreciente == false) {

            System.out.println("Todos los numeros son iguales");

        }

    }

}
