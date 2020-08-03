/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expersiones.regulares;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class ExpersionesRegulares {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        String nombre;

        do {
            //System.out.print("Ingrese nombre: ");
            nombre = getString("Ingrese numero: ");
            // System.out.println(validar(nombre));

        } while (validar(nombre) != true);
    }

    public static boolean validar(String nombre) {

        return nombre.matches("^([A-Z]{1}[a-z]+[ ]*){1,2}$");

    }

    public static String getString(String titulo) {

        String nombre = "";

        while (!nombre.matches("^([A-Z]{1}[a-z]+[ ]*){1,2}$")) {
            System.out.print(titulo);
            nombre = entrada.nextLine();

        }
        return nombre;
    }
    
       public int soloNumeros(int numero) {

        boolean ban;

        do {
            try {

                ban = false;
                numero = entrada.nextInt();

            } catch (Exception e) {
                System.out.println("Error :" + e);
                ban = true;
                entrada.nextLine();
            }

        } while (ban != false);
        return numero;
    }

}
