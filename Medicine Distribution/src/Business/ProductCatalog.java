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
 * @author abhishekashwathnarayanvenkat
 */
public class ProductCatalog {
    
    private ArrayList<Product> productCatalog;

    public ProductCatalog() {
    productCatalog = new ArrayList<>();
    }
    
    public ArrayList<Product> getProductcatalog(){
        return productCatalog;
    }
    
    
    public Product addProduct(){
        Product p = new Product();
        productCatalog.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productCatalog.remove(p);
    }
    
    public Product searchProduct(String productname){
        for (Product product : productCatalog) {
            if(product.getProdName()==productname){
                return product;
            }
        }
        return null;
    }
}
