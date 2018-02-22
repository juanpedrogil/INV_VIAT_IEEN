/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Clases.ManagerAsignarEquipo;
import Clases.ManagerUsers;
import Clases.ManagerSolicitud;
import Clases.ManagerPermisos;

import javax.swing.JTable;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kevin
 */
public class Ventana_asignar_EquipoComputo extends javax.swing.JDialog {
    ManagerAsignarEquipo manager_asignar;
    ManagerUsers manager_users;
    ManagerSolicitud manager_solicitud;
    ManagerPermisos manager_permisos;
    
    public static DefaultTableModel modeloAsignarEquipo;
    String[] Claves,Equipos;
    /**
     * Creates new form Ventana_asignar_EquipoComputo
     */
    public Ventana_asignar_EquipoComputo(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
        //Asignamos memoria al objeto
        manager_asignar = new ManagerAsignarEquipo();
        manager_users = new ManagerUsers();
        manager_solicitud = new ManagerSolicitud();
        manager_permisos = new ManagerPermisos();
        
        //Deshabilitamos el movimiento de los encabezados de las tablas
        tablaEquipoComputo.getTableHeader().setReorderingAllowed(false);
        tablaAsignarEquipo.getTableHeader().setReorderingAllowed(false);
        
        //Obtenemos el modelo de la tabla y luego se lo asingamos de nuevo
        /*Esto con la finalidad de agregar o quitar filas de dicha tabla*/
        modeloAsignarEquipo = (DefaultTableModel) this.tablaAsignarEquipo.getModel();
        tablaAsignarEquipo.setModel(modeloAsignarEquipo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_asignarEquipo = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaEquipoComputo = new JTable(){  public boolean isCellEditable(int rowIndex, int colIndex){  return false;  }  };
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaAsignarEquipo = new JTable(){  public boolean isCellEditable(int rowIndex, int colIndex){  return false;  }  };
        txtClaveEquipo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAsignar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        comboEmpleados = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tablaEquipoComputo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Equipo", "No. Serie", "Modelo"
            }
        ));
        tablaEquipoComputo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaEquipoComputoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaEquipoComputo);

        tablaAsignarEquipo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Clave", "Equipo", "No. Serie", "Modelo"
            }
        ));
        jScrollPane2.setViewportView(tablaAsignarEquipo);

        txtClaveEquipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Clave del equipo computo:");

        btnAsignar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAsignar.setText("Asignar");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Responsable:");

        comboEmpleados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboEmpleados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pn_asignarEquipoLayout = new javax.swing.GroupLayout(pn_asignarEquipo);
        pn_asignarEquipo.setLayout(pn_asignarEquipoLayout);
        pn_asignarEquipoLayout.setHorizontalGroup(
            pn_asignarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_asignarEquipoLayout.createSequentialGroup()
                .addGroup(pn_asignarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_asignarEquipoLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(pn_asignarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pn_asignarEquipoLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(pn_asignarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pn_asignarEquipoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtClaveEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pn_asignarEquipoLayout.createSequentialGroup()
                        .addGap(457, 457, 457)
                        .addComponent(btnAsignar)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pn_asignarEquipoLayout.setVerticalGroup(
            pn_asignarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_asignarEquipoLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(pn_asignarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtClaveEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(comboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_asignarEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAsignar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_asignarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_asignarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        comboEmpleados.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        comboEmpleados.addItem("Responsable...");
        manager_users.getNombresEmpleados(comboEmpleados);
        
        tablaEquipoComputo.setModel(manager_asignar.getEquipoComputo());
    }//GEN-LAST:event_formWindowOpened
    
    private void tablaEquipoComputoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaEquipoComputoMouseClicked
        // TODO add your handling code here:
        boolean coincidencia = false;
        Object[] botones = {"Reemplazar","Cancelar"};
        
        if(evt.getClickCount() == 2){
            
            //Obtenemos la fila donde está el equipo de computo que queremos asignar
            int fila = tablaEquipoComputo.getSelectedRow();
            
            //Obtenemos los datos del equipo que se va asignar
            String clave = tablaEquipoComputo.getValueAt(fila, 0).toString();
            //Comprobamos que siga estando disponible cuando lo seleccione
            String estado = manager_solicitud.estadoProducto(clave);
            if(estado.equals("DISPONIBLE")){
                String producto = tablaEquipoComputo.getValueAt(fila, 1).toString();
                String noserie = tablaEquipoComputo.getValueAt(fila, 2).toString();
                String modelo = tablaEquipoComputo.getValueAt(fila, 3).toString();

                //Buscamos si ya existe ese tipo de equipo (CPU,Monitor,Teclado)
                for(int f = 0;f<tablaAsignarEquipo.getRowCount();f++){

                    //Si el codigo ya se habia registrado entonces preguntamos si desea reemplazarlo
                    if(tablaAsignarEquipo.getValueAt(f,1).toString().equals(producto)){
                    coincidencia = true;
                    int opcion = JOptionPane.showOptionDialog(this,"¿Desea reemplazar el equipo "+tablaAsignarEquipo.getValueAt(f,0).toString()+"\n por el equipo "+clave+"?", "Confirmación",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
                    
                        //Si da reemplazar entonces lo reemplazamos
                        if(opcion == 0){
                            if(manager_asignar.desasignarEquipo(tablaAsignarEquipo.getValueAt(f,0).toString())){
                            modeloAsignarEquipo.removeRow(f);

                                if(manager_asignar.asignarEquipo(clave)){

                                    tablaEquipoComputo.setModel(manager_asignar.getEquipoComputo());
                                    modeloAsignarEquipo.addRow(new Object[]{clave,producto,noserie,modelo});
                                    break;//Terminamos el ciclo

                                }else{

                                    JOptionPane.showMessageDialog(null, "Verificar con el distribuidor");
                                    break;//Terminamos el ciclo

                                }//else

                            }//desasignar
                            else{
                                JOptionPane.showMessageDialog(null, "Verificar con el distribuidor");
                                coincidencia = true;
                                break;//Terminamos el ciclo
                            }

                            }//¿reemplazar?
                            else if(opcion == 1){
                                break;//Terminamos el ciclo
                            }//No quiso reemplazar
                        
                    }//if de coincidencia

                }//for

                //si b es falso significa que encontro coincidencia y no tiene que registrarlo de nuevo
                if(!coincidencia){

                    if(manager_asignar.asignarEquipo(clave)){
                        tablaEquipoComputo.setModel(manager_asignar.getEquipoComputo());
                        modeloAsignarEquipo.addRow(new Object[]{clave,producto,noserie,modelo});
                    }else{
                        JOptionPane.showMessageDialog(null, "Verificar con el distribuidor.");
                    }
                }
            }//estado disponible
            else{
                JOptionPane.showMessageDialog(null, "Se realizo un movimiento con dicho equipo y se encuentra en "+estado);
                tablaEquipoComputo.setModel(manager_asignar.getEquipoComputo());
            }
        }//getClickCount
    }//GEN-LAST:event_tablaEquipoComputoMouseClicked
    public void getDatosTablaAsignarEquipo(){
        Claves = new String[tablaAsignarEquipo.getRowCount()];
        Equipos = new String[tablaAsignarEquipo.getRowCount()];
        for(int i = 0;i<tablaAsignarEquipo.getRowCount();i++){
            Claves[i] = tablaAsignarEquipo.getValueAt(i, 0).toString();//Obtenemos las claves
            Equipos[i] = tablaAsignarEquipo.getValueAt(i, 1).toString();//Obtenemos las claves
        }//Llenar vector de los codigos de barras
    }//getDatosTablaAsignarEquipo
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        Object[] botones = {"Salir","Cancelar"};
                
        if(tablaAsignarEquipo.getRowCount() > 0){
            int opcion = JOptionPane.showOptionDialog(this,"¿Desea salir sin asignar los equipos?", "Confirmación",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, botones, botones[0]);
            
            if(opcion == 0){
                
                //Obtenemos las claves
                getDatosTablaAsignarEquipo();
                //Regresamos los productos a disponible ya que no se asignaron a un nuevo equipo de computo
                manager_asignar.regresarEquipos(Claves);
                this.dispose();
            
            }//salir
            
        }//Si hay por lo menos un registro entonces
    }//GEN-LAST:event_formWindowClosing

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        // TODO add your handling code here:
        if(manager_permisos.alta_asignacion(Principal.Username)){
            if(tablaAsignarEquipo.getRowCount() == 3){

                if(!txtClaveEquipo.getText().isEmpty()){

                    String empleado = comboEmpleados.getSelectedItem().toString();
                    if(!(empleado.equals("Responsable..."))){

                        //Obtenemos las claves y los nombres de los productos
                        getDatosTablaAsignarEquipo();

                        if(manager_asignar.insertarEquipoComputo(empleado, Claves, Equipos, txtClaveEquipo.getText())){
                           JOptionPane.showMessageDialog(null, "Se registro correctamente el nuevo conjunto de equipos de computo\n al empleado "+empleado);
                           this.dispose();
                        }else{
                           JOptionPane.showMessageDialog(null, "Verificar con el distribuidor."); 
                        }//if else insertar

                    }else{
                        JOptionPane.showMessageDialog(null, "Seleccione al empleado que se le asignaran los equipos de computo.");
                    }//if else del comboEmpleados

                }else{
                    JOptionPane.showMessageDialog(null, "Ingrese la clave que se le asignara a los equipos de computo.");
                }//if else del txtClaveEquipo

            }else{
                JOptionPane.showMessageDialog(null, "Necesita seleccionar los 3 equipos de computo.");
            }//if else de la tablaAsignarEquipo
        }else{
            JOptionPane.showMessageDialog(null, "Te han revocado los permisos para dar de alta conjuntos de equipos de computo.");
        }
    }//GEN-LAST:event_btnAsignarActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_asignar_EquipoComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_asignar_EquipoComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_asignar_EquipoComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_asignar_EquipoComputo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Ventana_asignar_EquipoComputo dialog = new Ventana_asignar_EquipoComputo(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnAsignar;
    private javax.swing.JComboBox<String> comboEmpleados;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel pn_asignarEquipo;
    private javax.swing.JTable tablaAsignarEquipo;
    private javax.swing.JTable tablaEquipoComputo;
    private javax.swing.JTextField txtClaveEquipo;
    // End of variables declaration//GEN-END:variables
}