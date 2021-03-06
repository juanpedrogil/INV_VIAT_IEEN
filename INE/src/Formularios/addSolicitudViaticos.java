/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Conexion;
import Clases.ExceptionDatosIncompletos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

import Clases.ManagerUsers;
import Clases.ManagerVehiculos;
import Clases.ManagerSoViaticos;

import Interfaces.PrincipalS;
import java.util.Vector;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author usuario
 */
public class addSolicitudViaticos extends javax.swing.JDialog {
    ManagerSoViaticos manager_viaticos;
    ManagerUsers manager_users;
    ManagerVehiculos manager_vehiculo;
    
    public int varida[];
    Conexion cbd=new Conexion();
    Connection cn=cbd.getConexion();
    public static boolean imprimirSolicitud=false;
    /**
     * Creates new form addSolicitudViaticos
     */
    public addSolicitudViaticos(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        //maxid();
        //txtid.setText(varida[0]+1+"");
        manager_viaticos = new ManagerSoViaticos();
        manager_users = new ManagerUsers();
        manager_vehiculo = new ManagerVehiculos();
        
        AutoCompleteDecorator.decorate(this.comboEmpleados);
        AutoCompleteDecorator.decorate(this.cmb_Vehiculo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pn_addInventario = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_Puesto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Actividad = new javax.swing.JTextArea();
        jLabel8 = new javax.swing.JLabel();
        txt_Lugar = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblAviso = new javax.swing.JLabel();
        date_Salida = new com.toedter.calendar.JDateChooser();
        date_Llegada = new com.toedter.calendar.JDateChooser();
        chb_Pernoctado = new javax.swing.JCheckBox();
        comboEmpleados = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        cmb_Vehiculo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        txtKilometraje = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtADescripcion = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nueva Solicitud");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pn_addInventario.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nombre:");

        txt_Puesto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Puesto.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Puesto:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Actividad a realizar:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Fecha de salida:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Fecha de llegada:");

        txt_Actividad.setColumns(20);
        txt_Actividad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Actividad.setRows(5);
        jScrollPane1.setViewportView(txt_Actividad);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Lugar:");

        txt_Lugar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txt_Lugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LugarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Pernoctado:");

        lblAviso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        comboEmpleados.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        comboEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmpleadosActionPerformed(evt);
            }
        });

        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/aceptar.png"))); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Vehiculo:");

        cmb_Vehiculo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        cmb_Vehiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmb_VehiculoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Kilometraje:");

        txtKilometraje.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtKilometraje.setEnabled(false);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Descripción:");

        txtADescripcion.setColumns(20);
        txtADescripcion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtADescripcion.setRows(5);
        txtADescripcion.setEnabled(false);
        jScrollPane2.setViewportView(txtADescripcion);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmb_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 142, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cmb_Vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtKilometraje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2)
                .addContainerGap())
        );

        javax.swing.GroupLayout pn_addInventarioLayout = new javax.swing.GroupLayout(pn_addInventario);
        pn_addInventario.setLayout(pn_addInventarioLayout);
        pn_addInventarioLayout.setHorizontalGroup(
            pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(pn_addInventarioLayout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(date_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pn_addInventarioLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(18, 18, 18)
                            .addComponent(date_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pn_addInventarioLayout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(18, 18, 18)
                            .addComponent(chb_Pernoctado)
                            .addGap(194, 194, 194))
                        .addGroup(pn_addInventarioLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addGap(18, 18, 18)
                            .addComponent(txt_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(comboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txt_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 289, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(btnAceptar)
                        .addGap(31, 31, 31)
                        .addComponent(btnCancelar))
                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        pn_addInventarioLayout.setVerticalGroup(
            pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(comboEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pn_addInventarioLayout.createSequentialGroup()
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(date_Salida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(date_Llegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(chb_Pernoctado))
                        .addGap(2, 2, 2)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(txt_Lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(lblAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(37, 37, 37))
                            .addGroup(pn_addInventarioLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(68, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_addInventarioLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(pn_addInventarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptar)
                            .addComponent(btnCancelar))
                        .addContainerGap())))
        );

        getContentPane().add(pn_addInventario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/formularios.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void maxid(){
        String sql="Select max(idSolicitud) from solicitud_viatico";
        int datos[]=new int[1];
        try{
            Statement st=cn.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
              datos[0]=rs.getInt("max(idSolicitud)");
            //datos[0]=rs.getString("max(idDatos)");
            varida=datos;
        }
    }catch(SQLException ex){
           javax.swing.JOptionPane.showMessageDialog(null, "Error"); 
        }
    }
    private void txt_LugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LugarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LugarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
       int indiceCarro = cmb_Vehiculo.getSelectedIndex();
        try{
            verificar_excepcion=true;
            validarDatos(true,"");
            
            //inserta solicitud
            insertar_Solicitud(indiceCarro);
            
        }catch(ExceptionDatosIncompletos e){
            if(verificar_excepcion)JOptionPane.showMessageDialog(this, e.getMessage());
            return;
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "El kilometraje debe ser un numero sin letras.");
        }
       
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        comboEmpleados.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        comboEmpleados.addItem("Selecione empleado...");
        manager_users.getNombresEmpleados(comboEmpleados);
        
        cmb_Vehiculo.setModel(new javax.swing.DefaultComboBoxModel(new String[] {}));
        cmb_Vehiculo.addItem("Selecione vehiculo...");
        manager_vehiculo.getVehiculosDisponibles(cmb_Vehiculo);
    }//GEN-LAST:event_formWindowOpened

    private void comboEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpleadosActionPerformed
        // TODO add your handling code here:
        int empleado = comboEmpleados.getSelectedIndex();
        if(empleado > 0){
            txt_Puesto.setText(manager_users.obtenerPuesto(comboEmpleados.getSelectedItem().toString()));
        }else{
            txt_Puesto.setText("");
        }
        
    }//GEN-LAST:event_comboEmpleadosActionPerformed

    private void cmb_VehiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmb_VehiculoActionPerformed
        // TODO add your handling code here:
        if(cmb_Vehiculo.getSelectedIndex() != 0){
            String separador [] = cmb_Vehiculo.getSelectedItem().toString().split("-");
            Vector vVehiculos = manager_vehiculo.infoVehiculos(separador[1]);
            
            String temporal[] = vVehiculos.get(0).toString().split(",");
            txtKilometraje.setText(temporal[3]);
            txtADescripcion.setEnabled(true);
            
        }else{
            txtKilometraje.setText("");
            txtADescripcion.setEnabled(false);
            txtADescripcion.setText("");
        }
        
    }//GEN-LAST:event_cmb_VehiculoActionPerformed
    public void insertar_Solicitud(int ConCarro){
        try{
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String fecha_Salida=sdf.format(date_Salida.getDate().getTime());
            String fecha_Llegada=sdf.format(date_Llegada.getDate().getTime());
            Conexion conexion=new Conexion();
            //conexion.getConexion();
            String carro = "Sin vehiculo";
            
            String pernoctado="No";
            if(chb_Pernoctado.isSelected()){
                pernoctado="Si";
            }
            //Inserción de solicitud
            //Con carro
            if(ConCarro != 0){
                //Obtenemos la matricula
                String separador [] = cmb_Vehiculo.getSelectedItem().toString().split("-");
                carro = separador[1];
                //Insertamos la información adicional del vehiculo
                conexion.getConexion();
                float kil=Float.parseFloat(txtKilometraje.getText());
                String query="insert into viaticos_vehiculos (kilometraje,descripcion,fecha,vehiculos_matricula)values('"+kil+"','"+txtADescripcion.getText()+"',date(now()),'"+carro+"');";
                conexion.ejecutar(query);
                imprimirSolicitud = true;
                
            }//ConCarro
            
            boolean insersion = insersion=conexion.ejecutar("insert into Solicitud_viatico (Fecha_Salida,Lugar,Nombre,Actividad,Pernoctado,Vehiculo,Puesto,Fecha_Llegada,Estado,Reporte) values('"+fecha_Salida+"','"+txt_Lugar.getText()+"'"
                + ",'"+comboEmpleados.getSelectedItem().toString()+"','"+txt_Actividad.getText()+"','"+pernoctado+"','"+carro+"'"
                + ",'"+txt_Puesto.getText()+"','"+fecha_Llegada+"','P','0')");
            
            if(insersion){
                JOptionPane.showMessageDialog(this, "Insersión correcta");
                PrincipalS.tablasolic.setModel(manager_viaticos.getTasol());
                this.setVisible(false);
            }else{
                JOptionPane.showMessageDialog(this, "Error al insertar pero no excepción");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    //Función para validar los datos que se insertan en el formulario.
    public void validarDatos(boolean verificar_fecha,String cad)throws ExceptionDatosIncompletos{
        try{
            if(verificar_fecha && date_Llegada.getDate().before(date_Salida.getDate())){
                if(cad.equals("")){
                    cad+="-La fecha de salida es mayor que la de llegada";
                }
                else{
                    cad+="\n-La fecha de salida es mayor que la de llegada";
                }
            }
        }catch(NullPointerException e){
            if(cad.equals("")){
                cad+="-No se ha insertado alguna de las fechas, inserte las fechas de salida y de llegada";
            }
            else{
                cad+="\n-No se ha insertado alguna de las fechas, inserte las fechas de salida y de llegada";
            }
            try{
                verificar_excepcion=false;
                validarDatos(false,cad);
                return;
            }catch(ExceptionDatosIncompletos ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
                return;
            }
        }
        if(chb_Pernoctado.isSelected()){
            if(date_Salida.getDate().getYear()==date_Llegada.getDate().getYear()
                    && date_Salida.getDate().getMonth()==date_Llegada.getDate().getMonth()
                    && date_Salida.getDate().getDate()==date_Llegada.getDate().getDate()){
                cad+="\nNo se puede seleccionar pernoctadar para una fecha de salida y de llagada igual";
            }
            
        }
        if(txt_Actividad.getText().equals("")){
            if(cad.equals("")){
                cad+="-No se ha insertado ninguna actividad, escriba la acitividad y vuelva a intentarlo";
            }
            else{
                cad+="\n-No se ha insertado ninguna actividad, escriba la acitividad y vuelva a intentarlo";
            }
        }
        if(txt_Lugar.getText().equals("")){
            if(cad.equals("")){
                cad+="-No se ha insertado el lugar, escriba el lugar y vuelva a intentarlo";
            }
            else{
                cad+="\n-No se ha insertado el lugar, escriba el lugar y vuelva a intentarlo";
            }
        }
        if(comboEmpleados.getSelectedItem().toString().equals("Selecione empleado...")){
            if(cad.equals("")){
                cad+="-No se ha seleccionado el empleado, seleccione uno de los empleados y vuelva a intentarlo";
            }
            else{
                cad+="\n-No se ha seleccionado el empleado, seleccione uno de los empleados y vuelva a intentarlo";
            }
        }
        if(txt_Puesto.getText().equals("")){
            if(cad.equals("")){
                cad+="-No se ha insertado el puesto del empleado, escriba el nombre del empleado y vuelva a intentarlo";
            }
            else{
                cad+="\n-No se ha insertado el puesto del empleado, escriba el nombre del empleado y vuelva a intentarlo";
            }
        }
        if(!cad.equals("")){
            throw new ExceptionDatosIncompletos(cad);
        }else{
            return;
        }
    }
    
    private boolean verificar_excepcion=true;
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
            java.util.logging.Logger.getLogger(addSolicitudViaticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addSolicitudViaticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addSolicitudViaticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addSolicitudViaticos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                addSolicitudViaticos dialog = new addSolicitudViaticos(new javax.swing.JFrame(), true);
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
    private javax.swing.JCheckBox chb_Pernoctado;
    private javax.swing.JComboBox cmb_Vehiculo;
    private javax.swing.JComboBox<String> comboEmpleados;
    private com.toedter.calendar.JDateChooser date_Llegada;
    private com.toedter.calendar.JDateChooser date_Salida;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JPanel pn_addInventario;
    private javax.swing.JTextArea txtADescripcion;
    private javax.swing.JTextField txtKilometraje;
    private javax.swing.JTextArea txt_Actividad;
    private javax.swing.JTextField txt_Lugar;
    private javax.swing.JTextField txt_Puesto;
    // End of variables declaration//GEN-END:variables
}
