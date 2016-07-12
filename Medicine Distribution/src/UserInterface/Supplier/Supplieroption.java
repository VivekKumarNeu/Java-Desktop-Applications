/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.Supplier;

import Business.Product;
import Business.ProductCatalog;
import Business.SalesDirectory;
import Business.SalesPerson;
import java.io.File;
import javax.swing.JPanel;
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
public class Supplieroption extends javax.swing.JPanel {

    /**
     * Creates new form Supplieroption
     */
    private JPanel userprocesscontrol;
    static boolean flag=true;
    private ProductCatalog productcatalog;
    
    public Supplieroption(JPanel userprocesscontrol, ProductCatalog productcatalog) {
        initComponents();
        this.userprocesscontrol = userprocesscontrol;
        this.productcatalog = productcatalog;
        populatedatafromfile();
        populatetable();
    }

       public void populatedatafromfile()
    {
        if(flag){ 
        try {

         
	File fXmlFile = new File("C:\\Users\\Vivek\\Documents\\NetBeansProjects\\Assignment5\\src\\Business\\productdata.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(fXmlFile);
		
          
	doc.getDocumentElement().normalize();
        NodeList nList = doc.getElementsByTagName("product");
        DefaultTableModel model = (DefaultTableModel)supplierjTable.getModel();
        model.setRowCount(0);
        
        
	for (int temp = 0; temp < nList.getLength(); temp++) {
                Product product = productcatalog.addProduct();
		Node nNode = nList.item(temp);
				
		if (nNode.getNodeType() == Node.ELEMENT_NODE) {

                       Element eElement = (Element) nNode;
                       product.setProdName(eElement.getElementsByTagName("productname").item(0).getTextContent());
                       product.setPrice(Integer.parseInt(eElement.getElementsByTagName("price").item(0).getTextContent()));
                       product.setQuantity(Integer.parseInt(eElement.getElementsByTagName("quantity").item(0).getTextContent()));
                     
                       Object []obj = new Object[4];
                       obj[0] = product;
                       obj[1] = product.getProdName();
                       obj[2] = product.getPrice();
                       obj[3] = product.getQuantity();
                      model.addRow(obj);
		}
	}
        flag = false;
    } catch (Exception e) {
	e.printStackTrace();
    }}
        
    }
    
    public void populatetable(){
    DefaultTableModel dtm = (DefaultTableModel)supplierjTable.getModel();
        int rowcount = supplierjTable.getRowCount();
        for ( int i= rowcount -1 ; i>=0; i--)
            dtm.removeRow(i);
        
            for(Product product : productcatalog.getProductcatalog()){
                       Object []obj = new Object[4];
                      obj[0] = product;
                       obj[1] = product.getProdName();
                       obj[2] = product.getPrice();
                       obj[3] = product.getQuantity();
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        supplierjTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Product list by all the Suppliers");

        supplierjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "ProductName", "Price", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(supplierjTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(231, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable supplierjTable;
    // End of variables declaration//GEN-END:variables
}
