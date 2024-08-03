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

public class pagos_Profesor extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    DefaultTableModel modelo1;
    int id;
    LocalDate fechaActual = LocalDate.now();
    String fecha = fechaActual.toString();
    
    public pagos_Profesor() {
        initComponents();
        listar();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        txt_Nom = new javax.swing.JTextField();
        txt_Monto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        btn_Guardar = new javax.swing.JButton();
        btn_Menu = new javax.swing.JButton();
        btn_Nuevo = new javax.swing.JButton();
        et1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id_Profesor:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Monto:");

        txt_Id.setEditable(false);
        txt_Id.setEnabled(false);

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Profesor", "Nombre", "A_Paterno", "A_Materno", "Monto", "Fecha"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        btn_Guardar.setText("Guardar");
        btn_Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GuardarActionPerformed(evt);
            }
        });

        btn_Menu.setText("Menu");
        btn_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuActionPerformed(evt);
            }
        });

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(btn_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                        .addComponent(btn_Nuevo)
                        .addGap(47, 47, 47))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_Id)
                                    .addComponent(txt_Nom, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(txt_Monto)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(btn_Menu))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addComponent(et1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Guardar)
                    .addComponent(btn_Nuevo))
                .addGap(61, 61, 61)
                .addComponent(btn_Menu)
                .addGap(49, 49, 49)
                .addComponent(et1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
         int fila=TablaDatos.getSelectedRow();
         if(fila==-1){
             JOptionPane.showMessageDialog(null,"Profesor no seleccionado");
         }else{
             id=Integer.parseInt((String)TablaDatos.getValueAt(fila,0).toString());
             String Nombre = ((String)TablaDatos.getValueAt(fila,1));
            
             
             txt_Id.setText(""+id);
             txt_Nom.setText(Nombre);
             
             
         }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuActionPerformed
        Menu obj1 = new Menu();
        obj1.setVisible(true);
        this.dispose();
        
        if(et1.isEnabled()){
        
        }else{
            obj1.bloquear();
        }
    }//GEN-LAST:event_btn_MenuActionPerformed

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        agregar();
        listar();
        limpiar();
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_NuevoActionPerformed

    
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
            java.util.logging.Logger.getLogger(pagos_Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagos_Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagos_Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagos_Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagos_Profesor().setVisible(true);
            }
        });
    }
    
    void listar(){
        String sql="select Id_Profesor, Nombre, A_Paterno, A_Materno,Monto,Fecha from profesores";
        try{
            cn= con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]alumno = new Object[6];
            modelo = (DefaultTableModel)TablaDatos.getModel();
            while (rs.next()){
                alumno[0] =rs.getInt("Id_Profesor");
                alumno[1] = rs.getString("Nombre");
                alumno[2] = rs.getString("A_Paterno");
                alumno[3] = rs.getString("A_Materno");
                alumno[4] = rs.getInt("Monto");
                alumno[5] = rs.getDate("Fecha"); //tengo que checar este para recibir el tipo de dato fecha getDate
                modelo.addRow(alumno);
               
            }
            TablaDatos.setModel(modelo);
        }catch(Exception e){
        
        }
    }
    void agregar(){
        String Nombre = txt_Nom.getText();
        int pago = Integer.parseInt(txt_Monto.getText());
        System.out.println(pago);
        System.out.println(id);
        if(Nombre.equals("")|| txt_Monto.getText()==""){
            JOptionPane.showMessageDialog(null, "Faltan rellenar campos");
        }else{

            
            //String sql = "INSERT INTO pagos (monto, id_alumno) VALUES ('" + pago + "', '" + id + "');" +
             //"UPDATE alumno SET Abono = Abono + '" + pago + "' WHERE Id = " + id;
            
            try {
                cn = con.getConnection();
                st = cn.createStatement();

                // Primero, ejecuta la inserción en la tabla "pagos"
                String insertPagoSQL = "INSERT INTO pagos_profesores (monto, Id_profesor,Fecha) VALUES ('" + pago + "', '" + id + "','"+fecha+"')";
                st.executeUpdate(insertPagoSQL);

                // Luego, ejecuta la actualización en la tabla "alumno"
                String updateAbonoSQL = "UPDATE profesores SET Monto = Monto + '" + pago + "' WHERE Id_Profesor = " + id;
                st.executeUpdate(updateAbonoSQL);

                JOptionPane.showMessageDialog(null, "Pago realizado");
                
                limpiaTabla();
                
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al ejecutar una de las consultas SQL: " + e.getMessage());
            }

        }
        
    }
    void limpiaTabla() {
        int rowCount = modelo.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    void limpiar(){
        txt_Id.setText("");
        txt_Monto.setText("");
        txt_Nom.setText("");
    }
    
    void bloquear(){
        et1.setEnabled(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JLabel et1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Monto;
    private javax.swing.JTextField txt_Nom;
    // End of variables declaration//GEN-END:variables
}
