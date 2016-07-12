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
public class DrugInventory {
    
    private ArrayList<Drugs> druglist;
    
public DrugInventory(){

    this.druglist = new ArrayList<>();
}
    
public ArrayList<Drugs> getdrugsDir() {
        return druglist;
    }

    public void setdrugsDir(ArrayList<Drugs> drugsDir) {
        this.druglist = drugsDir;
    }
    
    public Drugs adddrug(){
    
        Drugs drug = new Drugs();
        druglist.add(drug);
        return drug;
    }
    
    public void removedrug(Drugs drug){
            druglist.remove(drug);
    }
    
    public Drugs searchDrug(String drugname){
    
    for(Drugs drug : druglist)
        if (drug.getDrugname() == drugname)
                return drug;
    
    return null;
    }    

}
