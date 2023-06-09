/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package paquete;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dell
 */
public class FormAlternativas extends javax.swing.JFrame {

    /**
     * Creates new form FormAlternativas
     */
    private JPanel panel;

    public FormAlternativas() {
        initComponents();
// Centrar el formulario en la pantalla
        setLocationRelativeTo(null);
        establecerColorBoton();
        getContentPane().setBackground(Color.WHITE);
        btnAyuda.setBackground(Color.decode("#ADB5BD"));
//         getContentPane().setBackground(new Color(144, 238, 144));

    }

    private void establecerColorBoton() {
        Color colorFondo = Color.BLACK; // Color de fondo deseado

        btnColumAhorcado.setBackground(colorFondo);
        btnColumAhorcado.setContentAreaFilled(false);
        btnColumAhorcado.setOpaque(true);

        btnFilAhorcado.setBackground(colorFondo);
        btnFilAhorcado.setContentAreaFilled(false);
        btnFilAhorcado.setOpaque(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAyuda = new javax.swing.JButton();
        btnJugar = new javax.swing.JButton();
        btnFilAhorcado = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnColumAhorcado = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAyuda.setBackground(new java.awt.Color(206, 212, 218));
        btnAyuda.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        btnAyuda.setText("Ayuda");
        btnAyuda.setBorder(null);
        btnAyuda.setBorderPainted(false);
        btnAyuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAyudaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 490, 90, 40));

        btnJugar.setBackground(new java.awt.Color(173, 181, 189));
        btnJugar.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        btnJugar.setText("Jugar");
        btnJugar.setBorder(null);
        btnJugar.setBorderPainted(false);
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, 90, 40));

        btnFilAhorcado.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(btnFilAhorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 478, 29));

        btnSalir.setBackground(new java.awt.Color(222, 226, 230));
        btnSalir.setFont(new java.awt.Font("Harrington", 1, 18)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(463, 539, 90, 40));

        jLabel1.setFont(new java.awt.Font("Harrington", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Juego Del Ahorcado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 460, 90));

        btnColumAhorcado.setBackground(new java.awt.Color(0, 0, 0));
        btnColumAhorcado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnColumAhorcado.setBorderPainted(false);
        btnColumAhorcado.setFocusable(false);
        btnColumAhorcado.setSelected(true);
        btnColumAhorcado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnColumAhorcadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnColumAhorcado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 38, 648));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Cabez.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 160, 218, 263));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/PiernasAhorcado.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 590, 185, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/Braso.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 439, 80, 120));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imágenes/BrasoDerecho.png"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(565, 429, 94, 107));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
        // TODO add your handling code here:
        Form frm2 = new Form();
        frm2.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnAyudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAyudaActionPerformed
        // TODO add your handling code here:
        String instrucciones = "Instrucciones del juego del Ahorcado son las siguientes: \n"
                + " 1.- Mencionar cualquier letra del abecedario.\n"
                + " 2.- Pedir que coloquen al menos una letra de toda la palabra.\n"
                + " 3.- Intentar persuadir a quien ha escrito la palabra para que te dé pistas ";
        JOptionPane.showMessageDialog(this, instrucciones, "Instrucciones del Juego", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnAyudaActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnColumAhorcadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnColumAhorcadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnColumAhorcadoActionPerformed

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
            java.util.logging.Logger.getLogger(FormAlternativas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAlternativas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAlternativas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAlternativas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormAlternativas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAyuda;
    private javax.swing.JButton btnColumAhorcado;
    private javax.swing.JButton btnFilAhorcado;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
