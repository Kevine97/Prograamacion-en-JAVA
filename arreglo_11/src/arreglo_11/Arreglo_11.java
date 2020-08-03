/*
 programa que permite separar los numeros pares e inpares e  ingresarlos el otro arreglo.
 */
package arreglo_11;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int tabla[] = new int[10];
        int pares = 0, impares = 0;

        //llenando el arreglo
        System.out.println("***** LLenando el arreglo ******");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print((i + 1) + ". Inserte un numero entero: ");
            tabla[i] = entrada.nextInt();

            //verificando los numeros pares
            if (tabla[i] % 2 == 0) {
                pares++; // contabilizando cuantos elementos pares hay
            } else {
                impares++; // contabilizando cuantos elementos impares hay
            }

        }

        //creando los arreglos para los numeros pares e impares
        int arrePar[] = new int[pares]; //numeros pares
        int arreIm[] = new int[impares]; // numers impar

        int conteoPar = 0;
        int conteoIm = 0;

        for (int i = 0; i < 10; i++) {

            if (tabla[i] % 2 == 0) {// si el numero es ar

                arrePar[conteoPar++] = tabla[i]; // alamacenamos los numeros pares en el arreglo de pares

            } else {//si el numero es impar

                arreIm[conteoIm++] = tabla[i]; // Alamcenamos los numeros impares en el arreglo de impares
            }

        }

        //mostrando el arreglo de los numeros pares
        System.out.println("\n***** Elementos pares ****\n");

        if (conteoPar == 0) { // si el conteo de numeros pares es, entonces no se ingresaron numeros pares.
            System.out.println("No se ingresaron numeros pares");

        } else {// caso contrario se ingreso mas de un numero par
            for (int i = 0; i < conteoPar; i++) {
                System.out.print("  " + arrePar[i]);

            }
        }

        //Mostrando el arreglo de los numeros impares
        System.out.println("\n\n***** Elementos Impares *****\n");

        if (conteoIm == 0) { // Si el conteo de numeros Impares es 0, entonces no se ingreso ningun numero impar.

            System.out.println("No se ingresaron numeros Impares");

        } else { // caso contrario se ingreso mas de un numero impar

            for (int i = 0; i < conteoIm; i++) {
                System.out.print("  " + arreIm[i]);

            }

        }

        System.out.println("");
    }

}
