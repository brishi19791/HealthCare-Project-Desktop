/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Person.Patient;
import Business.Person.PatientList;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class HospitalEnterprise extends Enterprise {
    
    private PatientList patientList;

     public HospitalEnterprise(String name){
        
        super(name,EnterpriseType.Hospital);
        patientList=new PatientList();
        
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }

    public PatientList getPatientList() {
        return patientList;
    }

    public void setPatientList(PatientList patientList) {
        this.patientList = patientList;
    }

    
    
}
