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
public class supplier {
    
    private String supplyName;
    private ProductCatalog productcatalog;

    public supplier() {
    productcatalog = new ProductCatalog();
    }

    public String getSupplyName() {
        return supplyName;
    }

    public void setSupplyName(String supplyName) {
        this.supplyName = supplyName;
    }

    public ProductCatalog getproductcatalog() {
        return productcatalog;
    }

    public void setProductCatalog(ProductCatalog prodc) {
        this.productcatalog = prodc;
    }

    @Override
    public String toString() {
        return supplyName; //To change body of generated methods, choose Tools | Templates.
    }

    
}
