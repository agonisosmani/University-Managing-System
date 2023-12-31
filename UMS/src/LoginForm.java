
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
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
        jlbl1 = new java.awt.Label();
        jlbl2 = new javax.swing.JLabel();
        jlbl3 = new javax.swing.JLabel();
        jbtnAdmin = new java.awt.Button();
        jbtnManagement = new java.awt.Button();
        jbtnStudent = new java.awt.Button();
        jlblNewUs = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LoginAs");
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 153, 0));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jlbl1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlbl1.setForeground(new java.awt.Color(255, 255, 255));
        jlbl1.setText("Login As: ");

        jlbl2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jlbl2.setForeground(new java.awt.Color(255, 255, 255));
        jlbl2.setText("-");
        jlbl2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl2MouseClicked(evt);
            }
        });

        jlbl3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlbl3.setForeground(new java.awt.Color(255, 255, 255));
        jlbl3.setText("X");
        jlbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlbl3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jlbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbl2)
                .addGap(18, 18, 18)
                .addComponent(jlbl3)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jlbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlbl3)
                    .addComponent(jlbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jbtnAdmin.setActionCommand("jbtnAdmin");
        jbtnAdmin.setBackground(new java.awt.Color(0, 0, 204));
        jbtnAdmin.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbtnAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jbtnAdmin.setLabel("Admin");
        jbtnAdmin.setName("Admin"); // NOI18N
        jbtnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAdminActionPerformed(evt);
            }
        });

        jbtnManagement.setBackground(new java.awt.Color(102, 0, 0));
        jbtnManagement.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnManagement.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbtnManagement.setForeground(new java.awt.Color(255, 255, 255));
        jbtnManagement.setLabel("Management");
        jbtnManagement.setName("Management"); // NOI18N
        jbtnManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnManagementActionPerformed(evt);
            }
        });

        jbtnStudent.setBackground(new java.awt.Color(0, 153, 0));
        jbtnStudent.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jbtnStudent.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jbtnStudent.setForeground(new java.awt.Color(255, 255, 255));
        jbtnStudent.setLabel("Student");
        jbtnStudent.setName("Student"); // NOI18N
        jbtnStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnStudentActionPerformed(evt);
            }
        });

        jlblNewUs.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jlblNewUs.setForeground(new java.awt.Color(51, 153, 255));
        jlblNewUs.setText("New user in platform...");
        jlblNewUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jlblNewUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlblNewUsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbtnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jbtnManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jbtnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlblNewUs, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jlblNewUs)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jlblNewUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlblNewUsMouseClicked
        NewUser s = new NewUser();
                   this.hide();
                   s.setVisible(true);
    }//GEN-LAST:event_jlblNewUsMouseClicked

    private void jbtnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAdminActionPerformed
       Login i = new Login();
                   this.hide();
                   i.setVisible(true);
    }//GEN-LAST:event_jbtnAdminActionPerformed

    private void jbtnManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnManagementActionPerformed
        Login i = new Login();
                   this.hide();
                   i.setVisible(true);
    }//GEN-LAST:event_jbtnManagementActionPerformed

    private void jbtnStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnStudentActionPerformed
        Login i = new Login();
                   this.hide();
                   i.setVisible(true);
    }//GEN-LAST:event_jbtnStudentActionPerformed

    private void jlbl2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jlbl2MouseClicked

    private void jlbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlbl3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jlbl3MouseClicked

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private java.awt.Button jbtnAdmin;
    private java.awt.Button jbtnManagement;
    private java.awt.Button jbtnStudent;
    private java.awt.Label jlbl1;
    private javax.swing.JLabel jlbl2;
    private javax.swing.JLabel jlbl3;
    private javax.swing.JLabel jlblNewUs;
    // End of variables declaration//GEN-END:variables

    private void stateState(int ICONIFIED) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
