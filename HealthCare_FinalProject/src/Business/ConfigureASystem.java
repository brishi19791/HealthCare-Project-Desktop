/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business;

import Business.Person.Person;
import Business.Roles.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author user
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
       Person employee = system.getEmployeeDirectory().createPerson("Rishi Reddy");
       UserAccount ua=system.getUserAccountDirectory().createUserAccount("Sysadmin", "Sysadmin", employee, new SystemAdminRole());
       return system;
    }
    
}
