/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.classes;

public class supplier {
    
    private String supplierName;
    private String supplierAddress;
    private String supplierId;

    LaptopCatalog laptopcatalog;
    
    public supplier(){
    laptopcatalog = new LaptopCatalog();
    }

    public LaptopCatalog getLaptopcatalog() {
        return laptopcatalog;
    }

    public void setLaptopcatalog(LaptopCatalog laptopcatalog) {
        this.laptopcatalog = laptopcatalog;
    }
    
    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierAddress() {
        return supplierAddress;
    }

    public void setSupplierAddress(String supplierAddress) {
        this.supplierAddress = supplierAddress;
    }

    public String getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(String supplierId) {
        this.supplierId = supplierId;
    }
        
    
    @Override
  public String toString() {
    return supplierName;
  }
        
        
}
