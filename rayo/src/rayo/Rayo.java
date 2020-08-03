/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rayo;

/**
 *
 * @author Ara-PC
 */
import java.util.Scanner;
import java.io.IOException;
public class Rayo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try{
            System.out.println("\n\t****** R A Y O******\n");
        //****************************************************************************************************************//
        //PICO SUPERIOR DEL  RAYO
        for (int i = 0; i <= 5; i++) { //For que controlas filas del pico 

            for (int q = 20 - i; q >= i; q--) { // For que controla la cantidad de espacios 
               
                System.out.print("  ");
                 Thread.sleep(10);
            }

            for (int r = 5 - i; r < 5; r++) { 
                 Thread.sleep(1000);
                System.out.print(" *");
            }

            System.out.println();
        }
        //****************************************************************************************************************//
        //Linea superior del rayo
        for (int i = 0; i < 6; i++) {//For que controla la linea superior del rayo

            for (int l = 9 - i; l >= 0; l--) { // Ciclo que manipula los espacios 
                Thread.sleep(10);
                System.out.print("  ");
            }

            for (int l = 0; l < 5; l++) { // For que controla la cantidad de asteriscoque se imprimen por columna
                 Thread.sleep(1000);
                System.out.print(" *");

            }
            System.out.println("");
        }
        //****************************************************************************************************************//
        //Parte central del rayo 
        for (int i = 0; i < 3; i++) { //Cantidad de filas
            //System.out.print("\t");
            for (int l = 0; l <8; l++) { // Cantidad de columanas con asteriscos
                 Thread.sleep(1000);
                System.out.print(" ");
            }
           
            for (int j = 0; j <15 ;j++) {
                 System.out.print(" *");
                
            }
            System.out.println("");
        }
        //****************************************************************************************************************//
        //Linea inferior del rayo.
        for (int i = 0; i < 6; i++) { //Cantidad de filas

            for (int l = 12 - i; l >= 0; l--) { //Cantidad de espacios en blanco
                 Thread.sleep(10);
                System.out.print("  ");
            }

            for (int l = 0; l < 5; l++) { //For que manupula la cantidad de asterisoc a imprimir
                 Thread.sleep(1000);
                System.out.print(" *");

            }
            System.out.println("");
        }

        //Pico inferior del rayo. 
        //****************************************************************************************************************//
        for (int i = 0; i < 5; i++) { // Ocupamos este for desarrolar el tamaño del triangulo
            for (int l = 6 - i; l >= 0; l--) { // Ocupamos este for para imprimir los astericos. Empieza Imprimiendo 1 que es lo que vale ContAS, y asi sucesivamente hasta que cont llegue a 10
                 Thread.sleep(10); // Damos un tiempo de 1 segundo de retrazo
                System.out.print("  ");
            }

            for (int j = 4 - i; j >= 0; j--) {
                 Thread.sleep(1000);
                System.out.print(" *");

            }
            System.out.println(" ");

        }
        System.out.println("");
       }catch(InterruptedException e){}
        
    }

}
