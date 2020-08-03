/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadatos;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class EntradaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        int numero;
        
        System.out.println("Ingrese un entero: ");
        numero=entrada.nextInt();
        
        System.out.println("El numero ingresado es: "+numero);
    }
    
}
