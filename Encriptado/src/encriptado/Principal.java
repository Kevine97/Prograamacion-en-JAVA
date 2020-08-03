/*
        
Integrantes: 
            Jimmy Gabriel Zapata
            Roberto Beteta Rivas.
            Kevin EsquivelRojas


Docente: Hilario Campos.

Fecha:  13, de abril del 2020.


Obejtivo: Elaborar el cifrado Transposicion Columnar en Java Swing


 */
package encriptado;

import java.awt.Color;
import java.awt.Font;

public class Principal {

    public static void main(String args[]) {
        Home h = new Home();

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        Trans_Columnar t = new Trans_Columnar();
        t.tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        t.tabla.getTableHeader().setOpaque(false);
        t.tabla.getTableHeader().setBackground(new Color(245, 0, 87));
        t.tabla.getTableHeader().setForeground(new Color(255, 255, 255));

        h.setVisible(true);

        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(40);
                h.lbl_porcen.setText(Integer.toString(i) + "%");
                h.jProgressBar1.setValue(i);
                if (i == 100) {

                    h.setVisible(false);
                    t.setVisible(true);

                }
            }
        } catch (Exception e) {

        }

    }

}
