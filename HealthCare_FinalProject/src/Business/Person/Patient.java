/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Business.Person;

import Business.Encounter.EncounterList;

/**
 *
 * @author user
 */
public class Patient extends Person {
    
    private int age;
    private int weight;
    private String city;
    private EncounterList encounterList;
    private Doctor primaryDoctor;
    
    public Patient(){
        encounterList=new EncounterList();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public EncounterList getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(EncounterList encounterList) {
        this.encounterList = encounterList;
    }

    public Doctor getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(Doctor primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }
    
    
    
    @Override
    public String toString() {
        return  super.getFname();
    }
}
