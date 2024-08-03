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
import com.itextpdf.text.Rectangle;
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

public class Alumnos extends javax.swing.JFrame {
    
    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    DefaultTableModel modelo1;
    int id;
    int id_curso;
    LocalDate fechaActual = LocalDate.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    String fechaFormateada = fechaActual.format(formatter);
    String fecha = fechaActual.toString();
    public Alumnos() {
        initComponents();
        listar();
        
        
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        profesores = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        txt_Nom = new javax.swing.JTextField();
        txt_Pat = new javax.swing.JTextField();
        txt_Mat = new javax.swing.JTextField();
        txt_Edad = new javax.swing.JTextField();
        txt_Tel1 = new javax.swing.JTextField();
        txt_Tel2 = new javax.swing.JTextField();
        txt_Monto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        btn_Agregar = new javax.swing.JButton();
        btn_Modificar = new javax.swing.JButton();
        btn_Eliminar = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        btn_menu = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txt_Razon = new javax.swing.JTextField();
        btn_curso = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_Escuela = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Id_Alumno");

        jLabel2.setText("Nombre: ");

        jLabel3.setText("A.Paterno:");

        jLabel4.setText("A.Materno:");

        jLabel5.setText("Edad:");

        jLabel6.setText("Telefono 1:");

        jLabel7.setText("Telefono 2:");

        jLabel8.setText("Monto:");

        txt_Id.setEditable(false);
        txt_Id.setEnabled(false);

        txt_Nom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_NomKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NomKeyTyped(evt);
            }
        });

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Alumno", "Nombre", "A.Paterno", "A.Materno", "Edad", "Telefono1", "Telefono2", "Fecha", "Id Curso", "Curso", "Monto", "Escuela"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        btn_Agregar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_Agregar.setText("Guardar Registro");
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

        btn_menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_menu.setText("Menú");
        btn_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_menuActionPerformed(evt);
            }
        });

        jLabel10.setText("Curso:");

        btn_curso.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_curso.setText("Agregar Curso");
        btn_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cursoActionPerformed(evt);
            }
        });

        jLabel9.setText("Escuela-Procedencia:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Id)
                            .addComponent(txt_Nom)
                            .addComponent(txt_Pat)
                            .addComponent(txt_Mat)
                            .addComponent(txt_Edad, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                            .addComponent(txt_Tel1)
                            .addComponent(txt_Tel2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(jLabel9))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(275, 275, 275)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_Razon, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE)
                            .addComponent(txt_Monto)
                            .addComponent(txt_Escuela))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btn_Agregar)
                        .addGap(153, 153, 153)
                        .addComponent(btn_curso)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_Modificar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 693, Short.MAX_VALUE)
                        .addComponent(btn_menu)))
                .addGap(144, 144, 144)
                .addComponent(btn_Eliminar)
                .addGap(141, 141, 141)
                .addComponent(btn_Limpiar)
                .addGap(92, 92, 92))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_Id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_Nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(txt_Razon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_Pat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_Monto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_Mat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txt_Escuela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_Tel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_Tel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Agregar)
                    .addComponent(btn_Modificar)
                    .addComponent(btn_Eliminar)
                    .addComponent(btn_Limpiar)
                    .addComponent(btn_curso))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btn_menu)
                .addGap(35, 35, 35))
        );

        profesores.addTab("Registrar", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(profesores)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profesores)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AgregarActionPerformed
        agregar();
        listar();
    }//GEN-LAST:event_btn_AgregarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila=TablaDatos.getSelectedRow();
         if(fila==-1){
             JOptionPane.showMessageDialog(null,"Alumno no seleccionado");
         }else{
             id=Integer.parseInt((String)TablaDatos.getValueAt(fila,0).toString());
             String Nombre = ((String)TablaDatos.getValueAt(fila,1));
             String A_Paterno = ((String)TablaDatos.getValueAt(fila,2));
             String A_Materno = ((String)TablaDatos.getValueAt(fila,3));
             String Edad = ((String)TablaDatos.getValueAt(fila,4));
             String Tel_1 = ((String)TablaDatos.getValueAt(fila,5));
             String Tel_2 = ((String)TablaDatos.getValueAt(fila,6));
             id_curso=Integer.parseInt((String)TablaDatos.getValueAt(fila,8).toString());
             String razon = ((String)TablaDatos.getValueAt(fila,9)); 
             int monto = Integer.parseInt((String)TablaDatos.getValueAt(fila,10).toString());
             String escuela = ((String)TablaDatos.getValueAt(fila,11)); 

           
              
             
             txt_Id.setText(""+id);
             txt_Nom.setText(Nombre);
             txt_Pat.setText(A_Paterno);
             txt_Mat.setText(A_Materno);
             txt_Edad.setText(Edad);
             txt_Tel1.setText(Tel_1);
             txt_Tel2.setText(Tel_2);
             txt_Monto.setText(""+ monto);
            
             txt_Razon.setText(razon);
             txt_Escuela.setText(escuela);
             
         }
    }//GEN-LAST:event_TablaDatosMouseClicked

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

    private void txt_NomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NomKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NomKeyTyped

    private void txt_NomKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NomKeyReleased
         buscar(txt_Nom.getText());
    }//GEN-LAST:event_txt_NomKeyReleased

    private void btn_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_menuActionPerformed
        Menu frame = new Menu();
        
        frame.setVisible(true);
        this.dispose();
        
        if(btn_Eliminar.isEnabled()){
        }else{
            frame.bloquear();
        }
        
    }//GEN-LAST:event_btn_menuActionPerformed

    private void btn_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cursoActionPerformed
        
        curso();
        listar();
    }//GEN-LAST:event_btn_cursoActionPerformed
    
   
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
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Alumnos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alumnos().setVisible(true);
            }
        });
    }
    void listar(){
        String sql="SELECT alumno.Id,alumno.Nombre,alumno.A_Paterno,alumno.A_Materno,alumno.Edad,alumno.Telefono_1,alumno.Telefono_2,alumno.Fecha,cursos.Id_Curso,cursos.Nombre,cursos.Monto,alumno.escuela FROM alumno LEFT JOIN cursos ON alumno.Id=cursos.Id_Alumno ORDER BY alumno.Id";
        
        //System.out.println(sql);
        try{
            cn= con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            Object[]alumno = new Object[12];
            modelo = (DefaultTableModel)TablaDatos.getModel();
            
            while (rs.next()){
                
                alumno[0] =rs.getInt("Id");
                alumno[1] = rs.getString("Nombre");
                alumno[2] = rs.getString("A_Paterno");
                alumno[3] = rs.getString("A_Materno");
                alumno[4] = rs.getString("Edad");
                alumno[5] = rs.getString("Telefono_1");
                alumno[6] = rs.getString("Telefono_2");
                alumno[7] = rs.getDate("Fecha"); //tengo que checar este para recibir el tipo de dato fecha getDate
                alumno[8] = rs.getInt("cursos.Id_Curso");
                alumno[9] = rs.getString("cursos.Nombre");
                alumno[10] = rs.getInt("cursos.Monto");
                alumno[11] = rs.getString("alumno.escuela");
                modelo.addRow(alumno);
               
            }
            TablaDatos.setModel(modelo);
        }catch(Exception e){
        
        }
    }
    
    void modificar(){
        String nom = txt_Nom.getText();
        String a_Pat = txt_Pat.getText();
        String a_Mat = txt_Mat.getText();
        String edad = txt_Edad.getText();
        String tel1 = txt_Tel1.getText();
        String tel2 = txt_Tel2.getText();
        int monto = Integer.parseInt(txt_Monto.getText());
        String razon = txt_Razon.getText();
        String escuela = txt_Escuela.getText();
        if(nom.equals("")){
            JOptionPane.showMessageDialog(null,"Debe ingresar datos");
        }else{
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                
               

                // Primero, ejecuta la inserción en la tabla "pagos"
                String sql="update alumno set Nombre='"+nom+"',A_paterno='"+a_Pat+"',A_Materno='"+a_Mat+"',Edad='"+edad+"',Telefono_1='"+tel1+"',Telefono_2='"+tel2+"',escuela='"+escuela+"' where id="+id;
                st.executeUpdate(sql);

                // Luego, ejecuta la actualización en la tabla "alumno"
                String updateAbonoSQL = "UPDATE cursos SET Nombre = '"+razon+"',Monto='"+monto+"' where Id_Curso="+id_curso;
               ;
                st.executeUpdate(updateAbonoSQL);

                JOptionPane.showMessageDialog(null,"Usuario Actualizado");                
                limpiaTabla();
            }catch(Exception e){
            
            }
        }
    }
    void buscar(String Nombre){
        modelo1 = new DefaultTableModel();
        modelo1.addColumn("Id_Alumno");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("A_Paterno");
        modelo1.addColumn("A_Materno");
        modelo1.addColumn("Edad");
        modelo1.addColumn("Telefono_1");
        modelo1.addColumn("Telefono_2");
        modelo1.addColumn("Fecha");
        modelo1.addColumn("Id_Curso");
        modelo1.addColumn("Nombre");
        modelo1.addColumn("Monto");
        modelo1.addColumn("Escuela");
        TablaDatos.setModel(modelo1);
        String sql="";
        if(Nombre.equals("")){
            sql = "SELECT alumno.Id,alumno.Nombre,alumno.A_Paterno,alumno.A_Materno,alumno.Edad,alumno.Telefono_1,alumno.Telefono_2,alumno.Fecha,cursos.Id_Curso,cursos.Nombre,cursos.Monto,alumno.escuela FROM alumno LEFT JOIN cursos ON alumno.Id=cursos.Id_Alumno";
        }else{
            sql="SELECT alumno.Id,alumno.Nombre,alumno.A_Paterno,alumno.A_Materno,alumno.Edad,alumno.Telefono_1,alumno.Telefono_2,alumno.Fecha,cursos.Id_Curso,cursos.Nombre,cursos.Monto,alumno.escuela FROM alumno LEFT JOIN cursos ON alumno.Id=cursos.Id_Alumno where alumno.Nombre like'%"+Nombre+"%'";
            
        }
        String alumno[] = new String[11];
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
                alumno[9] = rs.getString(10);
                alumno[10] = rs.getString(11);
                modelo1.addRow(alumno);
            }
            TablaDatos.setModel(modelo1);
        }catch(Exception e){
        
        }
    }
    void agregar(){
        String Nombre = txt_Nom.getText();
        String A_Paterno = txt_Pat.getText();
        String A_Materno = txt_Mat.getText();
        String Edad = txt_Edad.getText();
        String Telefono_1 = txt_Tel1.getText();
        String Telefono_2 = txt_Tel2.getText();
        int monto = Integer.parseInt(txt_Monto.getText());
        int abono =0;
        String razon = txt_Razon.getText();
        String escuela = txt_Escuela.getText();

        if(Nombre.equals("")|| A_Paterno.equals("")|| A_Materno.equals("")|| Edad.equals("") || Telefono_1.equals("") || Telefono_2.equals("")   || razon.equals("")  || escuela.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan rellenar campos");
        }else{
            try {
                cn = con.getConnection();
                st = cn.createStatement();

                // Primero, ejecuta la inserción en la tabla "pagos"
                String insertPagoSQL = "insert into alumno(Nombre,A_Paterno,A_Materno,Edad,Telefono_1,Telefono_2,Fecha,escuela)values('"+Nombre+"','"+A_Paterno+"','"+A_Materno+"','"+Edad+"','"+Telefono_1+"','"+Telefono_2+"','"+fecha+"','"+escuela+"')";
                System.out.println(insertPagoSQL);
                st.executeUpdate(insertPagoSQL);

                String nuvea = "SET @nuevoIdAlumno = LAST_INSERT_ID()";
                st.executeUpdate(nuvea);
                
                String updateAbonoSQL = "INSERT INTO cursos (Id_Alumno, Nombre, Monto, Abono) VALUES (@nuevoIdAlumno,'"+razon+"','"+monto+"','"+abono+"')";
                System.out.println(updateAbonoSQL);
                st.executeUpdate(updateAbonoSQL);

                JOptionPane.showMessageDialog(null, "Registro guardado con exito");
                
                limpiaTabla();
                
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al ejecutar una de las consultas SQL: " + e.getMessage());
            }
        }
        
    }
     void limpiaTabla(){
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0); // Elimina la primera fila repetidamente hasta que no queden más filas
        }
    }
     void limpiar(){
        txt_Id.setText("");
        txt_Nom.setText("");
        txt_Pat.setText("");
        txt_Mat.setText("");
        txt_Tel1.setText("");
        txt_Tel2.setText("");
        txt_Monto.setText("");
        
        txt_Edad.setText("");
        txt_Razon.setText("");
        txt_Escuela.setText("");
    }
    void eliminar(){
        int fila_seleccionado = TablaDatos.getSelectedRow();
        if(fila_seleccionado==-1){
            JOptionPane.showMessageDialog(null,"Seleccione un registro");
        }else{
           
            try {
                cn = con.getConnection();
                st = cn.createStatement();

                String eli_pago = "DELETE FROM pagos WHERE Id_Alumno = "+ id + " AND Id_Curso = "+id_curso;
                System.out.println(eli_pago);
                st.executeUpdate(eli_pago);
                
                // Primero, ejecuta la inserción en la tabla "pagos"
                String insertPagoSQL = "DELETE FROM cursos WHERE Id_Alumno ="+ id + " AND Id_Curso = "+id_curso;
                System.out.println(insertPagoSQL);
                st.executeUpdate(insertPagoSQL);
                
                
                //String borra = "DELETE FROM alumno WHERE Id="+id;
                //st.executeUpdate(borra);

                JOptionPane.showMessageDialog(null, "Registro eliminado");
                
                limpiaTabla();
                
            } catch (SQLException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error al ejecutar una de las consultas SQL: " + e.getMessage());
            }
        }
    }
    
    public void bloquear(){
        btn_Eliminar.setEnabled(false);
    }
    
    void pdf(){
        // ...

            try {
                FileOutputStream archivo;
                File file = new File("src/pdf/comprobante.pdf");
                archivo = new FileOutputStream(file);
                Document doc = new Document();
                PdfWriter.getInstance(doc, archivo);
                doc.open();

                // Añade la imagen
                Image img = Image.getInstance("src/imagenes/prueba1.jpg");
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
                float[] ColumnaCli = new float[] { 2f, 2f, 2f, 2f };
                tablaCli.setWidths(ColumnaCli);
                tablaCli.setHorizontalAlignment(Element.ALIGN_LEFT);
                PdfPCell cli1 = new PdfPCell(new Phrase("Nombre"));
                PdfPCell cli2 = new PdfPCell(new Phrase("A.Paterno"));
                PdfPCell cli3 = new PdfPCell(new Phrase("A.Materno"));
                PdfPCell cli4 = new PdfPCell(new Phrase("Importe"));
                cli1.setBorder(0);
                cli2.setBorder(0);
                cli3.setBorder(0);
                cli4.setBorder(0);
                tablaCli.addCell(cli1);
                tablaCli.addCell(cli2);
                tablaCli.addCell(cli3);
                tablaCli.addCell(cli4);
                tablaCli.addCell(txt_Nom.getText()+"\n"+"______________________");
                tablaCli.addCell(txt_Pat.getText()+"\n"+"______________________");
                tablaCli.addCell(txt_Mat.getText()+"\n"+"______________________");
                
                doc.add(tablaCli);

                doc.close();
                archivo.close();
                Desktop.getDesktop().open(file);
            } catch (Exception e) {
                e.printStackTrace();
            }

    }
    
    void curso(){
         String Nombre = txt_Nom.getText();
        String A_Paterno = txt_Pat.getText();
        String A_Materno = txt_Mat.getText();
        String Edad = txt_Edad.getText();
        String Telefono_1 = txt_Tel1.getText();
        String Telefono_2 = txt_Tel2.getText();
        int monto = Integer.parseInt(txt_Monto.getText());
        int abono=0;
        String razon = txt_Razon.getText();

        if(Nombre.equals("")|| A_Paterno.equals("")|| A_Materno.equals("")|| Edad.equals("") || Telefono_1.equals("") || Telefono_2.equals("")   || razon.equals("")){
            JOptionPane.showMessageDialog(null, "Faltan rellenar campos");
        }else{
            String sql ="INSERT INTO cursos (Id_Alumno, Nombre, Monto, Abono) VALUES ('"+id+"','"+razon+"','"+monto+"','"+abono+"')";

            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Curso agregado");

                limpiaTabla();
            }catch(Exception e){
            
            }
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDatos;
    private javax.swing.JButton btn_Agregar;
    private javax.swing.JButton btn_Eliminar;
    private javax.swing.JButton btn_Limpiar;
    private javax.swing.JButton btn_Modificar;
    private javax.swing.JButton btn_curso;
    private javax.swing.JButton btn_menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTabbedPane profesores;
    private javax.swing.JTextField txt_Edad;
    private javax.swing.JTextField txt_Escuela;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Mat;
    private javax.swing.JTextField txt_Monto;
    private javax.swing.JTextField txt_Nom;
    private javax.swing.JTextField txt_Pat;
    private javax.swing.JTextField txt_Razon;
    private javax.swing.JTextField txt_Tel1;
    private javax.swing.JTextField txt_Tel2;
    // End of variables declaration//GEN-END:variables
}
