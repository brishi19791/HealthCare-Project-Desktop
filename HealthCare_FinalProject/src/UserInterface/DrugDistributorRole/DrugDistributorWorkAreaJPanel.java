/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.DrugDistributorRole;

import Business.Drug.Drug;
import Business.EcoSystem;
import Business.Enterprise.DrugCompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Organization.DrugDistributionOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.PharmacistWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class DrugDistributorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DrugDistributorWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private DrugDistributionOrganization ddo;
    private DrugCompanyEnterprise enterprise;
    private EcoSystem system;

    public DrugDistributorWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, DrugDistributionOrganization ddo, Enterprise enterprise, EcoSystem system) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.ddo = ddo;
        this.enterprise = (DrugCompanyEnterprise) enterprise;
        this.system = system;
        populateTable();
        populate();
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) pharmacistworkreqjTable.getModel();
        dtm.setRowCount(0);

        for (WorkRequest request : ddo.getWorkQueue().getWorkRequestList()) {
            if (request instanceof PharmacistWorkRequest) {
                Object[] row = new Object[6];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver() == null ? null : request.getReceiver();
                row[3] = request.getStatus();
                PharmacistWorkRequest req = (PharmacistWorkRequest) request;
                row[4] = req.getDrug();
                row[5] = req.getPharmacy();
                dtm.addRow(row);
            }

        }

    }

    public void populate() {
        DefaultTableModel dtm = (DefaultTableModel) drugdetailsjTable.getModel();
        dtm.setRowCount(0);

        for (Drug drug : enterprise.getDrugList().getDrugList()) {
            Object[] row = new Object[5];
            row[0] = drug;
            row[1] = drug.getManufactureDate();
            row[2] = drug.getExpiryDate();
            row[3] = drug.getCompostion();
            row[4] = drug.getWarning();
            dtm.addRow(row);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        drugdetailsjTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        pharmacistworkreqjTable = new javax.swing.JTable();
        assignjButton = new javax.swing.JButton();
        distributejButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Drug Distributor Work Area");

        drugdetailsjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Drug Name", "Mfg Date", "Expiry Date", "Composition", "Warning"
            }
        ));
        jScrollPane1.setViewportView(drugdetailsjTable);

        pharmacistworkreqjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Message", "Pharmacist", "Drug Distributor", "Status", "Drug Name", "Pharmacy Name"
            }
        ));
        jScrollPane2.setViewportView(pharmacistworkreqjTable);

        assignjButton.setText("Assign To Me");
        assignjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignjButtonActionPerformed(evt);
            }
        });

        distributejButton.setText("Distribute");
        distributejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distributejButtonActionPerformed(evt);
            }
        });

        jButton3.setText("Refresh");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(100, 100, 100)
                .addComponent(assignjButton)
                .addGap(27, 27, 27)
                .addComponent(distributejButton)
                .addGap(146, 146, 146))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backjButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignjButton)
                    .addComponent(distributejButton)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backjButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void assignjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignjButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = pharmacistworkreqjTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Work Request");
        }
        
        PharmacistWorkRequest request = (PharmacistWorkRequest) pharmacistworkreqjTable.getValueAt(selectedRow, 0);
        if(request.getStatus().equals("Processing")){
            JOptionPane.showMessageDialog(null,"Request has been taken up by other Distributor");
            return;
        }else if (request.getStatus().equals("Drug Sent")) {
            JOptionPane.showMessageDialog(null, "Drug already distributed");
            return;
        }
        request.setReceiver(account);
        request.setStatus("Processing");
    }//GEN-LAST:event_assignjButtonActionPerformed

    private void distributejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distributejButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = pharmacistworkreqjTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a Work Request");
        }
        PharmacistWorkRequest request = (PharmacistWorkRequest) pharmacistworkreqjTable.getValueAt(selectedRow, 0);
        if (request.getStatus().equals("Processing") && (request.getReceiver().equals(account))) {

            request.getPharmacy().getDrugList().getDrugList().add(request.getDrug());
            request.setStatus("Drug Sent");
        } else if (request.getStatus().equals("Drug Sent")) {
            JOptionPane.showMessageDialog(null, "Drug already distributed");
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Please accept the work request");
            return;
        }

    }//GEN-LAST:event_distributejButtonActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignjButton;
    private javax.swing.JButton backjButton1;
    private javax.swing.JButton distributejButton;
    private javax.swing.JTable drugdetailsjTable;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable pharmacistworkreqjTable;
    // End of variables declaration//GEN-END:variables
}
