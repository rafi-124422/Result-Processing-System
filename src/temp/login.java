/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package temp;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



import javax.swing.JOptionPane;

/**
 *
 * @author rafi-iut
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
   int number;
    public login(int i) {
        initComponents();
        number = i;
        if(number==1)
             login_page_title_label.setText("Admin Login");
        if(number==2)
             login_page_title_label.setText("Student Login");
        if(number==3)
             login_page_title_label.setText("Teacher Login");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        password_label = new javax.swing.JLabel();
        id_label = new javax.swing.JLabel();
        id_textField = new javax.swing.JTextField();
        password_textField = new javax.swing.JPasswordField();
        login_button = new javax.swing.JButton();
        login_page_title_label = new javax.swing.JLabel();
        back_button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        password_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        password_label.setText("Password");

        id_label.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id_label.setText("ID           ");

        id_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        id_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_textFieldActionPerformed(evt);
            }
        });

        password_textField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        password_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                password_textFieldActionPerformed(evt);
            }
        });

        login_button.setText("Login");
        login_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                login_buttonActionPerformed(evt);
            }
        });

        login_page_title_label.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        back_button.setText("Back");
        back_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_buttonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/temp/27173100-grunge-rubber-stamp-with-text-password-required-vector-illustration.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(login_page_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(id_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(id_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(password_label, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back_button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(login_page_title_label, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(id_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(password_label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(password_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(login_button, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_textFieldActionPerformed

    private void password_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_password_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_password_textFieldActionPerformed

    private void login_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_login_buttonActionPerformed
        // TODO add your handling code here:
        String id,password;
        id = id_textField.getText();
        password = password_textField.getText();
        if(number==1)
        {
            
             if(id.equals("admin")&&password.equals("123"))
                    {
                     
                        JOptionPane.showMessageDialog(this,"login successful");
                        new admin_view().setVisible(true);
                        dispose();
                    }
             else JOptionPane.showMessageDialog(this,"wrong id or password");
            
        }
        if(number==2)
        {
            try
            {
           
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = null;
            try {
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","124422");
                Statement state = con.createStatement();
                String query= "Select * from student";
                ResultSet result=state.executeQuery(query);
                int f=0;
                String i,n,p,d;
                 while(result.next())
                 {
                    
                      i = result.getString("studentid");
                      n = result.getString("name");
                      d = result.getString("DepartmentName");
                      p = result.getString("password");
                     
                     
                    if(id.equals(i)&&password.equals(p))
                    {
                        f=1;
                        JOptionPane.showMessageDialog(this,"login successful");
                        new student_view(n,d,i).setVisible(true);
                        dispose();
                    }
                    
                }
                 if(f==0)
                 {
                      JOptionPane.showMessageDialog(this,"wrong id or password");
                 }
                 result.close();
                
                
		} 
            catch (SQLException e) 
            {
			// TODO Auto-generated catch block
                    JOptionPane.showMessageDialog(this,"error connect in query");
			e.printStackTrace();
            }       
        }
        catch(ClassNotFoundException e)
        {
             JOptionPane.showMessageDialog(this,"error ");
        }
            
        }   
        if(number==3)
        {
            try
            {
           
            Class.forName("oracle.jdbc.OracleDriver");
            Connection con = null;
            try {
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","124422");
                Statement state = con.createStatement();
                String query= "Select * from teacher";
                ResultSet result=state.executeQuery(query);
                int f=0;
                String i,n,p;
                 while(result.next())
                 {
                    
                      i = result.getString("teacherId");
                      n = result.getString("name");
                      p = result.getString("password");
                     
                     
                    if(id.equals(i)&&password.equals(p))
                    {
                        f=1;
                        JOptionPane.showMessageDialog(this,"login successful");
                        new teacher_view(n,i).setVisible(true);
                        dispose();
                    }
                    
                }
                if(f==0)
                {
                      JOptionPane.showMessageDialog(this,"wrong id or password");
                }
                 result.close();
                
                
		} 
            catch (SQLException e) 
            {
			// TODO Auto-generated catch block
                    JOptionPane.showMessageDialog(this,"error connect in query");
			e.printStackTrace();
            }       
        }
        catch(ClassNotFoundException e)
        {
             JOptionPane.showMessageDialog(this,"error ");
        }
            
        }    
        
    }//GEN-LAST:event_login_buttonActionPerformed

    private void back_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_buttonActionPerformed
        // TODO add your handling code here:
        dispose();
        new home().setVisible(true);
    }//GEN-LAST:event_back_buttonActionPerformed
    
     
    
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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back_button;
    private javax.swing.JLabel id_label;
    private javax.swing.JTextField id_textField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton login_button;
    private javax.swing.JLabel login_page_title_label;
    private javax.swing.JLabel password_label;
    private javax.swing.JPasswordField password_textField;
    // End of variables declaration//GEN-END:variables
}
