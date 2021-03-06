/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.ManagerUsers;
import Clases.ManagerComplemento;
import Clases.ManagerPermisos;

import Interfaces.Principal;
import com.alee.laf.WebLookAndFeel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
/**
 *
 * @author kevin
 */
public class addEmpleados extends javax.swing.JDialog {
    String nombres,apellido_p,apellido_m,telefono,curp,rfc,calle,colonia,fecha,usuario,contraseña,codigoP,area,puesto,municipio,localidad;
    boolean documentacion;
    
    ManagerUsers manager_users;
    ManagerComplemento manager_complemento;
    ManagerPermisos manager_permisos;
    /**
     * Creates new form addEmpleados
     */
    public addEmpleados(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Asignamos memoria a los objetos
        manager_users = new ManagerUsers();
        manager_complemento = new ManagerComplemento();
        manager_permisos = new ManagerPermisos();
        
        if(Principal.banderaUser != 1){
            
            if(Principal.banderaUser == 2){
                txtUsuario.setText(Principal.UserUpdate);
            }else{
                txtUsuario.setText(Principal.Username);
            }
            txtUsuario.setEnabled(false);
            txtContraseña.setEnabled(false);
            checkDocumentacion.setEnabled(false);
            llenarCampos();
            txtContraseña.setText("**********");
            btnAceptar.setText("Actualizar");
        }//if(banderaUser)
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_empleado = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtApellidoP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidoM = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCalle = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtCurp = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtRfc = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new com.toedter.calendar.JDateChooser();
        jLabel15 = new javax.swing.JLabel();
        txtMunicipio = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtLocalidad = new javax.swing.JTextField();
        pn_usuario = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        checkDocumentacion = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        comboCargo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        comboArea = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblAviso = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pn_empleado.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre(s):");
        pn_empleado.add(jLabel1);
        jLabel1.setBounds(44, 14, 70, 17);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtNombre);
        txtNombre.setBounds(118, 11, 202, 23);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Apellido Paterno:");
        pn_empleado.add(jLabel2);
        jLabel2.setBounds(12, 43, 102, 17);

