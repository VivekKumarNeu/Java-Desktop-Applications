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
public class SalesPerson {
    
    private String SalesPersonfirstname;
    private String SalesPersonlastname;
    private int SalespersonId;
    private int commission;
    private int abovetarget;
    private int belowtarget;
    private ProductCatalog productcatalog;
    int totalsumpos;
    int totalsumnev;
    float commision;
    float totalcommision;
    
    public float getCommision() {
        return commision;
    }

    public void setCommision(float commision) {
        totalcommision = totalcommision+commision;
    }
    
    public float totalcommision()
    {
        return totalcommision;
    }
    
    public int getAbovetarget() {
        return totalsumpos;
    }

    public void setAbovetarget(int abovetarget) {
        this.abovetarget = abovetarget;
        totalsumpos = totalsumpos+abovetarget;
    }

    public int getBelowtarget() {
        return totalsumnev;
    }

    public void setBelowtarget(int belowtarget) {
        this.belowtarget = belowtarget;
        totalsumnev = totalsumnev+belowtarget;
    }

    public SalesPerson(){
    productcatalog = new ProductCatalog();
    }
    
    
    public String getSalesPersonfirstname() {
        return SalesPersonfirstname;
    }

    public void setSalesPersonfirstname(String SalesPersonfirstname) {
        this.SalesPersonfirstname = SalesPersonfirstname;
    }

    public void setCommission(int commision) {
        this.commission = commision;
    }
    
    public int getCommission() {
        return commission;
    }

    public String getSalesPersonlastname() {
        return SalesPersonlastname;
    }

    public void setSalesPersonlastname(String SalesPersonlastname) {
        this.SalesPersonlastname = SalesPersonlastname;
    }
    

    public int getSalespersonId() {
        return SalespersonId;
    }

    public void setSalespersonId(int SalespersonId) {
        this.SalespersonId = SalespersonId;
    }

    public ProductCatalog getProductcatalog() {
        return productcatalog;
    }

    public void setProductcatalog(ProductCatalog productcatalog) {
        this.productcatalog = productcatalog;
    }

    @Override
    public String toString() {
        return SalesPersonfirstname;
    }

    
}
