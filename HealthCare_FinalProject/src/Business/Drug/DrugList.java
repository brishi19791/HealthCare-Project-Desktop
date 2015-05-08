/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Drug;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class DrugList {
    
    private ArrayList<Drug> drugList;
    
    public DrugList(){
        drugList=new ArrayList<>();
    }

    public ArrayList<Drug> getDrugList() {
        return drugList;
    }
    
    public Drug createDrug(){
        Drug drug=new Drug();
        drugList.add(drug);
        return drug;
    }
    
    public void removeDrug(Drug drug){
        drugList.remove(drug);
    }
    
}
