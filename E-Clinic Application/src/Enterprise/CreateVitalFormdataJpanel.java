/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enterprise;

import Business.VitalSign;
import Business.VitalSignHistory;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Vivek
 */

public class CreateVitalFormdataJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateVitalFormdataJpanel
     */
    private VitalSignHistory vitalSignHistory;
    
    public CreateVitalFormdataJpanel(VitalSignHistory vitalSignHistory) {
        initComponents();
        this.vitalSignHistory = vitalSignHistory;
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

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Vital Form details");

        jLabel2.setText("Respiratory Rate");

        jLabel3.setText("Heart Rate");

        jLabel4.setText("Systolic Blood Pressure");

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

        submitjBtn.setText("Submit");
        submitjBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitjBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(weightjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bloodpressurejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(heartratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respiratoryratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(submitjBtn)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(respiratoryratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(heartratejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(bloodpressurejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(weightjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(submitjBtn)
                .addGap(180, 180, 180))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    public String currentdateandtime()
    {
        long seconds = System.currentTimeMillis();
        SimpleDateFormat dateformat = new SimpleDateFormat("MMM dd,yyyy HH:mm");    
        Date date = new Date(seconds);
        return (dateformat.format(date));
    }
      
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

        if(flag){        
        VitalSign vitalsign = vitalSignHistory.addVitalSign();
        vitalsign.setRespiratoryRate(Integer.parseInt(respiratoryratejTextField.getText()));
        vitalsign.setHeartRate(Integer.parseInt(heartratejTextField.getText()));
        vitalsign.setBloodPressure(Integer.parseInt(bloodpressurejTextField.getText()));
        vitalsign.setWeight(Integer.parseInt(weightjTextField.getText()));
        vitalsign.setTime(currentdateandtime());
        
        JOptionPane.showMessageDialog(this, "VitalSign is successfully added", "Information",JOptionPane.INFORMATION_MESSAGE);
        resetFields();
        }
        
    }//GEN-LAST:event_submitjBtnActionPerformed

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

public void resetFields(){
    
    respiratoryratejTextField.setText("");
    heartratejTextField.setText("");
    bloodpressurejTextField.setText("");
    weightjTextField.setText("");
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodpressurejTextField;
    private javax.swing.JTextField heartratejTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField respiratoryratejTextField;
    private javax.swing.JButton submitjBtn;
    private javax.swing.JTextField weightjTextField;
    // End of variables declaration//GEN-END:variables
}
