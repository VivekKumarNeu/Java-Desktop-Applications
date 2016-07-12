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
public class supplier {
    
    private String supplyName;
    private DrugInventory druginventory;

    public supplier() {
    druginventory = new DrugInventory();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public DrugInventory getDrugInventory() {
        return druginventory;
    }

    public void setDrugInventory(DrugInventory druginventory) {
        this.druginventory = druginventory;
    }

    @Override
    public String toString() {
        return supplyName; //To change body of generated methods, choose Tools | Templates.
    }

    
}
