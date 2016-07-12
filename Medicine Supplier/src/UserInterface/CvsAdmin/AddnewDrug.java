/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CvsAdmin;

import Business.DrugInventory;
import Business.Drugs;
import javax.swing.JPanel;

/**
 *
 * @author Vivek
 */
public class AddnewDrug extends javax.swing.JPanel {

    /**
     * Creates new form AddDrug
     */
    private JPanel userprocesscontrol;
    DrugInventory druginventory;
    Drugs drug;

    public AddnewDrug(JPanel userprocesscontrol,DrugInventory druginventory) {
        initComponents();
        this.userprocesscontrol = userprocesscontrol;
        this.druginventory = druginventory;
                
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        drugNamejTextField = new javax.swing.JTextField();
        drugQuantityjTextField = new javax.swing.JTextField();
        addDrugjButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        drugpricejLabel = new javax.swing.JLabel();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Add Drugs");

        jLabel2.setText("Drug Name");

        jLabel3.setText("Drug Quantity");

        drugQuantityjTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                drugQuantityjTextFieldFocusLost(evt);
            }
        });
        drugQuantityjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugQuantityjTextFieldActionPerformed(evt);
            }
        });

        addDrugjButton.setText("Add Drug");
        addDrugjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrugjButtonActionPerformed(evt);
            }
        });

        jLabel4.setText("Drug Price");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(299, 299, 299)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(addDrugjButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(202, 202, 202)
                                .addComponent(jLabel4)))
                        .addGap(100, 100, 100)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(drugNamejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(drugQuantityjTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(drugpricejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(315, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(drugNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(drugQuantityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel4))
                    .addComponent(drugpricejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(addDrugjButton)
                .addContainerGap(170, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void drugQuantityjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugQuantityjTextFieldActionPerformed
         
        
        
    }//GEN-LAST:event_drugQuantityjTextFieldActionPerformed

    private void addDrugjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrugjButtonActionPerformed
        
        for(Drugs singledrug : druginventory.getdrugsDir())
        {
                if(singledrug.getDrugname().equals(drugNamejTextField.getText()))
                {
                    int newvalue = singledrug.getQuantity() + Integer.parseInt(drugQuantityjTextField.getText());
                    singledrug.setQuantity(newvalue);
                    break;
                }                             
        }
        
        
    }//GEN-LAST:event_addDrugjButtonActionPerformed

    private void drugQuantityjTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_drugQuantityjTextFieldFocusLost
        
        for(Drugs singledrug : druginventory.getdrugsDir())
        {
                if(singledrug.getDrugname().equals(drugNamejTextField.getText()))
                {
                    float totalprice = Integer.parseInt(drugQuantityjTextField.getText())  *  singledrug.getprice();
                    drugpricejLabel.setText(String.valueOf(totalprice));
                }
        }
        
    }//GEN-LAST:event_drugQuantityjTextFieldFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrugjButton;
    private javax.swing.JTextField drugNamejTextField;
    private javax.swing.JTextField drugQuantityjTextField;
    private javax.swing.JLabel drugpricejLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
