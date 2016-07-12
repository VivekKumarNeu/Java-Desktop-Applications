/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author abhishekashwathnarayanvenkat
 */
public class Product {
    
    private String prodName;
    private float celingprice;
    private float floorprice;
    private float targetprice;
    private int quantity;
    private int volume=0;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = this.volume+volume;
    }

    public float getCelingprice() {
        return celingprice;
    }

    public void setCelingprice(float celingprice) {
        this.celingprice = celingprice;
    }

    public float getFloorprice() {
        return floorprice;
    }

    public void setFloorprice(float floorprice) {
        this.floorprice = floorprice;
    }

    public float getTargetprice() {
        return targetprice;
    }

    public void setTargetprice(float targetprice) {
        this.targetprice = targetprice;
    }

    
    private static int count =0;

    @Override
    public String toString() {
        return prodName; //To change body of generated methods, choose Tools | Templates.
    }
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    
       public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }


    
}
