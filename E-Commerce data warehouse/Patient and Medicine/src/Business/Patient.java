/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Vivek
 */
public class Patient {
    
    private String PatientId;
    private String DoctorName;
    private String Pharmacy;
    
    
    
    public String getPatientId() {
        return PatientId;
    }

    public void setPatientId(String PatientId) {
        this.PatientId = PatientId;
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
