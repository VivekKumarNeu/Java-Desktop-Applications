/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Supplier;

import Business.DrugInventory;
import Business.StoreDirectory;
import Business.supplierdirectory;
import UserInterface.CvsAdmin.ManageDrugCatalogjPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vivek
 */
public class SupplierOptionPage extends javax.swing.JPanel {

    /**
     * Creates new form SupplierOptionPage
     */
    private JPanel userprocesscontrol;
    DrugInventory druginventory;
    StoreDirectory storedirectory;
    supplierdirectory SupplierDirectory;

    public SupplierOptionPage(JPanel userprocesscontrol,DrugInventory druginventory, StoreDirectory storedirectory,supplierdirectory SupplierDirectory) {
        initComponents();
        this.userprocesscontrol = userprocesscontrol;
        this.druginventory = druginventory;
        this.storedirectory = storedirectory;
        this.SupplierDirectory = SupplierDirectory;
        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Supplier options");

        jButton1.setText("Add Supplier");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Add drug from Supplier ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1)))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addGap(55, 55, 55)
                .addComponent(jButton1)
                .addGap(51, 51, 51)
                .addComponent(jButton2)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
    addsupplier as = new addsupplier(userprocesscontrol,druginventory,SupplierDirectory);
    userprocesscontrol.add("addsupplier", as);
    CardLayout layout = (CardLayout) userprocesscontrol.getLayout();
    layout.next(userprocesscontrol);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Supplieraddingdrug sad = new Supplieraddingdrug(userprocesscontrol,druginventory,SupplierDirectory);
        userprocesscontrol.add("addsupplier", sad);
        CardLayout layout = (CardLayout) userprocesscontrol.getLayout();
        layout.next(userprocesscontrol);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}