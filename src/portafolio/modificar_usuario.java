/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package portafolio;

import java.awt.Dimension;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Roy
 */
public class modificar_usuario extends javax.swing.JFrame {
 conexion con = Portafolio.conexion;
    /**
     * Creates new form modificar_usuario
     */
    public modificar_usuario() {
        initComponents();
          this.setTitle("Modificar Usuario");
        
        this.setResizable(false);
        //Línea 1
        this.setSize(new Dimension(500, 500));
        
        //Línea 2
        this.setMinimumSize(new Dimension(700, 250));
        this.setLocationRelativeTo(modificar_usuario.this);
        mostrarnombre();
       
        nombre_usuario.setEnabled(false);
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
        nombre_usu = new javax.swing.JComboBox<>();
        nombre_usuario = new javax.swing.JTextField();
        clave = new javax.swing.JPasswordField();
        clave_nueva = new javax.swing.JPasswordField();
        confirmar_clave = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        nombre_usu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(nombre_usu);
        nombre_usu.setBounds(270, 40, 120, 20);

        nombre_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_usuarioActionPerformed(evt);
            }
        });
        nombre_usuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_usuarioKeyTyped(evt);
            }
        });
        getContentPane().add(nombre_usuario);
        nombre_usuario.setBounds(270, 80, 110, 20);

        clave.setEnabled(false);
        getContentPane().add(clave);
        clave.setBounds(270, 110, 110, 20);
        getContentPane().add(clave_nueva);
        clave_nueva.setBounds(270, 140, 110, 20);
        getContentPane().add(confirmar_clave);
        confirmar_clave.setBounds(270, 170, 110, 20);

        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(290, 290, 110, 23);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Clave:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(210, 110, 60, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nueva Clave:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 140, 103, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Confirmar Clave:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(140, 170, 140, 22);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre Usuario:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 40, 140, 22);

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(420, 40, 100, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nuevo Nombre Usuario:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 80, 200, 22);

        jButton3.setText("Limpiar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(440, 290, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagen/Color-fondo-blog.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -20, 870, 580);

        jMenu1.setText("Volver");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Cerrar sesion");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        String pass1 = String.valueOf(clave_nueva.getPassword());
        String pass2 = String.valueOf(confirmar_clave.getPassword());
        
        if ( nombre_usuario.getText().equals("") || clave.getPassword().equals("") || clave_nueva.getPassword().equals("") || confirmar_clave.getPassword().equals("") ){
            JOptionPane.showMessageDialog(rootPane,"No deje campos en blanco");
        } else {
      
        try{
        

         String sql = "update usuario set nombre='"+nombre_usuario.getText()+"' , clave='"+confirmar_clave.getPassword()+"' where nombre='"+nombre_usu.getSelectedItem()+"'";
        
        PreparedStatement ps=con.getConexion().prepareStatement(sql);
            
            //ps.setBinaryStream(4,fis,longitudBytes);
            if(pass1.equals(pass2)){
                 JOptionPane.showMessageDialog(null, "Datos Almacenados Satisfactoriamente"); 
            ps.execute();
            ps.close();
            }else{
                 JOptionPane.showMessageDialog(rootPane,"Error Confirmar Contraseña",
            "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        
        }catch(SQLException | NumberFormatException | HeadlessException x){
            JOptionPane.showMessageDialog(rootPane, "exception 2 "+x);
        }    
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombre_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_usuarioActionPerformed

    public void mostrarnombre(){
         String sql="select nombre from usuario";
          try{
            ResultSet rs = con.ejecutarSQLSelect(sql);
            nombre_usu.removeAllItems();
          
            while (rs.next()){
                
                nombre_usu.addItem(rs.getString(1));
       
            }
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane,"No existe ");
            
        }
        }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      String sql="select usuario.nombre,usuario.clave from usuario,funcionario where usuario.nombre='"+nombre_usu.getSelectedItem()+"'"; 
           String funci;
           String nom_usu;
           String pass;
           String lbl_nom;
            try{
            ResultSet rs = con.ejecutarSQLSelect(sql);
            while (rs.next()){
                
                //funci = rs.getString("funcionario_rut");
               funci =  rs.getString(1);
                nom_usu = rs.getString(2);
                pass = rs.getString(3);
                

                
               nombre_usuario.setText(nom_usu);
               
               
               clave.setText(pass);
            }
            
            
        
        }catch(Exception ex){
            JOptionPane.showMessageDialog(rootPane,"No existe Categoria ingresada"+ex);
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       nombre_usuario.setText("");
      clave.setText("");
      clave_nueva.setText("");
      confirmar_clave.setText("");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
      menu_usuario menu_usuario = new menu_usuario();
        menu_usuario.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void nombre_usuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_usuarioKeyTyped
      if(nombre_usuario.getText().length()>15){
           evt.consume();
           getToolkit().beep();
           JOptionPane.showMessageDialog(rootPane,"solo 15 digitos");
       
        }
    }//GEN-LAST:event_nombre_usuarioKeyTyped

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        inicio inicio = new inicio();
        inicio.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(modificar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(modificar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(modificar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(modificar_usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new modificar_usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField clave;
    private javax.swing.JPasswordField clave_nueva;
    private javax.swing.JPasswordField confirmar_clave;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> nombre_usu;
    private javax.swing.JTextField nombre_usuario;
    // End of variables declaration//GEN-END:variables
}
