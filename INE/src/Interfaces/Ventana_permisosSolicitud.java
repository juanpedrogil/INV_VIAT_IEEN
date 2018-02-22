/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.ManagerSolicitud;
import Clases.ManagerPermisos;
import javax.swing.JOptionPane;
/**
 *
 * @author kevin
 */
public class Ventana_permisosSolicitud extends javax.swing.JDialog {
    ManagerSolicitud manager_solicitud;
    ManagerPermisos manager_permisos;
    /**
     * Creates new form Ventana_permisosSolicitud
     */
    public Ventana_permisosSolicitud(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Asignamos memoria al objeto
        manager_solicitud = new ManagerSolicitud();
        manager_permisos = new ManagerPermisos();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoValeSolicitud = new javax.swing.ButtonGroup();
        pn_solicitudes = new javax.swing.JPanel();
        comboTipoSolicitud = new javax.swing.JComboBox<>();
        radioJefeDepa = new javax.swing.JRadioButton();
        radioUsuario = new javax.swing.JRadioButton();
        radioAuxiliar = new javax.swing.JRadioButton();
        radioAdministracion = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();
        btnAceptar1 = new javax.swing.JButton();
        radioOrganizacion = new javax.swing.JRadioButton();
        checkVale = new javax.swing.JCheckBox();
        checkSolicitud = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_solicitudes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboTipoSolicitud.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboTipoSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoSolicitudActionPerformed(evt);
            }
        });

        radioJefeDepa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioJefeDepa.setText("Jefe de departamento");

        radioUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioUsuario.setText("Usuario Depto.");

        radioAuxiliar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioAuxiliar.setText("Auxiliar");

        radioAdministracion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioAdministracion.setText("Administración");

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnAceptar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar1.setText("Cancelar");
        btnAceptar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptar1ActionPerformed(evt);
            }
        });

        radioOrganizacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioOrganizacion.setText("Organización");

        GrupoValeSolicitud.add(checkVale);
        checkVale.setText("Vale");
        checkVale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkValeActionPerformed(evt);
            }
        });

        GrupoValeSolicitud.add(checkSolicitud);
        checkSolicitud.setSelected(true);
        checkSolicitud.setText("Solicitud");
        checkSolicitud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSolicitudActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_solicitudesLayout = new javax.swing.GroupLayout(pn_solicitudes);
        pn_solicitudes.setLayout(pn_solicitudesLayout);
        pn_solicitudesLayout.setHorizontalGroup(
            pn_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_solicitudesLayout.createSequentialGroup()
                .addGap(0, 190, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar1)
                .addGap(188, 188, 188))
            .addGroup(pn_solicitudesLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pn_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_solicitudesLayout.createSequentialGroup()
                        .addComponent(checkSolicitud)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(checkVale))
                    .addComponent(comboTipoSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_solicitudesLayout.createSequentialGroup()
                        .addGroup(pn_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioAdministracion)
                            .addComponent(radioAuxiliar)
                            .addComponent(radioOrganizacion))
                        .addGap(18, 18, 18)
                        .addGroup(pn_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radioJefeDepa)
                            .addComponent(radioUsuario))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pn_solicitudesLayout.setVerticalGroup(
            pn_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_solicitudesLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(pn_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkVale)
                    .addComponent(checkSolicitud))
                .addGap(18, 18, 18)
                .addComponent(comboTipoSolicitud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(pn_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAdministracion)
                    .addComponent(radioJefeDepa))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioAuxiliar)
                    .addComponent(radioUsuario))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(radioOrganizacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(pn_solicitudesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar1)
                    .addComponent(btnAceptar))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(pn_solicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(pn_solicitudes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        comboTipoSolicitud.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        manager_solicitud.getComboSolicitud(comboTipoSolicitud);
        
        colocarRadios();
        
        if(Principal.banderaPermisosSolicitud == 2){
            radioUsuario.setEnabled(false);
            radioAuxiliar.setEnabled(false);
            radioJefeDepa.setEnabled(false);
            radioAdministracion.setEnabled(false);
            radioOrganizacion.setEnabled(false);
            btnAceptar.setVisible(false);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        boolean permisos = false;
        if(checkSolicitud.isSelected()){
            permisos = manager_permisos.permisosSolicitud(comboTipoSolicitud.getSelectedItem().toString(), radioUsuario.isSelected(), 
                radioAuxiliar.isSelected(), radioJefeDepa.isSelected(), radioAdministracion.isSelected(),radioOrganizacion.isSelected());
        }else{
            permisos = manager_permisos.permisosVale(comboTipoSolicitud.getSelectedItem().toString(), radioUsuario.isSelected(), 
                radioAuxiliar.isSelected(), radioJefeDepa.isSelected(), radioAdministracion.isSelected(),radioOrganizacion.isSelected());
        }
        
        
        if(permisos){
        
            JOptionPane.showMessageDialog(null,"Se guardaron los cambios satisfactoriamente.");
            
        }//if
        else{
            JOptionPane.showMessageDialog(null,"Verificar con el distribuidor.");
        }
        
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnAceptar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptar1ActionPerformed
        // TODO add your handling code here
        this.dispose();
    }//GEN-LAST:event_btnAceptar1ActionPerformed

    public void colocarRadios(){
        if(checkSolicitud.isSelected()){
            String tipo = comboTipoSolicitud.getSelectedItem().toString();
            radioUsuario.setSelected(manager_permisos.usuario_Solicitud(tipo));
            radioAuxiliar.setSelected(manager_permisos.auxiliar_Solicitud(tipo));
            radioJefeDepa.setSelected(manager_permisos.jefe_Solicitud(tipo));
            radioAdministracion.setSelected(manager_permisos.administracion_Solicitud(tipo));
            radioOrganizacion.setSelected(manager_permisos.organizacion_Solicitud(tipo));
        }else{
            String tipo = comboTipoSolicitud.getSelectedItem().toString();
            radioUsuario.setSelected(manager_permisos.usuario_Vale(tipo));
            radioAuxiliar.setSelected(manager_permisos.auxiliar_Vale(tipo));
            radioJefeDepa.setSelected(manager_permisos.jefe_Vale(tipo));
            radioAdministracion.setSelected(manager_permisos.administracion_Vale(tipo));
            radioOrganizacion.setSelected(manager_permisos.organizacion_Vale(tipo));
        }
    }//colocarRadios
    
    private void comboTipoSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoSolicitudActionPerformed
        // TODO add your handling code here:
        colocarRadios();
    }//GEN-LAST:event_comboTipoSolicitudActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosing

    private void checkSolicitudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSolicitudActionPerformed
        // TODO add your handling code here:
        comboTipoSolicitud.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        manager_solicitud.getComboSolicitud(comboTipoSolicitud);
        
        colocarRadios();
        
    }//GEN-LAST:event_checkSolicitudActionPerformed

    private void checkValeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkValeActionPerformed
        // TODO add your handling code here:
        comboTipoSolicitud.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        manager_solicitud.getComboVale(comboTipoSolicitud);
        
        colocarRadios();
    }//GEN-LAST:event_checkValeActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_permisosSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_permisosSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_permisosSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_permisosSolicitud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventana_permisosSolicitud dialog = new Ventana_permisosSolicitud(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoValeSolicitud;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAceptar1;
    private javax.swing.JCheckBox checkSolicitud;
    private javax.swing.JCheckBox checkVale;
    private javax.swing.JComboBox<String> comboTipoSolicitud;
    private javax.swing.JPanel pn_solicitudes;
    private javax.swing.JRadioButton radioAdministracion;
    private javax.swing.JRadioButton radioAuxiliar;
    private javax.swing.JRadioButton radioJefeDepa;
    private javax.swing.JRadioButton radioOrganizacion;
    private javax.swing.JRadioButton radioUsuario;
    // End of variables declaration//GEN-END:variables
}