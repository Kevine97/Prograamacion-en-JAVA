package poo_atletismo;

import java.util.Scanner;

public class POO_Atletismo {

    //Metodo para determinar el atleta ganador
    public static int ganador(Atleta atleta[]) {
        float tiempo;
        int indice = 0;

        tiempo = atleta[0].getTiempo();

        for (int i = 1; i < atleta.length; i++) {
            if (atleta[i].getTiempo() < tiempo) {
                tiempo = atleta[i].getTiempo();
                indice = i;
            }

        }
        return indice;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero, n, indice;
        String nombre;
        float tiempo;

        System.out.print("Digite el numero de atleta a participar: ");
        n = entrada.nextInt();
        Atleta at[] = new Atleta[n];
        System.out.println("______________________________________________________");
        System.out.println("\tINSTITUTO DE ATLETISMO NACIONAL (IAN)");
        System.out.println("______________________________________________________");

        for (int i = 0; i < at.length; i++) {
            
            System.out.println("\nDigite las caracteristicas del Atleta: " + (i + 1));
            System.out.print("Ingrese el numero de atleta: ");
            numero = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Ingrese el nombre del atleta: ");
            nombre = entrada.nextLine();
            System.out.print("Ingrese el tiempo de llegada: ");
            tiempo = entrada.nextFloat();

            at[i] = new Atleta(numero, nombre, tiempo);

        }

        indice = ganador(at);
        System.out.println("_____________________________________________________");
        System.out.println("\n\tA T L E T A  G A N A D O R");
        System.out.println("_____________________________________________________");
        System.out.println(at[indice].mostrarDatos());
        System.out.println("_____________________________________________________");
    }

}
