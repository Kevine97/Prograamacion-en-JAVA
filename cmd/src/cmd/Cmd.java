/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cmd;

import java.io.IOException;

/**
 *
 * @author Ara-PC
 */
public class Cmd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        try{
           
            for (int j = 0; j < 11; j++) {
                System.out.println("Estoy iterando: "+j);
                
            }
         new ProcessBuilder("cmd","/c","pause").inheritIO().start().waitFor();
            
        }catch(Exception e){
            
            System.out.println("Error "+e.getMessage());
        }

    }

}
