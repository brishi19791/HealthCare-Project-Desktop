/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;

import Business.Drug.Drug;
import Business.Enterprise.DrugCompanyEnterprise;
import Business.Enterprise.PharmacyEnterprise;

/**
 *
 * @author user
 */
public class Medication {
    
    private Drug drug;
    private int dosage;
    private PharmacyEnterprise pharmacy;
    private DrugCompanyEnterprise drugCompany;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public int getDosage() {
        return dosage;
    }

    public void setDosage(int dosage) {
        this.dosage = dosage;
    }

    public PharmacyEnterprise getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(PharmacyEnterprise pharmacy) {
        this.pharmacy = pharmacy;
    }

    public DrugCompanyEnterprise getDrugCompany() {
        return drugCompany;
    }

    public void setDrugCompany(DrugCompanyEnterprise drugCompany) {
        this.drugCompany = drugCompany;
    }
    
    
    

    
    
    
    
}
