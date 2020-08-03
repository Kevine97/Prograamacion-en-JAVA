/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        objeto obj = new objeto();
        boolean valido = false;

        do {
            System.out.print("Usuario: ");
            String user = new Scanner(System.in).nextLine();
            System.out.print("Contraseña: ");
            String pass = new Scanner(System.in).nextLine();

            if (obj.login(user, pass) == true) {
                valido = true;
                System.out.println("BIENVENDIO");
            } else {
                System.out.println("Usuario y/o contraseña incorrecta");
            }

        } while (valido == false);

    }

}
