/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import javax.swing.JFrame;

/**
 *
 * @author Abdelatief
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    
    public LoginForm() 
    {
        initComponents();
        setResizable(false);
        AdminCheckbox.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        AuthinticationCardLayout = new javax.swing.JPanel();
        loginPanel = new javax.swing.JPanel();
        CardLayoutPanel = new javax.swing.JPanel();
        AdminPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        UsernameTextfield = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        PasswordTextfield = new javax.swing.JPasswordField();
        OfficerPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        IdTextField = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        AdminCheckbox = new javax.swing.JCheckBox();
        Officer = new javax.swing.JCheckBox();
        LoginButton = new javax.swing.JButton();
        OfficersButtonsPanel = new javax.swing.JPanel();
        LoginButton6 = new javax.swing.JButton();
        LoginButton7 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        AdminButtonsPanel = new javax.swing.JPanel();
        LoginButton1 = new javax.swing.JButton();
        LoginButton2 = new javax.swing.JButton();
        LoginButton3 = new javax.swing.JButton();
        LoginButton4 = new javax.swing.JButton();
        LoginButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 40, 89));

        jPanel1.setBackground(new java.awt.Color(0, 40, 89));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/logo.jpg"))); // NOI18N

        AuthinticationCardLayout.setLayout(new java.awt.CardLayout());

        loginPanel.setBackground(new java.awt.Color(0, 40, 89));

        CardLayoutPanel.setLayout(new java.awt.CardLayout());

        AdminPanel.setBackground(new java.awt.Color(0, 40, 89));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 120, 187));
        jLabel1.setText("Password");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 120, 187));
        jLabel2.setText("Username");

        jSeparator1.setBackground(new java.awt.Color(0, 120, 187));
        jSeparator1.setForeground(new java.awt.Color(0, 120, 187));

        UsernameTextfield.setBackground(new java.awt.Color(0, 40, 89));
        UsernameTextfield.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        UsernameTextfield.setForeground(new java.awt.Color(255, 255, 255));
        UsernameTextfield.setBorder(null);

        jSeparator2.setBackground(new java.awt.Color(0, 120, 187));
        jSeparator2.setForeground(new java.awt.Color(0, 120, 187));

        PasswordTextfield.setBackground(new java.awt.Color(0, 40, 89));
        PasswordTextfield.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        PasswordTextfield.setForeground(new java.awt.Color(255, 255, 255));
        PasswordTextfield.setBorder(null);

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                    .addComponent(UsernameTextfield)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1)
                    .addComponent(PasswordTextfield))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(UsernameTextfield)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(PasswordTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        CardLayoutPanel.add(AdminPanel, "card2");

        OfficerPanel.setBackground(new java.awt.Color(0, 40, 89));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 120, 187));
        jLabel3.setText("ID");

        IdTextField.setBackground(new java.awt.Color(0, 40, 89));
        IdTextField.setFont(new java.awt.Font("Century Gothic", 0, 26)); // NOI18N
        IdTextField.setForeground(new java.awt.Color(255, 255, 255));
        IdTextField.setBorder(null);
        IdTextField.setMaximumSize(new java.awt.Dimension(0, 33));

        jSeparator3.setBackground(new java.awt.Color(0, 120, 187));
        jSeparator3.setForeground(new java.awt.Color(0, 120, 187));

        javax.swing.GroupLayout OfficerPanelLayout = new javax.swing.GroupLayout(OfficerPanel);
        OfficerPanel.setLayout(OfficerPanelLayout);
        OfficerPanelLayout.setHorizontalGroup(
            OfficerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OfficerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(OfficerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(IdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        OfficerPanelLayout.setVerticalGroup(
            OfficerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OfficerPanelLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IdTextField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        CardLayoutPanel.add(OfficerPanel, "card3");

        AdminCheckbox.setBackground(new java.awt.Color(0, 40, 89));
        buttonGroup1.add(AdminCheckbox);
        AdminCheckbox.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        AdminCheckbox.setForeground(new java.awt.Color(0, 120, 187));
        AdminCheckbox.setText("Admin");
        AdminCheckbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminCheckboxActionPerformed(evt);
            }
        });

        Officer.setBackground(new java.awt.Color(0, 40, 89));
        buttonGroup1.add(Officer);
        Officer.setFont(new java.awt.Font("Century", 0, 24)); // NOI18N
        Officer.setForeground(new java.awt.Color(0, 120, 187));
        Officer.setText("Officer");
        Officer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OfficerActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(0, 59, 115));
        LoginButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Log In");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(AdminCheckbox, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(Officer))
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(78, Short.MAX_VALUE))
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(CardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(17, Short.MAX_VALUE)))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AdminCheckbox)
                    .addComponent(Officer))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 324, Short.MAX_VALUE)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(loginPanelLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(CardLayoutPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(103, Short.MAX_VALUE)))
        );

        AuthinticationCardLayout.add(loginPanel, "card2");

        OfficersButtonsPanel.setBackground(new java.awt.Color(0, 40, 89));

        LoginButton6.setBackground(new java.awt.Color(0, 59, 115));
        LoginButton6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        LoginButton6.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton6.setText("Cases");
        LoginButton6.setToolTipText("");

        LoginButton7.setBackground(new java.awt.Color(0, 59, 115));
        LoginButton7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        LoginButton7.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton7.setText("Criminals");

        backButton.setBackground(new java.awt.Color(0, 59, 115));
        backButton.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        backButton.setForeground(new java.awt.Color(255, 255, 255));
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OfficersButtonsPanelLayout = new javax.swing.GroupLayout(OfficersButtonsPanel);
        OfficersButtonsPanel.setLayout(OfficersButtonsPanelLayout);
        OfficersButtonsPanelLayout.setHorizontalGroup(
            OfficersButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OfficersButtonsPanelLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(OfficersButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        OfficersButtonsPanelLayout.setVerticalGroup(
            OfficersButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OfficersButtonsPanelLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(LoginButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(LoginButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        AuthinticationCardLayout.add(OfficersButtonsPanel, "card4");

        AdminButtonsPanel.setBackground(new java.awt.Color(0, 40, 89));

        LoginButton1.setBackground(new java.awt.Color(0, 59, 115));
        LoginButton1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        LoginButton1.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton1.setText("Cases");
        LoginButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton1ActionPerformed(evt);
            }
        });

        LoginButton2.setBackground(new java.awt.Color(0, 59, 115));
        LoginButton2.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        LoginButton2.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton2.setText("Police Officers");

        LoginButton3.setBackground(new java.awt.Color(0, 59, 115));
        LoginButton3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        LoginButton3.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton3.setText("Back");
        LoginButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButton3ActionPerformed(evt);
            }
        });

        LoginButton4.setBackground(new java.awt.Color(0, 59, 115));
        LoginButton4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        LoginButton4.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton4.setText("Departments");

        LoginButton5.setBackground(new java.awt.Color(0, 59, 115));
        LoginButton5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        LoginButton5.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton5.setText("Criminals");

        javax.swing.GroupLayout AdminButtonsPanelLayout = new javax.swing.GroupLayout(AdminButtonsPanel);
        AdminButtonsPanel.setLayout(AdminButtonsPanelLayout);
        AdminButtonsPanelLayout.setHorizontalGroup(
            AdminButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminButtonsPanelLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(AdminButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LoginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        AdminButtonsPanelLayout.setVerticalGroup(
            AdminButtonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminButtonsPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(LoginButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(LoginButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(LoginButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        AuthinticationCardLayout.add(AdminButtonsPanel, "card3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(logo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(AuthinticationCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(logo)
                .addGap(3, 3, 3)
                .addComponent(AuthinticationCardLayout, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminCheckboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminCheckboxActionPerformed
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(AdminPanel);
        CardLayoutPanel.repaint();
        CardLayoutPanel.revalidate();
        UsernameTextfield.setText("");
        PasswordTextfield.setText("");
    }//GEN-LAST:event_AdminCheckboxActionPerformed

    private void OfficerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OfficerActionPerformed
        CardLayoutPanel.removeAll();
        CardLayoutPanel.add(OfficerPanel);
        CardLayoutPanel.repaint();
        CardLayoutPanel.revalidate();
        IdTextField.setText("");
    }//GEN-LAST:event_OfficerActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        if (AdminCheckbox.isSelected())
        {
            //put the admin log in condition here
            AuthinticationCardLayout.removeAll();
            AuthinticationCardLayout.add(AdminButtonsPanel);
            AuthinticationCardLayout.repaint();
            AuthinticationCardLayout.revalidate();
        }
        
        else
        {
            //put the officer log in condition here
            AuthinticationCardLayout.removeAll();
            AuthinticationCardLayout.add(OfficersButtonsPanel);
            AuthinticationCardLayout.repaint();
            AuthinticationCardLayout.revalidate();
        }
    }//GEN-LAST:event_LoginButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        AuthinticationCardLayout.removeAll();
        AuthinticationCardLayout.add(loginPanel);
        AuthinticationCardLayout.repaint();
        AuthinticationCardLayout.revalidate();
        UsernameTextfield.setText("");
        PasswordTextfield.setText("");
        IdTextField.setText("");
    }//GEN-LAST:event_backButtonActionPerformed

    private void LoginButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton3ActionPerformed
        AuthinticationCardLayout.removeAll();
        AuthinticationCardLayout.add(loginPanel);
        AuthinticationCardLayout.repaint();
        AuthinticationCardLayout.revalidate();
        UsernameTextfield.setText("");
        PasswordTextfield.setText("");
        IdTextField.setText("");
    }//GEN-LAST:event_LoginButton3ActionPerformed

    private void LoginButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButton1ActionPerformed
        JFrame caseForm = new CaseManagementForm();
        caseForm.show();
    }//GEN-LAST:event_LoginButton1ActionPerformed

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
    private javax.swing.JPanel AdminButtonsPanel;
    private javax.swing.JCheckBox AdminCheckbox;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel AuthinticationCardLayout;
    private javax.swing.JPanel CardLayoutPanel;
    private javax.swing.JTextField IdTextField;
    private javax.swing.JButton LoginButton;
    private javax.swing.JButton LoginButton1;
    private javax.swing.JButton LoginButton2;
    private javax.swing.JButton LoginButton3;
    private javax.swing.JButton LoginButton4;
    private javax.swing.JButton LoginButton5;
    private javax.swing.JButton LoginButton6;
    private javax.swing.JButton LoginButton7;
    private javax.swing.JCheckBox Officer;
    private javax.swing.JPanel OfficerPanel;
    private javax.swing.JPanel OfficersButtonsPanel;
    private javax.swing.JPasswordField PasswordTextfield;
    private javax.swing.JTextField UsernameTextfield;
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
