/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.doctorrole;

import Business.EcoSystem;
import Business.Encounter.Encounter;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.DoctorOrganization;
import Business.Organization.Organization;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.DoctorReferenceWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user
 */
public class DoctorReferenceJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorReferenceJPanel
     */
    private JPanel userProcessContainer;
    private UserAccount account;
    private Enterprise enterprise;
    private EcoSystem system;
    private Patient patient;
    private Encounter encounter;

    public DoctorReferenceJPanel(JPanel userProcessContainer, UserAccount account, Enterprise enterprise, EcoSystem system, Patient patient, Encounter encounter) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.account = account;
        this.enterprise = enterprise;
        this.system = system;
        this.patient = patient;
        this.encounter = encounter;
        populateNetworkcombo();
        populateTable();
    }

    public void populateNetworkcombo() {
        networkjComboBox.removeAllItems();
        for (Network network : system.getNetworkList()) {
            networkjComboBox.addItem(network);
        }
    }

    public void populateHospitalCombo(Network network) {
        hospitalnamejComboBox.removeAllItems();
        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (enterprise.getEnterpriseType().getValue().equals("Hospital")) {
                hospitalnamejComboBox.addItem(enterprise);
            }
        }
    }

    public void populateDocNameCombo(Enterprise enterprise) {
        doctornamesjComboBox.removeAllItems();
        for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (org instanceof DoctorOrganization) {
                for (Person p : org.getEmployeeDirectory().getPersonList()) {
                    doctornamesjComboBox.addItem(p);
                }
            }
        }
    }

    public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) docreferencejTable.getModel();
        dtm.setRowCount(0);
        //System.out.println(account.getWorkQueue().getWorkRequestList().size());

        for (WorkRequest request : account.getWorkQueue().getWorkRequestList()) {
            
            if (request instanceof DoctorReferenceWorkRequest) {
                System.out.println(account.getWorkQueue().getWorkRequestList().size());
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender();
                row[2] = request.getReceiver() == null ? null : request.getReceiver();
                row[3] = request.getStatus();
                DoctorReferenceWorkRequest req = (DoctorReferenceWorkRequest) request;
                row[4] = req.getPatient().getFname();
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

        jLabel1 = new javax.swing.JLabel();
        networkjComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        hospitalnamejComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        doctornamesjComboBox = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        docreferencejTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        messagejTextField = new javax.swing.JTextField();
        referjButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        backjButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        jLabel1.setText("Network");

        networkjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkjComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkjComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setText("Hospital Names");

        hospitalnamejComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        hospitalnamejComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hospitalnamejComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Doctor Names");

        doctornamesjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        docreferencejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Receiver", "Status", "Patient's Name"
            }
        ));
        jScrollPane1.setViewportView(docreferencejTable);

        jLabel4.setText("Message");

        referjButton.setText("Refer To a Doctor");
        referjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referjButtonActionPerformed(evt);
            }
        });

        jButton2.setText("Refresh");

        backjButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backjButton1.setText("<< Back");
        backjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backjButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Refer To Other Doctors");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(200, 200, 200))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jButton2)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(messagejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(referjButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backjButton1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(networkjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(doctornamesjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2)
                            .addGap(18, 18, 18)
                            .addComponent(hospitalnamejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(hospitalnamejComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(doctornamesjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(messagejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(referjButton)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(backjButton1)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void referjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referjButtonActionPerformed
        // TODO add your handling code here:
        String message = messagejTextField.getText();
        if (message.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter Message");
            return;
        } 
            DoctorReferenceWorkRequest request = new DoctorReferenceWorkRequest();
            Enterprise e=(Enterprise)hospitalnamejComboBox.getSelectedItem();
            //Encounter e1=request.getPatient().getEncounterList().createEncounter();
            request.setMessage(message);
            request.setSender(account);
            request.setStatus("Please Take Care");
            request.setPatient(patient);
            request.setEncounter(encounter);
            
            Person doctor = (Person) doctornamesjComboBox.getSelectedItem();
            request.setDoctor((Doctor) doctor);
            //e1.setDoctor((Doctor)doctor);
             
//        Person p=account.getEmployee();
//        Doctor doctor=(Doctor)p;
//        encounter.setDoctor(doctor);
            Organization org = null;
            for (Organization o : e.getOrganizationDirectory().getOrganizationList()) {
                if (o instanceof DoctorOrganization) {
                    org = o;
                    break;
                }
            }
            if (org!= null) {
                //System.out.println(org.getUserAccountDirectory().getUserAccountList().size());
                for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                    //System.out.println(ua.getEmployee().getFname());
                    if (ua.getEmployee().equals(doctor)) {
                        //System.out.println("in");
                        ua.getWorkQueue().getWorkRequestList().add(request);
                        account.getWorkQueue().getWorkRequestList().add(request);

                    }
                }
            }
            populateTable();

        
    
    }//GEN-LAST:event_referjButtonActionPerformed

    private void networkjComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkjComboBoxActionPerformed
        // TODO add your handling code here:
        Network network=(Network)networkjComboBox.getSelectedItem();
        if(network!=null){
            populateHospitalCombo(network);
        }
    }//GEN-LAST:event_networkjComboBoxActionPerformed

    private void hospitalnamejComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hospitalnamejComboBoxActionPerformed
        // TODO add your handling code here:
        Enterprise enterprise=(Enterprise)hospitalnamejComboBox.getSelectedItem();
        if(enterprise!=null){
            populateDocNameCombo(enterprise);
        }
    }//GEN-LAST:event_hospitalnamejComboBoxActionPerformed

    private void backjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backjButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton1;
    private javax.swing.JTable docreferencejTable;
    private javax.swing.JComboBox doctornamesjComboBox;
    private javax.swing.JComboBox hospitalnamejComboBox;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField messagejTextField;
    private javax.swing.JComboBox networkjComboBox;
    private javax.swing.JButton referjButton;
    // End of variables declaration//GEN-END:variables

    
}