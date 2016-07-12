/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Vivek
 */
public class VitalSignHistory {
    
        private ArrayList<VitalSign> vitalSignList;
        private ArrayList<Patient> patientList;
    
    public VitalSignHistory()
    {
        this.vitalSignList = new ArrayList<>();
        this.patientList = new ArrayList<>();
    }

    public ArrayList<VitalSign> getVitalSignList() {
        return vitalSignList;
    }

    public ArrayList<Patient> getpatientList() {
        return patientList;
    }
    
    public void setVitalSignList(ArrayList<VitalSign> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public void setpatientList(ArrayList<Patient> PatientList) {
        this.patientList = PatientList;
    }    
    
    public VitalSign addVitalSign(){
    
        VitalSign vitalsign = new VitalSign();
        this.vitalSignList.add(vitalsign);
        return vitalsign;
    }
    
    public Patient addPatient(){
        
        Patient patient = new Patient();
        this.patientList.add(patient);
        return patient;
    }
    
    public void deleteVitalsign(VitalSign vitalSign)
    {        
        vitalSignList.remove(vitalSign);
    }

    public void deletepatient(Patient patient){
            patientList.remove(patient);
    }
}
