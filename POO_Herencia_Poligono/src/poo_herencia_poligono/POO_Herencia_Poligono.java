/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_poligono;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class POO_Herencia_Poligono {

    static ArrayList<Polligono> poligono = new ArrayList<Polligono>();
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        llenarPoligono();
        mostrarResultados();

    }

    public static void llenarPoligono() {
        int opc;
        char res;
        do {

            do {
                System.out.println("\tM E N U");
                System.out.println("\tDigite que poligono desea: ");
                System.out.println("\t1. Triangulo");
                System.out.println("\t2. Rectangulo");
                System.out.print("\tOpcion: ");
                opc = entrada.nextInt();
            } while (opc < 1 || opc > 2);

            switch (opc) {

                case 1:
                    llenarTriangulo();

                    break;

                case 2:
                    llenarRectangulo();

                    break;
            }

            System.out.println("Desea digitar otro Poligono (S_N):  ");
            res = entrada.next().charAt(0);
        } while (res == 'S' || res == 's');

    }

    public static void llenarTriangulo() {
        double lado1, lado2, lado3;
        System.out.print("Digite el lado1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2: ");
        lado2 = entrada.nextDouble();
        System.out.print("Digite el lado3: ");
        lado3 = entrada.nextDouble();
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        poligono.add(triangulo);
        System.out.println("Area: " + triangulo.area());
    }

    public static void llenarRectangulo() {
        double lado1, lado2;
        System.out.print("Digite el lado1: ");
        lado1 = entrada.nextDouble();
        System.out.print("Digite el lado2: ");
        lado2 = entrada.nextDouble();
        Rectangulo rectangulo = new Rectangulo(lado1, lado2);
        poligono.add(rectangulo);
        System.out.println("Area: " + rectangulo.area());
    }

    public static void mostrarResultados() {

        for (Polligono poli : poligono) {

            System.out.println(poli.toString());
            System.out.println("Area: " + poli.area());
            System.out.println("");
        }
    }

}
