/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuadradosuma;
import java.util.Scanner;
/**
 *
 * @author Ara-PC
 */
public class CuadradoSuma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        double a,b,resultado;
        
        System.out.println("Digite el valor de a: ");
        a = entrada.nextDouble();
        System.out.println("Digite el valor de b:");
        b = entrada.nextDouble();
        
        resultado= Math.pow(a, 2) + Math.pow(b,2) + (2*a*b);
        
        System.out.println("resultado: "+resultado);
    }
    
}
