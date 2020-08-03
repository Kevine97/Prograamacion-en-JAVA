/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ndolares;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Ndolares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        float guillermo,luis,juan,total;
       
        System.out.println("Digite la cantida de dinero que tiene Guillermo: ");
        guillermo = entrada.nextFloat();
        
        //sacamos la mitad de guillermo
        luis = guillermo/2;
        juan = (luis+guillermo)/2;
        
        
        //calculando la cantida que hay entre los 3
        total = guillermo + juan + luis;
        
        System.out.println("\n La cantida de dinero que tienen entre los 3: "+total);
        
        
        
    }
    
}
