/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Administrator;

import Business.ProductCatalog;
import Business.SalesDirectory;
import Business.SalesPerson;
import Business.supplierdirectory;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Vivek
 */
public class AdminOptions extends javax.swing.JPanel {

    /**
     * Creates new form Addsuppliers
     */
    private JPanel userprocesscontrol;
    private SalesDirectory salesdirectory;
    private supplierdirectory SupplierDirectory;
    private ProductCatalog productcatalog;

    public AdminOptions(JPanel userprocesscontrol, SalesDirectory salesdirectory,supplierdirectory SupplierDirectory,ProductCatalog productcatalog) {
        initComponents();
        this.userprocesscontrol = userprocesscontrol;
        this.salesdirectory = salesdirectory;
        this.SupplierDirectory = SupplierDirectory;
        this.productcatalog = productcatalog;
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
        addsalespersonjButton = new javax.swing.JButton();
        viewsalespersonjButton = new javax.swing.JButton();
        supplierjButton1 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        addsalespersonjButton.setText("Add sales person");
        addsalespersonjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addsalespersonjButtonActionPerformed(evt);
            }
        });

        viewsalespersonjButton.setText("View sales person");
        viewsalespersonjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewsalespersonjButtonActionPerformed(evt);
            }
        });

        supplierjButton1.setText("Add Supplier");
        supplierjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                supplierjButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(supplierjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewsalespersonjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addsalespersonjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(270, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(addsalespersonjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewsalespersonjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(supplierjButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void addsalespersonjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addsalespersonjButtonActionPerformed
        
    Addsalesperson asp = new Addsalesperson(userprocesscontrol,salesdirectory,this);
    userprocesscontrol.add("Addsalesperson", asp);
    CardLayout layout = (CardLayout) userprocesscontrol.getLayout();
    layout.next(userprocesscontrol);
        
        
    }//GEN-LAST:event_addsalespersonjButtonActionPerformed

    private void viewsalespersonjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewsalespersonjButtonActionPerformed
        
    SalePersonjPanel asp = new SalePersonjPanel(userprocesscontrol,salesdirectory);
    userprocesscontrol.add("SalePersonjPanel", asp);
    CardLayout layout = (CardLayout) userprocesscontrol.getLayout();
    layout.next(userprocesscontrol);
        
    }//GEN-LAST:event_viewsalespersonjButtonActionPerformed

    private void supplierjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_supplierjButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_supplierjButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addsalespersonjButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton supplierjButton1;
    private javax.swing.JButton viewsalespersonjButton;
    // End of variables declaration//GEN-END:variables
}