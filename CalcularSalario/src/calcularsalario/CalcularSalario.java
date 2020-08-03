/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularsalario;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class CalcularSalario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner  entrada = new Scanner(System.in);
        int horas;
        float total,pago;
        
        //pidiendo la horas trabajadas por el usuario semanalmente 
        System.out.println("Digiste las horas semanales trabajadas: ");
        horas = entrada.nextInt();
        //pidiendo la cantidad a pagar por hora
        System.out.println("\nDigite el salario por hora: ");
        total= entrada.nextFloat();
        
        //calculando el total a pagar
        pago = horas * total;
        
        System.out.println("\n\n El salario semanal del empleado es: "+pago);
        
        
    }
    
}
