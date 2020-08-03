/*
 * Programa que permite eliminar el elemento de un arreglo en base a su posicion.
 */
package arreglo_10;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int arreglo[] = new int[10];
        int posicion;

        //Llenando el arreglo con 10 elementos
        System.out.println("***** Llenando el arreglo ***** ");
        for (int i = 0; i < arreglo.length; i++) {

            System.out.println((i + 1) + ". Inserte un entero: ");
            arreglo[i] = entrada.nextInt();

        }

        //validando que solo ingrese las posiciones del arreglo
        do {
            System.out.print("Inserte la posicion(0-9): ");
            posicion = entrada.nextInt();
        } while (posicion < 0 || posicion > 9);

         //moviendo los elementos del arreglo una posicion
        for (int i = posicion; i < 9; i++) {

            arreglo[i] = arreglo[i + 1];
        }
        
        //mostrando los elementos del arreglo
        System.out.println("**** Elementos nuevos *****");
        for (int i = 0; i < 9; i++) {
            System.out.println("Elementos: "+arreglo[i]);
            
        }

    }

}
