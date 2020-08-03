/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Ara-PC
 */
public class MetodoComunes {

    private double num1;
    private double num2;

    //Metodos
    public MetodoComunes(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public MetodoComunes() {

    }

    //Geter
    public double getSuma() {
        return num1 + num2;
    }

    public double getResta() {
        return num1 - num2;
    }

    public double getMul() {
        return num1 * num2;
    }

    public double getDiv() {
        return num1 / num2;
    }

    public String printf(String printf) {
        return printf;
    }

    public void system(String command) {
        try {
            new ProcessBuilder("cmd", "/c", command)
                    .inheritIO().start().waitFor();
        } catch (Exception e) {

        }
    }

    public void menu() {

        System.out.println("\t╔══════════════════════════════╗");
        System.out.println("\t║          M E N U   C A L C U L A D O R A      ║");
        System.out.println("\t╚══════════════════════════════╝");
        System.out.println("\t║\t\t1. SUMA                          ║");
        System.out.println("\t║\t\t2. RESTA                         ║");
        System.out.println("\t║\t\t3. MULTIPLICAION                 ║");
        System.out.println("\t║\t\t4. DIVISION                      ║");
        System.out.println("\t║\t\t5. LIMPIAR PANTALLA              ║");
        System.out.println("\t║\t\t6. PRINTF                        ║");
        System.out.println("\t║\t\t7. SALIR                         ║");
        System.out.println("\t╚══════════════════════════════╝");
        System.out.print("\t\t\tOPCION: ");

    }

    public void suma() {
        System.out.println("\n\t\t╔════════════╗");
        System.out.println("\t\t║       S U M A     ║");
        System.out.println("\t\t╚════════════╝");
    }
    public void resta() {
        System.out.println("\n\t\t╔════════════╗");
        System.out.println("\t\t║     R E S T A     ║");
        System.out.println("\t\t╚════════════╝");
    }
    public void print() {
        System.out.println("\n\t\t╔════════════╗");
        System.out.println("\t\t║     P R I N T     ║");
        System.out.println("\t\t╚════════════╝");
    }
    public void limpiar() {
        System.out.println("\n\t\t╔════════════╗");
        System.out.println("\t\t║  L I M P I A R    ║");
        System.out.println("\t\t╚════════════╝");
    }
    public void dividir() {
        System.out.println("\n\t\t╔════════════╗");
        System.out.println("\t\t║  D I V I D I R    ║");
        System.out.println("\t\t╚════════════╝");
    }

    public void multi() {
        System.out.println("\n\t\t╔══════════════╗");
        System.out.println("\t\t║ M U L T I P L I C A R║");
        System.out.println("\t\t╚══════════════╝");
    }
}
