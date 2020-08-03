/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor;

import javax.swing.JOptionPane;

/**
 *
 * @author Ara-PC
 */
public class Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n1,n2;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
        //Calculando el mayor de dos numeros
        
        if(n1>n2){
            
            JOptionPane.showMessageDialog(null, "El numero "+n1+" es mayor que "+n2);
        }else{
            if(n2>n1){
                
                JOptionPane.showMessageDialog(null,"El numero "+n2+" es mayor que "+n1 );
            }else{
                
                JOptionPane.showMessageDialog(null, "El numero "+n1+" es igual que "+n2);
            }
        }
    }
    
}
