package poo_herencia_empleados;

import java.util.ArrayList;
import java.util.Scanner;

public class POO_Herencia_Empleados {

    static ArrayList<Empleado> empleado = new ArrayList<Empleado>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Llenar();

    }

    public static void Llenar() {

        int opc;

        do {
            System.out.println("E M P L E A D O S");
            System.out.println("1. Comerciante");
            System.out.println("2. Repartidor");
            System.out.println("3. Mostrar");
            System.out.println("4. salir");
            System.out.print("Opcion: ");
            opc = entrada.nextInt();

            switch (opc) {

                case 1:
                    EmpleadoComerciante();
                    break;

                case 2:
                    EmpleadoRepartidor();
                    break;

                case 3:
                    mostrar();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Opcion Incorrecta");
            }

        } while (opc != 4);

    }

    public static void EmpleadoComerciante() {
        String nombre;
        int edad;
        double salario, comision;

        entrada.nextLine();
        System.out.print("Nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.print("Edad del empleado: ");
        edad = entrada.nextInt();
        System.out.print("Salario: ");
        salario = entrada.nextDouble();
        System.out.print("Comision: ");
        comision = entrada.nextDouble();
        Comerciante comerciante = new Comerciante(comision, nombre, edad, salario);
        empleado.add(comerciante);
        System.out.println(comerciante.toString());
        System.out.println("PLUS: "+comerciante.plus());
    }

    public static void EmpleadoRepartidor() {
        String nombre, zona;
        int edad;
        double salario;
        entrada.nextLine();
        System.out.print("Zona: ");
        zona = entrada.nextLine();
        System.out.print("Nombre del empleado: ");
        nombre = entrada.nextLine();
        System.out.print("Edad del empleado: ");
        edad = entrada.nextInt();
        System.out.print("Salario: ");
        salario = entrada.nextDouble();

        Repartidor rapartidor = new Repartidor(zona, nombre, edad, salario);
        empleado.add(rapartidor);
        System.out.println(rapartidor.toString());
        System.out.println("PLUS: "+rapartidor.plus());

    }

    public static void mostrar() {

        for (Empleado e : empleado) {

            System.out.println(e.toString());
        }
    }

}
