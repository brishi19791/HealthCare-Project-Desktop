/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.doctorrole;

import Business.EcoSystem;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorEmergencyWorkRequest;
import Business.WorkQueue.NurseWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class ViewSearchPatientPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewSearchPatientPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private DoctorEmergencyWorkRequest request;
    private Encounter encounter;

    public ViewSearchPatientPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system, DoctorEmergencyWorkRequest request, Encounter encounter) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.request = request;
        this.encounter = encounter;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) patientdetailsjTable.getModel();
        dtm.setRowCount(0);
        try {
            for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
                if (request instanceof DoctorEmergencyWorkRequest) {
                    Object[] row = new Object[6];
                    DoctorEmergencyWorkRequest req = (DoctorEmergencyWorkRequest) request;
                    System.out.println(req);
                    System.out.println(req.getPatient());

                    row[0] = req;
                    row[1] = req.getPatient().getLname();
                    row[2] = req.getPatient().getAge();
                    row[3] = req.getPatient().getCity();
                    row[4] = req.getPatient().getNum();
                    row[5] = req.getPatient().getEmail();
                    dtm.addRow(row);
                }
            }
        } catch (Exception e) {

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

        backJButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        referjButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        viewencounterhisjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        patientdetailsjTable = new javax.swing.JTable();

        backJButton4.setText("<< Back");
        backJButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButton4ActionPerformed(evt);
            }
        });

        jButton2.setText("Medical Prescription ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        referjButton.setText("Refer To a Doctor");
        referjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referjButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Lab Test Request");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        viewencounterhisjButton.setText("View Encounter History");
        viewencounterhisjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewencounterhisjButtonActionPerformed(evt);
            }
        });

        patientdetailsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Age", "City", "Phone Number", "Email ID"
            }
        ));
        jScrollPane2.setViewportView(patientdetailsjTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backJButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addGap(50, 50, 50)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(referjButton)
                                .addGap(18, 18, 18)
                                .addComponent(viewencounterhisjButton)))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2)
                    .addComponent(viewencounterhisjButton)
                    .addComponent(referjButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(backJButton4)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backJButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButton4ActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientdetailsjTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row");
        }
        DoctorEmergencyWorkRequest request = (DoctorEmergencyWorkRequest) patientdetailsjTable.getValueAt(selectedRow, 0);
        MedicalPrescriptionJPanel mpjp = new MedicalPrescriptionJPanel(userProcessContainer, account, enterprise, system, request.getPatient(), encounter);
        userProcessContainer.add("MedicalPrescriptionJPanel", mpjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void referjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientdetailsjTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row");
        }
        DoctorEmergencyWorkRequest request = (DoctorEmergencyWorkRequest) patientdetailsjTable.getValueAt(selectedRow, 0);
//        Encounter encounter=request.getPatient().getEncounterList().createEncounter();
//        Person p=account.getEmployee();
//        Doctor doctor=(Doctor)p;
//        encounter.setDoctor(doctor);
        DoctorReferenceJPanel drjp = new DoctorReferenceJPanel(userProcessContainer, account, enterprise, system, request.getPatient(), encounter);
        userProcessContainer.add("DoctorReferenceJPanel", drjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_referjButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientdetailsjTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row");
        }
        DoctorEmergencyWorkRequest request = (DoctorEmergencyWorkRequest) patientdetailsjTable.getValueAt(selectedRow, 0);
        DoctorLabWorkRequestJPanel dlwjp = new DoctorLabWorkRequestJPanel(userProcessContainer, account, enterprise, request.getPatient(), encounter);
        userProcessContainer.add("DoctorLabWorkRequestJPanel", dlwjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void viewencounterhisjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewencounterhisjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = patientdetailsjTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Row");
        }
        DoctorEmergencyWorkRequest request = (DoctorEmergencyWorkRequest) patientdetailsjTable.getValueAt(selectedRow, 0);
        ViewEncounterHistoryJPanel vehjp = new ViewEncounterHistoryJPanel(userProcessContainer, account, enterprise, request.getPatient());
        userProcessContainer.add("ViewEncounterHistoryJPanel", vehjp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_viewencounterhisjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton4;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable patientdetailsjTable;
    private javax.swing.JButton referjButton;
    private javax.swing.JButton viewencounterhisjButton;
    // End of variables declaration//GEN-END:variables
}
