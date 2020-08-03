/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_herencia_futbol;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class POO_Herencia_Futbol {

    static ArrayList<Persona> persona = new ArrayList<Persona>();
    static Scanner entrada = new Scanner(System.in);

    static Persona futbolista1 = new Futbolista(9, "Delantero", "Gonzalo", "Higain", 29);
    static Persona futbolista2 = new Futbolista(11, "Delantero", "Dembele", "Osman", 23);
    static Persona entrenador = new Entrenador("Ofensiva", "Pep", "Guardiola", 38);
    static Persona doctor = new Doctor("Licienciado en Fisioterapia", 20, "Alex", "Moreneti", 56);

    public static void main(String[] args) {

        persona.add(futbolista1);
        persona.add(futbolista2);
        persona.add(entrenador);
        persona.add(doctor);
        menu();
     
    }

    public static void menu() {

        int opc;

        do {
            System.out.println("\t M E N U");
            System.out.println("\t 1. Viaje Equipo");
            System.out.println("\t 2. Entrenamiento");
            System.out.println("\t 3. Partido de Futbol");
            System.out.println("\t 4. Planificar Entrenamiento");
            System.out.println("\t 5. Entrevista");
            System.out.println("\t 6. Curar Lesion");
            System.out.println("\t 7. Salir");
            System.out.println("\t___________________________________");
            System.out.print("\tOpcion: ");
            opc = entrada.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("");
                    viajarEquipo();
                    break;

                case 2:
                    System.out.println("");
                    entrenarEquipo();
                    break;

                case 3:
                    System.out.println("");
                    partidoFutbol();
                    break;

                case 4:
                    System.out.println("");
                    planificarEntrenamiento();
                    break;

                case 5:
                    System.out.println("");
                    entrevista();
                    break;

                case 6:
                    System.out.println("");
                    curarLesion();
                    break;

                case 7:
                    break;

                default:
                    System.out.println("\tOpcion Incorrecta");
            }
            system("pause");

        } while (opc != 7);
    }

    public static void viajarEquipo() {

        for (Persona e : persona) {
            System.out.print( e.getNombre() + "  " + e.getApellido()+" -> ");
            e.viajar();
            System.out.println();
           
         

        }
    }

    public static void entrenarEquipo() {

        for (Persona e : persona) {
            System.out.print(e.getNombre() + "  " + e.getApellido()+" -> ");
            e.entrenamiento();
            System.out.println();

        }

    }

    public static void partidoFutbol() {

        for (Persona e : persona) {
            System.out.println("Nombre: " + e.getNombre() + "\tApellido: " + e.getApellido());
            e.partidoFutbol();

        }

    }

    public static void planificarEntrenamiento() {

        System.out.println("Nombre: " + entrenador.getNombre() + "\tApellido: " + entrenador.getApellido());
        ((Entrenador) entrenador).planificarEntrenamiento();

    }

    public static void entrevista() {
        System.out.println("Nombre: " + futbolista1.getNombre() + "\tApellido: " + futbolista1.getApellido());
        ((Futbolista) futbolista1).entrevista();
    }

    public static void curarLesion() {
        System.out.println("Nombre: " + doctor.getNombre() + "\tApellido: " + doctor.getApellido());
        ((Doctor) doctor).curarLesion();
    }

    public static void system(String command) {
        try {
            new ProcessBuilder("cmd", "/c", command)
                    .inheritIO().start().waitFor();
        } catch (IOException | InterruptedException e) {

            System.out.println("Error: " + e);
        }
    }
}
