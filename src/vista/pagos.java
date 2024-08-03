/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import confi.Conexion;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pagos extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    DefaultTableModel modelo1;
    DefaultTableModel modelo2;
    int id;
    int id_curso;
    int id_pago;
    LocalDate fechaActual = LocalDate.now();
    String fecha = fechaActual.toString();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String fechaFormateada = fechaActual.format(formatter);//esta es la fecha actual
    
    //variables a utilizar para cambiar la fecha de los pagos
    Date fecha_pagos;
    String fecha_recibo;
    
    public pagos() {
        initComponents();
        listar();
        btn_Imprimir.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_Nom = new javax.swing.JTextField();
        txt_Monto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        btn_Guardar = new javax.swing.JButton();
        btn_Imprimir = new javax.swing.JButton();
        btn_Menu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        btn_Nuevo = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_Pat = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_Mat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_Razon = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaDatos1 = new javax.swing.JTable();
        et1 = new javax.swing.JLabel();
        btn_cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Abono:");

        txt_Nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NomKeyReleased(evt);
            }
        });

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Alumno", "Nombre", "A.Paterno", "A.Materno", "Id_Curso", "Curso", "Monto", "Importes", "Fecha"
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

        btn_Imprimir.setText("Reimpresión de recibos");
        btn_Imprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ImprimirActionPerformed(evt);
            }
        });

        btn_Menu.setText("Menu");
        btn_Menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MenuActionPerformed(evt);
            }
        });

        jLabel3.setText("Id_Alumno:");

        txt_Id.setEditable(false);
        txt_Id.setEnabled(false);

        btn_Nuevo.setText("Nuevo");
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });

        jLabel4.setText("A.Paterno:");

        jLabel5.setText("A.Materno:");

        jLabel6.setText("Curso:");

        TablaDatos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id_Alumno", "Nombre", "Curso", "id_importes", "importes", "Fechas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, true, true, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDatos1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatos1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaDatos1);
        if (TablaDatos1.getColumnModel().getColumnCount() > 0) {
            TablaDatos1.getColumnModel().getColumn(3).setMinWidth(10);
            TablaDatos1.getColumnModel().getColumn(3).setMaxWidth(15);
        }

        btn_cancelar.setText("Cancelar pago");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addGap(25, 25, 25)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_Nom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txt_Id, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txt_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txt_Mat, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                                            .addComponent(txt_Pat)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(109, 109, 109)
                                .addComponent(btn_Nuevo))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(47, 47, 47)
                                .addComponent(txt_Razon, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btn_Guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn_Imprimir)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_Menu)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(et1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 856, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(txt_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_Pat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txt_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txt_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_Razon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_Guardar)
                            .addComponent(btn_cancelar))
                        .addGap(18, 18, 18)
                        .addComponent(btn_Nuevo)
                        .addGap(34, 34, 34)
                        .addComponent(btn_Imprimir)
                        .addGap(18, 18, 18)
                        .addComponent(btn_Menu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(et1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_MenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MenuActionPerformed
        Menu men = new Menu();
        men.setVisible(true);
        this.dispose();
        
        if(et1.isEnabled()){
        
        }else{
            men.bloquear();
        }
        
    }//GEN-LAST:event_btn_MenuActionPerformed

    private void txt_NomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NomKeyReleased
        buscar(txt_Nom.getText());
    }//GEN-LAST:event_txt_NomKeyReleased

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila=TablaDatos.getSelectedRow();
         if(fila==-1){
             JOptionPane.showMessageDialog(null,"Alumno no seleccionado");
         }else{
             id=Integer.parseInt((String)TablaDatos.getValueAt(fila,0).toString());
             String Nombre = ((String)TablaDatos.getValueAt(fila,1));
             String a_pat = ((String)TablaDatos.getValueAt(fila,2));
             String a_mat = ((String)TablaDatos.getValueAt(fila, 3));
             id_curso=Integer.parseInt((String)TablaDatos.getValueAt(fila,4).toString());
            
             String razon = ((String)TablaDatos.getValueAt(fila, 5));
             
             txt_Id.setText(""+id);
             txt_Nom.setText(Nombre);
             txt_Pat.setText(a_pat);
             txt_Mat.setText(a_mat);
             txt_Razon.setText(razon);
             try{
                limpiaTabla_2();
             }catch(Exception e){
        
             }
                pagos();
                btn_Imprimir.setEnabled(false);
                
                //activar la caja de texto para generar un pago
                txt_Monto.setEnabled(true);
                txt_Monto.setText("");
             
             
         }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btn_GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GuardarActionPerformed
        agregar();
        listar();
        btn_Imprimir.setEnabled(true);
        pdf_boton_guardar();
        
    }//GEN-LAST:event_btn_GuardarActionPerformed

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        limpiar();
        btn_Imprimir.setEnabled(false);
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_ImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ImprimirActionPerformed
        pdf();
    }//GEN-LAST:event_btn_ImprimirActionPerformed

    private void TablaDatos1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatos1MouseClicked
        // TODO add your handling code here:
        int fila=TablaDatos1.getSelectedRow();
         if(fila==-1){
             JOptionPane.showMessageDialog(null,"Alumno no seleccionado");
         }else{
             id_pago=Integer.parseInt((String)TablaDatos1.getValueAt(fila,3).toString());

             int monto_pago = Integer.parseInt((String)TablaDatos1.getValueAt(fila,4).toString());
             //aqui esta la nuevo para implementar
             fecha_pagos = (Date) (TablaDatos1.getValueAt(fila,5));
             
             SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
             fecha_recibo = sdf.format(fecha_pagos);
             System.out.println(fecha_recibo);
             
             txt_Monto.setText("" + monto_pago);
                
             btn_Imprimir.setEnabled(true);
             //txt_Monto.setEnabled(false); // se agrega el metodo para que no se pueda modificar el monto
         }
    }//GEN-LAST:event_TablaDatos1MouseClicked

    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        eliminar_pago();
        listar();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    
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
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pagos().setVisible(true);
            }
        });
    }
    void listar(){
        //String sql="select Id, Nombre, A_Paterno, A_Materno,Monto,Abono,Fecha,razon from alumno";
        String sql="SELECT alumno.Id,alumno.Nombre,alumno.A_Paterno,alumno.A_Materno,cursos.Id_Curso,cursos.Nombre,cursos.Monto,cursos.Abono,alumno.Fecha FROM alumno LEFT JOIN cursos ON alumno.Id=cursos.Id_Alumno ORDER BY alumno.Id";

        try{
            cn= con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]alumno = new Object[9];
            modelo = (DefaultTableModel)TablaDatos.getModel();
            while (rs.next()){
                alumno[0] =rs.getInt("Id");
                alumno[1] = rs.getString("Nombre");
                alumno[2] = rs.getString("A_Paterno");
                alumno[3] = rs.getString("A_Materno");
                alumno[4] = rs.getString("cursos.Id_Curso");
                alumno[5] = rs.getString("cursos.Nombre");
                alumno[6] = rs.getInt("cursos.Monto"); //tengo que checar este para recibir el tipo de dato fecha getDate
                alumno[7] = rs.getString("cursos.Abono");
                alumno[8] = rs.getDate("alumno.Fecha");
                modelo.addRow(alumno);
               
            }
            TablaDatos.setModel(modelo);
        }catch(Exception e){
        
        }
    }
    
    void buscar(String Nombre){
        modelo1 = new DefaultTableModel();
        modelo1.addColumn("Id_Alumno");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("A.Paterno");
        modelo1.addColumn("A.Materno");
        modelo1.addColumn("Id_Curso");
        modelo1.addColumn("Curso");
        modelo1.addColumn("Monto");
        modelo1.addColumn("Importes");
        modelo1.addColumn("Fecha");
        TablaDatos.setModel(modelo1);
        String sql="";
        if(Nombre.equals("")){
           sql="SELECT alumno.Id,alumno.Nombre,alumno.A_Paterno,alumno.A_Materno,cursos.Id_Curso,cursos.Nombre,cursos.Monto,cursos.Abono,alumno.Fecha FROM alumno LEFT JOIN cursos ON alumno.Id=cursos.Id_Alumno ORDER BY alumno.Id";

        }else{
            sql="SELECT alumno.Id,alumno.Nombre,alumno.A_Paterno,alumno.A_Materno,cursos.Id_Curso,cursos.Nombre,cursos.Monto,cursos.Abono,alumno.Fecha FROM alumno LEFT JOIN cursos ON alumno.Id=cursos.Id_Alumno where alumno.Nombre like'%"+Nombre+"%'";

            System.out.println(sql);
        }
        String alumno[] = new String[9];
        try{
            cn= con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                alumno[0] =rs.getString(1);
                alumno[1] = rs.getString(2);
                alumno[2] = rs.getString(3);
                alumno[3] = rs.getString(4);
                alumno[4] = rs.getString(5);
                alumno[5] = rs.getString(6);
                alumno[6] = rs.getString(7);
                alumno[7] = rs.getString(8);
                alumno[8] = rs.getString(9);
                modelo1.addRow(alumno);
            }
            TablaDatos.setModel(modelo1);
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
                String insertPagoSQL = "INSERT INTO pagos (monto,id_alumno,Fecha,Id_curso) VALUES ('"+pago+"', '"+id+"', '"+fecha+"', '"+id_curso+"')";
                st.executeUpdate(insertPagoSQL);

                // Luego, ejecuta la actualización en la tabla "alumno"
                String updateAbonoSQL = "UPDATE cursos SET Abono = Abono + '" + pago + "' WHERE Id_Curso="+id_curso;
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
   void limpiaTabla_2(){
       int rowCount = modelo2.getRowCount();
        for (int i = rowCount - 1; i >= 0; i--) {
            modelo2.removeRow(i);
        }
   }
   void limpiar(){
        txt_Id.setText("");
        txt_Nom.setText("");
        txt_Pat.setText("");
        txt_Mat.setText("");
        txt_Monto.setText("");
        txt_Razon.setText("");
    }
   
   void pdf(){
        // ...

            try {
                FileOutputStream archivo;
                File file = new File("C:/Users/52557/Documents/NetBeansProjects/Sistema/src/pdf/comprobante1.pdf");
                archivo = new FileOutputStream(file);
                Document doc = new Document();
                PdfWriter.getInstance(doc, archivo);
                doc.open();

                // Añade la imagen
                Image img = Image.getInstance("C:/Users/52557/Documents/NetBeansProjects/Sistema/src/imagenes/prueba1.jpg");
                img.scaleToFit(200, 200);  // Escala la imagen a 200x200 unidades de puntos

                Paragraph fecha = new Paragraph();
                Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
                fecha.add(Chunk.NEWLINE);
                SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");

                fecha.add("Fecha: " + fecha_recibo +"\n\n Encuentranos en: "+"\n      Facebook: \n    Math & English");

                PdfPTable Encabezado = new PdfPTable(4);
                Encabezado.setWidthPercentage(100);
                Encabezado.getDefaultCell().setBorder(0);
                float[] ColumnaEncabezado = new float[] {50f, 3f, 55f, 30f };
                Encabezado.setWidths(ColumnaEncabezado);
                Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

                Encabezado.addCell(img);
                String calle = "Patricio Aguirre #1 Bo. San Juan";
                String colonia = "          Zumpango, México";
                String tel = "5561512759";
                
                Encabezado.addCell("");
                Encabezado.addCell("\n " + calle + "\n\n " + colonia + "\n\n            Tel. " + tel );
                Encabezado.addCell(fecha);
 
                doc.add(Encabezado);

                Paragraph cli = new Paragraph();
                cli.add("______________________________________________________________________________");
                cli.add(Chunk.NEWLINE);
                
                cli.add("Datos cliente: " + "\n");
                cli.add("----------------------------------------------------------------------------------------------------------------------------------");
                doc.add(cli);

                PdfPTable tablaCli = new PdfPTable(4);
                tablaCli.setWidthPercentage(120);
                tablaCli.getDefaultCell().setBorder(0);
                float[] ColumnaCli = new float[] { 2f, 2f, 2f, 3f };
                tablaCli.setWidths(ColumnaCli);
                tablaCli.setHorizontalAlignment(Element.ALIGN_LEFT);
                PdfPCell cli1 = new PdfPCell(new Phrase("Nombre"));
                PdfPCell cli2 = new PdfPCell(new Phrase("A.Paterno"));
                PdfPCell cli3 = new PdfPCell(new Phrase("A.Materno"));
                PdfPCell cli4 = new PdfPCell(new Phrase("Importe (" + txt_Razon.getText()+")"));
                cli1.setBorder(0);
                cli2.setBorder(0);
                cli3.setBorder(0);
                cli4.setBorder(0);
                tablaCli.addCell(cli1);
                tablaCli.addCell(cli2);
                tablaCli.addCell(cli3);
                tablaCli.addCell(cli4);
                tablaCli.addCell(txt_Nom.getText()+"\n"+"____________________");
                tablaCli.addCell(txt_Pat.getText()+"\n"+"____________________");
                tablaCli.addCell(txt_Mat.getText()+"\n"+"____________________");
                tablaCli.addCell("$ " + txt_Monto.getText()+"\n"+"______________________");
                doc.add(tablaCli);

                doc.close();
                archivo.close();
                Desktop.getDesktop().open(file);

            } catch (Exception e) {
                e.printStackTrace();
            }

    }
   
   void pagos(){
       String sql="SELECT alumno.Id,alumno.Nombre,cursos.Nombre,pagos.Id_Pago,pagos.monto,pagos.Fecha FROM alumno LEFT JOIN cursos ON alumno.Id=cursos.Id_Alumno LEFT JOIN pagos ON cursos.Id_Curso = pagos.Id_Curso WHERE alumno.Id=" + id + " ORDER BY alumno.Id";
       System.out.println(sql);
       try{
            cn= con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]alumno = new Object[6];
            modelo2 = (DefaultTableModel)TablaDatos1.getModel();
            while (rs.next()){
                alumno[0] =rs.getInt("Id");
                alumno[1] = rs.getString("Nombre");
                alumno[2] = rs.getString("cursos.Nombre");
                alumno[3] = rs.getInt("pagos.Id_Pago");
                alumno[4] = rs.getInt("pagos.monto");
                alumno[5] = rs.getDate("pagos.Fecha");
                modelo2.addRow(alumno);
               
            }
            TablaDatos1.setModel(modelo2);
        }catch(Exception e){
        
        }
   }
   void bloquear(){
       et1.setEnabled(false);
   }
   
   //este es el nuevo metodo
   void eliminar_pago(){
        int pago = Integer.parseInt(txt_Monto.getText());
        System.out.println(pago);
        System.out.println(id);
        if(txt_Monto.getText()==""){
            JOptionPane.showMessageDialog(null, "Faltan rellenar campos");
        }else{

            
            //String sql = "INSERT INTO pagos (monto, id_alumno) VALUES ('" + pago + "', '" + id + "');" +
             //"UPDATE alumno SET Abono = Abono + '" + pago + "' WHERE Id = " + id;
            
            try {
                cn = con.getConnection();
                st = cn.createStatement();

                // Primero, ejecuta la inserción en la tabla "pagos"
                String insertPagoSQL = "DELETE FROM pagos where Id_Pago= "+ id_pago + " and Id_Curso=" + id_curso;
                st.executeUpdate(insertPagoSQL);

                // Luego, ejecuta la actualización en la tabla "alumno"
                String updateAbonoSQL = "UPDATE cursos SET Abono = Abono - '" + pago + "' WHERE Id_Curso= " + id_curso;
                st.executeUpdate(updateAbonoSQL);

                JOptionPane.showMessageDialog(null, "Pago eliminado con exito");
                
                limpiaTabla();
                
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al ejecutar una de las consultas SQL: " + e.getMessage());
            }

        }
   }
   
   //metodo para el boton guardar y enviara la fecha actual
   void pdf_boton_guardar(){
        // ...

            try {
                FileOutputStream archivo;
                File file = new File("C:/Users/52557/Documents/NetBeansProjects/Sistema/src/pdf/comprobante1.pdf");
                archivo = new FileOutputStream(file);
                Document doc = new Document();
                PdfWriter.getInstance(doc, archivo);
                doc.open();

                // Añade la imagen
                Image img = Image.getInstance("C:/Users/52557/Documents/NetBeansProjects/Sistema/src/imagenes/prueba1.jpg");
                img.scaleToFit(200, 200);  // Escala la imagen a 200x200 unidades de puntos

                Paragraph fecha = new Paragraph();
                Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLUE);
                fecha.add(Chunk.NEWLINE);
                SimpleDateFormat f1 = new SimpleDateFormat("dd-MM-yyyy");

                fecha.add("Fecha: " + fechaFormateada +"\n\n Encuentranos en: "+"\n      Facebook: \n    Math & English");

                PdfPTable Encabezado = new PdfPTable(4);
                Encabezado.setWidthPercentage(100);
                Encabezado.getDefaultCell().setBorder(0);
                float[] ColumnaEncabezado = new float[] {50f, 3f, 55f, 30f };
                Encabezado.setWidths(ColumnaEncabezado);
                Encabezado.setHorizontalAlignment(Element.ALIGN_LEFT);

                Encabezado.addCell(img);
                String calle = "Patricio Aguirre #1 Bo. San Juan";
                String colonia = "          Zumpango, México";
                String tel = "5561512759";
                
                Encabezado.addCell("");
                Encabezado.addCell("\n " + calle + "\n\n " + colonia + "\n\n            Tel. " + tel );
                Encabezado.addCell(fecha);
 
                doc.add(Encabezado);

                Paragraph cli = new Paragraph();
                cli.add("______________________________________________________________________________");
                cli.add(Chunk.NEWLINE);
                
                cli.add("Datos cliente: " + "\n");
                cli.add("----------------------------------------------------------------------------------------------------------------------------------");
                doc.add(cli);

                PdfPTable tablaCli = new PdfPTable(4);
                tablaCli.setWidthPercentage(120);
                tablaCli.getDefaultCell().setBorder(0);
                float[] ColumnaCli = new float[] { 2f, 2f, 2f, 3f };
                tablaCli.setWidths(ColumnaCli);
                tablaCli.setHorizontalAlignment(Element.ALIGN_LEFT);
                PdfPCell cli1 = new PdfPCell(new Phrase("Nombre"));
                PdfPCell cli2 = new PdfPCell(new Phrase("A.Paterno"));
                PdfPCell cli3 = new PdfPCell(new Phrase("A.Materno"));
                PdfPCell cli4 = new PdfPCell(new Phrase("Importe (" + txt_Razon.getText()+")"));
                cli1.setBorder(0);
                cli2.setBorder(0);
                cli3.setBorder(0);
                cli4.setBorder(0);
                tablaCli.addCell(cli1);
                tablaCli.addCell(cli2);
                tablaCli.addCell(cli3);
                tablaCli.addCell(cli4);
                tablaCli.addCell(txt_Nom.getText()+"\n"+"____________________");
                tablaCli.addCell(txt_Pat.getText()+"\n"+"____________________");
                tablaCli.addCell(txt_Mat.getText()+"\n"+"____________________");
                tablaCli.addCell("$ " + txt_Monto.getText()+"\n"+"______________________");
                doc.add(tablaCli);

                doc.close();
                archivo.close();
                Desktop.getDesktop().open(file);

            } catch (Exception e) {
                e.printStackTrace();
            }

    }
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JTable TablaDatos1;
    private javax.swing.JButton btn_Guardar;
    private javax.swing.JButton btn_Imprimir;
    private javax.swing.JButton btn_Menu;
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JLabel et1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Mat;
    private javax.swing.JTextField txt_Monto;
    private javax.swing.JTextField txt_Nom;
    private javax.swing.JTextField txt_Pat;
    private javax.swing.JTextField txt_Razon;
    // End of variables declaration//GEN-END:variables
}
