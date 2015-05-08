/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

/**
 *
 * @author user
 */
public class Doctor extends Person {
    
    private String specialization;
    
     public enum SpecializationType{
        Cardiologist("Cardiologist"),
        Pathologist("Pathologist"),
        ENTSpecialist("ENT Specialist"),
        Dermatologist("Dermatologist"),
        CosmeticSurgeon("Cosmetic Surgeon"),
        Urologist("Urologist"),
        Oncologist("oncologist");
        
        private String value;
        private SpecializationType(String value) {
            this.value = value;
        }
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return  value;
        }
        

    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    
    @Override
    public String toString() {
        return  super.getFname();
    }
    
    
}
