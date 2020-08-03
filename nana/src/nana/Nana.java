/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nana;

import java.util.Scanner;

/**
 *
 * @author FAMILIA
 */
public class Nana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        

        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");

            }

            for (int k = 1; k <= 7; k++) {
                if (i == 1 || k == 1 || k == 7) {
                    System.out.print(" *");

                } else {
                    System.out.print("  ");
                }

            }

            System.out.println();

        }

        for (int q = 1; q <= 7; q++) {

            if (q <= 7 / 2 || q == 7 ) {
                System.out.print(" *");
            } else {
                System.out.print("  ");
            }

        }
        System.out.println();

        
      
        for (int i = 1; i <= 7; i++) {

            for (int j = 1; j < i; j++) {
                System.out.print(" ");

            }

            for (int k = 1; k <= 7; k++) {
                if (k == 1 || k == 7) {
                    System.out.print(" *");

                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
        }

 for (int q = 1; q <= 7; q++) {

            if (q <= 7 / 2 || q == 7 ) {
                System.out.print(" *");
            } else {
                System.out.print("  ");
            }

        }
        System.out.println();
        int n2 = 7+1;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <2*i; j++) {
                System.out.print(" ");

            }

            for (int j = 1; j <= n2; j++) {
                if (j == 1 || j == n2) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            n2--;
            System.out.println();
        }

    }

}
