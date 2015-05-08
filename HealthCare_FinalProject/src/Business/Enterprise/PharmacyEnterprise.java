/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Enterprise;

import Business.Drug.DrugList;
import Business.Roles.Role;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PharmacyEnterprise extends Enterprise {
    private DrugList drugList;
    
    public PharmacyEnterprise(String name){
        super(name,EnterpriseType.Pharmacy);
        drugList=new DrugList();
    }
    
    

    @Override
    public ArrayList<Role> getSupportedRole() {
       return null;
    }

    /**
     * @return the drugList
     */
    public DrugList getDrugList() {
        return drugList;
    }

    /**
     * @param drugList the drugList to set
     */
    public void setDrugList(DrugList drugList) {
        this.drugList = drugList;
    }
    
    
}
