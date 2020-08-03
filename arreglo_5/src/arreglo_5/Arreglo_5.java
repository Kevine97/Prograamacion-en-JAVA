/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_5;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int tabla1[] = new int[10];
        int tabla2[] = new int[10];
        int tabla3[] = new int[20];

        //Elementos del arrelo A
        System.out.println("Elementos del arreglo A");

        for (int i = 0; i < tabla1.length; i++) {
            System.out.print((i + 1) + ". Ingrese el dato: ");
            tabla1[i] = entrada.nextInt();

        }

        //Elementos del arrelo B
        System.out.println("\nElementos del arreglo 2");

        for (int i = 0; i < tabla2.length; i++) {
            System.out.print((i + 1) + ". Ingrese el dato: ");
            tabla2[i] = entrada.nextInt();

        }

        //Elementos del arreglo c
        int j = 0;
        for (int i = 0; i < tabla1.length; i++) {

            tabla3[j++] = tabla1[i];
            tabla3[j++] = tabla2[i];

        }

        //Mostrando el arreglo c 
        System.out.println("***** Mostrando datos del arreglo 3 ******");
        for (int i = 0; i < tabla3.length; i++) {
            System.out.print(tabla3[i] + " ");

        }

        System.out.println("");
    }

}
