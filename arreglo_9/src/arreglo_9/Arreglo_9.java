/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_9;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        boolean creciente = true;
        int insetar, sitio = 0, j = 0;

        //llenando el arreglo con los 5 elementos.
        System.out.println(" ***** LLenando el arreglo *****");
        do {
            for (int i = 0; i < 5; i++) {
                System.out.print((i + 1) + ". Inserte un entero: ");
                arreglo[i] = entrada.nextInt();
            }

            //comprobando si el arreglo esta ordenado de forma creciente
            for (int i = 0; i < 4; i++) {
                if (arreglo[i] < arreglo[i + 1]) {
                    creciente = true;
                }
                if (arreglo[i] > arreglo[i + 1]) {

                    creciente = false;
                    break;
                }

            }

            if (creciente == false) {

                System.out.println("El arreglo no esta ordenado en forma creciente");
            }

        } while (creciente == false);

        //pidieno el numero a insertar
        System.out.print("Digite un elemento a insertar: ");
        insetar = entrada.nextInt();

        //en que posicion va el numero
        while (arreglo[j] < insetar && j < 5) {

            sitio++;
            j++;

        }

        //avanzamos una posicion del arreglo
        for (int i = 4; i >= sitio; i--) {

            arreglo[i + 1] = arreglo[i];

        }

           //asigando el numero nuevo
        arreglo[sitio] = insetar;
        
        //Imprimiendo el nuevo arreglo
        
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1)+". "+arreglo[i]);
            
        }
        
        
    }

}
