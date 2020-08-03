package poo_sistematico;

import java.util.Scanner;

public class POO_Sistematico {

    //Metodo para verificar si el numero de cuenta existe 
    public static int buscarCuenta(Cuenta t[], int numeroCuenta, int contadorCuenta) {

        int indice = 0;
        boolean encontrado = false;

        for (int i = 0; i < contadorCuenta; i++) {

            if (t[i].getNumeroCuenta() == numeroCuenta) {
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

        String nombre, dni, sexo;

        double saldo, cantidad, cantidad1;
        int numeroCuenta, opc, opc1;
        int contador = 0, edad;
        int contadorPersona = 0;
        int indiceCuenta;

        //Clase menu
        Menus menu = new Menus();
        Persona persona = new Persona();
        Cuenta cuenta[] = new Cuenta[60];
        Persona persona2[] = new Persona[60];

        try {

            do {
                menu.menu();
                menu.consultar1();
                menu.menu2();
                opc = entrada.nextInt();

                switch (opc) {

                    case 1:
                        menu.cliente();
                        entrada.nextLine();
                        System.out.print("\n\t\tIngrese el Nombre: ");
                        nombre = entrada.nextLine();
                        System.out.print("\t\tIngrese DNI: ");
                        dni = entrada.nextLine();
                        System.out.print("\t\tIngrese Edad: ");
                        edad = entrada.nextInt();
                        if (persona.mayorEdad(edad) == true) {

                            entrada.nextLine();
                            System.out.print("\t\tIngrese el Sexo(H-M): ");
                            sexo = entrada.nextLine();

                            menu.cuenta1();
                            System.out.print("\n\t\tNumero de cuenta: ");
                            numeroCuenta = entrada.nextInt();
                            System.out.print("\t\tSaldo a depositar: ");
                            saldo = entrada.nextDouble();
                            cuenta[contador++] = new Cuenta(saldo, numeroCuenta);
                            persona2[contadorPersona] = new Persona(nombre, edad, dni, sexo, cuenta);
                            System.out.println("\n\t\t═════════════════════════════════════");
                            System.out.println("\t\t\tRealizado correctamente ...");
                            System.out.println("\t\t\tSaldo: " + persona2[contadorPersona].consultarSaldo(contadorPersona));
                            System.out.println("\t\t═════════════════════════════════════");
                            contadorPersona++;

                        } else {
                            System.out.println("\t\tNo es mayor de edad para crear una cuenta");
                        }

                        break;

                    case 2:

                        menu.cuenta();
                        for (int i = 0; i < contador; i++) {

                            System.out.println("Cuenta: " + (i + 1));
                            System.out.println(cuenta[i].mostrarCuenta());
                            System.out.println(persona2[i].persona());
                            System.out.println("\t═════════════════════════════════");

                        }
                        break;

                    case 3:
                        menu.consultar1();
                        menu.menu3();
                        opc1 = entrada.nextInt();
                        System.out.print("\t\tIngrese el numero de cuenta: ");
                        numeroCuenta = entrada.nextInt();
                        indiceCuenta = buscarCuenta(cuenta, numeroCuenta, contador);
                        if (indiceCuenta == -1) {
                            System.out.println("\t\tNumero de cuenta incorrecto");
                        } else {
                            switch (opc1) {

                                case 1:
                                    menu.ingresar();
                                    System.out.print("\n\n\t\tSaldo a ingresar: ");
                                    cantidad = entrada.nextDouble();
                                    persona2[indiceCuenta].ingresarDinero(indiceCuenta, cantidad);
                                    System.out.println("\n\t\t═════════════════════════════════════");
                                    System.out.println("\t\t\tRealizado correctamente ...");
                                    System.out.println("\t\t\tSaldo: " + persona2[indiceCuenta].consultarSaldo(indiceCuenta));
                                    System.out.println("\t\t═════════════════════════════════════");
                                    break;

                                case 2:
                                    menu.retirar();
                                    System.out.print("\n\n\t\tSaldo a retirar: ");
                                    cantidad1 = entrada.nextDouble();

                                    if (cantidad1 > persona2[indiceCuenta].consultarSaldo(indiceCuenta)) {
                                        System.out.println("\n\t\t S A L D O   I N S U F I C I E N T E");
                                    } else {
                                        persona2[indiceCuenta].retirarDinero(indiceCuenta, cantidad1);
                                        System.out.println("\n\t\t═════════════════════════════════════");
                                        System.out.println("\t\t\tRealizado correctamente ...");
                                        System.out.println("\t\t\tSaldo: " + persona2[indiceCuenta].consultarSaldo(indiceCuenta));
                                        System.out.println("\t\t═════════════════════════════════════");
                                    }

                                    break;

                                case 3:
                                    menu.consultar();
                                    System.out.println("\n\t\t═════════════════════════════════════");
                                    System.out.println("\t\t\tRealizado correctamente ...");
                                    System.out.println("\t\t\tSaldo: " + persona2[indiceCuenta].consultarSaldo(indiceCuenta));
                                    System.out.println("\t\t═════════════════════════════════════");
                                    break;

                                case 4:
                                    break;

                                default:
                                    System.out.println("\t\tOpcion Incorrecta");
                            }
                            break;
                        }

                    case 4:
                        break;

                    default:
                        System.out.println("Opcion Incorrecta");

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
