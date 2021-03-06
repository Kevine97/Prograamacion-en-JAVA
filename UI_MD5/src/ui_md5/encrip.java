/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_md5;

import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;
import static javafx.scene.paint.Color.color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author Ara-PC
 */
public class encrip extends javax.swing.JFrame {

    /**
     * Creates new form MD5
     */
    ArrayList<Persona> p = new ArrayList<Persona>();
    Registro r = new Registro();
    DefaultTableModel modelo;
    int x;
    int y;

    public encrip() {
        initComponents();

        modelo = new DefaultTableModel();
        modelo.addColumn("Nombre");
        modelo.addColumn("Correo");
        modelo.addColumn("Contraseña");
        modelo.addColumn("MD5");
        r.tabla.setModel(modelo);

        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_principal = new javax.swing.JPanel();
        button_mostrar = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtcontra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        button_registro = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panel_principalMouseDragged(evt);
            }
        });
        panel_principal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panel_principalMousePressed(evt);
            }
        });
        panel_principal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        button_mostrar.setBackground(new java.awt.Color(63, 61, 86));
        button_mostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_mostrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_mostrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_mostrarMousePressed(evt);
            }
        });
        button_mostrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Mostrar Registros");
        button_mostrar.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 140, 40));

        panel_principal.add(button_mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 550, 240, 40));

        jPanel2.setBackground(new java.awt.Color(245, 0, 87));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENCRIPTACION   MD5");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 30, 460, 30));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_cancel_35px_1.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 0, 50, 40));

        panel_principal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 90));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(63, 61, 86));
        jLabel2.setText("Correo");
        panel_principal.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 110, 30));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(63, 61, 86));
        jLabel3.setText("Nombre");
        panel_principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 110, 30));

        txtnombre.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        panel_principal.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 240, 310, 40));

        txtcorreo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        panel_principal.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 310, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(63, 61, 86));
        jLabel4.setText("Contraseña");
        panel_principal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 400, 110, 30));

        txtcontra.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        panel_principal.add(txtcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 310, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(63, 61, 86));
        jLabel5.setText("Datos Personales");
        panel_principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 230, 40));

        button_registro.setBackground(new java.awt.Color(245, 0, 87));
        button_registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                button_registroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                button_registroMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                button_registroMousePressed(evt);
            }
        });
        button_registro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Registrar Datos");
        button_registro.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 140, 40));

        panel_principal.add(button_registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 550, 240, 40));

        jTabbedPane1.setBackground(new java.awt.Color(63, 61, 86));
        jTabbedPane1.setForeground(new java.awt.Color(63, 61, 86));
        jTabbedPane1.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        panel_principal.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 410, 410));

        getContentPane().add(panel_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel8MousePressed

    private void panel_principalMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_principalMouseDragged
        // TODO add your handling code here:
        int x1 = evt.getXOnScreen();
        int y1 = evt.getYOnScreen();
        this.setLocation(x1 - x, y1 - y);
    }//GEN-LAST:event_panel_principalMouseDragged

    private void panel_principalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panel_principalMousePressed
        // TODO add your handling code here:
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panel_principalMousePressed

    private void button_registroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_registroMouseEntered
        // TODO add your handling code here:
        button_registro.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_button_registroMouseEntered

    private void button_registroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_registroMouseExited
        // TODO add your handling code here:

        button_registro.setBackground(new Color(245, 0, 87));

    }//GEN-LAST:event_button_registroMouseExited

    private void button_mostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_mostrarMouseEntered
        // TODO add your handling code here:
        button_mostrar.setBackground(new Color(245, 0, 87));
    }//GEN-LAST:event_button_mostrarMouseEntered

    private void button_mostrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_mostrarMouseExited
        // TODO add your handling code here:
        button_mostrar.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_button_mostrarMouseExited

    private void button_registroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_registroMousePressed
        // TODO add your handling code here:
        Persona per = new Persona(txtnombre.getText(), txtcorreo.getText(), txtcontra.getText());
        p.add(per);
        /*String info[][] = new String[p.size()][3];
        modelo.addRow(info);*/
        mostrar();
        txtcorreo.setText("");
        txtcontra.setText("");
        txtnombre.setText("");
        JOptionPane.showMessageDialog(null, "Registro correctamente");
    }//GEN-LAST:event_button_registroMousePressed

    public void mostrar() {

        String persona[][] = new String[p.size()][3];

        for (int i = 0; i < p.size(); i++) {

            persona[i][0] = p.get(i).getNombre();
            persona[i][1] = p.get(i).getCorreo();
            persona[i][2] = p.get(i).getContrasena();
        }
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        r.tabla.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        r.tabla.setForeground(new java.awt.Color(63, 61, 86));
        r.tabla.setModel(new javax.swing.table.DefaultTableModel(
                persona,
                new String[]{
                    "Nombre", "Correo", "Contraseña", "MD5"
                }
        ));

    }

    private void button_mostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button_mostrarMousePressed
        // TODO add your handling code here:

        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_button_mostrarMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(encrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(encrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(encrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(encrip.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new encrip().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel button_mostrar;
    private javax.swing.JPanel button_registro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel panel_principal;
    private javax.swing.JTextField txtcontra;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
