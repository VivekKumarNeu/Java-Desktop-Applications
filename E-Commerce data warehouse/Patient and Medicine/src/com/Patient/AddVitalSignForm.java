/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Patient;

import com.Business.Patient;
import com.Business.Person;
import com.Business.PersonDirectory;
import com.Business.VitalSign;
import com.Business.VitalSignHistory;
import com.Person.Searchperson;
import java.awt.CardLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Vivek
 */
public class AddVitalSignForm extends javax.swing.JPanel {

    /**
     * Creates new form AddVitalSignForm
     */
    JPanel usercontrolpanel;
    private VitalSignHistory vitalsignhistory;
    PersonDirectory persondirectory;
    int age=0;
    
    public AddVitalSignForm(VitalSignHistory vitalshistory, JPanel ucp,PersonDirectory personaldir ) {
        initComponents();
        this.usercontrolpanel = ucp;
        this.vitalsignhistory = vitalsignhistory;
        this.persondirectory = personaldir;
        
        populatetable();
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
        respiratoryratejTextField = new javax.swing.JTextField();
        heartratejTextField = new javax.swing.JTextField();
        bloodpressurejTextField = new javax.swing.JTextField();
        weightjTextField = new javax.swing.JTextField();
        submitjBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        vitalformpagejTable = new javax.swing.JTable();
        displayjButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        VitalsignjTable = new javax.swing.JTable();
        UpdatejButton = new javax.swing.JButton();
        searchjButton = new javax.swing.JButton();
        searchjTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        heartratejButton = new javax.swing.JButton();
        RespjButton = new javax.swing.JButton();
        weightjButton = new javax.swing.JButton();

        setLayout(new java.awt.CardLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Vital Form details");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Respiratory Rate");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Heart Rate");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Systolic Blood Pressure");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Weight(Pounds)");

        respiratoryratejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                respiratoryratejTextFieldKeyTyped(evt);
            }
        });

        heartratejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                heartratejTextFieldKeyTyped(evt);
            }
        });

        bloodpressurejTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bloodpressurejTextFieldKeyTyped(evt);
            }
        });

        weightjTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                weightjTextFieldKeyTyped(evt);
            }
        });

        submitjBtn.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        submitjBtn.setText("Submit");
        submitjBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjBtnActionPerformed(evt);
            }
        });

        vitalformpagejTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Person Name", "Patient Id"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(vitalformpagejTable);

        displayjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        displayjButton.setText("Display");
        displayjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayjButtonActionPerformed(evt);
            }
        });

        VitalsignjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Heart Rate", "Respiratory Rate", "Blood Pressure", "Weight", "Status", "Time"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(VitalsignjTable);
        if (VitalsignjTable.getColumnModel().getColumnCount() > 0) {
            VitalsignjTable.getColumnModel().getColumn(0).setResizable(false);
        }

        UpdatejButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        UpdatejButton.setText("Update Vital Sign");
        UpdatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatejButtonActionPerformed(evt);
            }
        });

        searchjButton.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        searchjButton.setText("Search Person");
        searchjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchjButtonActionPerformed(evt);
            }
        });

        searchjTextField.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setText("Vital Sign Pie Chart");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Delete Vital Signs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setText("Blood Pressure Graph");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        heartratejButton.setText("Heart Rate Graph");
        heartratejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heartratejButtonActionPerformed(evt);
            }
        });

        RespjButton.setText("Respieatory Rate Graph");
        RespjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RespjButtonActionPerformed(evt);
            }
        });

        weightjButton.setText("Weight Graph");
        weightjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(searchjButton)
                            .addComponent(searchjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(UpdatejButton)
                                .addGap(92, 92, 92)
                                .addComponent(jButton2)
                                .addGap(86, 86, 86)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(heartratejButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(RespjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(weightjButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(158, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5))
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(respiratoryratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(weightjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodpressurejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(displayjButton, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                            .addComponent(submitjBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(heartratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(364, 364, 364))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(searchjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(respiratoryratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(submitjBtn))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(heartratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bloodpressurejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(displayjButton))
                        .addGap(31, 31, 31)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heartratejButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RespjButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(weightjButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UpdatejButton)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(77, 77, 77))
        );

        add(jPanel1, "card2");
    }// </editor-fold>//GEN-END:initComponents

    public void populatetable(){
    
        DefaultTableModel dtm = (DefaultTableModel)vitalformpagejTable.getModel();
        int rowcount = vitalformpagejTable.getRowCount();
                
                
        for ( int i= rowcount -1 ; i>=0; i--)
            dtm.removeRow(i);
        
        for (Person per : persondirectory.getpersonlist())
        {
            for(Patient patientid : per.getvitalsignhistory().getpatientList()){
             
            Object row[] = new Object[2];
            row[0] = per;
            row[1] = patientid.getPatientId();
            dtm.addRow(row);
            }
           
        }
    }
    
    
    private void respiratoryratejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_respiratoryratejTextFieldKeyTyped
        char respiratory = evt.getKeyChar();
        if (!(Character.isDigit(respiratory)))
        evt.consume();
    }//GEN-LAST:event_respiratoryratejTextFieldKeyTyped

    private void heartratejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_heartratejTextFieldKeyTyped
        char heartrate = evt.getKeyChar();
        if (!(Character.isDigit(heartrate)))
        evt.consume();
    }//GEN-LAST:event_heartratejTextFieldKeyTyped

    private void bloodpressurejTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bloodpressurejTextFieldKeyTyped
        char bloodpressure = evt.getKeyChar();
        if (!(Character.isDigit(bloodpressure)))
        evt.consume();
    }//GEN-LAST:event_bloodpressurejTextFieldKeyTyped

    private void weightjTextFieldKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_weightjTextFieldKeyTyped
        char weight = evt.getKeyChar();
        if (!(Character.isDigit(weight)))
        evt.consume();
    }//GEN-LAST:event_weightjTextFieldKeyTyped

    private void submitjBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitjBtnActionPerformed

        boolean flag=false;
        JTextField[] textFields = new JTextField[5];
        textFields[0] = respiratoryratejTextField;
        textFields[1] = heartratejTextField;
        textFields[2] = bloodpressurejTextField;
        textFields[3] = weightjTextField;
        
        for(int i=0;i<4;i++) {
            
            if (textFields[i].getText().equals("")) {
                flag=false;
                JOptionPane.showMessageDialog(this, "Fields cannot be blank.","Error",JOptionPane.ERROR_MESSAGE);
                break;
            } else if ((textFields[i].getText().equals("0"))) {
                flag=false;
                JOptionPane.showMessageDialog(this, "Values cannot be zero.Please re-enter the value","Error",JOptionPane.ERROR_MESSAGE);
                break;
            } else                 
                  flag=true;
            }
        
        if(flag) {
        int selectedrow = vitalformpagejTable.getSelectedRow();
        if(selectedrow >=0)
        {
            Person peeps = (Person) vitalformpagejTable.getValueAt(selectedrow,0);
            VitalSign vitalsign = peeps.getvitalsignhistory().addVitalSign();
            vitalsign.setBloodPressure(Integer.parseInt(bloodpressurejTextField.getText()));
            vitalsign.setHeartRate(Integer.parseInt(heartratejTextField.getText()));
            vitalsign.setRespiratoryRate(Integer.parseInt(respiratoryratejTextField.getText()));
            vitalsign.setWeight(Integer.parseInt(weightjTextField.getText()));
            vitalsign.setTime(currentdateandtime());
            clearfields();
            
            /* steps for populating vital sign*/
            
            DefaultTableModel dtm = (DefaultTableModel)VitalsignjTable.getModel();
        int rowcount = VitalsignjTable.getRowCount();
                
        for ( int i= rowcount -1 ; i>=0; i--)
            dtm.removeRow(i);

                int selectedrow1 = vitalformpagejTable.getSelectedRow();
                   if(selectedrow >=0)
            {
               Person person = (Person) vitalformpagejTable.getValueAt(selectedrow,0);
            age = peeps.getAge();
            for(VitalSign vitalsigns : person.getvitalsignhistory().getVitalSignList())
            {
                Object row[] = new Object[6];
                row[0] = vitalsigns;
                row[1] = vitalsigns.getRespiratoryRate();
                row[2] = vitalsigns.getBloodPressure();
                row[3] = vitalsigns.getWeight();
                row[4] = healthconditions(vitalsigns.getRespiratoryRate(),vitalsigns.getHeartRate(),vitalsigns.getBloodPressure(),vitalsigns.getWeight());
                row[5] = vitalsigns.getTime();
                dtm.addRow(row);
            }
            
        }  
            } else {
           
            JOptionPane.showMessageDialog(this, "Please select a row","Warning", JOptionPane.ERROR_MESSAGE);
        }}        
    }//GEN-LAST:event_submitjBtnActionPerformed

    public String currentdateandtime()
    {
        long seconds = System.currentTimeMillis();
        SimpleDateFormat dateformat = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
        Date date = new Date(seconds);
        return (dateformat.format(date));
    }
    
    
    
    public void clearfields(){
    bloodpressurejTextField.setText("");
    heartratejTextField.setText("");
    respiratoryratejTextField.setText("");
    weightjTextField.setText("");
    }
    
    private void displayjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayjButtonActionPerformed
        
        DefaultTableModel dtm = (DefaultTableModel)VitalsignjTable.getModel();
        int rowcount = VitalsignjTable.getRowCount();
                
        for ( int i= rowcount -1 ; i>=0; i--)
            dtm.removeRow(i);

        int selectedrow = vitalformpagejTable.getSelectedRow();
        if(selectedrow >=0)
        {
            Person peeps = (Person) vitalformpagejTable.getValueAt(selectedrow,0);
            age = peeps.getAge();
            for(VitalSign vitalsigns : peeps.getvitalsignhistory().getVitalSignList())
            {
                Object row[] = new Object[6];
                row[0] = vitalsigns;
                row[1] = vitalsigns.getRespiratoryRate();
                row[2] = vitalsigns.getBloodPressure();
                row[3] = vitalsigns.getWeight();
                row[4] = healthconditions(vitalsigns.getRespiratoryRate(),vitalsigns.getHeartRate(),vitalsigns.getBloodPressure(),vitalsigns.getWeight());
                row[5] = vitalsigns.getTime();
                dtm.addRow(row);
            }
            
        }  
        
    }//GEN-LAST:event_displayjButtonActionPerformed

        public String agecheck()
    {
        if(age>=1 && age<=3)
            return "Toddler";
        else if (age>=4 && age<=5)
            return "Preschoorer";
        else if (age>=6 && age<=12)
            return "SchoolAge";
        else return "Adolescent";
    }
        
         public String healthconditions(int respR,int heartR, int bpR, int weightR )
    {
        
        Integer[] values = setdatarange(agecheck());
        boolean resprate = state(values,respR,0,1);
        boolean heartrate = state(values,heartR,2,3); 
        boolean Bloodpressure = state(values,bpR,4,5);
        boolean weight = state(values,weightR,6,7);
        
        if (resprate && heartrate && Bloodpressure && weight)
                return "Normal";
        else
            return "Abnormal";
    }
    
         public Integer[] setdatarange(String agegroup)
    {
        Integer[] xx={0};
        HashMap<String, Integer[]> map = new HashMap<>();
        map.put("Toddler", new Integer[] {20,30,80,130,80,110,22,31});
        map.put("Preschoorer", new Integer[] {20,30,80,120,80,110,31,40});
        map.put("SchoolAge", new Integer[] {20,30,70,110,80,120,41,92});
        map.put("Adolescent",new Integer[] {12,20,55,105,110,120,110,100000});
        
        if (map.containsKey(agegroup)){
             xx = map.get(agegroup);
             return xx;
        }
        return xx;
    }
    
    public boolean state(Integer[] x,int vitalvalue,int first,int last)
    {
            int[] valuerange = IntStream.rangeClosed(x[first], x[last]).toArray();
            ArrayList<Integer> patientlist = new ArrayList<>();
            for (int i=0;i<valuerange.length;i++)
                  patientlist.add(valuerange[i]);
             if (patientlist.contains(vitalvalue))
                    return true;
             else
                    return false;
    }
    
    private void UpdatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatejButtonActionPerformed
        
        int selectedrow = VitalsignjTable.getSelectedRow();
        if(selectedrow >=0)
        {
            VitalSign vital = (VitalSign) VitalsignjTable.getValueAt(selectedrow,0);
            
            UpdatejPanel va = new UpdatejPanel(usercontrolpanel,vital, this);
            usercontrolpanel.add("UpdatejPanel",va);
            CardLayout layout = (CardLayout) usercontrolpanel.getLayout();
            layout.next(usercontrolpanel);
            
        }  
               
    }//GEN-LAST:event_UpdatejButtonActionPerformed

    private void searchjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchjButtonActionPerformed
        
        String patientname = searchjTextField.getText();
        
        Person p = persondirectory.searchPerson(patientname);
        if (p==null){
                    JOptionPane.showMessageDialog(this, "Person was not found");
                } else {
                    Searchperson sr = new Searchperson(usercontrolpanel,p);
                    usercontrolpanel.add("SearchPerson",sr);
                    CardLayout layout = (CardLayout) usercontrolpanel.getLayout();
                    layout.next(usercontrolpanel);
                }        
        
        
        
    }//GEN-LAST:event_searchjButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int selectedrow = VitalsignjTable.getSelectedRow();
        if(selectedrow >=0)
        {
            VitalSign peeps = (VitalSign) VitalsignjTable.getValueAt(selectedrow,0);
            String status = (String) VitalsignjTable.getValueAt(selectedrow,4);
            
            
        DefaultPieDataset piechatdata = new DefaultPieDataset();
        piechatdata.setValue("Blood Pressure", peeps.getBloodPressure());
        piechatdata.setValue("Heart Rate", peeps.getHeartRate());
        piechatdata.setValue("Respiratory Rate", peeps.getRespiratoryRate());
        piechatdata.setValue("Weight", peeps.getWeight());
        JFreeChart chart = ChartFactory.createPieChart("Pie Chart -"+status, piechatdata, true, true, true);
        PiePlot p= (PiePlot) chart.getPlot();
        ChartFrame frame = new ChartFrame("Pie chart",chart);
        frame.setVisible(true);
        frame.setSize(450,500);
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int selectedrow = VitalsignjTable.getSelectedRow();
        int Selectedperson = vitalformpagejTable.getSelectedRow();
        Person person = (Person) vitalformpagejTable.getValueAt(Selectedperson, 0);
        
        if(selectedrow >=0)
        {
            VitalSign vitalsign = (VitalSign) VitalsignjTable.getValueAt(selectedrow,0);
            person.getvitalsignhistory().deleteVitalsign(vitalsign);
            populatevitalsigntable();
            populatetable();
            
        }    
                
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
        int selectedrow = vitalformpagejTable.getSelectedRow();
        Person person = (Person) vitalformpagejTable.getValueAt(selectedrow, 0);
        ArrayList<Integer> obj = new ArrayList<Integer>();
        int totallength = person.getvitalsignhistory().getVitalSignList().size();
        for(VitalSign vs : person.getvitalsignhistory().getVitalSignList())
                obj.add(vs.getBloodPressure());

        DefaultCategoryDataset dataset =  new DefaultCategoryDataset();
            for(int x=1;x<=totallength;x++){
                dataset.setValue(obj.get(x-1),"Blood Pressure","VitalSign "+x);
        }
        JFreeChart chart = ChartFactory.createBarChart("Blood Pressure chart", "Blood Pressure","Data value", dataset,PlotOrientation.VERTICAL,false,false,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar chart for Blood Pressure",chart);
        frame.setVisible(true);
        frame.setSize(450,350);
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void heartratejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heartratejButtonActionPerformed
        int selectedrow = vitalformpagejTable.getSelectedRow();
        Person person = (Person) vitalformpagejTable.getValueAt(selectedrow, 0);
        ArrayList<Integer> obj = new ArrayList<Integer>();
        int totallength = person.getvitalsignhistory().getVitalSignList().size();
        for(VitalSign vs : person.getvitalsignhistory().getVitalSignList())
                obj.add(vs.getHeartRate());

        DefaultCategoryDataset dataset =  new DefaultCategoryDataset();
            for(int x=1;x<=totallength;x++){
                dataset.setValue(obj.get(x-1),"Heart Rate","VitalSign "+x);
        }
        JFreeChart chart = ChartFactory.createBarChart("Heart Rate chart", "Heart Rate","Data value", dataset,PlotOrientation.VERTICAL,false,false,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar chart for Heart Rate",chart);
        frame.setVisible(true);
        frame.setSize(450,350);
    }//GEN-LAST:event_heartratejButtonActionPerformed

    private void RespjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RespjButtonActionPerformed
        
        int selectedrow = vitalformpagejTable.getSelectedRow();
        Person person = (Person) vitalformpagejTable.getValueAt(selectedrow, 0);
        ArrayList<Integer> obj = new ArrayList<Integer>();
        int totallength = person.getvitalsignhistory().getVitalSignList().size();
        for(VitalSign vs : person.getvitalsignhistory().getVitalSignList())
                obj.add(vs.getRespiratoryRate());

        DefaultCategoryDataset dataset =  new DefaultCategoryDataset();
            for(int x=1;x<=totallength;x++){
                dataset.setValue(obj.get(x-1),"Respiratory Rate","VitalSign "+x);
        }
        JFreeChart chart = ChartFactory.createBarChart("Respiratory Rate chart", "Respiratory Rate","Data value", dataset,PlotOrientation.VERTICAL,false,false,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar chart for Respiratory Rate",chart);
        frame.setVisible(true);
        frame.setSize(450,350);
        
        
    }//GEN-LAST:event_RespjButtonActionPerformed

    private void weightjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightjButtonActionPerformed
        
        int selectedrow = vitalformpagejTable.getSelectedRow();
        Person person = (Person) vitalformpagejTable.getValueAt(selectedrow, 0);
        ArrayList<Integer> obj = new ArrayList<Integer>();
        int totallength = person.getvitalsignhistory().getVitalSignList().size();
        for(VitalSign vs : person.getvitalsignhistory().getVitalSignList())
                obj.add(vs.getWeight());

        DefaultCategoryDataset dataset =  new DefaultCategoryDataset();
            for(int x=1;x<=totallength;x++){
                dataset.setValue(obj.get(x-1),"Weight","VitalSign "+x);
        }
        JFreeChart chart = ChartFactory.createBarChart("Weight chart", "Weight","Data value", dataset,PlotOrientation.VERTICAL,false,false,false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setRangeGridlinePaint(Color.black);
        ChartFrame frame = new ChartFrame("Bar chart for Weight",chart);
        frame.setVisible(true);
        frame.setSize(450,350);
        
        
        
    }//GEN-LAST:event_weightjButtonActionPerformed

    
    public void populatevitalsigntable(){
    
        int Selectedperson = vitalformpagejTable.getSelectedRow();
        Person per = (Person) vitalformpagejTable.getValueAt(Selectedperson, 0);

        DefaultTableModel dtm = (DefaultTableModel)VitalsignjTable.getModel();
        int rowcount = VitalsignjTable.getRowCount();
                
        for ( int i= rowcount -1 ; i>=0; i--)
            dtm.removeRow(i);
        
            for(VitalSign vitalsigns : per.getvitalsignhistory().getVitalSignList()){
             
                Object row[] = new Object[6];
                row[0] = vitalsigns;
                row[1] = vitalsigns.getRespiratoryRate();
                row[2] = vitalsigns.getBloodPressure();
                row[3] = vitalsigns.getWeight();
                row[4] = healthconditions(vitalsigns.getRespiratoryRate(),vitalsigns.getHeartRate(),vitalsigns.getBloodPressure(),vitalsigns.getWeight());
                row[5] = vitalsigns.getTime();
                dtm.addRow(row);
                
            }
           
        
        
        
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RespjButton;
    private javax.swing.JButton UpdatejButton;
    private javax.swing.JTable VitalsignjTable;
    private javax.swing.JTextField bloodpressurejTextField;
    private javax.swing.JButton displayjButton;
    private javax.swing.JButton heartratejButton;
    private javax.swing.JTextField heartratejTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField respiratoryratejTextField;
    private javax.swing.JButton searchjButton;
    private javax.swing.JTextField searchjTextField;
    private javax.swing.JButton submitjBtn;
    private javax.swing.JTable vitalformpagejTable;
    private javax.swing.JButton weightjButton;
    private javax.swing.JTextField weightjTextField;
    // End of variables declaration//GEN-END:variables
}
