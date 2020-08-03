package poo_tablero;

import java.util.Scanner;

public class POO_Tablero {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int x, y, opc, incremento = 0;
        Tablero t1;

        System.out.print("Digite la coordenada inicial de X: ");
        x = entrada.nextInt();
        System.out.print("Digite la coordenada inicial de Y: ");
        y = entrada.nextInt();

        //Posicio Inicial del objeto
        t1 = new Tablero(x, y);

        do {
            System.out.println("\n\t M E N U ");
            System.out.println("_________________________________________");
            System.out.println("1. Mover hacia ARRIBA");
            System.out.println("2. Mover hacia ABAJO");
            System.out.println("3. Mover hacia la DERECHA");
            System.out.println("4. Mover hacia la IZQUIERDA");
            System.out.println("5. Salir");
            System.out.println("_________________________________________");
            System.out.print("\tOpcion: ");
            opc = entrada.nextInt();

            if (opc != 5) {
                System.out.print("\nDigite la cantidad de espacio que desea moverse: ");
                incremento = entrada.nextInt();

            }

            switch (opc) {

                case 1:
                    t1.moverArriba(incremento);
                    break;

                case 2:
                    t1.moverAbajo(incremento);
                    break;

                case 3:
                    t1.moverDerecha(incremento);
                    break;

                case 4:
                    t1.moverIzquierda(incremento);
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Opcion incorrecta");

            }

            System.out.println("Coordenas actual (X,Y): " + "(" + t1.getX() + "," + t1.getY() + ")");

        } while (opc != 5);

    }

}
