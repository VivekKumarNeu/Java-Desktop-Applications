/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Business;

/**
 *
 * @author Vivek
 */
public class Person {
    
    private String Personname;
    private int age;
    private String mailid;
    private String address;
    Patient patient;
    
    VitalSignHistory vitalsignhistory;
    PersonDirectory persondirectory;
    
    public Person(){
    
        vitalsignhistory = new VitalSignHistory();
    }

     public VitalSignHistory getvitalsignhistory() {
        return vitalsignhistory;
    }

    public void setVitalsignhistory(VitalSignHistory vitalsignhistory) {
        this.vitalsignhistory = vitalsignhistory;
    }
    
    public String getPersonname() {
        return Personname;
    }

    public void setPersonname(String personname) {
        this.Personname = personname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMailid() {
        return mailid;
    }

    public void setMailid(String mailid) {
        this.mailid = mailid;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return Personname;
    }
    
    
}
