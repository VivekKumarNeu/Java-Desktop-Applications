/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.function.Supplier;

/**
 *
 * @author Vivek
 */
public class SalesDirectory {
    
    private ArrayList<SalesPerson> salespersonlist;

    public SalesDirectory(){
    salespersonlist = new ArrayList<SalesPerson>();
    }
    
    public ArrayList<SalesPerson> getSalespersonlist() {
        return salespersonlist;
    }

    public SalesPerson addSalesperon(){
        SalesPerson s = new SalesPerson();
        salespersonlist.add(s);
        return s;
    }
    
    public void removeSalesperson(SalesPerson s){
        salespersonlist.remove(s);
    }
   
    
    
    
    
}
