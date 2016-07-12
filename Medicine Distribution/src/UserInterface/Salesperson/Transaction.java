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
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Vivek
 */
public class Transaction extends javax.swing.JPanel {

    /**
     * Creates new form Transaction
     */
    private SalesDirectory salesdirectory;
    private supplierdirectory SupplierDirectory;
    private ProductCatalog productcatalog;
    private CustomerDirectory customerdirectory;
    private JPanel userprocesscontrol;
    float lastquotedcustomerprice=0;
    float commision;
    boolean flag=true;
    
    public Transaction(JPanel userprocesscontrol,SalesDirectory salesdirectory,ProductCatalog productcatalog,CustomerDirectory customerdirectory) {
        initComponents();
        this.userprocesscontrol = userprocesscontrol;
        this.salesdirectory = salesdirectory;
        this.productcatalog = productcatalog;
        this.customerdirectory = customerdirectory;
        
        populateSales();
        populateProductTable();
        populatecustomer();
    }

    public void populateSales(){

            salesmancombobox.removeAllItems();
            
            for(SalesPerson sales : salesdirectory.getSalespersonlist())
            {
                salesmancombobox.addItem(sales);
            }
            
           
        }
    
        public void populatecustomer(){

            customerjComboBox.removeAllItems();
            
            for(Customer customer : customerdirectory.getCustomerDirectory())
            {
                customerjComboBox.addItem(customer);
                System.out.println(customer.getCustomerName());
            }
            
           
        }

    
    
