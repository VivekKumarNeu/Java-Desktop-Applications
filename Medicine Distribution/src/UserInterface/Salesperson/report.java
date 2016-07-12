/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Salesperson;

import Business.Customer;
import Business.CustomerDirectory;
import Business.Product;
import Business.ProductCatalog;
import Business.SalesDirectory;
import Business.SalesPerson;
import Business.supplierdirectory;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JPanel;

/**
 *
 * @author Vivek
 */

public class report extends javax.swing.JPanel {

    /**
     * Creates new form report
    */
    private SalesDirectory salesdirectory;
    private supplierdirectory SupplierDirectory;
    private ProductCatalog productcatalog;
    private CustomerDirectory customerdirectory;
    private JPanel userprocesscontrol;
    private Customer cust;

    public report(JPanel userprocesscontrol,SalesDirectory salesdirectory,ProductCatalog productcatalog,CustomerDirectory customerdirectory) {
        initComponents();
        this.userprocesscontrol = userprocesscontrol;
        this.salesdirectory = salesdirectory;
        this.productcatalog = productcatalog;
        this.customerdirectory = customerdirectory;
        populateSales();
        topsalesperson();
        popularproduct();
        bestcustomer();
        profitorloss();
        setcommsion();
    }

    public void setcommsion()
    {
    SalesPerson sales = (SalesPerson) salesmancombobox.getSelectedItem();
    totalcimmisionjTextField.setText(String.valueOf(sales.totalcommision()));
    }
    
    
    public void topsalesperson()
    {
        int sellerquantity;
        int size;
        String concat="";
        MyLinkedMap<Integer, String>saleslist = new MyLinkedMap<>();
        
        for(SalesPerson sales : salesdirectory.getSalespersonlist()){
                sellerquantity=0;
                for(Product prod : sales.getProductcatalog().getProductcatalog()){
                        sellerquantity = sellerquantity+prod.getQuantity();
                  }
                    saleslist.put(sellerquantity,sales.getSalesPersonfirstname());    
                    }
        System.out.println(saleslist);
        size = saleslist.size();
        String con="";
        
        for(int x=size-1;size>1;x--){
                concat = concat+","+saleslist.getValue(x);
                if(x==(size-3))
                    break;
        }
        topsalesperson.setText(concat);
            
        
    }
    
    class MyLinkedMap<K, V> extends LinkedHashMap<K, V>
{

    public V getValue(int i)
    {

       Map.Entry<K, V>entry = this.getEntry(i);
       if(entry == null) return null;

       return entry.getValue();
    }

    public Map.Entry<K, V> getEntry(int i)
    {
        Set<Map.Entry<K,V>>entries = entrySet();
        int j = 0;
        for(Map.Entry<K, V>entry : entries)
            if(j++ == i)return entry;

        return null;

    }

}
         
    public void popularproduct(){
    
        int xeroxvolume=0;
        int printervolume=0;
        int inkjet=0;
        int cartridge=0;
           
        ArrayList<Product> prod =  productcatalog.getProductcatalog();
        
        xeroxvolume = prod.get(0).getVolume();
        printervolume = prod.get(1).getVolume();
        inkjet = prod.get(2).getVolume();
        cartridge = prod.get(3).getVolume();
        
        
        int num[] = new int[]{xeroxvolume,printervolume,inkjet,cartridge};
         int smallest = num[0];
                int largetst = num[0];
                
         for(int i=1; i< num.length; i++)
                {
                        if(num[i] > largetst)
                                largetst = num[i];
                        else if (num[i] < smallest)
                                smallest = num[i];
                }
         System.out.println("Largest Number is : " + largetst);
         
         if(largetst==xeroxvolume)
            PopularProductjTextField.setText("Xerox");
         else if(largetst==printervolume)
             PopularProductjTextField.setText("Printer");
         else if(largetst==inkjet)
             PopularProductjTextField.setText("InkJet");
         else if(largetst==cartridge)
             PopularProductjTextField.setText("cartridge");
    }
    
    public void bestcustomer(){
    
        int[] myIntArray = new int[5];
        int i=0;
        for(Customer c : customerdirectory.getCustomerDirectory())
        {
            int sum = 0;
            for (int f : c.getcustomerstatus().values()) {
            sum += f;
                }               
                    System.out.println("sum "+sum);
                    myIntArray[i]=sum;
                    i++;
    }
        int smallest = myIntArray[0];
        int largetst = myIntArray[0];
        
         for(int p=0; p< myIntArray.length; p++)
                {
                        if(myIntArray[p] > largetst)
                                largetst = myIntArray[p];
                        else if (myIntArray[p] < smallest)
                                smallest = myIntArray[p];
                }
         System.out.println("Largest Numbermkkk is : " + largetst);
    
         if(largetst==myIntArray[0])
             bestcustomerjTextField.setText("Sam");
         else if(largetst==myIntArray[1])
             bestcustomerjTextField.setText("Rick");
        else if(largetst==myIntArray[2])
             bestcustomerjTextField.setText("Phils");
        else if(largetst==myIntArray[3])
             bestcustomerjTextField.setText("Rohan");
         else if(largetst==myIntArray[4])
             bestcustomerjTextField.setText("Riksha");
    }
    
    public void profitorloss()
    {
       SalesPerson sales = (SalesPerson) salesmancombobox.getSelectedItem();
       
       abovetargetjTextField.setText(String.valueOf(sales.getAbovetarget()));
       belowtargetjTextField.setText(String.valueOf(sales.getBelowtarget()));
       
    }
    
     public void populateSales(){

            salesmancombobox.removeAllItems();
            
            for(SalesPerson sales : salesdirectory.getSalespersonlist())
            {
                salesmancombobox.addItem(sales);
            }
            
           
        }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        topsalesperson = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        PopularProductjTextField = new javax.swing.JTextField();
        salesmancombobox = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        abovetargetjTextField = new javax.swing.JTextField();
        belowtargetjTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        bestcustomerjTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        totalcimmisionjTextField = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Report Page");

        jLabel2.setText("Top 3 sales person");

        jLabel3.setText("Popular product by sales");

        salesmancombobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salesmancomboboxActionPerformed(evt);
            }
        });

        jLabel4.setText("Person");

        jLabel5.setText("Products - above target price");

        jLabel6.setText("Products - below target price");

        belowtargetjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                belowtargetjTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Best customer");

        jLabel8.setText("Total commission");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(41, 41, 41)
                                .addComponent(salesmancombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(topsalesperson, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                    .addComponent(PopularProductjTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(totalcimmisionjTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                                        .addComponent(bestcustomerjTextField, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(belowtargetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(abovetargetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(topsalesperson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(PopularProductjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salesmancombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(abovetargetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(belowtargetjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(bestcustomerjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(totalcimmisionjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void belowtargetjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_belowtargetjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_belowtargetjTextFieldActionPerformed

    private void salesmancomboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salesmancomboboxActionPerformed
        
        populateProductTable();
    }//GEN-LAST:event_salesmancomboboxActionPerformed

    public void populateProductTable()
    {
        profitorloss();
        setcommsion();
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField PopularProductjTextField;
    private javax.swing.JTextField abovetargetjTextField;
    private javax.swing.JTextField belowtargetjTextField;
    private javax.swing.JTextField bestcustomerjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JComboBox salesmancombobox;
    private javax.swing.JTextField topsalesperson;
    private javax.swing.JTextField totalcimmisionjTextField;
    // End of variables declaration//GEN-END:variables
}
