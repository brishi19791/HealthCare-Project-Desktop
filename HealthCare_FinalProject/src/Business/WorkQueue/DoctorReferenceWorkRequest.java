/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.WorkQueue;

import Business.Encounter.Encounter;
import Business.Person.Doctor;
import Business.Person.Patient;

/**
 *
 * @author user
 */
public class DoctorReferenceWorkRequest extends WorkRequest {
    
    private Encounter encounter;
    private Patient patient;
    private Doctor doctor;

    public Encounter getEncounter() {
        return encounter;
    }

    public void setEncounter(Encounter encounter) {
        this.encounter = encounter;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    
    
    
}
