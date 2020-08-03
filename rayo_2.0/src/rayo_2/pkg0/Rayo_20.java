/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rayo_2.pkg0;

/**
 *
 * @author Ara-PC
 */
public class Rayo_20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try{
            System.out.println(ANSI_RED + "Texto de color rojo" + ANSI_RESET);
            System.out.println(ANSI_RED+"\n R A Y O\n "+ANSI_RESET);
        //****************************************************************************************************************//
        //PICO SUPERIOR DEL  RAYO
        for (int i = 0; i < 5; i++) { //For que controlas filas del pico 

            for (int q = 17 - i; q >= i; q--) { // For que controla la cantidad de espacios 
               
                System.out.print("  ");
                
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

            for (int l = 8 - i; l >= 0; l--) { // Ciclo que manipula los espacios 
                Thread.sleep(10);
                System.out.print("  ");
            }

            for (int l = 0; l < 4; l++) { // For que controla la cantidad de asteriscoque se imprimen por columna
                 Thread.sleep(1000);
                System.out.print(ANSI_RED+" *"+ANSI_RESET);

            }
            System.out.println("");
        }
        //****************************************************************************************************************//
        //Parte central del rayo 
        for (int i = 0; i < 2; i++) { //Cantidad de filas
            //System.out.print("\t");
            for (int l = 0; l <6; l++) { // Cantidad de columanas con asteriscos
                 Thread.sleep(10);
                System.out.print(" ");
            }
           
            for (int j = 0; j <12 ;j++) {
                Thread.sleep(1000);
                 System.out.print(ANSI_YELLOW+" *"+ANSI_RESET);
                
            }
            System.out.println("");
        }
        //****************************************************************************************************************//
        //Linea inferior del rayo.
        for (int i = 0; i < 6; i++) { //Cantidad de filas

            for (int l = 9 - i; l >= 0; l--) { //Cantidad de espacios en blanco
                 Thread.sleep(10);
                System.out.print("  ");
            }

            for (int l = 0; l < 4; l++) { //For que manupula la cantidad de asterisoc a imprimir
                 Thread.sleep(1000);
                System.out.print(" *");

            }
            System.out.println("");
        }

        //Pico inferior del rayo. 
        //****************************************************************************************************************//
        for (int i = 0; i < 5; i++) { // Ocupamos este for desarrolar el tamaño del triangulo
            for (int l = 3 - i; l >= 0; l--) { // Ocupamos este for para imprimir los astericos. Empieza Imprimiendo 1 que es lo que vale ContAS, y asi sucesivamente hasta que cont llegue a 10
                 Thread.sleep(10); // Damos un tiempo de 1 segundo de retrazo
                System.out.print("  ");
            }

            for (int j = 3 - i; j >= 0; j--) {
                 Thread.sleep(1000);
                System.out.print(" *");

            }
            System.out.println(" ");

        }
        System.out.println("");
       }catch(InterruptedException e){}
    }
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_YELLOW = "\u001B[33m";
}
