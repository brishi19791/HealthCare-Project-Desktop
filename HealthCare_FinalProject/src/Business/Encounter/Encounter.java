/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Encounter;

import Business.Person.Doctor;
import java.util.Date;

/**
 *
 * @author user
 */
public class Encounter {
    
    private VitalSign vitalsign;
    private Medication medication;
    private LabTest labTest;
    private Date doj;
    private Doctor doctor;
    private int id;
    private static int count = 1;
    
    public Encounter(){
        vitalsign=new VitalSign();
        medication=new Medication();
        labTest=new LabTest();
        id = count;
        count++;
    }

    public VitalSign getVitalsign() {
        return vitalsign;
    }

    public void setVitalsign(VitalSign vitalsign) {
        this.vitalsign = vitalsign;
    }

    public Medication getMedication() {
        return medication;
    }

    public void setMedication(Medication medication) {
        this.medication = medication;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public LabTest getLabTest() {
        return labTest;
    }

    public void setLabTest(LabTest labTest) {
        this.labTest = labTest;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }
    

    @Override
    public String toString() {
        return String.valueOf(id);
    }
    
    
    
    
}
