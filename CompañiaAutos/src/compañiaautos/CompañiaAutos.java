/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compañiaautos;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class CompañiaAutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        
        final float salario = 1000;
        int nCarros;
        float costeCarro,neto;
     
        System.out.println("Total de carros vendidos: ");
        nCarros = entrada.nextInt();
        System.out.println("Coste de carro: ");
        costeCarro = entrada.nextFloat();
        
        neto = salario + (nCarros * 150) + (0.05f * costeCarro * nCarros);
        
        System.out.println("El salario del empleado es: "+neto);
        
    }
    
}
