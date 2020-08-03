/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Ara-PC
 */
public class objeto {

    //Inicio de sesion 
    public boolean login(String user, String password) {

        if (user.equals("kevin") && password.equals("upoli123")) {

            return true;
        } else {

            return false;
        }

    }

}
