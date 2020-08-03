/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo_3;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Arreglo_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int[5];
        int sumaPositivo = 0, contPositivo = 0;
        int sumaNegativo = 0, contNegativo = 0;
        int contCero = 0;
        float mediaNegativo=0, mediaPositivo=0;

        System.out.println("***** GUARDANDO LOS NUMEROS EN EL ARREGLO ****");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print((i + 1) + " Digite un numero: ");
            numeros[i] = entrada.nextInt();

            if (numeros[i] == 0) {
                contCero++;

            } else {

                if (numeros[i] > 0) {

                    contPositivo++;
                    sumaPositivo += numeros[i];
                } else {

                    contNegativo++;
                    sumaNegativo += numeros[i];

                }

            }

        }
        
         System.out.println("\n***** Datos del arreglo en sistema *****");
        
        //Calculando la media de los positivo
        
        if(contPositivo==0){
            
            System.out.println("No se ingresaron numeros positivos");
            
        }else{
            
            mediaPositivo = (float)sumaPositivo/contPositivo;
        }
        
        //Calculando la media de los neativos
        if(contNegativo==0){
            
            System.out.println("No se ingresaron numeros negativos");
            
        }else{
            
            mediaNegativo = (float)sumaNegativo/contNegativo;
        }
        
        System.out.println("Media de los numeros positivos: "+mediaPositivo);
        System.out.println("Media de los numeros negativos: "+mediaNegativo);
        System.out.println("Conteo de numeros 0: "+contCero);
        
    }

}
