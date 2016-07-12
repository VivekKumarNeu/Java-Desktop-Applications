/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Vivek
 */
public class CustomerDirectory {
    
    private ArrayList<Customer> customerlist;
    
    public CustomerDirectory(){
    customerlist = new ArrayList<>();
    }
    
    
    public List<Customer> getCustomerDirectory(){
        return customerlist;
    }
    
    public Customer addCustomer(){
        Customer cust = new Customer();
        customerlist.add(cust);
        return cust;
    }
    
}
