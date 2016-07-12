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
public class CVSStores {
    
    int storeId;
    String storename;
    String storelocation;
    private DrugInventory druginventory;
        
    public CVSStores(){
        druginventory = new DrugInventory();
    }
    
    public DrugInventory getdrugcatalog() {
        return druginventory;
    }
       
    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public String getStorename() {
        return storename;
    }

    public void setStorename(String storename) {
        this.storename = storename;
    }

    public String getStorelocation() {
        return storelocation;
    }

    public void setStorelocation(String storelocation) {
        this.storelocation = storelocation;
    }

    @Override
    public String toString() {
        return this.storename;
    }
    
    
    
}
