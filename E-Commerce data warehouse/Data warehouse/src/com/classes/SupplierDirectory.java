/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

import java.util.ArrayList;

/**
 *
 * @author Vivek
 */
public class SupplierDirectory {
    
    private ArrayList<supplier> supplierlist;
    
    
    public SupplierDirectory()
    {
    supplierlist = new ArrayList<>();
    }
    
    public ArrayList<supplier> getsupplierlist() {
        return supplierlist;
    }
    
    public supplier addSupplier(){
    
        supplier Supplier = new supplier();
        supplierlist.add(Supplier);
        return Supplier;
    }
    
    
}
