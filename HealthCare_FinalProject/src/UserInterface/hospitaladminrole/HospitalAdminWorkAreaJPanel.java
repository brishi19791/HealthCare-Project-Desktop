/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package UserInterface.hospitaladminrole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class HospitalAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HospitalAdminWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    
    private EcoSystem system;
    public HospitalAdminWorkAreaJPanel(JPanel userProcessContainer,Enterprise enterprise,EcoSystem system) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
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

        mngorgjButton = new javax.swing.JButton();
        mgempjButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        mngorgjButton.setText("Manage Organizations");
        mngorgjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mngorgjButtonActionPerformed(evt);
            }
        });

        mgempjButton.setText("Manage Employees");
        mgempjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mgempjButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("HospitalAdmin WorkArea");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel1)
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mgempjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mngorgjButton))
                .addGap(128, 128, 128))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(mngorgjButton)
                .addGap(41, 41, 41)
                .addComponent(mgempjButton)
                .addContainerGap(117, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void mngorgjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mngorgjButtonActionPerformed
        // TODO add your handling code here:
         ManageOrganizationsJPanel mojp = new ManageOrganizationsJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("ManageOrganizationsJPanel", mojp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mngorgjButtonActionPerformed

    private void mgempjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mgempjButtonActionPerformed
        // TODO add your handling code here:
           ManageEmployeesJPanel mejp = new ManageEmployeesJPanel(userProcessContainer, enterprise.getOrganizationDirectory(),system);
        userProcessContainer.add("ManageEmployeesJPanel", mejp);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_mgempjButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton mgempjButton;
    private javax.swing.JButton mngorgjButton;
    // End of variables declaration//GEN-END:variables
}
