/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.CvsAdmin;

import Business.DrugInventory;
import Business.Drugs;
import Business.supplierdirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Vivek
 */
public class ViewDrugjPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDrugjPanel
     */    
    private JPanel userprocesscontrol;
    DrugInventory druginventory;
    Drugs drug;
    ManageDrugCatalogjPanel managedrugcatalog;

    public ViewDrugjPanel(JPanel userprocesscontrol,DrugInventory druginventory,Drugs drug,ManageDrugCatalogjPanel mdcp) {
        initComponents();
        this.userprocesscontrol = userprocesscontrol;
        this.drug = drug;
        this.managedrugcatalog = mdcp;
        filltable();
    }

    public void filltable(){
    
    drugnamejTextField.setText(drug.getDrugname());
    drugpricejTextField.setText(String.valueOf(drug.getprice()));
    drugserialnumberjTextField.setText(drug.getDrugserialnumber());
    drugwuantityjTextField.setText(String.valueOf(drug.getQuantity()));
    expdatejTextField.setText(drug.getExpirydate());
    legaljTextField.setText(drug.getLeagal());
    manudatejTextField.setText(drug.getManufacturedate());
    volumejTextField.setText(String.valueOf(drug.getVolumeintake()));
    weightjTextField.setText(String.valueOf(drug.getWeight()));
    shapejTextField.setText(drug.getdrugdesign());
    
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        weightjTextField = new javax.swing.JTextField();
        legaljTextField = new javax.swing.JTextField();
        volumejTextField = new javax.swing.JTextField();
        drugpricejTextField = new javax.swing.JTextField();
        expdatejTextField = new javax.swing.JTextField();
        manudatejTextField = new javax.swing.JTextField();
        drugserialnumberjTextField = new javax.swing.JTextField();
        drugwuantityjTextField = new javax.swing.JTextField();
        drugnamejTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();
        savejButton = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        shapejTextField = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Drug Details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Drug Name");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Quantity");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("DrugSerialNumber");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Manufacture date");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Expiry date");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Price");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Volumne Intake");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Legal");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Weight");

        weightjTextField.setEditable(false);

        legaljTextField.setEditable(false);

        volumejTextField.setEditable(false);

        drugpricejTextField.setEditable(false);
        drugpricejTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drugpricejTextFieldActionPerformed(evt);
            }
        });

        expdatejTextField.setEditable(false);

        manudatejTextField.setEditable(false);

        drugserialnumberjTextField.setEditable(false);

        drugwuantityjTextField.setEditable(false);

        drugnamejTextField.setEditable(false);

        jButton1.setText("<< back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        updatejButton.setText("Update");
        updatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatejButtonActionPerformed(evt);
            }
        });

        savejButton.setText("Save");
        savejButton.setEnabled(false);
        savejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savejButtonActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Shape");

        shapejTextField.setBackground(new java.awt.Color(240, 240, 240));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                .addComponent(savejButton)
                .addGap(88, 88, 88)
                .addComponent(updatejButton)
                .addGap(188, 188, 188))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(183, 183, 183)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(176, 176, 176)
                        .addComponent(shapejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(156, 156, 156)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel5))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(drugpricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(volumejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(expdatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(weightjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(drugserialnumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(manudatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(legaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(drugwuantityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(drugnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(156, 156, 156)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(shapejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(savejButton)
                    .addComponent(updatejButton))
                .addGap(36, 36, 36))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(104, 104, 104)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(drugnamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(drugwuantityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(drugserialnumberjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(manudatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(expdatejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(drugpricejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(volumejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(legaljTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(weightjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(132, Short.MAX_VALUE)))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        userprocesscontrol.remove(this);
        CardLayout layout = (CardLayout) userprocesscontrol.getLayout();
        layout.previous(userprocesscontrol);
        managedrugcatalog.populatetable();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatejButtonActionPerformed
        
    drugnamejTextField.setEditable(true);
    drugpricejTextField.setEditable(true);
    expdatejTextField.setEditable(true);
    legaljTextField.setEditable(true);
    manudatejTextField.setEditable(true);
    volumejTextField.setEditable(true);
    weightjTextField.setEditable(true);
    shapejTextField.setEditable(true);
    
     updatejButton.setEnabled(false);
     savejButton.setEnabled(true);
        
    }//GEN-LAST:event_updatejButtonActionPerformed

    private void savejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savejButtonActionPerformed
        boolean flag = true;
        JTextField[] textFields = new JTextField[10];
        textFields[0] = drugnamejTextField;
        textFields[1] = drugpricejTextField;
        textFields[2] = drugserialnumberjTextField;
        textFields[3] = drugwuantityjTextField;
        textFields[4] = expdatejTextField;
        textFields[5] = legaljTextField;
        textFields[6] = manudatejTextField;
        textFields[7] = volumejTextField;
        textFields[8] = weightjTextField;
        textFields[9] = shapejTextField;
        
        
            for(int i=0;i<10;i++) {
                if (textFields[i].getText().equals("")) {
                    flag=false;
                    JOptionPane.showMessageDialog(this, "Please fill all the fields","Warning",JOptionPane.WARNING_MESSAGE);
                    break;
                } else 
                {
                    flag=true;
                }
        }
        if (flag){
            drug.setDrugname(drugnamejTextField.getText());
            drug.setprice(Float.parseFloat(drugpricejTextField.getText()));
            drug.setDrugserialnumber(drugserialnumberjTextField.getText());
            drug.setQuantity(Integer.parseInt(drugwuantityjTextField.getText()));
            drug.setExpirydate(expdatejTextField.getText());
            drug.setLeagal(legaljTextField.getText());
            drug.setManufacturedate(manudatejTextField.getText());
            drug.setVolumeintake(Integer.parseInt(volumejTextField.getText()));
            drug.setWeight(Integer.parseInt(weightjTextField.getText()));
            drug.setdrugdesign(shapejTextField.getText());
            JOptionPane.showMessageDialog(this, "Data is been saved.");
            drugnamejTextField.setText("");
            drugpricejTextField.setText("");
            expdatejTextField.setText("");
            legaljTextField.setText("");
            manudatejTextField.setText("");
            volumejTextField.setText("");
            weightjTextField.setText("");
            shapejTextField.setText("");
            drugwuantityjTextField.setText("");
            drugserialnumberjTextField.setText("");
            
            
            
            
            
            
        }
        
        
        
    }//GEN-LAST:event_savejButtonActionPerformed

    private void drugpricejTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drugpricejTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drugpricejTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField drugnamejTextField;
    private javax.swing.JTextField drugpricejTextField;
    private javax.swing.JTextField drugserialnumberjTextField;
    private javax.swing.JTextField drugwuantityjTextField;
    private javax.swing.JTextField expdatejTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField legaljTextField;
    private javax.swing.JTextField manudatejTextField;
    private javax.swing.JButton savejButton;
    private javax.swing.JTextField shapejTextField;
    private javax.swing.JButton updatejButton;
    private javax.swing.JTextField volumejTextField;
    private javax.swing.JTextField weightjTextField;
    // End of variables declaration//GEN-END:variables
}
