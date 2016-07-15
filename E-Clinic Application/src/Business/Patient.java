/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 * Assignment 2
 * @author Vivek
 */
public class Patient {

    String PatientName;
    String PatentId;
    int Age;
    String DoctorName;
    String Pharmacy;

    public String getPatientName() {
        return PatientName;
    }

    public void setPatientName(String PatientName) {
        this.PatientName = PatientName;
    }

    public String getPatentId() {
        return PatentId;
    }

    public void setPatentId(String PatentId) {
        this.PatentId = PatentId;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDoctorName() {
        return DoctorName;
    }

    public void setDoctorName(String DoctorName) {
        this.DoctorName = DoctorName;
    }

    public String getPharmacy() {
        return Pharmacy;
    }

    public void setPharmacy(String Pharmacy) {
        this.Pharmacy = Pharmacy;
    }
    
}
