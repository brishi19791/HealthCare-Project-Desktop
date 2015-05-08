/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import java.util.ArrayList;

/**
 *
 * @author user
 */
public class PatientList {
    
    private ArrayList<Patient> patientList;
    
    public PatientList(){
        patientList=new ArrayList<>();
    }

    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
      public Patient createPatient(String fname,String lname,String email,int num,int age,String city){
         Patient patient=new Patient();
         patient.setFname(fname);
         patient.setLname(lname);
         patient.setEmail(email);
         patient.setNum(num);
         patient.setAge(age);
         
         patient.setCity(city);
         patientList.add(patient);
         return patient;
     }
    
    

    
}
