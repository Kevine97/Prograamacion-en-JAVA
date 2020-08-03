/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_4;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeros[] = new int[10];

        //Pidiendo datos del arreglo 
        System.out.println("***** Datos del arreglo *****");
        for (int i = 0; i < numeros.length; i++) {
            //System.out.print((i + 1) + " .Ingrese los nuemeros: ");
            //numeros[i] = entrada.nextInt();
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
        }

        System.out.println("***** El Resultado es *****");
        for (int i = 0; i <6; i++) {
            System.out.print(numeros[i]+" ");
            System.out.print(numeros[9-i]+" ");
        }
        System.out.println("");
    }

}
