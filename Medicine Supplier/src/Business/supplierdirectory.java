/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 *
 * @author Vivek
 */
public class supplierdirectory {
    
        private List<supplier> supplierList;
    
        public supplierdirectory() {
    
        supplierList = new ArrayList<supplier>();
    }
    
    public List<supplier> getSupplierlist(){
        return supplierList;
    }
    
    public supplier addSupplier(){
        supplier s = new supplier();
        supplierList.add(s);
        return s;
    }
    
    public void removeSupplier(Supplier s){
        supplierList.remove(s);
    }
    
    public supplier searchSupplier(String keyword){
        for (supplier supplier : supplierList) {
            if(supplier.getSupplyName().equals(keyword)){
                return supplier;
            }
        }
        return null;
    }
    
    
    
}
