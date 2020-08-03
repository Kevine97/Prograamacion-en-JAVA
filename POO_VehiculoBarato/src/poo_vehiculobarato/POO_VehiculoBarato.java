package poo_vehiculobarato;

import java.util.Scanner;

public class POO_VehiculoBarato {

    //Metodo para encontrar el coche con el  precio mas barato
    public static int cohe_barato(Vehiculo coches[]) {

        float precio;
        int indice = 0;

        //Ingresamo el primer precio
        precio = coches[0].getPrecio(); //Asignamos el primer precio del coche ingresado

        for (int i = 1; i < coches.length; i++) {
            if (coches[i].getPrecio() < precio) { // Condicion para determinar cual coche es mas barato

                precio = coches[i].getPrecio();
                indice = i;
            }

        }

        return indice;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int n, indice;

        System.out.print("Digite la cantidad de vehiculos: ");
        n = entrada.nextInt();
        Vehiculo coche[] = new Vehiculo[n];

        System.out.println("________________________________________");
        System.out.println("\tA U T O   L O T E");
        System.out.println("________________________________________");
        for (int i = 0; i < coche.length; i++) {
            entrada.nextLine();
            System.out.println("\nDigite las caracteristicas del vehiculo: " + (i + 1));
            System.out.print("Introduzca la marca: ");
            marca = entrada.nextLine();
            System.out.print("Introduzca el modelo: ");
            modelo = entrada.nextLine();
            System.out.print("Introduzca el precio: ");
            precio = entrada.nextFloat();

            //llenando el constructo
            coche[i] = new Vehiculo(marca, modelo, precio);

        }

        indice = cohe_barato(coche);
        System.out.println("_____________________________________________________");
        System.out.println("\n\tC O C H E   M A S   B A R A T O");
        System.out.println("_____________________________________________________");
        System.out.println(coche[indice].mostrarDatos());
        System.out.println("_____________________________________________________");
    }

}
