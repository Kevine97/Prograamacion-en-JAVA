/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

/**
 *
 * @author Ara-PC
 */
import java.util.Scanner;

public class Formas {

    public static void main(String[] args) throws InterruptedException {

        Scanner entrada = new Scanner(System.in);
        int opc;

        try {

            do {
                System.out.println("\n\t__________________________________");
                System.out.println("\t M E N U   D E   F O R M A S");
                System.out.println("\t__________________________________");
                System.out.println("\t\t1. Cuadrado ");
                System.out.println("\t\t2. Triangulo");
                System.out.println("\t\t3. Rayo");
                System.out.println("\t\t4. Rombo");
                System.out.println("\t\t5. Estrella");
                System.out.println("\t\t6. Salir");
                System.out.println("\t__________________________________");
                System.out.print("\t\tOpcion: ");
                opc = entrada.nextInt();

                switch (opc) {
                    case 1:
                        cuadro();
                        break;

                    case 2:
                        triangulo();
                        break;

                    case 3:
                        rayo();

                        break;

                    case 4:
                        rombo();
                        break;

                    case 5:
                        estrella();
                        break;

                    case 6:
                        System.out.println("\tSaliendo del sistema  . . . .");
                        Thread.sleep(3000);
                        break;

                    default:
                        System.out.println("Opcion Incorrecta");
                        break;
                }

                System.out.println("");
                new ProcessBuilder("cmd", "/c", "pause").inheritIO().start().waitFor();
                //new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

            } while (opc != 6);

        } catch (Exception e) {

            System.out.println("Error " + e.getMessage());
        }

        entrada.close();

    }

