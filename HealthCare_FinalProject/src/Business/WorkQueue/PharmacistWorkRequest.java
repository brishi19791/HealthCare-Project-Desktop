/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Drug.Drug;
import Business.Enterprise.PharmacyEnterprise;

/**
 *
 * @author user
 */
public class PharmacistWorkRequest extends WorkRequest{
    private Drug drug;
    private PharmacyEnterprise pharmacy;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }

    public PharmacyEnterprise getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(PharmacyEnterprise pharmacy) {
        this.pharmacy = pharmacy;
    }
    
    
    
    
    
}
