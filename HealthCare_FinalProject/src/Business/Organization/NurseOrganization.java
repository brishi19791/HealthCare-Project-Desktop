/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Roles.NurseRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class NurseOrganization extends Organization {

    public NurseOrganization(){
        super(Type.Nurse.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new NurseRole());
        return roles;
    }
    
}
