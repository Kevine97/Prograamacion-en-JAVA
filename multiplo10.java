import java.util.Scanner;

public class multiplo10{


    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Digite un numero: ");
        numero = entrada.nextInt();


        //calculando si el numero es multiplo de 10

        if(numero%10==0){

            System.out.println("El numero "+ numero +" Es multiplo de 10");
        }else{

            System.out.println("El numero "+ numero+ " no es multiplo de 10");
        }

       entrada.close();


    }
    
}