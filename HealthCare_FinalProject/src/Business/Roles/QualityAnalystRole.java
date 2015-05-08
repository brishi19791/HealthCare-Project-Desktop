/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Roles;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Organization.QualityAnalystOrganization;
import Business.UserAccount.UserAccount;
import UserInterface.DrugQualityAnalystRole.QualityAnalystWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author user
 */
public class QualityAnalystRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system) {
       return new QualityAnalystWorkAreaJPanel(userProcessContainer,account,(QualityAnalystOrganization)organization,enterprise,system);
    }
    
}
