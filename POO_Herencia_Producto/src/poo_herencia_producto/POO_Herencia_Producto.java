/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_producto;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class POO_Herencia_Producto {

    static ArrayList<Producto> productos = new ArrayList<Producto>();
    static Scanner entrada = new Scanner(System.in);

    public static void system(String command) {
        try {
            new ProcessBuilder("cmd", "/c", command)
                    .inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {

            System.out.println("Error: " + e);
        }
    }

    public static void main(String[] args) {
        
        menu();

    }

    public static void menu() {

        int opc;

        do {
            System.out.println("\tP R O D U C T O S");
            System.out.println("\t 1. Perecederos");
            System.out.println("\t 2. No perecederos");
            System.out.println("\t 3. Lista de productos");
            System.out.println("\t 4. SALIR");
            System.out.println("\t____________________________________");
            System.out.print("\tOpcion: ");
            opc = entrada.nextInt();

            switch (opc) {

                case 1:
                    perecederos();
                    break;

                case 2:
                    NOperecederos();
                    break;

                case 3:
                    mostrar();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("\n\tOpcion Incorrecta");
            }

            system("pause");
        } while (opc != 4);

    }

    public static void perecederos() {

        int dias;
        double precio;
        String nombre;
        int cantidad;
        double l;

        System.out.print("\tDias a caducar: ");
        dias = entrada.nextInt();
        entrada.nextLine();
        System.out.print("\tNombre del producto: ");
        nombre = entrada.nextLine();
        System.out.print("\tPrecio: ");
        precio = entrada.nextDouble();
        System.out.print("\tCantidad: ");
        cantidad = entrada.nextInt();

        Perecedero p = new Perecedero(dias, nombre, precio, cantidad);
        l = p.calcular();
        productos.add(p);
        System.out.println("\tPrecio total: " + l);

    }

    public static void NOperecederos() {

        String dias;
        double precio;
        String nombre;
        int cantidad;
        double l;
        entrada.nextLine();
        System.out.print("\tTipo de producto: ");
        dias = entrada.nextLine();
        System.out.print("\tNombre del producto: ");
        nombre = entrada.nextLine();
        System.out.print("\tPrecio: ");
        precio = entrada.nextDouble();
        System.out.print("\tCantidad: ");
        cantidad = entrada.nextInt();

       NoPerecedero c = new NoPerecedero(dias, nombre, precio, cantidad);
       l = c.calcular();
       productos.add(c);
       System.out.println("\tPrecio total: " + l);

    }
    
    public static void mostrar(){
        
        for(Producto p: productos){
            
            System.out.println(p.toString());
            System.out.print("\tPrecio total: "+p.calcular());
            System.out.println("");
        }
    }

}
