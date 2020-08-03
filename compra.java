import javax.swing.JOptionPane;
import java.util.Scanner;

public class compra{

    public static void main(String[] args){


            //variables
            float precioCompra=0;
            float descuento=0;

            precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio de compra"));

            //verificando los 300

            if(precioCompra > 300){

                descuento = precioCompra - (precioCompra*0.20f);
                JOptionPane.showMessageDialog(null, "Su precio de compra es: "+descuento);
            }else{

                JOptionPane.showMessageDialog(null, "Su precio de compra es: "+precioCompra);
            }


    }

}