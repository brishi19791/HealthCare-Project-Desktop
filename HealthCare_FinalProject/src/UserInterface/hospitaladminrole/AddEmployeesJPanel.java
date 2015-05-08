/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.hospitaladminrole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.LabOrganization;
import Business.Organization.NurseOrganization;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Organization.ReceptionOrganization;
import Business.Person.Person;
import Business.Roles.LabRole;
import Business.Roles.NurseRole;
import Business.Roles.ReceptionistRole;
import Business.UserAccount.UserAccount;
import Business.Validation.EmailValidation;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class AddEmployeesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddEmployeesJPanel
     */
    private JPanel userProcessContainer;
    private OrganizationDirectory organizationDirectory;
    EcoSystem system;

    public AddEmployeesJPanel(JPanel userProcessContainer, OrganizationDirectory organizationDirectory,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organizationDirectory = organizationDirectory;
        this.system=system;
        populatecombo();
    }

    public void populatecombo() {
        orgjComboBox.removeAllItems();
        for (Organization organization : organizationDirectory.getOrganizationList()) {
            if ((organization instanceof LabOrganization) || (organization instanceof NurseOrganization) || (organization instanceof ReceptionOrganization)) {
                orgjComboBox.addItem(organization);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        phnumjTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        emailidjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cityjTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        orgjComboBox = new javax.swing.JComboBox();
        createjButton = new javax.swing.JButton();
        createpatientjLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        usernamejTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwordjTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();

        jLabel1.setText("Name");

        namejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                namejTextFieldKeyTyped(evt);
            }
        });

        jLabel2.setText("Phone Number");

        phnumjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phnumjTextFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Email ID");

        jLabel4.setText("City");

        cityjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityjTextFieldKeyTyped(evt);
            }
        });

        jLabel5.setText("Employee Type");

        orgjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        orgjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgjComboBoxActionPerformed(evt);
            }
        });

        createjButton.setText("Create");
        createjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createjButtonActionPerformed(evt);
            }
        });

        createpatientjLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        createpatientjLabel.setText("Create Employees");

        jLabel6.setText("UserName");

        usernamejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernamejTextFieldKeyTyped(evt);
            }
        });

        jLabel7.setText("Password");

        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(namejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                    .addComponent(phnumjTextField)
                                    .addComponent(emailidjTextField)
                                    .addComponent(cityjTextField)
                                    .addComponent(orgjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(usernamejTextField)
                                    .addComponent(passwordjTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(createpatientjLabel))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton)
                        .addGap(85, 85, 85)
                        .addComponent(createjButton)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createpatientjLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(phnumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(emailidjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(orgjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(usernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(createjButton)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backJButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createjButtonActionPerformed
        // TODO add your handling code here:
        String name = namejTextField.getText();
        String city = cityjTextField.getText();
        int num = Integer.parseInt(phnumjTextField.getText());
        String email = emailidjTextField.getText();
        String username = usernamejTextField.getText();
        String password = passwordjTextField.getText();
        Organization org = (Organization) orgjComboBox.getSelectedItem();
        if(name.isEmpty()||city.isEmpty()||num==0||email.isEmpty()||username.isEmpty()||password.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter all details");
            return;
        }
        boolean status = EmailValidation.validateEmail(email);
        if (status == false || String.valueOf(num).length()!=10) {
            JOptionPane.showMessageDialog(null, "Please enter valid details");
            return;
        }
        
        for(Network network:system.getNetworkList()){
                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                     for(Organization o:enterprise.getOrganizationDirectory().getOrganizationList()){
                       for(UserAccount ua:o.getUserAccountDirectory().getUserAccountList()){
                           if(ua.getUsername().equals(username)){
                               JOptionPane.showMessageDialog(null, "A user with same username already exists");
                               return;
                           }
                       }
                    }
                }
            }

         
        if (org instanceof LabOrganization) {
            Person person = org.getEmployeeDirectory().createLabAssistant(name, city, email, num);
            org.getUserAccountDirectory().createUserAccount(username, password, person, new LabRole());

        } else if (org instanceof NurseOrganization) {
            Person person = org.getEmployeeDirectory().createNurse(name, city, email, num);
            org.getUserAccountDirectory().createUserAccount(username, password, person, new NurseRole());
        } else if (org instanceof ReceptionOrganization) {
            Person person = org.getEmployeeDirectory().createReceptionist(name, city, email, num);
            org.getUserAccountDirectory().createUserAccount(username, password, person, new ReceptionistRole());
        }
       


    }//GEN-LAST:event_createjButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void orgjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgjComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgjComboBoxActionPerformed

    private void namejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_namejTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isLetter(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_namejTextFieldKeyTyped

    private void phnumjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phnumjTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_phnumjTextFieldKeyTyped

    private void cityjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityjTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isLetter(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_cityjTextFieldKeyTyped

    private void usernamejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_usernamejTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) ||Character.isLetter(ch)||(ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_usernamejTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField cityjTextField;
    private javax.swing.JButton createjButton;
    private javax.swing.JLabel createpatientjLabel;
    private javax.swing.JTextField emailidjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JComboBox orgjComboBox;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JTextField phnumjTextField;
    private javax.swing.JTextField usernamejTextField;
    // End of variables declaration//GEN-END:variables
}
