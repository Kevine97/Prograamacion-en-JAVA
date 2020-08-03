/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_6;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner entrada = new Scanner(System.in);

        int a[] = new int[12];
        int b[] = new int[12];
        int c[] = new int[24];

        //areglos A
        System.out.println("*** Datos del primer arreglo");

        for (int i = 0; i < a.length; i++) {
            System.out.print((i + 1) + ". Ingrese los datos: ");
            a[i] = entrada.nextInt();
        }

        //areglos B
        System.out.println("\n*** Datos del segundo arreglo");

        for (int i = 0; i < b.length; i++) {
            System.out.print((i + 1) + ". Ingrese los datos: ");
            b[i] = entrada.nextInt();
        }

        //Arreglo C
        //Guardando datos en el arreglo
        int j = 0;
       /* int l = 0;
        
        while(l<12){
            
            //Copiando los elementos de a
            for (int k = 0; k < 3; k++) {
                c[j] = a[l + k];
                j++;
            }

            //Copiando los elementos de b
            for (int k = 0; k < 3; k++) {
                c[j] = b[l + k];
                j++;
            }
            
            l+=3;
            
        }*/
        
        for (int i = 0; i < 12; i+=3) {
            //Copiando los elementos de a
            for (int k = 0; k < 3; k++) {
                c[j++] = a[i + k];

            }

            //Copiando los elementos de b
            for (int k = 0; k < 3; k++) {
                c[j++] = b[i + k];

            }

        }

        //Mostrando los elemento c
        System.out.println("**** Mostrando el arreglo C ****");
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");

        }
        System.out.println("");
    }

}
