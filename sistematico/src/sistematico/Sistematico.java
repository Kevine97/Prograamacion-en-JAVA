/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistematico;

/**
 *
 * @author Ara-PC
 */
import java.util.Scanner;

public class Sistematico {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Usuario y Contraseña
        // Usuario = kevin Passwrod = Upoli123
        boolean validar = false;
        // Opcion 1
        int anoActual, anoNacimineto, edad;
        // opcion 2
        int numeroP;
        // Opcion 3
        float area, altura, base;
        // opcion 4
        String nombre = " Kevin Esquivel Rojas";
        // opcion
        int opc, opc1;

        do{
            validar = true;
            
        System.out.println("\t****** BIENVENIDO AL SISTEMA ******\n");
        System.out.print("User: ");
        String usuario = new Scanner(System.in).nextLine();
        System.out.print("Password: ");
        String password = new Scanner(System.in).nextLine();

        if (usuario.equals("kevin") && password.equals("upoli123")) {

            do {
                // MENU DE OPCIONES
                System.out.println("\t__________________________________");
                System.out.println("\t M E N U   D E   O C I O N E S");
                System.out.println("\t__________________________________");
                System.out.println("\t\t1. Calcular año de nacimiento ");
                System.out.println("\t\t2. Calcular numero primo");
                System.out.println("\t\t3. Triangulo");
                System.out.println("\t\t4. Imprimir nombre del desarrollador");
                System.out.println("\t\t5. Salir");
                System.out.println("\t__________________________________");
                System.out.print("\t\tOpcion: ");
                opc = entrada.nextInt();
                switch (opc) {
                case 1:
                    System.out.print("Ingrese el año actual: ");
                    anoActual = entrada.nextInt();

                    if (anoActual > 2020 || anoActual < 0) {

                        System.out.println("Año incorrecto");
                    } else {

                        System.out.print("Ingrese su edad: ");
                        edad = entrada.nextInt();

                        if (edad == 0 || edad < 0) {

                            System.out.println("Edad incorrecto");

                        } else {
                            anoNacimineto = anoActual - edad;
                            System.out.println("El año de nacimiento en el que nacio es: " + anoNacimineto);
                        }

                    }

                    break;

                case 2:
                    System.out.print("Ingrese el numero: ");
                    numeroP = entrada.nextInt();

                    if (numeroP % 2 == 0) {
                        System.out.println("El numero es par");
                    } else {

                        System.out.println("El numero es primo");
                    }

                    break;

                case 3:

                    System.out.println("\t__________________________________");
                    System.out.println("\t M E N U   D E   A R E A");
                    System.out.println("\t__________________________________");
                    System.out.println("\t\t1. Area ");
                    System.out.println("\t\t2. Altura");
                    System.out.println("\t\t3. Base");
                    System.out.println("\t\t4. Regresar");
                    System.out.println("\t__________________________________");
                    System.out.print("\t\tOpcion: ");
                    opc1 = entrada.nextInt();
                    switch (opc1) {
                    case 1:
                        float baseA = 0, alturaA = 0;
                        System.out.print("Ingrese la base: ");
                        baseA = entrada.nextFloat();
                        System.out.print("Ingrese la altura: ");
                        alturaA = entrada.nextFloat();
                        area = (baseA * alturaA) / 2;
                        System.out.println("El area es: " + area);
                        break;
                    case 2:
                        float AreaB = 0, alturaB = 0;
                        System.out.print("Ingrese el Area: ");
                        AreaB = entrada.nextFloat();
                        System.out.print("Ingrese la altura: ");
                        alturaB = entrada.nextFloat();
                        base = (AreaB * 2) / alturaB;
                        System.out.println("La base es: " + base);
                        break;

                    case 3:
                        float areaH = 0, baseH = 0;
                        System.out.print("Ingrese el Area: ");
                        areaH = entrada.nextFloat();
                        System.out.print("Ingrese la base: ");
                        baseH = entrada.nextFloat();
                        altura = (areaH * 2) / baseH;
                        System.out.println("La altura es: " + altura);

                        break;

                    case 4:
                        break;

                    default:
                        System.out.println("Opcion Incorrecta");
                        break;
                    }

                    break;

                case 4:
                    System.out.println("Nombre del desarrollador: " + nombre);
                    break;

                case 5:
                    System.out.println("Saliendo del sistema ...");
                    break;

                default:
                    System.out.println("Opcion incorrecta;");
                    break;
                }

            } while (opc != 5);

        } else {

            System.out.println("Usuario y/o Contraseña incorreta");
            validar = false;
        }
        }while(validar==false);

        entrada.close();

    }
}
