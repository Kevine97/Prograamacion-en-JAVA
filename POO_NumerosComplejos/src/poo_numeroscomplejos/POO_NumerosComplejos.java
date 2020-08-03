package poo_numeroscomplejos;

import java.util.Scanner;

public class POO_NumerosComplejos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double a, b, c, d;
        int opc, numero;
        Complejo numero1, numero2, suma, mult;

        //Menu
        do {
            System.out.println("\tO P E R A C I O N E S");
            System.out.println("1. Suma dos numeros complejos");
            System.out.println("2. Multiplicar dos numeros complejos");
            System.out.println("3. Comparar dos numeros complejos");
            System.out.println("4. Multiplicar un numero complejo por un entero");
            System.out.println("5. Salir");
            System.out.print("Opcion: ");
            opc = entrada.nextInt();
            switch (opc) {

                case 1:
                    System.out.println("Digite el primer numero complejo");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();

                    System.out.println("\nDigite el segundo numero complejo");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    numero1 = new Complejo(a, b);
                    numero2 = new Complejo(c, d);
                    suma = numero1.suma(numero2);
                    System.out.println("La suma es: " + suma.getA() +" + "+ suma.getB() + "i");

                    break;

                case 2:
                    System.out.println("Digite el primer numero complejo");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();

                    System.out.println("\nDigite el segundo numero complejo");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();

                    numero1 = new Complejo(a, b);
                    numero2 = new Complejo(c, d);
                    mult = numero1.producto(numero2);
                    System.out.println("La multipllicacion es: " + mult.getA() +" + "+ mult.getB() + "i");
                    break;

                case 3:
                    System.out.println("Digite el primer numero complejo");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();

                    System.out.println("\nDigite el segundo numero complejo");
                    System.out.print("Digite la parte real: ");
                    c = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    d = entrada.nextDouble();
                    numero1 = new Complejo(a, b);
                    numero2 = new Complejo(c, d);
                    if (numero1.igualdad(numero2)) {
                        System.out.println("Los numeros complejos son iguales");
                    } else {
                        System.out.println("Los numeros complejos son diferentes");
                    }
                    break;

                case 4:
                    System.out.println("Digite el primer numero complejo");
                    System.out.print("Digite la parte real: ");
                    a = entrada.nextDouble();
                    System.out.print("Digite la parte imaginaria: ");
                    b = entrada.nextDouble();
                    System.out.print("Ahora digite el numero entero");
                    numero = entrada.nextInt();
                    numero1 = new Complejo(a, b);
                    mult = numero1.entero(numero);
                    System.out.println("La multipllicacion es: " + mult.getA() +" + "+ mult.getB() + "i");
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcion Incorrecta ...");
                    break;

            }
        } while (opc != 5);

    }

}