    public void populateProductTable(){
    
        DefaultTableModel model = (DefaultTableModel)productTable.getModel();
        model.setRowCount(0);
        SalesPerson supp = (SalesPerson) salesmancombobox.getSelectedItem();
    
            for(Product product : productcatalog.getProductcatalog()){
                
                Object []obj = new Object[4];
                obj[0] = product;
                obj[1] = product.getCelingprice();
                obj[2] = product.getTargetprice();
                obj[3] = product.getFloorprice();
                
                model.addRow(obj);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        salesmancombobox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        txtSalesPrice = new javax.swing.JTextField();
        quantitySpinner = new javax.swing.JSpinner();
        addtoCartButton6 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        customerjComboBox = new javax.swing.JComboBox();
        customervaluejTextField = new javax.swing.JTextField();
        buyjButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        commisiontextfield = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Sales Person");

        jLabel3.setText("Product Catalog");

        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product Name", "Ceiling Price", "Target Price", "Floor Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);

        jLabel6.setText("Sales Price");

        txtSalesPrice.setText("0");

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(0), Integer.valueOf(0), null, Integer.valueOf(1)));
        quantitySpinner.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                quantitySpinnerStateChanged(evt);
            }
        });

        addtoCartButton6.setText("Check");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });

        jLabel4.setText("Customer");

        customervaluejTextField.setText("keep value");
        customervaluejTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customervaluejTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                customervaluejTextFieldFocusLost(evt);
            }
        });

        buyjButton.setText("Order");
        buyjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buyjButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Commision");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(salesmancombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 492, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6))
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(customerjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(commisiontextfield, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtSalesPrice, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(customervaluejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(addtoCartButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(buyjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(12, 12, 12)))))
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salesmancombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customerjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSalesPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(customervaluejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(addtoCartButton6)))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(commisiontextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addComponent(buyjButton)
                .addContainerGap(158, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        String status="";
        int Value=0;
        Customer cust = (Customer) customerjComboBox.getSelectedItem();
        int fetchedquantit = (Integer)quantitySpinner.getValue();
         int selectedrow = productTable.getSelectedRow();
         Product product = (Product) productTable.getValueAt(selectedrow,0);
        int customerprice = Integer.parseInt(customervaluejTextField.getText());
        float ceilingprice = product.getCelingprice();
        float floorprice = product.getFloorprice();
        float targetprice = product.getTargetprice();
        float sellingprice = Float.parseFloat(txtSalesPrice.getText());
        
        HashMap<String, Integer> productdata = new HashMap<>();
        productdata.put("Xerox", 40000);
        productdata.put("Printer", 23000);
        productdata.put("InkJet", 31500);
        productdata.put("Cartridge", 6000);
        
        
        Set<String> keys = productdata.keySet();
        for(String key: keys){
            if(product.getProdName().equals(key))
               Value = productdata.get(key);
        }

        if((customerprice > ceilingprice) || (customerprice < floorprice))
         {
             JOptionPane.showMessageDialog(this, "Product cannot be sold heigher or lower");
             
         } else {

            if((fetchedquantit*product.getTargetprice())<=Value)
                 status = "floor";
            else 
                 status ="ceiling";
                                
         // will check the difference first
             callresult(status,fetchedquantit,customerprice,ceilingprice,floorprice,targetprice,sellingprice);
         
         
         }
         
    }//GEN-LAST:event_addtoCartButton6ActionPerformed

        public void callresult(String status,int quantity, float customerprice,float ceilingprice, float floorprice,float targetprice,float sellingprice)
    {
       
                if(status.equals("floor"))
            {
                if(Float.parseFloat(customervaluejTextField.getText()) > lastquotedcustomerprice)
                {
                
                // give less discount
              if(customerprice < floorprice){
                  JOptionPane.showMessageDialog(this, "Sorry, product cannot be sold with this price range. Please have a look on supplier text field for value");
                  txtSalesPrice.setText(String.valueOf(ceilingprice));
              } 
              
                  float rec;
                  lastquotedcustomerprice = Float.parseFloat(customervaluejTextField.getText());
                  if(flag){
                      rec = recursionfloor(customerprice, ceilingprice)+Float.parseFloat(customervaluejTextField.getText());
                      flag=false;
                  }else{
                      rec = recursionfloor(customerprice, sellingprice)+Float.parseFloat(customervaluejTextField.getText());
                  }
                  txtSalesPrice.setText(String.valueOf(rec)+customervaluejTextField.getText());
              
          } 
    }
                else if(status.equals("ceiling")){
            if(Float.parseFloat(customervaluejTextField.getText()) > lastquotedcustomerprice)
                {
                    
            if(customerprice < floorprice){
                  JOptionPane.showMessageDialog(this, "Sorry, product cannot be sold with this price range. Please have a look on supplier text field for value");
                  txtSalesPrice.setText(String.valueOf(ceilingprice));
              } 
                    
                  float rec;
                  lastquotedcustomerprice = Float.parseFloat(customervaluejTextField.getText());
                  if(flag){
                      rec = recursionceiling(customerprice, ceilingprice)+Float.parseFloat(customervaluejTextField.getText());
                      flag=false;
                  }else{
                      rec = recursionceiling(customerprice, Float.parseFloat(txtSalesPrice.getText()))+Float.parseFloat(customervaluejTextField.getText());
                  }
                  txtSalesPrice.setText(String.valueOf(rec)+customervaluejTextField.getText());
                  
           }
            
        }
                commision = calculatecommision();
                commisiontextfield.setText(String.valueOf(commision));
                        
                
    }

    public float recursionfloor(float customerpr , float salesperperice)
    {
        return (salesperperice-customerpr)/2;
                
    }
    
    public float recursionceiling(float customerpr , float salesperperice)
    {
        return (salesperperice - customerpr )/3;
                
    }
     
     
    private void customervaluejTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customervaluejTextFieldFocusGained
        
        customervaluejTextField.setText("");
        
    }//GEN-LAST:event_customervaluejTextFieldFocusGained

    private void customervaluejTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customervaluejTextFieldFocusLost
        
        if(customervaluejTextField.getText().equals(""))
            customervaluejTextField.setText("new value");
    }//GEN-LAST:event_customervaluejTextFieldFocusLost

    private void buyjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buyjButtonActionPerformed
        
        SalesPerson sales = (SalesPerson) salesmancombobox.getSelectedItem();
        int selectedrow = productTable.getSelectedRow();
        Product product = (Product) productTable.getValueAt(selectedrow,0);
        int fetchedquantit = (Integer)quantitySpinner.getValue();
        Customer cust = (Customer) customerjComboBox.getSelectedItem();
         
        
        // setting for sales person, which product he sold
        Product prod = sales.getProductcatalog().addProduct();
        prod.setProdName(product.getProdName());
        prod.setQuantity(fetchedquantit);
        
        for(Product xx :  productcatalog.getProductcatalog()){
                if(product.getProdName().equals(xx.getProdName()))
                {
                        xx.setVolume(fetchedquantit);
                }
        }
        // add up in the customer,what he bought
               for(Customer cc : customerdirectory.getCustomerDirectory())
               {
                    if(cc.getCustomerName().equals(cust.getCustomerName()))
                    {
                    if(cc.getcustomerstatus().containsKey(product.getProdName())){
                        int previousvalue = cc.getcustomerstatus().get(product.getProdName());
                          cust.setcustomerstatus(product.getProdName(), previousvalue+fetchedquantit);
                       }else{
                           cust.setcustomerstatus(product.getProdName(),fetchedquantit);
                        
                        
                    }
               }
               }
        
               if(Float.parseFloat(txtSalesPrice.getText())>product.getTargetprice())
               {
                   sales.setAbovetarget(fetchedquantit);
               } else {
                   sales.setBelowtarget(fetchedquantit);
               }
               
               float findcommision = (Float.parseFloat(commisiontextfield.getText())*(fetchedquantit*Float.parseFloat(txtSalesPrice.getText())))/100;
               sales.setCommision(findcommision);
               
    }//GEN-LAST:event_buyjButtonActionPerformed

            public float calculatecommision(){

            int selectedrow = productTable.getSelectedRow();
            Product product = (Product) productTable.getValueAt(selectedrow,0);

            float sellingprice =  Float.parseFloat(txtSalesPrice.getText());
            float targetprice = product.getTargetprice();
            float ceilingprice = product.getCelingprice();
            float commission=0;

            float btwntarcei = (ceilingprice - targetprice)/8;
            float tarcei1 = targetprice+btwntarcei;
            float tarcei2 = tarcei1 + btwntarcei;
            float tarcei3 = tarcei2 + btwntarcei;
            float tarcei4 = tarcei3 + btwntarcei;
            float tarcei5 = tarcei4 + btwntarcei;
            float tarcei6 = tarcei5 + btwntarcei;
            float tarcei7 = tarcei6 + btwntarcei;

            float btwntarfloor = (targetprice - product.getFloorprice())/8; // 6

            float tarfloor1 = targetprice - btwntarcei; // 144
            float tarfloor2 = tarfloor1 - btwntarcei; // 136
            float tarfloor3 = tarfloor2 - btwntarcei;//128
            float tarfloor4 = tarfloor3 - btwntarcei;//120
            float tarfloor5 = tarfloor4 - btwntarcei;//112
            float tarfloor6 = tarfloor5 - btwntarcei;//104
            float tarfloor7 = tarfloor6 - btwntarcei;//98

            float profloss = sellingprice - targetprice;
            if(profloss <0)
            {
                if(sellingprice<targetprice && sellingprice>tarfloor1)
                {
                    commission = 15;
                } else if (sellingprice<tarfloor1 && sellingprice>tarfloor2)
                {
                    commission = 13;
                } else if (sellingprice<tarfloor2 && sellingprice>tarfloor3)
                {
                    commission = 11;
                } else if (sellingprice<tarfloor3 && sellingprice<tarfloor4)
                {
                    commission = 10;
                } else if (sellingprice<tarfloor4 && sellingprice<tarfloor5)
                {
                    commission = 9;
                }else if (sellingprice<tarfloor5 && sellingprice<tarfloor6)
                {
                    commission = 6;
                } else if (sellingprice<tarfloor6 && sellingprice<tarfloor7)
                {
                    commission = 4;
                }
            } else {

                if(sellingprice>targetprice && sellingprice<tarcei1){
                    commission = 18;
                } else if(sellingprice>tarcei1 && sellingprice<tarcei2){
                    commission = 21;
                } else if(sellingprice>tarcei2 && sellingprice<tarcei3){
                    commission = 24;
                } else if(sellingprice>tarcei3 && sellingprice<tarcei4){
                    commission = 27;
                } else if(sellingprice>tarcei4 && sellingprice<tarcei5){
                    commission = 30;
                } else if(sellingprice>tarcei5 && sellingprice<tarcei6){
                    commission = 33;
                }else if(sellingprice>tarcei6 && sellingprice<tarcei7){
                    commission = 36;
                }
            }

            //JOptionPane.showMessageDialog(this, "Your commission is "+ commission+"%" );
            return commission;
            }
    
    
    
    private void quantitySpinnerStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_quantitySpinnerStateChanged
        lastquotedcustomerprice =0;
        
    }//GEN-LAST:event_quantitySpinnerStateChanged

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        txtSalesPrice.setText("0");
        customervaluejTextField.setText("");
        flag=true;
        commisiontextfield.setText("");
        
    }//GEN-LAST:event_productTableMouseClicked

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JButton buyjButton;
    private javax.swing.JTextField commisiontextfield;
    private javax.swing.JComboBox customerjComboBox;
    private javax.swing.JTextField customervaluejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    private javax.swing.JSpinner quantitySpinner;
    private javax.swing.JComboBox salesmancombobox;
    private javax.swing.JTextField txtSalesPrice;
    // End of variables declaration//GEN-END:variables
}
