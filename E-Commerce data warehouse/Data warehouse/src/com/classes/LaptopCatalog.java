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
public class LaptopCatalog {
    
    private ArrayList<laptop> laptopcatalog ; 
    
    public LaptopCatalog()
    {
        laptopcatalog = new ArrayList<>();
    }
    
    public ArrayList<laptop> getlaptoplist() {
        return laptopcatalog;
    }
    
    public laptop addlaptop(){
    
        laptop newlaptop = new laptop();
        laptopcatalog.add(newlaptop);
        return newlaptop;
    }
    
}