    //P R O C E D I M I E N T O S //
    public static void rayo() {

        try {

            System.out.println("\n\t****** R A Y O ******\n");
            for (int i = 1; i <= 7; i++) {

                for (int j = 1; j < i; j++) {
                    System.out.print("  ");

                }

                for (int k = 1; k <= 7; k++) {
                    if (i == 1 || k == 1 || k == 7) {
                        Thread.sleep(500);
                        System.out.print(" *");

                    } else {
                        System.out.print("  ");
                    }

                }

                System.out.println();

            }

            for (int q = 1; q <= 9; q++) {

                if (q <= 7 / 2 || q == 9) {
                    Thread.sleep(500);
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();

            for (int i = 1; i <= 7; i++) {

                for (int j = 1; j < i; j++) {
                    System.out.print("  ");

                }

                for (int k = 1; k <= 7; k++) {
                    if (k == 1 || k == 7) {
                        Thread.sleep(500);
                        System.out.print(" *");

                    } else {
                        System.out.print("  ");
                    }

                }
                System.out.println();
            }

            for (int q = 1; q <= 9; q++) {

                if (q <= 7 / 2 || q == 9) {
                    Thread.sleep(500);
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println();
            int n2 = 7 + 1;
            for (int i = 1; i <= 7; i++) {
                for (int j = 1; j < 2 * i; j++) {
                    System.out.print("  ");

                }

                for (int j = 1; j <= n2; j++) {
                    if (j == 1 || j == n2) {
                        Thread.sleep(500);
                        System.out.print(" *");
                    } else {
                        System.out.print("  ");
                    }

                }
                n2--;
                System.out.println();

            }
            for (int j = 1; j < 17; j++) {
                System.out.print("  ");

            }
            System.out.println("*");

        } catch (Exception e) {

            System.out.println("Problemas: " + e.getMessage());
        }
    }

    public static void cuadro() {

        try {
            int n = 7,
                    k = 0,
                    j = 0;
            System.out.println("\n\t****** C U A D R A D O ******\n");
            /* System.out.print("Ingrese el tamaño del cuadro: ");
                        n = entrada.nextInt(); // Variable n controla el tamaño del cuadro*/

            for (int i = 0; i < n; i++) { // Ciclo for que controla la linea superior del cuadro
                Thread.sleep(500); // damos un tiempo de retraso 1 segundo
                System.out.print(" *");

            }
            System.out.println();

            /*CENTRO DEL CUADRO*/
            while (k < n - 2) { // ciclo while que controla el centro del cuadro
                Thread.sleep(500); // damos un tiempo de retraso 1 segundo
                System.out.print(" *");
                for (int i = 0; i < n - 2; i++) {//Usamos este ciclo for para dar un espacio entre los asteriscos

                    System.out.print("  ");
                }

                System.out.println(" *");

                k++; // incrementamos el indice del ciclo while
            }
            // Linea inferior
            for (int i = 0; i < n; i++) { // ciclo que controla la Linea inferior del cuadro
                Thread.sleep(500);;// damos un tiempo de 1 segundo
                System.out.print(" *");
            }
            System.out.println("");

        } catch (Exception e) {

            System.out.println("Problemas: " + e.getMessage());

        }

    }

    public static void triangulo() {
        try {
            System.out.println("\n\t****** T R I A N G U L O ******\n");
            for (int i = 1; i < 12 - 1; i++) { // For que imprime los espacios en blanco

                System.out.print(" ");

            }
            Thread.sleep(500);
            System.out.print("*\n"); // Asterisco de la punta del primer pico

            //Rayas del primer pico 
            for (int i = 2; i <= 10 - 1; i++) { // For que controla las filas del pico, empezando en la posicion #2
                for (int a = 1; a <= 10 - i; a++) { //For que imprime los espacios en blanco 
                    System.out.print(" ");

                }
                //System.out.print("                  ");
                Thread.sleep(500);
                System.out.print("*");

                for (int a = 1; a <= 2 * i - 3; a++) { // For que inclina las rayas.
                    System.out.print(" ");
                }
                System.out.print("  ");
                Thread.sleep(500);
                System.out.print("*\n");
            }
            Thread.sleep(500);
            System.out.print("*");
            for (int i = 1; i < 11; i++) {
                Thread.sleep(500);
                System.out.print(" *");

            }
            System.out.println(" ");

        } catch (Exception e) {

            System.out.println("Problemas: " + e.getMessage());

        }
    }

    public static void rombo() {

        try {

            System.out.println("\n\t****** R O M B O******\n");

            //Parte superior del rombo
            for (int i = 0; i <= 7; i++) { //For para el numero de filas

                for (int l = 7 - i; l >= 0; l--) { //For para imprimir espacios en blanco

                    System.out.print(" ");
                }

                for (int l = 0; l < i; l++) {//for para impirmir asteriscos
                    Thread.sleep(500);
                    System.out.print(" *");

                }
                System.out.println("");
            }

            //Parte inferior del rombo
            for (int i = 0; i <= 7; i++) { // For que controla el numero de filas
                for (int l = 0; l <= i; l++) {//For que imprime los espacio en blanco

                    System.out.print(" ");
                }

                for (int l = 7 - i - 1; l >= 0; l--) { //For que imprime los asterisco disminuyendo de forma decendente.
                    Thread.sleep(500);
                    System.out.print(" *");

                }
                System.out.println("");

            }

        } catch (Exception e) {
            System.out.println("Problemas: " + e.getMessage());
        }
    }

    public static void estrella() {
        try {
            System.out.println("\n\t****** E S T R E L L A ******\n");
            //Primer pico de la estrella 
            for (int i = 1; i < 15 - 1; i++) { // For que imprime los espacios en blanco

                System.out.print("  ");

            }
            Thread.sleep(500);
            System.out.print("*\n"); // Asterisco de la punta del primer pico

            //Rayas del primer pico 
            for (int i = 2; i <= 8 - 1; i++) { // For que controla las filas del pico, empezando en la posicion #2
                for (int a = 1; a <= 8 - i; a++) { //For que imprime los espacios en blanco 
                    System.out.print(" ");

                }
                System.out.print("                  ");
                System.out.print("*");

                for (int a = 1; a <= 2 * i - 3; a++) { // For que inclina las rayas.
                    System.out.print(" ");
                }
                System.out.print("  ");
                Thread.sleep(500);
                System.out.print("*\n");
            }

            //Rayas
            for (int i = 0; i < 26; i++) { //For que imprime la rayas verticales de la estrellas

                if (i > 8 && i < 17) {  // Mientra este en esa condicion que imprima espacios en blancos.
                    System.out.print("  ");
                } else { //en caso contrario imprima asteriscos
                    Thread.sleep(500);
                    System.out.print(" *"); //
                }
            }

            //Rayas de abajo
            for (int i = 0; i <= 4; i++) { //Tamaño de la linea de asterisco.

                System.out.println();

                for (int a = 0; a <= i; a++) { // For que salta los espacios en blanco
                    System.out.print("  ");
                }

                System.out.print("");
                Thread.sleep(500);
                System.out.print("*");

                for (int q = 22 - i; q >= i; q--) { // For que controla la cantidad de espacios  para que imprima la otra linea

                    System.out.print("  ");

                }
                Thread.sleep(500);
                System.out.print(" *");
            }

            //Picos de abajo
            for (int i = 6; i >= 0; i--) {
                System.out.println(" ");
                System.out.print("          ");
                Thread.sleep(500);
                System.out.print("*");

                for (int a = i * 2; a >= 0; a--) {
                    System.out.print(" ");
                }
                System.out.print("");
                Thread.sleep(500);
                System.out.print("*");

                for (int q = 12 - i; q >= i; q--) { // For que controla la cantidad de espacios 

                    System.out.print("  ");

                }
                Thread.sleep(500);
                System.out.print("*");
                for (int a = i * 2; a >= 0; a--) {
                    System.out.print(" ");
                }
                System.out.print("");
                Thread.sleep(500);
                System.out.print("*");

            }

            System.out.println("");
            for (int i = 0; i < 5; i++) {
                System.out.print("  ");

            }
            System.out.print("* ");

            for (int i = 0; i < 28; i++) {
                System.out.print(" ");

            }
            System.out.print(" *");

            System.out.println("");
        } catch (Exception e) {
            System.out.println("Problemas : " + e.getMessage());
        }
    }

}
