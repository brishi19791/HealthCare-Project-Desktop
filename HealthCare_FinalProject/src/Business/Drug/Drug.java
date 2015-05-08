/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Drug;

import Business.Enterprise.DrugCompanyEnterprise;
import java.util.Date;

/**
 *
 * @author user
 */
public class Drug {
    private String drugName;
    private Date manufactureDate;
    private Date expiryDate;
    private String compostion;
    private String warning;
    private DrugCompanyEnterprise drugCompany;
    private MedicationGuide medicationGuide;
    private CommunicationPlan communicationPlan;
    
    public Drug(){
        medicationGuide=new MedicationGuide();
        communicationPlan=new CommunicationPlan();
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCompostion() {
        return compostion;
    }

    public void setCompostion(String compostion) {
        this.compostion = compostion;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public DrugCompanyEnterprise getDrugCompany() {
        return drugCompany;
    }

    public void setDrugCompany(DrugCompanyEnterprise drugCompany) {
        this.drugCompany = drugCompany;
    }

    public MedicationGuide getMedicationGuide() {
        return medicationGuide;
    }

    public void setMedicationGuide(MedicationGuide medicationGuide) {
        this.medicationGuide = medicationGuide;
    }

    public CommunicationPlan getCommunicationPlan() {
        return communicationPlan;
    }

    public void setCommunicationPlan(CommunicationPlan communicationPlan) {
        this.communicationPlan = communicationPlan;
    }
    
    
    

    @Override
    public String toString() {
        return  drugName;
    }
    
    
    
    
    
    
    
}
