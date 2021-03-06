/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.doctorrole;

import Business.EcoSystem;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorEmergencyWorkRequest;
import Business.WorkQueue.WorkRequest;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ManageEmergencyRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmergencyRequestJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private HospitalEnterprise hospitalEnterprise;
    private EcoSystem system;
    private DoctorOrganization doctorOrganization;

    public ManageEmergencyRequestJPanel(JPanel userProcessContainer, UserAccount account, DoctorOrganization doctorOrganization, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.hospitalEnterprise = (HospitalEnterprise) enterprise;
        this.system = system;
        this.doctorOrganization = doctorOrganization;
        populate();
    }

    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel) emergencyjTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest request : doctorOrganization.getWorkQueue().getWorkRequestList()) {
            if (request instanceof DoctorEmergencyWorkRequest) {
                Object[] row = new Object[5];
                DoctorEmergencyWorkRequest req = (DoctorEmergencyWorkRequest) request;
                row[0] = req;
                row[1] = req.getLname();
                row[2] = req.getSender();
                //row[3]=req.getReceiver();
                row[3] = req.getStatus();
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
        emergencyjTable = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        sendjButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        emergencyjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Sender", "Status"
            }
        ));
        jScrollPane1.setViewportView(emergencyjTable);

        jButton1.setText("Assign To ME");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        sendjButton.setText("Send");
        sendjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendjButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Emergency Requests");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(sendjButton)
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addGap(168, 168, 168))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(jButton3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(sendjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(59, 59, 59))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = emergencyjTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Work Request");
            return;
        }

        DoctorEmergencyWorkRequest request = (DoctorEmergencyWorkRequest) emergencyjTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equals("Patient found")) {
            JOptionPane.showMessageDialog(null, "Patient found already");
            return;
        }
        request.setReceiver(account);
        //request.setStatus("Pending");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void sendjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = emergencyjTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Work Request");
        }
        DoctorEmergencyWorkRequest request = (DoctorEmergencyWorkRequest) emergencyjTable.getValueAt(selectedRow, 0);
        String status;
        if (request.getStatus().equals("Awaiting")) {
//            JOptionPane.showMessageDialog(null, "Please accept the request first");
//            return;
            for (Patient p : hospitalEnterprise.getPatientList().getPatientList()) {

                if (p.getFname().equals(request.getFname()) && p.getLname().equals(request.getLname())) {
                    request.setPatient(p);
                    status = "Patient found";

                } else {
                    status = "Patient not found";
                }
                if (request.getPatient() != null) {
                    request.setStatus(status);
                }

            }
        }else if(request.getStatus().equals("Patient found")){
            JOptionPane.showMessageDialog(null,"Patient found already");
            return;
        }
      
    }//GEN-LAST:event_sendjButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable emergencyjTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton sendjButton;
    // End of variables declaration//GEN-END:variables
}
