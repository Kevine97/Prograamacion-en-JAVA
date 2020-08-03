import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class HolaMundo {   
    public static void main(String[] args) {
        System.out.println("********************");
        System.out.println("Hola mundo!, mi primer codigo en java");
        System.out.println("********************");

        Scanner read = new Scanner(System.in);  

        System.out.println("Me podria indicar su nombre?");
        /* int decimal float string bool */
        String nombre;
        nombre = read.nextLine();

        System.out.println("Mucho gusto <<" + nombre + ">>, soy tu programa.");
        

        /* if else Switch */

        Integer opcion = 0;

        System.out.println("********************");
        System.out.println("Menu");
        System.out.println("********************");
        System.out.println("1. Saludame");
        System.out.println("2. Suma de numeros");
        System.out.println("3. Salir");
        System.out.println("********************");
        System.out.print("opcion: ");
        opcion = read.nextInt();

        /* operadores logicos ==, !=, >=, =<, >, < */
        if (opcion == 0) {
            System.out.println("opcion no valida");
        } else  {

            switch (opcion) {
                
                case 1:
                    System.out.println("Esta es la opcion de un saludo!");
                    System.out.print("aquien saludo? ");
                    String valor = new Scanner(System.in).nextLine();
                    System.out.println("Hola " + valor);
                    break;
                
                case 2:
                    System.out.println("Esta es la opcion de suma!");
                    System.out.print("Digite valor uno:");
                    Integer valor1 = read.nextInt();
                    System.out.print("\n");
                    System.out.print("Digite valor dos:");
                    Integer valor2 = read.nextInt();
                    System.out.println("El resultado es: " + 
                                (valor1  + valor2));
                    break;
                
                case 3:
                    System.out.println("Adios!");
                    break;
            
                default:
                    break;
            }

        }
        read.close();
    }
}