/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptado;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ara-PC
 */
public class Trans_Columnar extends javax.swing.JFrame {

    ArrayList<Encriptado> encrip = new ArrayList<Encriptado>();
    DefaultTableModel modelo;
    ListSelectionModel model;
    int x;
    int y;

    public Trans_Columnar() {
        initComponents();
        //setBackground(new Color(0, 0, 0, 0));
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/icons8_registry_editor_40px_1.png")).getImage()
        );
        modelo = new DefaultTableModel();
        modelo.addColumn("Sentence");
        modelo.addColumn("Encrypted");
        modelo.addColumn("Decrypted");
        tabla.setModel(modelo);
        setBackground(new Color(0, 0, 0, 0));
        tabla.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(new Color(245, 0, 87));
        tabla.getTableHeader().setForeground(new Color(255, 255, 255));

        setLocationRelativeTo(null);
    }

    static int[][] encrypt(int plainText[][], int cipherText[][], String message, int rowCount, int columnCount, String key) {
        int i, j;
        int k = 0;
        for (i = 0; i < rowCount; i++) {
            for (j = 0; j < columnCount; j++) {
                if (k < message.length()) {
                    plainText[i][j] = (int) message.charAt(k);
                    k++;
                } else {
                    break;
                }
            }
        }
        for (i = 0; i < columnCount; i++) {
            int currentCol = ((int) key.charAt(i) - 48) - 1;
            for (j = 0; j < rowCount; j++) {
                cipherText[j][i] = plainText[j][currentCol];
            }
        }
        //System.out.print("Cipher Array(read column by column): \n");
        for (i = 0; i < rowCount; i++) {
            for (j = 0; j < columnCount; j++) {
                //System.out.print((char) cipherText[i][j] + "\t");
            }
            System.out.println();
        }
        return cipherText;
    }

    static int[][] decrypt(int plainText[][], int cipherText[][], String message, int rowCount, int columnCount, String key) {
        int i, j;
        int k = 0;
        for (i = 0; i < columnCount; i++) {
            int currentCol = ((int) key.charAt(i) - 48) - 1;
            for (j = 0; j < rowCount; j++) {
                plainText[j][currentCol] = cipherText[j][i];
            }
        }
        //  System.out.print("Plain Array(read row by row): \n");
        for (i = 0; i < rowCount; i++) {
            for (j = 0; j < columnCount; j++) {
                //System.out.print((char) plainText[i][j] + "\t");
            }
            System.out.println();
        }
        return plainText;
    }

    /*  private static void showTable() {
        for (Object[] table1 : table) {
            for (Object item : table1) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
    }*/
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_principal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtfrase = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        lbl_exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        lbl_Sentence = new javax.swing.JLabel();
        txt_sentence = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_Encrypted = new javax.swing.JTextField();
        txt_Decrypted = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        backgraund = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_principal.setBackground(new java.awt.Color(255, 255, 255));
        panel_principal.setOpaque(false);
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

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Word");
        panel_principal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 60, 40));

        txtfrase.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        txtfrase.setForeground(new java.awt.Color(255, 255, 255));
        txtfrase.setBorder(null);
        txtfrase.setCaretColor(new java.awt.Color(255, 255, 255));
        txtfrase.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txtfrase.setOpaque(false);
        txtfrase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtfraseMousePressed(evt);
            }
        });
        txtfrase.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtfraseKeyPressed(evt);
            }
        });
        panel_principal.add(txtfrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 310, 40));

        jPanel1.setBackground(new java.awt.Color(83, 109, 254));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_cancel_35px_2.png"))); // NOI18N
        lbl_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_exitMousePressed(evt);
            }
        });
        jPanel1.add(lbl_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 0, 40, 40));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText(" COLUMNAR TRANSPOSITION");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 70));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_macos_minimize_35px_1.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(715, 0, 50, 40));

        panel_principal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        tabla.setBackground(new java.awt.Color(63, 61, 86));
        tabla.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                " Sentence", " Encrypted", "Decrypted"
            }
        ));
        tabla.setFocusable(false);
        tabla.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tabla.setRowHeight(30);
        tabla.setRowMargin(0);
        tabla.setSelectionBackground(new java.awt.Color(83, 109, 254));
        tabla.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tabla.setShowVerticalLines(false);
        tabla.getTableHeader().setReorderingAllowed(false);
        tabla.setVerifyInputWhenFocusTarget(false);

        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        panel_principal.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 780, 150));

        lbl_Sentence.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        lbl_Sentence.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Sentence.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Sentence.setText("Word");
        panel_principal.add(lbl_Sentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, 80, 40));

        txt_sentence.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_sentence.setForeground(new java.awt.Color(255, 255, 255));
        txt_sentence.setBorder(null);
        txt_sentence.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_sentence.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_sentence.setOpaque(false);
        panel_principal.add(txt_sentence, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 490, 310, 40));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Encryted");
        panel_principal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 550, 70, 40));

        txt_Encrypted.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Encrypted.setForeground(new java.awt.Color(255, 255, 255));
        txt_Encrypted.setBorder(null);
        txt_Encrypted.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Encrypted.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_Encrypted.setOpaque(false);
        txt_Encrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_EncryptedActionPerformed(evt);
            }
        });
        panel_principal.add(txt_Encrypted, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 550, 310, 40));

        txt_Decrypted.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txt_Decrypted.setForeground(new java.awt.Color(255, 255, 255));
        txt_Decrypted.setBorder(null);
        txt_Decrypted.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_Decrypted.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_Decrypted.setOpaque(false);
        txt_Decrypted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_DecryptedActionPerformed(evt);
            }
        });
        panel_principal.add(txt_Decrypted, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 310, 40));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Decrypted");
        panel_principal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, -1, 40));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Phrase Registration");
        panel_principal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 240, -1));

        jPanel2.setBackground(new java.awt.Color(63, 61, 86));
        jPanel2.setForeground(new java.awt.Color(63, 61, 86));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Encrypted");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 100, 40));

        panel_principal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 240, 40));
        panel_principal.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 310, 10));
        panel_principal.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 250, 10));
        panel_principal.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 310, 10));
        panel_principal.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 650, 310, 10));
        panel_principal.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 530, 310, 10));

        backgraund.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo.png"))); // NOI18N
        panel_principal.add(backgraund, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        getContentPane().add(panel_principal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 700));

        setBounds(0, 0, 800, 700);
    }// </editor-fold>//GEN-END:initComponents

    public void tbencripLineaSeleccionada(JTable tb) {

        if (tb.getSelectedRow() != -1) {
            txtfrase.setText(encrip.get(tb.getSelectedRow()).getFrase());
            txt_Encrypted.setText(encrip.get(tb.getSelectedRow()).getEncriptada());
            txt_Decrypted.setText(encrip.get(tb.getSelectedRow()).getDesencriptada());
        }
    }

    public void mostrar() {
        String encriptacion[][] = new String[encrip.size()][3];

        for (int i = 0; i < encrip.size(); i++) {

            encriptacion[i][0] = encrip.get(i).getFrase();
            encriptacion[i][1] = encrip.get(i).getEncriptada();
            encriptacion[i][2] = encrip.get(i).getDesencriptada();
        }
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                encriptacion,
                new String[]{
                    " Sentence", " Encrypted", "Decrypted"
                }
        ));

    }
    private void lbl_exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exitMousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_exitMousePressed

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

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        // TODO add your handling code here:
        if (txtfrase.getText().length() > 20) {
            Scanner sc = new Scanner(System.in);
            String message = txtfrase.getText();
            String key = "12345";
            int columnCount = key.length();
            int rowCount = (message.length() + columnCount) / columnCount;
            int plainText[][] = new int[rowCount][columnCount];
            int cipherText[][] = new int[rowCount][columnCount];

            cipherText = encrypt(plainText, cipherText, message, rowCount, columnCount, key);
            String ct = "";
            for (int i = 0; i < columnCount; i++) {
                for (int j = 0; j < rowCount; j++) {
                    if (cipherText[j][i] == 0) {
                        ct = ct;
                    } else {
                        ct = ct + (char) cipherText[j][i];
                    }
                }
            }

            plainText = decrypt(plainText, cipherText, ct, rowCount, columnCount, key);
            String pt = "";
            for (int i = 0; i < rowCount; i++) {
                for (int j = 0; j < columnCount; j++) {
                    if (plainText[i][j] == 0) {
                        pt = pt + "";
                    } else {
                        pt = pt + (char) plainText[i][j];
                    }
                }
            }

            Encriptado en = new Encriptado(message, ct, pt);
            encrip.add(en);
            /*String info[][] = new String[p.size()][3];
            modelo.addRow(info);*/
            mostrar();
            txtfrase.setText("");

        } else {

            JOptionPane.showMessageDialog(null, "Longitud de la palabra tiene que ser mayor a 20 caracteres");
        }
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(83, 109, 254));

    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseExited
        // TODO add your handling code here:
        jPanel2.setBackground(new Color(63, 61, 86));
    }//GEN-LAST:event_jPanel2MouseExited

    private void txt_EncryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_EncryptedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_EncryptedActionPerformed

    private void txt_DecryptedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_DecryptedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_DecryptedActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        // TODO add your handling code here:
        int seleccion = tabla.rowAtPoint(evt.getPoint());
        // int seleccion = tabla.getSelectedRow();
        txt_sentence.setText(String.valueOf(tabla.getValueAt(seleccion, 0)));
        txt_Encrypted.setText(String.valueOf(tabla.getValueAt(seleccion, 1)));
        txt_Decrypted.setText(String.valueOf(tabla.getValueAt(seleccion, 2)));


    }//GEN-LAST:event_tablaMouseClicked

    private void txtfraseMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtfraseMousePressed
        txt_sentence.setText("");
        txt_Encrypted.setText("");
        txt_Decrypted.setText("");
    }//GEN-LAST:event_txtfraseMousePressed

    private void txtfraseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfraseKeyPressed
        // TODO add your handling code here:
        txt_sentence.setText("");
        txt_Encrypted.setText("");
        txt_Decrypted.setText("");
    }//GEN-LAST:event_txtfraseKeyPressed

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        // TODO add your handling code here:
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_jLabel2MousePressed

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
            java.util.logging.Logger.getLogger(Trans_Columnar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Trans_Columnar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Trans_Columnar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Trans_Columnar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
               new Trans_Columnar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgraund;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_Sentence;
    private javax.swing.JLabel lbl_exit;
    private javax.swing.JPanel panel_principal;
    public javax.swing.JTable tabla;
    private javax.swing.JTextField txt_Decrypted;
    private javax.swing.JTextField txt_Encrypted;
    private javax.swing.JTextField txt_sentence;
    public javax.swing.JTextField txtfrase;
    // End of variables declaration//GEN-END:variables
}