        txtApellidoP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtApellidoP);
        txtApellidoP.setBounds(118, 40, 202, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido Materno:");
        pn_empleado.add(jLabel3);
        jLabel3.setBounds(10, 72, 104, 17);

        txtApellidoM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtApellidoM);
        txtApellidoM.setBounds(118, 69, 202, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Calle:");
        pn_empleado.add(jLabel4);
        jLabel4.setBounds(82, 101, 32, 17);

        txtCalle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtCalle);
        txtCalle.setBounds(118, 98, 202, 23);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Colonia:");
        pn_empleado.add(jLabel5);
        jLabel5.setBounds(65, 130, 49, 17);

        txtColonia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtColonia);
        txtColonia.setBounds(118, 127, 202, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Telefono:");
        pn_empleado.add(jLabel6);
        jLabel6.setBounds(420, 14, 57, 17);

        txtTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtTelefono);
        txtTelefono.setBounds(487, 11, 202, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Código Postal:");
        pn_empleado.add(jLabel7);
        jLabel7.setBounds(395, 43, 88, 17);

        txtCodigo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtCodigo);
        txtCodigo.setBounds(487, 40, 202, 23);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("CURP:");
        pn_empleado.add(jLabel8);
        jLabel8.setBounds(443, 72, 40, 17);

        txtCurp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtCurp);
        txtCurp.setBounds(487, 69, 202, 23);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("RFC:");
        pn_empleado.add(jLabel9);
        jLabel9.setBounds(453, 101, 30, 17);

        txtRfc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtRfc);
        txtRfc.setBounds(487, 98, 202, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Fecha de nacimiento:");
        pn_empleado.add(jLabel10);
        jLabel10.setBounds(353, 130, 130, 17);
        pn_empleado.add(txtFecha);
        txtFecha.setBounds(487, 130, 202, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Municipio:");
        pn_empleado.add(jLabel15);
        jLabel15.setBounds(54, 159, 60, 17);

        txtMunicipio.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtMunicipio);
        txtMunicipio.setBounds(118, 156, 202, 23);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Localidad:");
        pn_empleado.add(jLabel16);
        jLabel16.setBounds(53, 188, 61, 17);

        txtLocalidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pn_empleado.add(txtLocalidad);
        txtLocalidad.setBounds(118, 185, 202, 23);

        pn_usuario.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Usuario:");

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Contraseña:");

        txtContraseña.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        checkDocumentacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        checkDocumentacion.setText("Documentación");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Cargo:");

        comboCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Área:");

        comboArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_usuarioLayout = new javax.swing.GroupLayout(pn_usuario);
        pn_usuario.setLayout(pn_usuarioLayout);
        pn_usuarioLayout.setHorizontalGroup(
            pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_usuarioLayout.createSequentialGroup()
                .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_usuarioLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lblAviso))
                    .addGroup(pn_usuarioLayout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(btnAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pn_usuarioLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_usuarioLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_usuarioLayout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40)
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pn_usuarioLayout.createSequentialGroup()
                                .addComponent(checkDocumentacion)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel13))
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboCargo, 0, 150, Short.MAX_VALUE)
                            .addComponent(comboArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pn_usuarioLayout.setVerticalGroup(
            pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_usuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_usuarioLayout.createSequentialGroup()
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(checkDocumentacion)
                            .addGroup(pn_usuarioLayout.createSequentialGroup()
                                .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(12, 12, 12)
                        .addComponent(lblAviso))
                    .addGroup(pn_usuarioLayout.createSequentialGroup()
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(comboCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))))
                .addGap(18, 18, 18)
                .addGroup(pn_usuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addGap(60, 60, 60))
        );

        pn_empleado.add(pn_usuario);
        pn_usuario.setBounds(0, 214, 699, 136);

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        pn_empleado.add(jLabel17);
        jLabel17.setBounds(0, 0, 720, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_empleado, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void llenarCampos(){
        String cadena = manager_users.infoEmpleado(txtUsuario.getText());
        String separador [] = cadena.split(",");
        txtNombre.setText(separador[0]);
        txtApellidoP.setText(separador[1]);
        txtApellidoM.setText(separador[2]);
        txtCalle.setText(separador[3]);
        txtColonia.setText(separador[4]);
        txtTelefono.setText(separador[5]);
        txtCodigo.setText(separador[6]);
        txtFecha.setDateFormatString(separador[7]);
        txtCurp.setText(separador[8]);
        txtRfc.setText(separador[9]);
        txtMunicipio.setText(separador[10]);
        txtLocalidad.setText(separador[11]);
        comboCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        comboCargo.addItem(separador[12]);
        comboCargo.setEditable(false);
        comboArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        comboArea.addItem(separador[13]);
        comboArea.setEditable(false);
    }//Llenar campos
    
    private void getInfo(){
        nombres = txtNombre.getText();
        apellido_p = txtApellidoP.getText();
        apellido_m = txtApellidoM.getText();
        calle = txtCalle.getText();
        colonia = txtColonia.getText();
        telefono = txtTelefono.getText();
        codigoP = txtCodigo.getText();
        contraseña = txtContraseña.getText();
        curp = txtCurp.getText();
        rfc = txtRfc.getText();
        usuario = txtUsuario.getText();
        puesto = comboCargo.getSelectedItem().toString();
        area = comboArea.getSelectedItem().toString();
        municipio = txtMunicipio.getText();
        localidad = txtLocalidad.getText();
    }//getInfo()
    
    private int validar(){
        if(txtNombre.getText().isEmpty()){
            return 1;
        }
        if(txtApellidoP.getText().isEmpty()){
            return 2;
        }
        if(txtApellidoM.getText().isEmpty()){
            return 3;
        }
        if(txtUsuario.getText().isEmpty()){
            return 4;
        }
        if(txtContraseña.getText().isEmpty()){
            return 5;
        }
        return 0;
    }//validar()
    
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        int res = validar();
        if(Principal.banderaUser == 1){
            if(manager_permisos.alta_user(Principal.Username)){
                switch(res){
                    case 0:
                        getInfo();
                        boolean insertar = manager_users.insertarEmpleado(nombres, apellido_p, apellido_m, telefono, calle, colonia, curp, rfc, "1980-04-25", codigoP, checkDocumentacion.isSelected(),municipio,localidad);
                        if(insertar){
                            JOptionPane.showMessageDialog(null, "El empleado "+nombres+" "+apellido_p+" ha sido registrado en la base de datos exitosamente.");
                            if(manager_permisos.consulta_user(Principal.Username)){
                                Principal.tablaUsuarios.setModel(manager_users.getEmpleados());
                            }
                            this.dispose();
                        }else{
                                JOptionPane.showMessageDialog(null, "Verificar con el distribuidor.");
                                this.dispose();
                        }
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del nuevo empleado");
                        txtNombre.requestFocus();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa el apellido paterno del nuevo empleado");
                        txtApellidoP.requestFocus();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa el apellido materno del nuevo empleado");
                        txtApellidoM.requestFocus();
                        break;    
                    case 4:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre de usuario del nuevo empleado");
                        txtUsuario.requestFocus();
                        break;    
                    case 5:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa la contraseña del nuevo empleado");
                        txtContraseña.requestFocus();
                        break;
                }//switch
            }else{
                JOptionPane.showMessageDialog(null, "Te han revocado los permisos para registrar nuevos empleados.");
            }
        }//if para dar de alta
        else{
            switch(res){
                    case 0:
                        getInfo();
                        boolean actualizar = manager_users.actualizarEmpleado(usuario, nombres, apellido_p, apellido_m, calle, colonia, telefono, codigoP, "1995-08-01", curp, rfc, municipio, localidad,puesto);
                        if(actualizar){
                            JOptionPane.showMessageDialog(null, "La información del usuario "+usuario+" ha sido actualizada exitosamente.");
                            if(manager_permisos.consulta_user(Principal.Username)){
                                Principal.tablaUsuarios.setModel(manager_users.getEmpleados());
                            }
                            this.dispose();
                        }else{
                                JOptionPane.showMessageDialog(null, "Verificar con el distribuidor.");
                                this.dispose();
                        }
                        break;
                    case 1:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre del empleado");
                        txtNombre.requestFocus();
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa el apellido paterno del empleado");
                        txtApellidoP.requestFocus();
                        break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa el apellido materno del empleado");
                        txtApellidoM.requestFocus();
                        break;    
                    case 4:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa el nombre de usuario del empleado");
                        txtUsuario.requestFocus();
                        break;    
                    case 5:
                        JOptionPane.showMessageDialog(null, "Por favor ingresa la contraseña del empleado");
                        txtContraseña.requestFocus();
                        break;
                }//switch
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //Llenamos los combobox
        if(Principal.banderaUser == 1){
            comboCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
            manager_complemento.getComboPuestos(comboCargo);

            comboArea.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
            manager_complemento.getComboAreas(comboArea);
        }
    }//GEN-LAST:event_formWindowOpened

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
        if(!(txtUsuario.getText().isEmpty())){
            
            //Comparamos si existe o no
            if(manager_users.existeUsuario(txtUsuario.getText())){
                //Existe, entonces pintamos en rojo los TextField
                txtUsuario.setBackground(java.awt.Color.RED);
                btnAceptar.setEnabled(false);
                lblAviso.setText("El nombre de usuario ya se encuentra registrado.");
                
            }else{
                //Si no existe, entonces pintamos de verde los TextField
                txtUsuario.setBackground(java.awt.Color.GREEN);
                btnAceptar.setEnabled(true);
                lblAviso.setText("");
            }
            
        }//Buscar si existe o no
        else{
            txtUsuario.setBackground(java.awt.Color.WHITE);
            btnAceptar.setEnabled(true);
            lblAviso.setText("");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
         // TODO add your handling code here:
         this.dispose();
        
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(addEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addEmpleados dialog = new addEmpleados(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox checkDocumentacion;
    private javax.swing.JComboBox<String> comboArea;
    private javax.swing.JComboBox<String> comboCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JPanel pn_empleado;
    private javax.swing.JPanel pn_usuario;
    private javax.swing.JTextField txtApellidoM;
    private javax.swing.JTextField txtApellidoP;
    private javax.swing.JTextField txtCalle;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCurp;
    private com.toedter.calendar.JDateChooser txtFecha;
    private javax.swing.JTextField txtLocalidad;
    private javax.swing.JTextField txtMunicipio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
