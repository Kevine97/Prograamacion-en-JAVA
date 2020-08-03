/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_zoologico;

/**
 *
 * @author Ara-PC
 */
public class Menus {

    public void menu() {

        System.out.println("\t╔════════════════════════════════════════╗");
        System.out.println("\t║            Z O O L O G I C O   N A C I O N A L                ║");
        System.out.println("\t╚════════════════════════════════════════╝");
    }

    public void usuario() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                    P E R R O S                ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void cuenta() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                   G A L L I N A               ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void ingresar() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                     G A T O                   ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void retirar() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                      L E O N                  ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void consultar() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                 E L I M I N A R               ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void consultar1() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                    M E N U                    ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void repro1() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║  R E P R O D U C T O R     N E T F L I X      ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void repro2() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║  R E P R O D U C T O R     S P O T I F Y     ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void submenu() {
        System.out.println("\t ════════════════════════════════════════");
        System.out.println("\t\t\t\t1. Perros");
        System.out.println("\t\t\t\t2. Gallinas");
        System.out.println("\t\t\t\t3. Gatos");
        System.out.println("\t\t\t\t4. Leon");
        System.out.println("\t\t\t\t5. Salir");
        System.out.println("\t ════════════════════════════════════════");
    }

    public void submenu_GA() {
        System.out.println("\t ════════════════════════════════════════");
        System.out.println("\t\t\t\t1. Agregar Perro");
        System.out.println("\t\t\t\t2. Escuchar Perro");
        System.out.println("\t\t\t\t3. Alimentar Perro");
        System.out.println("\t\t\t\t4. Regresar");
        System.out.println("\t ════════════════════════════════════════");

    }

    public void submenu_P() {
        System.out.println("\t ════════════════════════════════════════");
        System.out.println("\t\t\t\t1. Agregar Gallina");
        System.out.println("\t\t\t\t2. Escuchar Gallina");
        System.out.println("\t\t\t\t3. Alimentar Gallina");
        System.out.println("\t\t\t\t4. Regresar");
        System.out.println("\t ════════════════════════════════════════");

    }

    public void submenu_G() {
        System.out.println("\t ════════════════════════════════════════");
        System.out.println("\t\t\t\t1. Agregar Gatao");
        System.out.println("\t\t\t\t2. Escuchar Gato");
        System.out.println("\t\t\t\t3. Alimentar Gato");
        System.out.println("\t\t\t\t4. Regresar");
        System.out.println("\t ════════════════════════════════════════");

    }

    public void submenu_L() {
        System.out.println("\t ════════════════════════════════════════");
        System.out.println("\t\t\t\t1. Agregar Leon");
        System.out.println("\t\t\t\t2. Escuchar Leon");
        System.out.println("\t\t\t\t3. Alimentar Leon");
        System.out.println("\t\t\t\t4. Regresar");
        System.out.println("\t ════════════════════════════════════════");

    }

    public void limpiar() {

        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

}
