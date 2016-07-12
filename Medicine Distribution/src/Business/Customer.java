/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.HashMap;

/**
 *
 * @author Vivek
 */
public class Customer {
    
    private String customerName;
    private int customerId;
    private HashMap<String, Integer> customerstatus = new HashMap<String, Integer>();
            
    public HashMap<String,Integer> getcustomerstatus(){
        return customerstatus;
    }
    
    public void setcustomerstatus(String productname, int quantity){
        customerstatus.put(productname, quantity);
    }
    
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return this.customerName;
    }
           
    
}
