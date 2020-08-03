/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package while_negativo;

import javax.swing.JOptionPane;

/**
 *
 * @author Ara-PC
 */
public class While_negativo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int cuadrado, numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while (numero >= 1) {

            cuadrado = (int) Math.pow(numero, 2);
            JOptionPane.showMessageDialog(null,numero+" ^2 = "+cuadrado);
            numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        }

    }

}
