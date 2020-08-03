/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_8;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int numero[] = new int[10]; // Arreglo de 10 numeros enteros
        int newNumero, posicion;
        for (int i = 0; i < 8; i++) {
            //llenando el arreglo con 8 numeros
            numero[i] = Integer.parseInt(JOptionPane.showInputDialog("***** Llenando el arreglo *****\n\n\t" + (i + 1) + ". Inserte un numero"));
        }

        newNumero = Integer.parseInt(JOptionPane.showInputDialog("Digite el nuevo numero"));
       // posicion = Integer.parseInt("Digite la posicion en cual lo desea integrar");
        System.out.print("Digite la nueva posicion: ");
        posicion = entrada.nextInt() - 1;

        // corriedo una posicion 
        for (int i = 7; i >= posicion; i--) {
            numero[i + 1] = numero[i];

        }
        
        
        //asigando el numero a numero a la posicion.
        numero[posicion] = newNumero; // insertamos el numero en la posicion requerida
        
        System.out.println("****** Nuevos elementos del arreglo ******");
        for (int i = 0; i < 9; i++) {
            
            System.out.println((i+1)+". "+numero[i]);
        }
    }

}
