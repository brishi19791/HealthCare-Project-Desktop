/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Encounter.Encounter;
import Business.Person.Patient;

/**
 *
 * @author user
 */
public class DoctorEmergencyWorkRequest extends WorkRequest {
    
    private Patient patient;
    private String fname;
    private String lname;
    private Encounter encounter;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    
    @Override
    public String toString() {
        return  fname;
    }
    
    
    
    
    
    
    
}
