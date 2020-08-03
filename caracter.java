import javax.swing.JOptionPane;
public class caracter{

    public static void main(String[] args) {
        
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);

        if(Character.isUpperCase(letra)){

            JOptionPane.showMessageDialog(null,"Es una letra mayuscula");
        }else{

            JOptionPane.showMessageDialog(null,"No es una letra mayuscula");
        }

    }

}