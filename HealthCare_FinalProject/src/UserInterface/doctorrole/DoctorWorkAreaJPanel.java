/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.doctorrole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DoctorOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private DoctorOrganization doctorOrganization;
    private Enterprise enterprise;
    private EcoSystem system;
    public DoctorWorkAreaJPanel(JPanel userProcessContainer,UserAccount account,DoctorOrganization doctorOrganization,Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.doctorOrganization=doctorOrganization;
        this.enterprise=enterprise;
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
        viewpatientjButton = new javax.swing.JButton();
        managereferedjButton = new javax.swing.JButton();
        raiseemergencyjButton = new javax.swing.JButton();
        manageemergencyjButton = new javax.swing.JButton();
        manageadversejButton = new javax.swing.JButton();
        viewadversejButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Doctor Work Area");

        viewpatientjButton.setText("View Patient");
        viewpatientjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewpatientjButtonActionPerformed(evt);
            }
        });

        managereferedjButton.setText("Manage Refered Work Requests");
        managereferedjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managereferedjButtonActionPerformed(evt);
            }
        });

        raiseemergencyjButton.setText("Raise Emergency Request");
        raiseemergencyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raiseemergencyjButtonActionPerformed(evt);
            }
        });

        manageemergencyjButton.setText("Manage Emergency Request");
        manageemergencyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageemergencyjButtonActionPerformed(evt);
            }
        });

        manageadversejButton.setText("Raise Adverse Event");
        manageadversejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageadversejButtonActionPerformed(evt);
            }
        });

        viewadversejButton.setText("View Adverse Events");
        viewadversejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewadversejButtonActionPerformed(evt);
            }
        });

        jButton1.setText("View Patient's Feedback");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(raiseemergencyjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageemergencyjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(managereferedjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewpatientjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(manageadversejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewadversejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(manageemergencyjButton)
                .addGap(18, 18, 18)
                .addComponent(raiseemergencyjButton)
                .addGap(18, 18, 18)
                .addComponent(managereferedjButton)
                .addGap(18, 18, 18)
                .addComponent(viewpatientjButton)
                .addGap(18, 18, 18)
                .addComponent(manageadversejButton)
                .addGap(18, 18, 18)
                .addComponent(viewadversejButton)
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void viewpatientjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewpatientjButtonActionPerformed
        // TODO add your handling code here:
         ViewPatientJPanel vpjp = new ViewPatientJPanel(userProcessContainer, account,doctorOrganization,enterprise,system);
        userProcessContainer.add("ViewPatientJPanel", vpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewpatientjButtonActionPerformed

    private void managereferedjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managereferedjButtonActionPerformed
        // TODO add your handling code here:
        ManageReferedWorkRequestsJPanel mrwrjp = new ManageReferedWorkRequestsJPanel(userProcessContainer, account,doctorOrganization,enterprise,system);
        userProcessContainer.add("ManageReferedWorkRequestsJPanel", mrwrjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_managereferedjButtonActionPerformed

    private void raiseemergencyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raiseemergencyjButtonActionPerformed
        // TODO add your handling code here:
        DoctorEmergencyRequestJPanel derjp = new DoctorEmergencyRequestJPanel(userProcessContainer, account,enterprise,system);
        userProcessContainer.add("DoctorEmergencyRequestJPanel", derjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_raiseemergencyjButtonActionPerformed

    private void manageemergencyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageemergencyjButtonActionPerformed
        // TODO add your handling code here:
        ManageEmergencyRequestJPanel merjp = new ManageEmergencyRequestJPanel(userProcessContainer, account,doctorOrganization,enterprise,system);
        userProcessContainer.add("ManageEmergencyRequestJPanel", merjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageemergencyjButtonActionPerformed

    private void manageadversejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageadversejButtonActionPerformed
        // TODO add your handling code here:
         RaiseAdverseEventJPanel maejp = new RaiseAdverseEventJPanel(userProcessContainer, account,enterprise,system);
        userProcessContainer.add("ManageAdverseEventJPanel", maejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageadversejButtonActionPerformed

    private void viewadversejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewadversejButtonActionPerformed
        // TODO add your handling code here:
        ViewAdverseEventsJPanel vaejp = new ViewAdverseEventsJPanel(userProcessContainer, account,doctorOrganization,enterprise,system);
        userProcessContainer.add("ViewAdverseEventsJPanel", vaejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_viewadversejButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         ViewPatientFeedBackJPanel vaejp = new ViewPatientFeedBackJPanel(userProcessContainer, account,enterprise,system);
        userProcessContainer.add("ViewPatientFeedBackJPanel", vaejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageadversejButton;
    private javax.swing.JButton manageemergencyjButton;
    private javax.swing.JButton managereferedjButton;
    private javax.swing.JButton raiseemergencyjButton;
    private javax.swing.JButton viewadversejButton;
    private javax.swing.JButton viewpatientjButton;
    // End of variables declaration//GEN-END:variables
}