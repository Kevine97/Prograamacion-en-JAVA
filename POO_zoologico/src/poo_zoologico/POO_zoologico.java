/*

Nombre: Kevin Alexander Esquivel Rojas
Docente: Hilario Antonio Campos Silva
Asignatura: Programacion II

                                            Domingo,5 de marzo del 2020


Objetivo: Crear un programa para un zoologico utilizando interfaces.

Razas Gallina: Gallina de Padua o Padovana, Gallina de cuello desnudo, Sedosa del Japón.
Razas de Leon: León de Katanga, León del Congo, León Transvaal, León de Nubia.
Razas de gatos: Selkirk Rex, Oriental De Pelo Largo, Abisinio, Azul Ruso.
Razas de perros: Azul Ruso, Frenchton, Goldador, Pitbull. 

 */
package poo_zoologico;

import java.io.IOException;
import java.util.Scanner;

public class POO_zoologico {

    public static void system(String command) {
        try {
            new ProcessBuilder("cmd", "/c", command)
                    .inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {

            System.out.println("Error: " + e);
        }
    }

    static Scanner entrada = new Scanner(System.in);

    //Instanseando las clases
    static Perro p;
    static Gato g;
    static Gallina ga;
    static Leon l;

    public static void main(String[] args) {

        Menus menu = new Menus();

        int opc;
        int opc_G;
        int opc_P;
        int opc_L;
        int opc_GA;

        do {
            menu.menu();
            menu.consultar1();
            menu.submenu();
            System.out.print("\t\t\topcion: ");
            opc = entrada.nextInt();
            switch (opc) {

                case 1:

                    do {
                        menu.usuario();
                        menu.submenu_GA();
                        System.out.print("\t\t\tOpcion: ");
                        opc_GA = entrada.nextInt();

                        switch (opc_GA) {
                            case 1:
                                animal_Perro();
                                break;

                            case 2:
                                if (Perro.p.size() > 0) {
                                    p.escuchar_perro();
                                } else {
                                    System.out.println("\t\t\tNo hay perros en el zoologico");
                                }

                                break;

                            case 3:
                                if (Perro.p.size() > 0) {
                                    p.alimentar_perro();
                                } else {
                                    System.out.println("\t\t\tNo hay perros en el zoologico");
                                }

                                break;

                            case 4:

                                break;

                        }

                    } while (opc_GA != 4);

                    break;

                case 2:

                    do {
                        menu.cuenta();
                        menu.submenu_P();

                        System.out.print("\t\t\tOpcion: ");
                        opc_P = entrada.nextInt();

                        switch (opc_P) {
                            case 1:
                                animal_Gallina();
                                break;
                            case 2:
                                if (Gallina.g.size() > 0) {

                                    ga.escuchar_gallina();
                                } else {
                                    System.out.println("\t\t\tNo hay gallinas en el zoologico");
                                }

                                break;

                            case 3:
                                if (Gallina.g.size() > 0) {
                                    ga.alimentar_gallina();
                                } else {
                                    System.out.println("\t\t\tNo hay gallinas en el zoologico");
                                }

                                break;

                            case 4:
                                break;

                        }

                    } while (opc_P != 4);

                    break;

                case 3:

                    do {
                        menu.ingresar();
                        menu.submenu_G();
                        System.out.print("\t\t\tOpcion: ");
                        opc_G = entrada.nextInt();

                        switch (opc_G) {

                            case 1:
                                animal_Gato();
                                break;

                            case 2:
                                if (Gato.gat.size() > 0) {
                                    g.escuchar_Gato();
                                } else {
                                    System.out.println("\t\t\tNo hay gatos en el zoologico");
                                }

                                break;

                            case 3:
                                if (Gato.gat.size() > 0) {
                                    g.alimentar_Gato();
                                } else {
                                    System.out.println("\t\t\tNo hay gatos en el zoologico");
                                }

                                break;

                            case 4:
                                break;

                        }
                    } while (opc_G != 4);

                    break;

                case 4:
                    do {
                        menu.retirar();
                        menu.submenu_L();
                        System.out.print("\t\t\tOpcion: ");
                        opc_L = entrada.nextInt();

                        switch (opc_L) {

                            case 1:
                                animal_Leon();
                                break;

                            case 2:
                                if (Leon.l.size() > 0) {
                                    l.escuchar_Leon();
                                } else {
                                    System.out.println("\t\t\tNo hay leones en el zoologico");
                                }

                                break;

                            case 3:
                                if (Leon.l.size() > 0) {
                                    l.alimentar_Leon();
                                } else {
                                    System.out.println("\t\t\tNo hay leones en el zoologico");
                                }

                                break;

                            case 4:
                                break;
                        }

                    } while (opc_L != 4);
                    break;

                case 5:
                    System.out.println("\t\tSaliendo...");
                    break;

                default:
                    System.out.println("\t\tOpcion Incorrecta");
            }

            system("pause");
        } while (opc != 5);

    }

    public static void animal_Perro() {

        String nombre;
        String raza;

        entrada.nextLine();
        System.out.print("\t\t\tNombre del perro: ");
        nombre = entrada.nextLine();
        System.out.print("\t\t\tIngrese la raza: ");
        raza = entrada.nextLine();

        p = new Perro(nombre, raza);
        Perro.p.add(p);
    }

    public static void animal_Gato() {

        String nombre;
        String raza;

        entrada.nextLine();
        System.out.print("\t\t\tNombre del Gato: ");
        nombre = entrada.nextLine();
        System.out.print("\t\t\tIngrese la raza: ");
        raza = entrada.nextLine();

        g = new Gato(nombre, raza);
        Gato.gat.add(g);

    }

    public static void animal_Gallina() {

        String nombre;
        String raza;

        entrada.nextLine();
        System.out.print("\t\t\tNombre de la Gallina: ");
        nombre = entrada.nextLine();
        System.out.print("\t\t\tIngrese la raza: ");
        raza = entrada.nextLine();

        ga = new Gallina(nombre, raza);
        Gallina.g.add(ga);

    }

    public static void animal_Leon() {

        String nombre;
        String raza;

        entrada.nextLine();
        System.out.print("\t\t\tNombre del Leon: ");
        nombre = entrada.nextLine();
        System.out.print("\t\t\tIngrese la raza: ");
        raza = entrada.nextLine();

        l = new Leon(nombre, raza);
        Leon.l.add(l);

    }

}
