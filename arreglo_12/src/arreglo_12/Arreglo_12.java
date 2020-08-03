/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_12;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[20];
        boolean creciente = false;

        //llenando y comprobando el primer arreglo 
        System.out.println("****** Llenando el primero arreglo *******");
        do {

            for (int i = 0; i < a.length; i++) {
                System.out.print((1 + i) + ". Ingrese un entero: ");
                a[i] = entrada.nextInt();
            }

            for (int i = 0; i < 9; i++) {

                if (a[i] < a[i + 1]) { // si el numero que le sigue es mayor... es creciente

                    creciente = true;
                }
                if (a[i] > a[i + 1]) {

                    creciente = false; // el programa es decreciente
                    break;
                }

            }

            if (creciente == false) {
                System.out.println("¡AVISOOOO! El arreglo esta Desordenando, vuelva a digitar.");
            }

        } while (creciente == false);

        //llenando y comprobando el segundo arreglo.
        System.out.println("****** Llenando el segundo arreglo *******");
        do {

            for (int i = 0; i < b.length; i++) {
                System.out.print((1 + i) + ". Ingrese un entero: ");
                b[i] = entrada.nextInt();
            }

            for (int i = 0; i < 9; i++) {

                if (b[i] < b[i + 1]) { // si el numero que le sigue es mayor... es creciente

                    creciente = true;
                }
                if (b[i] > b[i + 1]) {

                    creciente = false; // el programa es decreciente
                    break;
                }

            }

            if (creciente == false) {
                System.out.println("¡AVISOOOO! El arreglo esta Desordenando, vuelva a digitar.");
            }

        } while (creciente == false);

        int i = 0; //sera para el arreglo A
        int j = 0; //sera para el arreglo B
        int k = 0; //sera para el arreglo C
        
        while(i<10 && j<10){
            
            if(a[i]<b[j]){ // si el elemento del arreglo A es menor al elemento del arreglo B
                
                c[k++] = a[i++]; //copiamos un elemento del arreglo A y avanzamos una posicion
               // i++;
            }else{
                
                c[k++] = b[j++];//copiamos un elemento del arreglo B y avanzamos una posicion
                //j++;
            }
            
            //k++; // avanzamos una posicion en el arreglo C 
        }
        
        if(i==10){
            while(j<10){
                c[k++]=b[j++];
              //  j++;
               // k++;
            }
        }else{
            
            while(i<10){
                c[k++]=a[i++];
                //i++;
                //k++;
            }
        }
        
        
        System.out.println("***** Mostrando el arreglo C *****");
        for (int l = 0; l < 20; l++) {
            System.out.println((1+l)+". "+c[l]);
            
        }

    }

}
