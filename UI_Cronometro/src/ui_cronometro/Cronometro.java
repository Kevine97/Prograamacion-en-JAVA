/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui_cronometro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;

/**
 *
 * @author Ara-PC
 */
public class Cronometro extends javax.swing.JFrame {

    private Timer tiempo;
    private int centesimas = 0, segundos = 0, minutos = 0, horas = 0;
    private final ActionListener acciones = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent ae) {
            centesimas++;
            if (centesimas == 100) {
                segundos++;
                centesimas = 0;
            }

            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }
            if (minutos == 60) {
                horas++;
                minutos = 0;
            }

            actualizarlbl_Evento_();
        }

    };

    private void actualizarlbl_Evento_() {

        String texto = (horas <= 9 ? "0" : "") + horas + ":" + (minutos <= 9 ? "0" : "") + minutos + ":" + (segundos <= 9 ? "0" : "") + segundos + ":" + (centesimas <= 9 ? "0" : "") + centesimas;
        lbl_Evento_.setText(texto);
    }

    public Cronometro() {
        initComponents();
        this.setLocationRelativeTo(null);
        tiempo = new Timer(10, acciones);

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
        jPanel2 = new javax.swing.JPanel();
        lbl_Logo_ = new javax.swing.JLabel();
        lbl_exit_ = new javax.swing.JLabel();
        lbl_Cronometro_ = new javax.swing.JLabel();
        lbl_Evento_ = new javax.swing.JLabel();
        lbl_Play = new javax.swing.JLabel();
        lbl_pausa = new javax.swing.JLabel();
        lbl_detener_ = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cronometro");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 250));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 102, 178));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_Logo_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Logo_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_cronometro/icons8_stopwatch_80px.png"))); // NOI18N
        jPanel2.add(lbl_Logo_, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 11, 86, 78));

        lbl_exit_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_exit_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_cronometro/icons8_close_window_30px.png"))); // NOI18N
        lbl_exit_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_exit_MousePressed(evt);
            }
        });
        jPanel2.add(lbl_exit_, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 10, -1, -1));

        lbl_Cronometro_.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lbl_Cronometro_.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Cronometro_.setText(" Chronometer");
        jPanel2.add(lbl_Cronometro_, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 25, 286, 47));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 100));

        lbl_Evento_.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lbl_Evento_.setForeground(new java.awt.Color(0, 102, 178));
        lbl_Evento_.setText("00:00:00:00");
        jPanel1.add(lbl_Evento_, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 200, 30));

        lbl_Play.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_Play.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_cronometro/icons8_play_60px.png"))); // NOI18N
        lbl_Play.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_PlayMousePressed(evt);
            }
        });
        jPanel1.add(lbl_Play, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 70, 50));

        lbl_pausa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_cronometro/icons8_pause_60px.png"))); // NOI18N
        lbl_pausa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_pausaMousePressed(evt);
            }
        });
        jPanel1.add(lbl_pausa, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 60, 50));

        lbl_detener_.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_detener_.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_cronometro/icons8_stop_60px.png"))); // NOI18N
        lbl_detener_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbl_detener_MousePressed(evt);
            }
        });
        jPanel1.add(lbl_detener_, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 190, 70, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_exit_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_exit_MousePressed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_lbl_exit_MousePressed

    private void lbl_PlayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_PlayMousePressed
        // TODO add your handling code here:

        tiempo.start();
        lbl_Play.setEnabled(false);
        lbl_detener_.setEnabled(true);
        lbl_pausa.setEnabled(true);
    }//GEN-LAST:event_lbl_PlayMousePressed

    private void lbl_pausaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_pausaMousePressed
        // TODO add your handling code here:
        tiempo.stop();
        lbl_pausa.setEnabled(false);
        lbl_Play.setEnabled(true);
        lbl_detener_.setEnabled(true);
    }//GEN-LAST:event_lbl_pausaMousePressed

    private void lbl_detener_MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_detener_MousePressed

        if (tiempo.isRunning()) {
            tiempo.stop();
            lbl_Play.setEnabled(true);

        }

        lbl_pausa.setEnabled(true);
       // lbl_detener_.setEnabled(false);

        horas = 0;
        minutos = 0;
        segundos = 0;
        centesimas = 0;
        
        actualizarlbl_Evento_();

    }//GEN-LAST:event_lbl_detener_MousePressed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cronometro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_Cronometro_;
    private javax.swing.JLabel lbl_Evento_;
    private javax.swing.JLabel lbl_Logo_;
    private javax.swing.JLabel lbl_Play;
    private javax.swing.JLabel lbl_detener_;
    private javax.swing.JLabel lbl_exit_;
    private javax.swing.JLabel lbl_pausa;
    // End of variables declaration//GEN-END:variables
}