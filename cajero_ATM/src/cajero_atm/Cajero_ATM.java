/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cajero_atm;

import javax.swing.JOptionPane;

/**
 *
 * @author Ara-PC
 */
public class Cajero_ATM {

    public static void main(String[] args) {

        int inicio = 1000;
        int opc, cont = 0;
        float ingreso = 0, actual = 0, retiro = 0, mk = 0, ml = 0;

        do {

            opc = Integer.parseInt(JOptionPane.showInputDialog("ATM UPOLI\n\n"
                    + "1. Ingrese Dinero\n"
                    + "2. Retire Dinero\n"
                    + "3. Visualizar dinero actual\n"
                    + ""
                    + "4. Salir del cajero"));

            switch (opc) {

                case 1:
                    mk++;
                    ingreso = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantida a ingresar"));
                    actual = inicio + ingreso;

                    JOptionPane.showMessageDialog(null, "Cantidad de dinero Actual : " + actual);

                    break;

                case 2:

                    retiro = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad de dinero a retirar"));
                    cont++;
                    actual =  inicio - retiro;
                    JOptionPane.showMessageDialog(null, "Cantidad de dinero actual : " + actual);

                    break;

                case 3:

                    if (cont >= 1 || mk >= 1) {

                        JOptionPane.showMessageDialog(null, "Dinero actual en la cuenta : " + actual);

                    } else {

                        JOptionPane.showMessageDialog(null, "Dinero actual en la cuenta : " + inicio);
                    }

                    break;

                case 4:
                    JOptionPane.showMessageDialog(null, "GRACIAS POR VISITARNOS! :)");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Digite una opcion correcta");

            }

        } while (opc != 4);

    }

}
