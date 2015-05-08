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
public class PersonDirectory {
    
     private ArrayList<Person> personList;

    public PersonDirectory() {
        personList = new ArrayList<>();
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
     public Person createPerson(String name){
        Person person = new Person();
        person.setFname(name);
        personList.add(person);
        return person;
    }
     
     public Doctor createDoctor(String name,String email,int num,Doctor.SpecializationType type){
         Doctor doctor=new Doctor();
         doctor.setFname(name);
         doctor.setEmail(email);
         doctor.setNum(num);
         doctor.setSpecialization(type.getValue());
         personList.add(doctor);
         return doctor;
         
     }
     
//     public Patient createPatient(String fname,String lname,String email,int num,int age,String city){
//         Patient patient=new Patient();
//         patient.setFname(fname);
//         patient.setLname(lname);
//         patient.setEmail(email);
//         patient.setNum(num);
//         patient.setAge(age);
//         
//         patient.setCity(city);
//         personList.add(patient);
//         return patient;
//     }
     public Nurse createNurse(String name,String city,String email,int num){
         Nurse nurse=new Nurse();
         nurse.setFname(name);
         nurse.setNum(num);
         nurse.setEmail(email);
         nurse.setCity(city);
         personList.add(nurse);
         return nurse;
     }
     
     public LabAssistant createLabAssistant(String name,String city,String email,int num){
         LabAssistant lab=new LabAssistant();
         lab.setFname(name);
         lab.setNum(num);
         lab.setCity(city);
         lab.setEmail(email);
         personList.add(lab);
         return lab;
     }
     public Receptionist createReceptionist(String name,String city,String email,int num){
         Receptionist r=new Receptionist();
         r.setFname(name);
         r.setNum(num);
         r.setCity(city);
         r.setEmail(email);
         personList.add(r);
         return r;
     }
}
