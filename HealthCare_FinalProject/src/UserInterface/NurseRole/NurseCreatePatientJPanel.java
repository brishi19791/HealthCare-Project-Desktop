/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.NurseRole;

import Business.EcoSystem;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.PatientOrganization;
import Business.Person.Patient;
import Business.Roles.PatientRole;
import Business.UserAccount.UserAccount;
import Business.Validation.EmailValidation;
import java.awt.CardLayout;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class NurseCreatePatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NurseCreatePatientJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private HospitalEnterprise hospitalEnterprise;
    EcoSystem system;

    public NurseCreatePatientJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.hospitalEnterprise= (HospitalEnterprise)enterprise;
        this.system=system;
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
        respratejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        heartratejTextField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        sysbpjTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tempjTextField = new javax.swing.JTextField();
        addjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        fnamejTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        lnamejTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        agejTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        cityjTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        phnumjTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        emailidjTextField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        dojjXDatePicker = new org.jdesktop.swingx.JXDatePicker();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        usernamejTextField = new javax.swing.JTextField();
        passwordjTextField = new javax.swing.JTextField();

        jLabel1.setText("Respiratory Rate");

        respratejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respratejTextFieldKeyTyped(evt);
            }
        });

        jLabel2.setText("Heart Rate");

        heartratejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heartratejTextFieldKeyTyped(evt);
            }
        });

        jLabel3.setText("Systolic BP");

        sysbpjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                sysbpjTextFieldKeyTyped(evt);
            }
        });

        jLabel4.setText("Temperature");

        tempjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tempjTextFieldKeyTyped(evt);
            }
        });

        addjButton.setText("Add and Send Request");
        addjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addjButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("First Name");

        fnamejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnamejTextFieldKeyTyped(evt);
            }
        });

        jLabel6.setText("Last Name");

        lnamejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lnamejTextFieldKeyTyped(evt);
            }
        });

        jLabel7.setText("Age");

        agejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                agejTextFieldKeyTyped(evt);
            }
        });

        jLabel8.setText("City");

        cityjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cityjTextFieldKeyTyped(evt);
            }
        });

        jLabel9.setText("Phone Number");

        phnumjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phnumjTextFieldKeyTyped(evt);
            }
        });

        jLabel10.setText("Email ID");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Create Patient");

        jLabel12.setText("Date of Admit");

        jLabel13.setText("Username");

        jLabel14.setText("Password");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cityjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                    .addComponent(agejTextField)
                                    .addComponent(lnamejTextField)
                                    .addComponent(fnamejTextField)
                                    .addComponent(phnumjTextField)
                                    .addComponent(emailidjTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(293, 293, 293)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(addjButton)
                                    .addComponent(jLabel11))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dojjXDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(respratejTextField)
                    .addComponent(heartratejTextField)
                    .addComponent(sysbpjTextField)
                    .addComponent(tempjTextField)
                    .addComponent(usernamejTextField)
                    .addComponent(passwordjTextField))
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(fnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(lnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(heartratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(sysbpjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(dojjXDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(respratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(phnumjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tempjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(emailidjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(usernamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(passwordjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(addjButton)
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addjButtonActionPerformed
         //TODO add your handling code here:
        if (respratejTextField.getText().isEmpty() || heartratejTextField.getText().isEmpty() || sysbpjTextField.getText().isEmpty() || tempjTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all details");
        } else {
            String fname = fnamejTextField.getText();
            String lname = lnamejTextField.getText();
            int age = Integer.parseInt(agejTextField.getText());
            String city = cityjTextField.getText();
            int phnum = Integer.parseInt(phnumjTextField.getText());
            String email = emailidjTextField.getText();
            float resp = Float.parseFloat(respratejTextField.getText());
            float hr = Float.parseFloat(heartratejTextField.getText());
            float sbp = Float.parseFloat(sysbpjTextField.getText());
            float temp = Float.parseFloat(tempjTextField.getText());
            Date doj=dojjXDatePicker.getDate();
            String username=usernamejTextField.getText();
            String password=passwordjTextField.getText();
            if(fname.isEmpty()||lname.isEmpty()||age==0||city.isEmpty()||phnum==0||email.isEmpty()){
                JOptionPane.showMessageDialog(null,"Please enter all patient details");
                return;
            }
            
//            for(Organization org:enterprise.getOrganizationDirectory().getOrganizationList()){
//                if(org instanceof PatientOrganization){
//                    Patient p=org.getEmployeeDirectory().createPatient(fname, lname, email, phnum, age, city);
//                    
//                }
//            }

           //System.out.println(hospitalEnterprise.getPatientList());
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
            boolean status = EmailValidation.validateEmail(email);
            if (status == false||String.valueOf(phnum).length()!=10||String.valueOf(age).length()>2) {
                JOptionPane.showMessageDialog(null, "Please enter valid details");
                return;
            }
//            Date date=new Date();
//            if(!(doj.equals(date.))){
//                JOptionPane.showMessageDialog(null,"Please give today's date");
//                return;
//            }
            Patient p = hospitalEnterprise.getPatientList().createPatient(fname, lname, email, phnum, age, city);
            for (Organization organization : hospitalEnterprise.getOrganizationDirectory().getOrganizationList()) {
                if (organization instanceof PatientOrganization) {
                    
                    organization.getUserAccountDirectory().createUserAccount(username, password, p, new PatientRole());
                }
            }
            
            Encounter encounter = p.getEncounterList().createEncounter();
            encounter.getVitalsign().setHeartrate(hr);
            encounter.getVitalsign().setResprate(resp);
            encounter.getVitalsign().setSysbp(sbp);
            encounter.getVitalsign().setTemp(temp);
            encounter.setDoj(doj);

            //JOptionPane.showMessageDialog(null, "Patient Created Successfully");
            fnamejTextField.setText("");
            lnamejTextField.setText("");
            agejTextField.setText("");
            cityjTextField.setText("");
            phnumjTextField.setText("");
            emailidjTextField.setText("");
            respratejTextField.setText("");
            heartratejTextField.setText("");
            sysbpjTextField.setText("");
            tempjTextField.setText("");
            

            NurseWorkRequestJPanel nwajp = new NurseWorkRequestJPanel(userProcessContainer, account, hospitalEnterprise, p, encounter);
            userProcessContainer.add("NurseWorkAreaJPanel", nwajp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        
    }//GEN-LAST:event_addjButtonActionPerformed

    private void fnamejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnamejTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isLetter(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_fnamejTextFieldKeyTyped

    private void lnamejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnamejTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isLetter(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_lnamejTextFieldKeyTyped

    private void agejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_agejTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_agejTextFieldKeyTyped

    private void cityjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cityjTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isLetter(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_cityjTextFieldKeyTyped

    private void phnumjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phnumjTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_phnumjTextFieldKeyTyped

    private void respratejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respratejTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_respratejTextFieldKeyTyped

    private void heartratejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heartratejTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_heartratejTextFieldKeyTyped

    private void sysbpjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sysbpjTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_sysbpjTextFieldKeyTyped

    private void tempjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tempjTextFieldKeyTyped
        // TODO add your handling code here:
        char ch = evt.getKeyChar();
        if (!(Character.isDigit(ch) || (ch == KeyEvent.VK_BACK_SPACE) || (ch == KeyEvent.VK_DELETE))) {
            evt.consume();
        }
    }//GEN-LAST:event_tempjTextFieldKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JTextField agejTextField;
    private javax.swing.JTextField cityjTextField;
    private org.jdesktop.swingx.JXDatePicker dojjXDatePicker;
    private javax.swing.JTextField emailidjTextField;
    private javax.swing.JTextField fnamejTextField;
    private javax.swing.JTextField heartratejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lnamejTextField;
    private javax.swing.JTextField passwordjTextField;
    private javax.swing.JTextField phnumjTextField;
    private javax.swing.JTextField respratejTextField;
    private javax.swing.JTextField sysbpjTextField;
    private javax.swing.JTextField tempjTextField;
    private javax.swing.JTextField usernamejTextField;
    // End of variables declaration//GEN-END:variables
}