/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_proyecto_aeropuerto;

import java.util.Scanner;

/**
 *
 * @author Ara-PC
 */
public class POO_Proyecto_Aeropuerto {

    static Scanner entrada = new Scanner(System.in);
    final static int num = 4; //Cantidad de aeropuertos
    static Aeropuerto aeropuertos[] = new Aeropuerto[num]; //Arreglo de la clase aeropuertos
   
    public static void main(String[] args) {

        
        //Insertar datos de los aeropuertos
        insertar_Aeropuertos(aeropuertos);
       
       menu();
    }

    public static void insertar_Aeropuertos(Aeropuerto aero[]) {

        aero[0] = new Aeropuerto_Publico(80000, "La costeña", "Managua", "Nicaragua");
        aero[0].insertar_Compañia(new Compañia("AeroPeru"));
        aero[0].insertar_Compañia(new Compañia("LATAM"));
        aero[0].getCompañia("AeroPeru").insertar_Vuelo(new Vuelo("IB20", "Lima", "Mexico", 150.2, 200));
        aero[0].getCompañia("AeroPeru").insertar_Vuelo(new Vuelo("IB21", "Lima", "Mexico", 150.2, 200));
        aero[0].getCompañia("LATAM").insertar_Vuelo(new Vuelo("FC12", "Lima", "Mexico", 150.2, 200));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertar_pasajero(new Pasajero("Kevin Esquivel", "001-009", "Nicaraguense"));
        aero[0].getCompañia("AeroPeru").getVuelo("IB20").insertar_pasajero(new Pasajero("Kevin Esquivel", "001-009", "Nicaraguense"));
        aero[0].getCompañia("LATAM").getVuelo("FC12").insertar_pasajero(new Pasajero("Kevin Esquivel", "001-009", "Nicaraguense"));

        /*aero[1] = new Aeropuerto_Privado("Central Madrid", "Madrid", "España");
        aero[1].insertar_Compañia(new Compañia("AirEuropa"));
        String empresa[] = {"Cobresol", "Anguila"};
        ((Aeropuerto_Privado) aero[1]).insetar_empresas(empresa);
        aero[1].getCompañia("AirEuropa").insertar_Vuelo(new Vuelo("12345", "Managua", "España", 1000, 200));
        aero[1].getCompañia("AirEuropa").getVuelo("AE025").insertar_pasajero(new Pasajero("Kevin", "001-998", "Nicaraguense"));

        aero[2] = new Aeropuerto_Publico(800000, "Aeropuerto Mexico", "DF Mexico", "Mexico");
        aero[2].insertar_Compañia(new Compañia("AirAmerica"));
        aero[2].insertar_Compañia(new Compañia("VuelaMexico"));
        aero[2].getCompañia("AirAmerica").insertar_Vuelo(new Vuelo("FC12", "Managua", "Costa Rica", 100.90, 120));
        aero[2].getCompañia("VuelaMexico").insertar_Vuelo(new Vuelo("FC13", "Managua", "España", 400, 100));
        aero[2].getCompañia("AirAmerica").getVuelo("FC12").insertar_pasajero(new Pasajero("Jose Calderon", "20vgHP", "Nicaraguense"));
        aero[2].getCompañia("VuelaMexico").getVuelo("FC13").insertar_pasajero(new Pasajero("Raul", "21VPL", "Nicaraguense"));

        aero[3] = new Aeropuerto_Publico(800000, "Aeropuerto Bogota", "Bogota", "Colombia");
        aero[3].insertar_Compañia(new Compañia("AirColombia"));
        aero[3].insertar_Compañia(new Compañia("VuelaColombia"));
        aero[3].getCompañia("AirColombia").insertar_Vuelo(new Vuelo("FC12", "Managua", "Costa Rica", 100.90, 120));
        aero[3].getCompañia("VuelaColombia").insertar_Vuelo(new Vuelo("FC13", "Managua", "España", 400, 100));
        aero[3].getCompañia("AirColombia").getVuelo("FC12").insertar_pasajero(new Pasajero("Jose Calderon", "20vgHP", "Nicaraguense"));
        aero[3].getCompañia("VuelaColombia").getVuelo("FC13").insertar_pasajero(new Pasajero("Raul", "21VPL", "Nicaraguense"));
*/
    }

    public static void menu() {

        int opc;

        do {
            System.out.println("M E N U");
            System.out.println("1. Ver Aeropuerto Gestionado");
            System.out.println("2. Ver Empresas Pratocinadoras o Subvencion");
            System.out.println("3. Ver Compañias");
            System.out.println("4. Listar Vuelos de las Compañias");
            System.out.println("5. Listas posibles vuelos de origen a destino");
            System.out.println("6. Salir");
            System.out.println("___________________________________________________");
            System.out.print("Opcion: ");
            opc = entrada.nextInt();
            switch (opc) {

                case 1:
                    System.out.println("");
                    mostrarAeropuerto(aeropuertos);
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    break;

                default:
                    System.out.println("Opcion incorrecta");
                    break;

            }

        } while (opc != 6);
    }

    public static void mostrarAeropuerto(Aeropuerto aeropuerto[]) {
       
        for (int i = 0; i < aeropuerto.length; i++) {

            if (aeropuerto[i] instanceof Aeropuerto_Privado) {
                System.out.println("Aeropuero Privado");
                System.out.println("Nombre: " + aeropuerto[i].getNombre());
                System.out.println("Ciudad: " + aeropuerto[i].getCiudad());
                System.out.println("Pais: " + aeropuerto[i].getPais());

            } else {

                System.out.println("Aeropuero Publico");
                System.out.println("Nombre: " + aeropuerto[i].getNombre());
                System.out.println("Ciudad: " + aeropuerto[i].getCiudad());
                System.out.println("Pais: " + aeropuerto[i].getPais());

            }
            System.out.println("");
        }

    }
}
