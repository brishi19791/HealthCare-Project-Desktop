/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Organization;

import Business.Person.PersonDirectory;
import Business.Roles.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public abstract class Organization {
    private String name;
    private WorkQueue workQueue;
    private PersonDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter;
    
    public enum Type{
        HospitalAdmin("HospitalAdmin Organization"),
        ClinicalAdmin("ClinicalAdmin Organization"),
        Doctor("Doctor Organization"),
        Nurse("Nurse Organization"),
        Lab("Lab Organization"),
        Patient("Patient Organization"),
        Recepionist("Reception Organization"),
        DrugCompanyAdmin("DrugCompanyAdmin Organization"),
        DrugDistributor("DrugDistribution Organization"),
        DrugManufacturer("DrugManufacturing Organization"),
        QualityAnalyst("QualityAnalyst Organization"),
        PharmacyAdmin("PharmacyAdmin Organization"),
        Pharmacist("Pharmacist Organization");
        
        private String value;
        private Type(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

    }
    
      public Organization(String name) {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new PersonDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
        ++counter;
    }
      public abstract ArrayList<Role> getSupportedRole();

    public String getName() {
        return name;
    }
    

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    

    public PersonDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(PersonDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    @Override
    public String toString() {
        return  name;
    }

   
    
    

    
}
