/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Ara-PC
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero1 = 0, numero2 = 0, suma = 0, resta = 0, multi = 0;
        float division = 0;
        char letra;

        do {
            numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un nummero"));

            letra = JOptionPane.showInputDialog("Digite la operacion que desea realizar\n"
                    + "S. -> SUMA\n"
                    + "R. -> RESTA\n"
                    + "M. -> MULTIPLICACION\n"
                    + "D. -> DIVISION\n"
                    + "E. -> EXIT").charAt(0);

            switch (letra) {

                case 'S':
                case 's':
                    suma = numero1 + numero2;
                    JOptionPane.showMessageDialog(null, "La suma es: " + suma);
                    break;

                case 'R':
                case 'r':
                    resta = numero1 - numero2;
                    JOptionPane.showMessageDialog(null, "La esta es: " + resta);
                    break;

                case 'M':
                case 'm':
                    multi = numero1 * numero2;
                    JOptionPane.showMessageDialog(null, "La Multiplicacion es: " + multi);
                    break;

                case 'D':
                case 'd':

                    if (numero2 == 0) {

                        JOptionPane.showMessageDialog(null, "Division entre 0. ERROR");
                    } else {

                        division = (float) numero1 / (float) numero2;
                        JOptionPane.showMessageDialog(null, "La Division es: " + division);

                    }

                    break;
                case 'e':
                case 'E': JOptionPane.showMessageDialog(null, "SALIENDO ...a");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion incorrecta");

            }

        } while (letra != 'E' && letra != 'e');

    }

}
