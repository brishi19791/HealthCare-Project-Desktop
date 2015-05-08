/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Roles.HospitalAdminRole;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class HospitalAdminOrganization  extends Organization{
    
    public HospitalAdminOrganization()
    {
        super(Type.HospitalAdmin.getValue());
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new HospitalAdminRole());
        return roles;
    }
    
}
