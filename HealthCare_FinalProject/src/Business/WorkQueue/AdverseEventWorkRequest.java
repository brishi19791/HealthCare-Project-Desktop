/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Drug.Drug;
import Business.Enterprise.DrugCompanyEnterprise;

/**
 *
 * @author user
 */
public class AdverseEventWorkRequest extends WorkRequest{
    private Drug drug;
    private DrugCompanyEnterprise drugCompany;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public DrugCompanyEnterprise getDrugCompany() {
        return drugCompany;
    }

    public void setDrugCompany(DrugCompanyEnterprise drugCompany) {
        this.drugCompany = drugCompany;
    }

    
    
    
    
    
}
