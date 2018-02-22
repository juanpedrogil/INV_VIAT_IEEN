/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.Conexion;
import static Interfaces.PrimerInicio.estado;
import com.alee.laf.WebLookAndFeel;
import com.sun.glass.events.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author oscar
 */
public class ventanaCliente extends javax.swing.JFrame {
    Conexion con;
   

    /**
     * Creates new form ventanaCliente
     */
    public ventanaCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        campoIP.setHorizontalAlignment (campoIP.CENTER);
        con = new Conexion();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        campoIP = new javax.swing.JTextField();
        avisoLabel = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Direccionar servidor");
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setLayout(null);

        jButton1.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        jButton1.setText(" Cancelar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(240, 140, 120, 30);

        jButton2.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        jButton2.setText(" Continuar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(80, 140, 130, 30);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        jLabel1.setText("Introduzca la dirección IP del servidor.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 10, 340, 40);

        campoIP.setFont(new java.awt.Font("Yu Gothic UI", 0, 18)); // NOI18N
        campoIP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoIPKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoIPKeyTyped(evt);
            }
        });
        jPanel1.add(campoIP);
        campoIP.setBounds(60, 70, 330, 30);

        avisoLabel.setForeground(new java.awt.Color(153, 153, 153));
        avisoLabel.setText("Advertencia: Esta configuración debe ser realizada por un administrador.");
        jPanel1.add(avisoLabel);
        avisoLabel.setBounds(30, 110, 430, 14);

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        fondo.setText("jLabel1");
        jPanel1.add(fondo);
        fondo.setBounds(0, 0, 460, 190);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PrimerInicio primerinicio = new PrimerInicio();
        primerinicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (!campoIP.getText().equals("")) {
            metodoEntrar();
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese la IP del servidor remoto.","Información",JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoIPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIPKeyTyped
         // TODO add your handling code here:
         char caracter = evt.getKeyChar();
        
        if (campoIP.getText().length()== 15){
            evt.consume();
        }else if(caracter != evt.getKeyCode()){    
        }
        if(((caracter < '0') || (caracter > '9'))  && (caracter != ' ') && (caracter != '.')){
            
            evt.consume();
        }else{
            
        }
    }//GEN-LAST:event_campoIPKeyTyped

    private void campoIPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoIPKeyReleased
         // TODO add your handling code here:
         if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!campoIP.getText().equals("")) {
                metodoEntrar();
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese la IP del servidor remoto.", "Información", JOptionPane.INFORMATION_MESSAGE);
            }//else
        }//if
    }//GEN-LAST:event_campoIPKeyReleased
    
    public void metodoEntrar() {
        String host = campoIP.getText();
        try {
            if (InetAddress.getByName(host).isReachable(1000)) {
                System.out.println("Ping correcto :" + InetAddress.getByName(host).isReachable(1000));
                guardarIP(campoIP.getText());
                Login login = new Login();
                login.setVisible(true);

            } else {
                System.out.println("" + InetAddress.getByName(host).isReachable(1000));
            }
        } catch (UnknownHostException ex) {
            Logger.getLogger(ventanaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ventanaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void guardarIP(String usuario) throws IOException {
        File archivo = new File("cnfg.ntw");

        //Crear objeto FileWriter que sera el que nos ayude a escribir sobre archivo
        BufferedWriter escribir = new BufferedWriter(new FileWriter(archivo));

        //Escribimos en el archivo con el metodo write 
        escribir.write("");
        escribir.write(usuario);

        //Cerramos la conexion
        escribir.close();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws UnsupportedLookAndFeelException {
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
            java.util.logging.Logger.getLogger(PrimerInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrimerInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrimerInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrimerInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        UIManager.setLookAndFeel(new WebLookAndFeel());
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new ventanaCliente().setVisible(estado);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avisoLabel;
    private javax.swing.JTextField campoIP;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}