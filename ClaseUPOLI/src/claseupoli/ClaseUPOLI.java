/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseupoli;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Ara-PC
 */
public class ClaseUPOLI {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n1, n2, opc;
        int suma = 0, resta = 0;
       

        String saludo = new Scanner(System.in).nextLine();
        
        System.out.println(saludo);
        
      /*
            opc = Integer.parseInt(JOptionPane.showInputDialog("S I S T E M A T I C O  I\n"
                    + "1. Saludame\n"
                    + "2. Suma de dos numeros\n"
                    + "3. Resta de  dos numeros\n"
                    + "4. Salir"));

            switch (opc) {
                case 1:
                    //Pidiendo el nombre a saludar 
                    saludo = JOptionPane.showInputDialog("Ingrese el nombre a saludar");
                    JOptionPane.showMessageDialog(null, "HOLA " + saludo + " bienvenido a nuestro sistema");

                    break;
                case 2:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));

                    //La suma de dos numeros
                    suma = n1 + n2;
                    JOptionPane.showMessageDialog(null, n1 + " + " + n2 + " = " + suma);
                    break;

                case 3:
                    n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
                    n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));

                    //resta de dos numeros
                    resta = n1 - n2;
                    JOptionPane.showMessageDialog(null, n1 + " - " + n2 + " = " + resta);
                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "Gracias por visistar nuestro sistema :)");
                    break;
                default: JOptionPane.showMessageDialog(null,"Opcion Incorrecta");
                    
            }

        } while (opc != 4);*/
    }

}
