/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_sistematico;

/**
 *
 * @author Ara-PC
 */
public class Menus {

    public void menu() {

        System.out.println("\t╔════════════════════════════════════════╗");
        System.out.println("\t║     B A N C O   C E N T R A L   D E   N I C A R A G U A       ║");
        System.out.println("\t╚════════════════════════════════════════╝");
    }

    public void usuario() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║           INFORMACION DE USUARIO              ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void cuenta() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║            INFORMACION DE CUENTA              ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void ingresar() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                 INGRESAR SALDO                ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void retirar() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                 RETIRAR SALDO                  ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void consultar() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                 CONSULTAR SALDO               ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void consultar1() {
        System.out.println("\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                      M E N U                  ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void cliente() {
        System.out.println("\n\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                REGISTRO CLIENTE               ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void cuenta1() {
        System.out.println("\n\t\t╔══════════════════════════════╗");
        System.out.println("\t\t║                 REGISTRO CUENTA               ║");
        System.out.println("\t\t╚══════════════════════════════╝");
    }

    public void menu2() {
        System.out.println("\t\t════════════════════════════════════");
        System.out.println("\t\t1. Registrar Cuentas");
        System.out.println("\t\t2. Listar Cuentas");
        System.out.println("\t\t3. Seleccionar Cuenta");
        System.out.println("\t\t4. Salir");
        System.out.println("\t\t════════════════════════════════════");
        System.out.print("\t\tOpcion: ");

    }

    public void menu3() {
        System.out.println("\t\t════════════════════════════════════");
        System.out.println("\t\t1. Ingresar");
        System.out.println("\t\t2. Retirar");
        System.out.println("\t\t3. Totalizar");
        System.out.println("\t\t4. Regresar");
        System.out.println("\t\t════════════════════════════════════");
        System.out.print("\t\tOpcion: ");
    }

    public void limpiar() {

        for (int i = 0; i < 10; i++) {
            System.out.println("");
        }
    }

}
