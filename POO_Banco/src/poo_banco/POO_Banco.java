/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_banco;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class POO_Banco {

    public static int buscarCuenta(Banco banco[], int n) {
        int i = 0, indice = 0;
        boolean encontrado = false;

        while ((i < banco.length) && encontrado == false) {
            if (banco[i].getNumeroCuenta() == n) {
                encontrado = true;
                indice = i;
            }
            i++;
        }
        if (encontrado == false) {
            indice = -1;

        }
        return indice;
    }

    public static void main(String[] args) {

        try {

            Scanner entrada = new Scanner(System.in);
            String nombre, apellido, dni;
            int numeroCuenta, n;
            double saldo;
            // Banco banco[];
            Menus menu = new Menus();

            menu.menu();
            menu.usuario();
            System.out.print("\n\tDNI: ");
            dni = entrada.nextLine();
            System.out.print("\tNombre: ");
            nombre = entrada.nextLine();
            System.out.print("\tApellido: ");
            apellido = entrada.nextLine();
            System.out.print("\tNumeros de cuentas a crear: ");
            n = entrada.nextInt();

            Banco banco[] = new Banco[n];
            menu.limpiar();
            menu.menu();
            menu.cuenta();
            for (int i = 0; i < banco.length; i++) {
                System.out.println("\n\tDigite los datos para la cuenta: " + (i + 1));
                System.out.print("\tIngrese el numero de cuenta: ");
                numeroCuenta = entrada.nextInt();
                System.out.print("\tDigite el saldo de la cuenta: ");
                saldo = entrada.nextDouble();

                banco[i] = new Banco(numeroCuenta, saldo);

            }

            Cliente cliente1 = new Cliente(dni, nombre, apellido, banco);
            int opc;
            int indiceCuenta;
            double cantidadDinero, cantidadDinero2;
            do {
                menu.limpiar();
                menu.menu();
                System.out.println("\t\t\t\t1. Ingresar Dinero");
                System.out.println("\t\t\t\t2. Retirar Dinero");
                System.out.println("\t\t\t\t3. Consultar Saldo");
                System.out.println("\t\t\t\t4. Salir");
                System.out.println("\t\t═════════════════════════════════");
                System.out.print("\t\t\t\tOpcion: ");
                opc = entrada.nextInt();

                switch (opc) {

                    case 1:
                        menu.limpiar();
                        menu.menu();
                        menu.ingresar();
                        System.out.print("\tIngrese el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarCuenta(banco, numeroCuenta);
                        if (indiceCuenta == -1) {
                            System.out.println("\n\tEl numero de cuenta no existe");
                        } else {
                            System.out.print("\tDigite la cantidad de dinero: ");
                            cantidadDinero = entrada.nextDouble();
                            cliente1.ingresarDinero(indiceCuenta, cantidadDinero);
                            System.out.println("\t═════════════════════════════════");
                            System.out.println("\tRealizado correctamente");
                            System.out.println("\tSalo disponible: " + cliente1.consultarSaldo(indiceCuenta));
                            System.out.println("\t═════════════════════════════════");

                        }
                        break;

                    case 2:
                        menu.limpiar();
                        menu.menu();
                        menu.retirar();
                        System.out.print("\tIngrese el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarCuenta(banco, numeroCuenta);
                        if (indiceCuenta == -1) {
                            System.out.println("\n\tEl numero de cuenta no existe");
                        } else {
                            System.out.print("\tDigite la cantidad de dinero: ");
                            cantidadDinero2 = entrada.nextDouble();

                            if (cantidadDinero2 > cliente1.consultarSaldo(indiceCuenta)) {
                                System.out.println("S\taldo insuficiente");
                            } else {
                                cliente1.retirarDinero(indiceCuenta, cantidadDinero2);
                                System.out.println("\t═════════════════════════════════");
                                System.out.println("\tRealizado correctamente");
                                System.out.println("\tSalo disponible: " + cliente1.consultarSaldo(indiceCuenta));
                                System.out.println("\t═════════════════════════════════");
                            }

                        }
                        break;

                    case 3:
                        menu.limpiar();
                        menu.menu();
                        menu.consultar();
                        System.out.print("\tIngrese el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarCuenta(banco, numeroCuenta);
                        if (indiceCuenta == -1) {
                            System.out.println("\n\tEl numero de cuenta no existe");
                        } else {
                            System.out.println("\t═════════════════════════════════");
                            System.out.println("\tSalo disponible: " + cliente1.consultarSaldo(indiceCuenta));
                            System.out.println("\t═════════════════════════════════");
                        }
                        break;

                    case 4:
                        System.out.println("Gracias por visitarnos...");
                        Thread.sleep(1000);
                        break;

                    default:
                        System.out.println("\tOpcion Incorrecta");
                }

                system("pause");
            } while (opc != 4);

        } catch (Exception e) {

            System.out.println("Error: " + e);
        }

    }

    public static void system(String command) {
        try {
            new ProcessBuilder("cmd", "/c", command)
                    .inheritIO().start().waitFor();
        } catch (Exception e) {

        }
    }

}
