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
public class Drugs {
    
    String drugname;
    int quantity;
    String drugserialnumber;
    String manufacturedate;
    String expirydate;
    float price;
    String drugdesign;
    int volumeintake;
    String leagal;
    int weight;

    public String getDrugname() {
        return drugname;
    }

    public void setDrugname(String drugname) {
        this.drugname = drugname;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getManufacturedate() {
        return manufacturedate;
    }

    public void setManufacturedate(String manufacturedate) {
        this.manufacturedate = manufacturedate;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public String getDrugserialnumber() {
        return drugserialnumber;
    }

    public void setDrugserialnumber(String drugserialnumber) {
        this.drugserialnumber = drugserialnumber;
    }

    public float getprice() {
        return price;
    }

    public void setprice(float price) {
        this.price = price;
    }

    public String getdrugdesign() {
        return drugdesign;
    }

    public void setdrugdesign(String drugdesign) {
        this.drugdesign = drugdesign;
    }

    public int getVolumeintake() {
        return volumeintake;
    }

    public void setVolumeintake(int volumeintake) {
        this.volumeintake = volumeintake;
    }

    public String getLeagal() {
        return leagal;
    }

    public void setLeagal(String leagal) {
        this.leagal = leagal;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return this.drugserialnumber ;
    }
    
    
}
