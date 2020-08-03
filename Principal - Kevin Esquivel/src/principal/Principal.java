/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double num1 = 0, num2 = 0;
        int opc;
        MetodoComunes s;
        MetodoComunes m = new MetodoComunes();

        try {
            do {

                m.menu();
                opc = entrada.nextInt();
                switch (opc) {

                    case 1:
                        m.suma();
                        System.out.print("\n\tIngrese el primer numero: ");
                        num1 = entrada.nextDouble();
                        System.out.print("\tIngrese el segundo numero: ");
                        num2 = entrada.nextDouble();
                        s = new MetodoComunes(num1, num2);
                        System.out.println("\n\t════════════════════════");
                        System.out.println("\t\tLa suma es: " + s.getSuma());
                         System.out.println("\t════════════════════════");
                        break;

                    case 2:
                        m.resta();
                        System.out.print("\n\tIngrese el primer numero: ");
                        num1 = entrada.nextDouble();
                        System.out.print("\tIngrese el segundo numero: ");
                        num2 = entrada.nextDouble();
                        s = new MetodoComunes(num1, num2);
                         System.out.println("\n\t════════════════════════");
                        System.out.println("\t\tLa resta es: " + s.getResta());
                         System.out.println("\t════════════════════════");
                        break;

                    case 3:
                        m.multi();
                        System.out.print("\n\tIngrese el primer numero: ");
                        num1 = entrada.nextDouble();
                        System.out.print("\tIngrese el segundo numero: ");
                        num2 = entrada.nextDouble();
                        s = new MetodoComunes(num1, num2);
                        System.out.println("\n\t════════════════════════");
                        System.out.println("\t\tLa multiplicacion es: " + s.getMul());
                        System.out.println("\t════════════════════════");
                        break;

                    case 4:
                        m.dividir();
                        System.out.print("\n\tIngrese el primer numero: ");
                        num1 = entrada.nextDouble();
                        System.out.print("\tIngrese el segundo numero: ");
                        num2 = entrada.nextDouble();

                        if (num2 == 0) {
                            System.out.println("\tNo se puede dividir entre 0");
                        } else {
                            s = new MetodoComunes(num1, num2);
                            System.out.println("\n\t════════════════════════");
                            System.out.println("\t\tLa division es: " + s.getDiv());
                             System.out.println("\t════════════════════════");
                        }
                        break;

                    case 5:
                        m.limpiar();
                        System.out.println("\tLimpiando pantalla");
                        m.system("cls");

                        break;

                    case 6:
                        m.print();
                        System.out.print("\tIngrese la cadena a imprimir: ");
                        String printf = new Scanner(System.in).nextLine();
                         System.out.println("\n\t════════════════════════");
                        System.out.println("\t\ttexto: " + m.printf(printf));
                         System.out.println("\t════════════════════════");
                        break;

                    case 7:
                        System.out.println("Gracias por visitarnos...");
                        Thread.sleep(2000);
                        break;
                    default:
                        System.out.println("Opcion Incorrecta");

                }
                m.system("pause");

            } while (opc != 7);

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }

    }

}
