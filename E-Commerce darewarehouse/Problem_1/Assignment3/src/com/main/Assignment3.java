/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.main;

import com.classes.LaptopCatalog;
import com.classes.SupplierDirectory;
import com.classes.laptop;
import com.classes.supplier;
import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

/**
 *
 * @author Vivek
 */
public class Assignment3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LaptopCatalog laptopcatalog = new LaptopCatalog();
        SupplierDirectory supplierdirectory = new SupplierDirectory();
        supplier Supplier = new supplier();
        laptop Laptop = new laptop();
        String input;

        while (true) {
            System.out.println("Enter 1 to add supplier ; Enter 2 to show supplier details ; 3 to enter a laptop detail ; 0 to exit");
            Scanner in = new Scanner(System.in);
            input = in.nextLine();

            if (input.equals("0")) {
                exit(0);
            }

            if (input.equals("1")) {
                Supplier = supplierdirectory.addSupplier();
                System.out.println("Enter the supplier ID");
                input = in.nextLine();
                Supplier.setSupplierId(input);
                System.out.println("Enter the supplier Name");
                input = in.nextLine();
                Supplier.setSupplierName(input);
                System.out.println("Enter the supplier Address");
                input = in.nextLine();
                Supplier.setSupplierAddress(input);
                
                System.out.println("Data saved is " + Supplier.getSupplierId() + ", " + Supplier.getSupplierName()+ " and " + Supplier.getSupplierAddress());

            } else if (input.equals("2")) {

                if (supplierdirectory.getsupplierlist().isEmpty()) {
                    System.out.println("No record to display.Please enter a supplier.");
                } else {
                    System.out.println("Priting report ....");

                    for (supplier sulppy : supplierdirectory.getsupplierlist()  ) {
                        System.out.print(sulppy.getSupplierId()+ " ");
                        System.out.print(sulppy.getSupplierName() + " ");
                        System.out.println(sulppy.getSupplierAddress());
                    }

                }
            } else if (input.equals("3")) {
                boolean flag=false;
                    System.out.println("Please enter a supplier name");
                    input = in.nextLine();
                ArrayList<supplier> verify= supplierdirectory.getsupplierlist();
                    for(supplier x : verify){
                        if(x.getSupplierName().equals(in.nextLine()))
                                flag=true;
                    }
                    
                for(supplier sup:supplierdirectory.getsupplierlist())
                {
                    if(sup.getSupplierName().equals(in.nextLine()))
                    {
                       Laptop = sup.getLaptopcatalog().addlaptop();
                       System.out.println("Enter the Model name ");
                       input = in.nextLine();
                       Laptop.setModelname(input);
                       System.out.println("Enter the Model serial number");
                       input = in.nextLine();
                       Laptop.setSerialnumber(input);
                       System.out.println("Enter the Model processor name");
                       input = in.nextLine();
                       Laptop.setProcessor(input);

                    } else {}                    
                    }
                System.out.println("Supplier name not found!!");
            } else if (input.equals("4"))
            {
                    if(supplierdirectory.getsupplierlist().isEmpty())
                            System.out.println("There is no supplier in the list. Please enter few suppliers");
                     else {
                        for(supplier supply : supplierdirectory.getsupplierlist())
                        {
                            if(supply.getLaptopcatalog().getlaptoplist().isEmpty()){
                                System.out.println("No laptop list found for "+supply+"!!!");
                            } else {
                                        for(laptop lappy : supply.getLaptopcatalog().getlaptoplist() ){
                            
                        System.out.print(lappy.getModelname() + " ");
                        System.out.print(lappy.getProcessor() + " ");
                        System.out.println(lappy.getSerialnumber());
                            }                            
                        }
                            
                             
                            
            }
                
                
            
                    }
                    
                    }
            
            }
            

        }
    }
