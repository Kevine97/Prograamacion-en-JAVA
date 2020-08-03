package cls;
import java.util.concurrent.TimeUnit;
import java.lang.Object;

public class Cls {
    
    public static void main(String[] args) {
        try {
        System.out.println("*");
        delay(500);

        System.out.println("*");
        delay(500);

        System.out.println("*");
        delay(500);

        System.out.println("*");
        delay(500);

        System.out.println("*");
        delay(500);

        System.out.println("*");
        
        delay(500);

        System.out.println("*");
        delay(500);
        

        System.out.println("*");
        delay(500);
        

        System.out.println("*");
        delay(500);
        System.out.println("*");
        delay(500);
        
        System.out.println("*");
        system("cls");
        system("pause");

        } catch (Exception e) {
            System.out.println("error:" + e.getMessage());
        }
        int opcion = 0;
        /*
        Menu
        1. Cuadrado
        
        */
        switch(opcion) {
            case 1:

            break;
            case 2:
            break;
            default:
            break;
        }
    }
    
    public static void system(String command) {
        try {
            new ProcessBuilder("cmd", "/c", command)
            .inheritIO().start().waitFor();
        } catch (Exception e) {

        }
    }

     
    public static void delay(Integer count) {
        try {
            TimeUnit.MILLISECONDS.sleep(count);
        } catch (Exception e) {

        }
    }

}