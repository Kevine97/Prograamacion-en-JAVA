import javax.swing.JOptionPane;
import java.util.Scanner;
public class menorMayor{

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        int numero1, numero2;

        System.out.print("Ingrese el numero 1: ");
        numero1 = entrada.nextInt();
        System.out.print("Ingrese el numero 2: ");
        numero2 = entrada.nextInt();

        if(numero1 > numero2){

            System.out.print("El numero "+numero1+" es mayor que el numero "+numero2 );

        }else{

            if(numero2>numero1){

                System.out.print("El numero "+numero2+" es mayor que el numero "+numero1);

            }else{

                System.out.print("El numero "+numero1+" Es igual al numero "+numero2);

            }
        }

    }
}