/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import confi.Conexion;
import java.sql.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Profesores extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    DefaultTableModel modelo1;
    int id;
    LocalDate fechaActual = LocalDate.now();
    String fecha = fechaActual.toString();
   
    public Profesores() {
        initComponents();
        listar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txt_IdP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_NomP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_PatP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_MatP = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_TelP = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatosP = new javax.swing.JTable();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_Menu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id_Profesor:");

        txt_IdP.setEditable(false);
        txt_IdP.setEnabled(false);

        jLabel2.setText("Nombre:");

        txt_NomP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NomPKeyReleased(evt);
            }
        });

        jLabel3.setText("A_Paterno:");

        jLabel4.setText("A_Materno:");

        jLabel5.setText("Telefono:");

        TablaDatosP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id.Profesor", "Nombre", "A.Paterno", "A.Materno", "Telefono", "Monto", "Fecha"
            }
        ));
        TablaDatosP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosPMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatosP);

        btn_Agregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Agregar.setText("Agregar");
        btn_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AgregarActionPerformed(evt);
            }
        });

        btn_Modificar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Modificar.setText("Modificar");
        btn_Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ModificarActionPerformed(evt);
            }
        });

        btn_Eliminar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Eliminar.setText("Eliminar");
        btn_Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EliminarActionPerformed(evt);
            }
        });

        btn_Limpiar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Limpiar.setText("Nuevo");
        btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_LimpiarActionPerformed(evt);
            }
        });

        btn_Menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Menu.setText("Menú");
        btn_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(btn_Agregar)
                        .addGap(149, 149, 149)
                        .addComponent(btn_Modificar)
                        .addGap(172, 172, 172)
                        .addComponent(btn_Eliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 127, Short.MAX_VALUE)
                        .addComponent(btn_Limpiar)
                        .addContainerGap(123, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_IdP, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(txt_NomP)
                                    .addComponent(txt_PatP)
                                    .addComponent(txt_MatP))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(34, 34, 34)
                                .addComponent(txt_TelP, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_Menu)
                .addGap(505, 505, 505))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_IdP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_NomP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_TelP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_PatP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_MatP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar)
                    .addComponent(btn_Limpiar))
                .addGap(18, 18, 18)
                .addComponent(btn_Menu)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuActionPerformed
        Menu men = new Menu();
        men.setVisible(true);
        this.dispose();
        if(btn_Eliminar.isEnabled()){
        }else{
            men.bloquear();
        }
    }//GEN-LAST:event_btn_MenuActionPerformed

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        agregar();
        listar();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void TablaDatosPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosPMouseClicked
        int fila=TablaDatosP.getSelectedRow();
         if(fila==-1){
             JOptionPane.showMessageDialog(null,"Alumno no seleccionado");
         }else{
             id=Integer.parseInt((String)TablaDatosP.getValueAt(fila,0).toString());
             String Nombre = ((String)TablaDatosP.getValueAt(fila,1));
             String A_Paterno = ((String)TablaDatosP.getValueAt(fila,2));
             String A_Materno = ((String)TablaDatosP.getValueAt(fila,3));
             
             String Tel_1 = ((String)TablaDatosP.getValueAt(fila,4));
            
             
            
             
             txt_IdP.setText(""+id);
             txt_NomP.setText(Nombre);
             txt_PatP.setText(A_Paterno);
             txt_MatP.setText(A_Materno);
             
             txt_TelP.setText(Tel_1);
             
             
             
             
         }
    }//GEN-LAST:event_TablaDatosPMouseClicked

    private void btn_ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ModificarActionPerformed
        modificar();
        listar();
    }//GEN-LAST:event_btn_ModificarActionPerformed

    private void btn_EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EliminarActionPerformed
        eliminar();
        listar();
        limpiar();
    }//GEN-LAST:event_btn_EliminarActionPerformed

    private void btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_LimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_LimpiarActionPerformed

    private void txt_NomPKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NomPKeyReleased
    }//GEN-LAST:event_txt_NomPKeyReleased

    
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
            java.util.logging.Logger.getLogger(Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profesores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profesores().setVisible(true);
            }
        });
    }
   
    void listar(){
        String sql="select * from profesores";
        try{
            cn=con.getConnection();
            st=cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]persona = new Object[7];
            modelo =(DefaultTableModel)TablaDatosP.getModel();
            while(rs.next()){
                persona[0]=rs.getInt("Id_Profesor");
                persona[1]=rs.getString("Nombre");
                persona[2]=rs.getString("A_Paterno");
                persona[3]=rs.getString("A_Materno");
                persona[4]=rs.getString("Telefono");
                persona[5]=rs.getInt("Monto");
                persona[6]=rs.getDate("Fecha");
                modelo.addRow(persona);
            }
            TablaDatosP.setModel(modelo);
        }catch(Exception e){
        
        }
    }
        void modificar(){
            String nom = txt_NomP.getText();
            String a_Pat = txt_PatP.getText();
            String a_Mat = txt_MatP.getText();

            String tel1 = txt_TelP.getText();



            String sql="update profesores set Nombre='"+nom+"',A_paterno='"+a_Pat+"',A_Materno='"+a_Mat+"',Telefono='"+tel1+"',Fecha='"+fecha+"'where Id_Profesor="+id;
            if(nom.equals("")){
                JOptionPane.showMessageDialog(null,"Debe ingresar datos");
            }else{
                try{
                    cn = con.getConnection();
                    st = cn.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null,"Usuario Actualizado");
                    limpiaTabla();
                }catch(Exception e){

                }
            }
        }
    void agregar(){
        String Nombre = txt_NomP.getText();
        String A_Paterno = txt_PatP.getText();
        String A_Materno = txt_MatP.getText();
        String Telefono_1 = txt_TelP.getText();
       
        if(Nombre.equals("")|| A_Paterno.equals("")|| A_Materno.equals("")|| Telefono_1.equals("")  ){
            JOptionPane.showMessageDialog(null, "Faltan rellenar campos");
        }else{
            String sql = "insert into profesores(Nombre,A_Paterno,A_Materno,Telefono,Monto,Fecha)values('"+Nombre+"','"+A_Paterno+"','"+A_Materno+"','"+Telefono_1+"','"+0+"', '"+fecha+"')";
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Usuario agregado");

                limpiaTabla();
            }catch(Exception e){
            
            }
        }
        
    }
    void limpiaTabla(){
        for(int i=0;i<=TablaDatosP.getRowCount();i++){
            modelo.removeRow(i);
            i=i-1;
        }
    }
    
    void limpiar(){
        txt_IdP.setText("");
        txt_NomP.setText("");
        txt_MatP.setText("");
        txt_PatP.setText("");
        txt_TelP.setText("");
       
    }
    
    void eliminar(){
        int fila_seleccionado = TablaDatosP.getSelectedRow();
        if(fila_seleccionado==-1){
            JOptionPane.showMessageDialog(null,"Seleccione un registro");
        }else{
            String sql = "delete from profesores where Id_profesor="+id;
            try{
                cn=con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Usuario eleminado con exito");
                limpiaTabla();
            }catch(Exception e){
            
            }
        }
    }
    
    public void bloquear(){
        btn_Eliminar.setEnabled(false);
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatosP;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_IdP;
    private javax.swing.JTextField txt_MatP;
    private javax.swing.JTextField txt_NomP;
    private javax.swing.JTextField txt_PatP;
    private javax.swing.JTextField txt_TelP;
    // End of variables declaration//GEN-END:variables
}
