/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatorios;

import javax.swing.JOptionPane;

/**
 *
 * @author Ara-PC
 */
public class Aleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int numero, aleatorio, cont = 0;

        aleatorio = (int) (Math.random() * 100);

        do {

            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));

            if (aleatorio > numero) {

                System.out.println("Digite un numero mayor");
            } else {

                System.out.println("Digite un numero menor");
            }

             cont++;
        } while (numero!=aleatorio);
        
        JOptionPane.showMessageDialog(null, "GENIAL ADIVINASTE EN MAXIMO DE INSTENO: "+cont);

    }

}
