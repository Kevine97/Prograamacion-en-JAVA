/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Modelo.entities.Users;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Ara-PC
 */
public class Util {

    public static Users currentUser = new Users();

    public static void messageInfo(String title, String message) {

        JOptionPane.showMessageDialog(new JFrame(), message, title, JOptionPane.INFORMATION_MESSAGE);
    }

    public static void messageWarning(String title, String message) {

        JOptionPane.showMessageDialog(new JFrame(), message, title, JOptionPane.WARNING_MESSAGE);

    }

    public static void messageError(String title, String message) {

        JOptionPane.showMessageDialog(new JFrame(), message, title, JOptionPane.ERROR_MESSAGE);

    }

    public static boolean messageConfirmation(String title, String message) {

        return JOptionPane.showConfirmDialog(new JFrame(), message, title, JOptionPane.YES_NO_OPTION) == 0;

    }

}
