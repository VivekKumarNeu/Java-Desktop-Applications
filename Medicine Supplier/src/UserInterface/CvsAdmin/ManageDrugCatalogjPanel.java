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
import javax.swing.JPanel;
import java.io.File;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
/**
 *
 * @author Vivek
 */
public class ManageDrugCatalogjPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageDrugCatalogjPanel
     */
    private JPanel userprocesscontrol;
    DrugInventory druginventory;
    Drugs drug;
    supplierdirectory supplierdirectory;
    static boolean flag = true;
    public ManageDrugCatalogjPanel(JPanel userprocesscontrol,DrugInventory druginventory,supplierdirectory supplierdirectory) {
        initComponents();
        this.userprocesscontrol = userprocesscontrol;
        this.druginventory = druginventory;
        this.supplierdirectory = supplierdirectory;
        
        populatedatafromfile();
        populatetable();
    }

    public void populatedatafromfile()
    {
        if(flag){ 
        try {

         
	File fXmlFile = new File("C:\\Users\\Vivek\\Documents\\NetBeansProjects\\Assignment4\\src\\Functions\\data.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
			
	doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("drug");
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        model.setRowCount(0);
        
        
	for (int temp = 0; temp < nList.getLength(); temp++) {
                Drugs drug = druginventory.adddrug();
		Node nNode = nList.item(temp);
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                       Element eElement = (Element) nNode;
                       drug.setDrugserialnumber(eElement.getAttribute("id"));
                       drug.setDrugname(eElement.getElementsByTagName("drugname").item(0).getTextContent());
                       drug.setQuantity(Integer.parseInt(eElement.getElementsByTagName("quantity").item(0).getTextContent()));
                       drug.setExpirydate(eElement.getElementsByTagName("expiryyear").item(0).getTextContent());
                       drug.setManufacturedate(eElement.getElementsByTagName("manufacturedate").item(0).getTextContent());
                       drug.setVolumeintake(Integer.parseInt(eElement.getElementsByTagName("volumeintake").item(0).getTextContent()));
                       drug.setLeagal(eElement.getElementsByTagName("legal").item(0).getTextContent());
                       drug.setWeight(Integer.parseInt(eElement.getElementsByTagName("weight").item(0).getTextContent()));
                       drug.setdrugdesign(eElement.getElementsByTagName("DrugDesign").item(0).getTextContent());
                       drug.setprice(Float.parseFloat(eElement.getElementsByTagName("price").item(0).getTextContent()));
                       
                       Object []obj = new Object[4];
                       obj[0] = drug;
                       obj[1] = drug.getDrugname();
                       obj[2] = drug.getQuantity();
                       obj[3] = drug.getprice();
                      model.addRow(obj);
		}
	}
        flag = false;
    } catch (Exception e) {
	e.printStackTrace();
    }}
        
    }
    
    public void populatetable(){
    DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        int rowcount = jTable1.getRowCount();
                
                
        for ( int i= rowcount -1 ; i>=0; i--)
            dtm.removeRow(i);
        
            for(Drugs drug : druginventory.getdrugsDir()){
                       Object []obj = new Object[4];
                       obj[0] = drug;
                       obj[1] = drug.getDrugname();
                       obj[2] = drug.getQuantity();
                       obj[3] = drug.getprice();
                       dtm.addRow(obj);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Drug Id", "Drug name", "Quantity", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("CVS Drug Catalog");

        jButton1.setText("<< Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("View by supplier");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("View drug");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(160, 160, 160))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(151, 151, 151))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 488, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
            .addGroup(layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jButton3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(25, 25, 25))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        userprocesscontrol.remove(this);
        CardLayout layout = (CardLayout) userprocesscontrol.getLayout();
        layout.previous(userprocesscontrol);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    showsupplieranddrug spd = new showsupplieranddrug(userprocesscontrol,druginventory,supplierdirectory);
    userprocesscontrol.add("showsupplieranddrug", spd);
    CardLayout layout = (CardLayout) userprocesscontrol.getLayout();
    layout.next(userprocesscontrol);
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    int cvsselectedrow = jTable1.getSelectedRow();
    Drugs drug = (Drugs) jTable1.getValueAt(cvsselectedrow,0);

    if(cvsselectedrow >= 0){
        ViewDrugjPanel spd = new ViewDrugjPanel(userprocesscontrol,druginventory,drug,this);
        userprocesscontrol.add("showsupplieranddrug", spd);
        CardLayout layout = (CardLayout) userprocesscontrol.getLayout();
        layout.next(userprocesscontrol);
    } else {
        JOptionPane.showMessageDialog(this, "Please select a row");
    }
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
