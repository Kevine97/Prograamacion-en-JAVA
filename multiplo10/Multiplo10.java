/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package multiplo10;

import javax.swing.JOptionPane;
/**
 *
 * @author Ara-PC
 */
public class Multiplo10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numero;
        
       numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
       
       
       //calculando si el numero en multipllo de 10
       
       if(numero % 10 == 0){
           
           JOptionPane.showMessageDialog(null, "El numero "+numero+" es multiplo de 10");
           
       }else{
          
           JOptionPane.showMessageDialog(null, "El numero "+numero+ " no es multiplo de 10");
       }
       
        
    }
    
}
