import java.util.Scanner;

public class clase{

public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

    int suma,n1,n2;
    int opc;
    

    
        do{

            System.out.println("\t\t________________________________________");
            System.out.println("\n\t\t\t\tM  E  N  U ");
            System.out.println("\n\t\t\t 1. SALUDAME");
            System.out.println("\t\t\t 2. SUMA DE DOS NUMEROS");
            System.out.println("\t\t\t 3. SALIR");
            System.out.println("\t\t________________________________________");
            System.out.print("\t\t\t Opcion: ");
            opc = entrada.nextInt();
            
            switch (opc) {
                case 1:
                
                    System.out.println("Digite su nombre: ");
                    String nombre = new Scanner(System.in).nextLine();
                    System.out.println("HOLA "+nombre+" Mucho gusto"); 
                    break;
                
                case 2: 
                        System.out.print("Ingrese un entero: ");
                        n1 = entrada.nextInt();
                        System.out.print("Ingrese un entero: ");
                        n2 = entrada.nextInt();

                        suma= n1+n2;
                        System.out.println("LA suma de los dos numero es: "+suma);

                    break;

                case 3: System.out.println(" S A L I E N D O .... ");
                         System.out.println("Gracias por visitarnos! :)");
                    break;

                default:System.out.println("Digite una opcion valida");
                    break;
            }

        }while(opc!=3);


    }

}