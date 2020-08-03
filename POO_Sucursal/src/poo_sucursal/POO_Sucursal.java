/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_sucursal;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class POO_Sucursal {

    public static int buscarSucursal(Sucursal t[], int numeroSucursal, int contadorSucursal) {

        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < contadorSucursal; i++) {

            if (t[i].getNumeroSucursal() == numeroSucursal) {
                indice = i;
                encontrado = true;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static int buscarPaquete(Paquete t[], int numeroPaquete, int contadorPaquete) {

        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < contadorPaquete; i++) {

            if (t[i].getNumeroPaquete() == numeroPaquete) {
                indice = i;
                encontrado = true;
            }
        }

        if (encontrado == false) {
            indice = -1;
        }
        return indice;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroSucursal, opc;
        String direccion, ciudad;
        int numeroPaquete, prioridad;
        String dni;
        double peso, precioPaquete;
        int contadorSucursal = 0, contadorPaquete = 0;
        int indiceSucursal, indicePaquete;

        Sucursal sucursal[] = new Sucursal[50];
        Paquete paquete[] = new Paquete[100];

        do {
            System.out.println("M E N U");
            System.out.println("1. Crear una Sucursal");
            System.out.println("2. Enviar Paquete");
            System.out.println("3. Consultar Sucursal");
            System.out.println("4. Consultar Paquete");
            System.out.println("5. Mostrar todas las Sucursales");
            System.out.println("6. Mostrar todas los Paquetes");
            System.out.println("7. Salir");
            System.out.print("Opcion de menu: ");
            opc = entrada.nextInt();

            switch (opc) {

                case 1:
                    System.out.print("Digite el numero sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("Digite la direccion: ");
                    direccion = entrada.nextLine();
                    System.out.print("Digite la ciudad: ");
                    ciudad = entrada.nextLine();
                    sucursal[contadorSucursal++] = new Sucursal(numeroSucursal, direccion, ciudad);

                    break;

                case 2:
                    System.out.print("Digite el numero de sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);

                    if (indiceSucursal == -1) {
                        System.out.println("Socursal no existe");
                    } else {
                        System.out.print("Numero de paquete");
                        numeroPaquete = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Digite le dni de la persona: ");
                        dni = entrada.nextLine();
                        System.out.print("Digite el peso: ");
                        peso = entrada.nextDouble();
                        System.out.print("Digite la prioridad: ");
                        prioridad = entrada.nextInt();

                        paquete[contadorPaquete] = new Paquete(numeroPaquete, dni, peso, prioridad);
                        precioPaquete = sucursal[indiceSucursal].calcularPrecio(paquete[contadorPaquete]);
                        System.out.println("\nEl precio es: " + "$" + precioPaquete);
                        contadorPaquete++;
                    }

                    break;

                case 3:
                    System.out.print("Diigite el numero de sucursal: ");
                    numeroSucursal = entrada.nextInt();
                    indiceSucursal = buscarSucursal(sucursal, numeroSucursal, contadorSucursal);
                    if (indiceSucursal == -1) {
                        System.out.println("La sucursal no existe");
                    } else {
                        System.out.println("Los datos de la sucursal son: ");
                        System.out.println(sucursal[indiceSucursal].mostarSucursal());
                    }
                    break;

                case 4:
                    System.out.print("Diigite el nuemro de paquete: ");
                    numeroPaquete = entrada.nextInt();
                    indicePaquete = buscarPaquete(paquete, numeroPaquete, contadorPaquete);
                    if (indicePaquete == -1) {
                        System.out.println("El paquete no exite");
                    } else {

                        System.out.println("Los datos del paquete: ");
                        System.out.println(paquete[indicePaquete].MostrarPaquetes());
                    }
                    break;

                case 5:
                    for (int i = 0; i < contadorSucursal; i++) {

                        System.out.println("\nSucursal: " + (i + 1));
                        System.out.println(sucursal[i].mostarSucursal());

                    }
                    break;

                case 6:
                    for (int i = 0; i < contadorPaquete; i++) {

                        System.out.println("\nSucursal: " + (i + 1));
                        System.out.println(paquete[i].MostrarPaquetes());

                    }
                    break;

                case 7:
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }

            System.out.println("\n  ");

        } while (opc != 7);
    }

}
