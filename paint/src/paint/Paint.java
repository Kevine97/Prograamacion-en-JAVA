/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

/**
 *
 * @author Ara-PC
 */
public class Paint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Primer pico de la estrella 
        for (int i = 1; i < 24 - 1; i++) { // For que imprime los espacios en blanco

            System.out.print(" ");

        }
        System.out.print("*\n"); // Asterisco de la punta del primer pico

        
        //Rayas del primer pico 
        for (int i = 2; i <= 6 - 1; i++) { // For que controla las filas del pico, empezando en la posicion #2
            for (int j = 1; j <= 8 - i; j++) { //For que imprime los espacios en blanco 
                System.out.print(" ");

            }
            System.out.print("              ");
            System.out.print("*");

            for (int j = 1; j <= 2 * i - 3; j++) { // For que inclina las rayas.
                System.out.print(" ");
            }
            System.out.print("  ");
            System.out.print("*\n");
        }

        //Rayas
        System.out.print(" ");
        for (int i = 0; i < 22; i++) { //For que imprime la rayas verticales de la estrellas

            if (i > 7 && i < 13) {  // Mientra este en esa condicion que imprima espacios en blancos.
                System.out.print("  ");
            } else { //en caso contrario imprima asteriscos

                System.out.print(" *"); //
            }
            
        }

        //Rayas de abajo
        for (int i = 0; i <= 2; i++) { //Tamaño de la linea de asterisco.
            

            System.out.println();

            for (int j = i; j >= 0; j--) { // For que salta los espacios en blanco
                System.out.print("   ");
            }
           
            System.out.print(" ");
            System.out.print("*");

            for (int q = 11 - i; q >= i; q--) { // For que controla la cantidad de espacios  para que imprima la otra linea

                System.out.print("   ");
            }

            System.out.print("*");
        }
        
        
        //Picos de abajo
         for (int i = 4; i >=0; i--) {
            System.out.println("");
            System.out.print("           ");
            System.out.print("*");

            for (int j = i*2; j>=0 ; j--) {
                System.out.print(" ");
            }
            System.out.print("");
            System.out.print("*");
           
            for (int q = 8 - i; q >= i; q--) { // For que controla la cantidad de espacios 

                System.out.print("  ");

            }
            
             System.out.print("*");
            for (int j = i*2; j>=0 ; j--) {
                System.out.print(" ");
            }
            System.out.print("");
            System.out.print("*");
            
         }
         
         System.out.println("");
        for (int i = 0; i < 11; i++) {
            System.out.print(" ");
            
        }
        System.out.print("* ");
        
        for (int i = 0; i < 20; i++) {
            System.out.print(" ");
            
        }
        System.out.print(" *");

        System.out.println("");

    }

}
