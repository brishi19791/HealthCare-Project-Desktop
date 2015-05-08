/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.DrugQualityAnalystRole;

import Business.EcoSystem;
import Business.Enterprise.DrugCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.QualityAnalystOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.AdverseEventWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ManageDoctorEventsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDoctorEventsJPanel
     */
       private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private QualityAnalystOrganization qao;
    public ManageDoctorEventsJPanel(JPanel userProcessContainer, UserAccount account, QualityAnalystOrganization qao, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.qao = qao;
        populateTable();
    }
    
     public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) adversejTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest request : qao.getWorkQueue().getWorkRequestList()) {
            if (request instanceof AdverseEventWorkRequest) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver();
                row[3] = request.getStatus();
                AdverseEventWorkRequest req = (AdverseEventWorkRequest) request;
                row[4] = req.getDrug().getDrugName();
                row[5] = req.getDrugCompany().getName();
                dtm.addRow(row);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        adversejTable = new javax.swing.JTable();
        assignjButton = new javax.swing.JButton();
        backJButton3 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        notifyjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        adversejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Message", "Doctor Name", "QA Name", "Status", "Drug Name", "Drug Compnay"
            }
        ));
        jScrollPane1.setViewportView(adversejTable);

        assignjButton.setText("Assign To Me");
        assignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButtonActionPerformed(evt);
            }
        });

        backJButton3.setText("<< Back");
        backJButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton3ActionPerformed(evt);
            }
        });

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        notifyjButton.setText("Call Back");
        notifyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notifyjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Adverse Events Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(notifyjButton)
                        .addGap(107, 107, 107)
                        .addComponent(assignjButton)
                        .addGap(46, 46, 46)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addComponent(backJButton3)
                    .addContainerGap(575, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notifyjButton)
                    .addComponent(assignjButton)
                    .addComponent(jButton3))
                .addGap(115, 115, 115))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(293, Short.MAX_VALUE)
                    .addComponent(backJButton3)
                    .addContainerGap()))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = adversejTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Work Request");
        }
        AdverseEventWorkRequest request = (AdverseEventWorkRequest) adversejTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Pending")){
            JOptionPane.showMessageDialog(null,"Work Request taken up by others");
            return;
        }else if(request.getStatus().equals("Drug Called Back")){
            JOptionPane.showMessageDialog(null,"Drug already called back!!");
            return;
        }
        request.setReceiver(account);
        request.setStatus("Pending");
    }//GEN-LAST:event_assignjButtonActionPerformed

    private void backJButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton3ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void notifyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notifyjButtonActionPerformed
        // TODO add your handling code here:

        int selectedRow = adversejTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row");
        }
        AdverseEventWorkRequest request = (AdverseEventWorkRequest) adversejTable.getValueAt(selectedRow, 0);
        //request.setMessage(message);
        if (request.getStatus().equals("Pending")&&(request.getReceiver().equals(account))) {
            NotificationJPanel njp = new NotificationJPanel(userProcessContainer, account, qao, enterprise, system, request);
            userProcessContainer.add("NotificationJPanel", njp);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        } else if (request.getStatus().equals("Drug Called Back")) {
            JOptionPane.showMessageDialog(null, "Drug already called back");
        } else {
            JOptionPane.showMessageDialog(null, "Please Accept the work Request");
        }
        //
        //        request.setSender(account);
        //        request.setStatus("Called Back");
        //        Organization org = null;
        //        for (Network network : system.getNetworkList()) {
            //            for (Enterprise e : network.getEnterpriseDirectory().getEnterpriseList()) {
                //                if ((e instanceof HospitalEnterprise) || (e instanceof PharmacyEnterprise)) {
                    //                    for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                        //                        if ((o instanceof DoctorOrganization) || (o instanceof PharmacistOrganization)) {
                            //                            org = o;
                            //                            break;
                            //                        }
                        //                    }
                    //                    if (org != null) {
                        //                        org.getWorkQueue().getWorkRequestList().add(request);
                        //
                        //                    }
                    //
                    //                }
                //            }
            //        }
        //        account.getWorkQueue().getWorkRequestList().add(request);
    }//GEN-LAST:event_notifyjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable adversejTable;
    private javax.swing.JButton assignjButton;
    private javax.swing.JButton backJButton3;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton notifyjButton;
    // End of variables declaration//GEN-END:variables
}
