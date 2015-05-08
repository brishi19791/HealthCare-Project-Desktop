/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Drug.DrugList;
import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author user
 */
public abstract class Enterprise extends Organization {
    
    private EnterpriseType enterpriseType;
    private OrganizationDirectory organizationDirectory;
    //private DrugList drugList;
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        this.organizationDirectory=new OrganizationDirectory();
    }
    
    public enum EnterpriseType{
        Hospital("Hospital"),
        //Clinic("Clinic"),
        Pharmacy("Pharmacy"),
        DrugCompany("DrugCompany");
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }

        public String getValue() {
            return value;
        }

             
        public String toString(){
            return value;
        }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

//    public DrugList getDrugList() {
//        return drugList;
//    }
//
//    public void setDrugList(DrugList drugList) {
//        this.drugList = drugList;
//    }
    
    

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
    
}
