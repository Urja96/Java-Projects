/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.VitalSigns;
import Business.VitalSignsHistory;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class AbnormalPanel extends javax.swing.JPanel {

    /**
     * Creates new form AbnormalPanel
     */
    private VitalSignsHistory vsh;
    
    private double maxbp;
    private double minbp;
    public AbnormalPanel(VitalSignsHistory vsh, double maxbp, double minbp) {
        initComponents();
        this.vsh = vsh;
        this.maxbp = maxbp;
        this.minbp = minbp;
        populateTable(); 
        
        
    }
    private void populateTable(){
        DefaultTableModel dtm = (DefaultTableModel)table. getModel();
        dtm.setRowCount(0);
                for(VitalSigns vs : vsh.getAbnormalList(maxbp, minbp)){
                Object row[] = new Object[2];
                row[0] = vs;
                row[1] = vs.getPulse();
                dtm.addRow(row);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        bttonViewDetails = new javax.swing.JButton();
        bttonDelete = new javax.swing.JButton();
        lableTemperature = new javax.swing.JLabel();
        lableBP = new javax.swing.JLabel();
        lablePulse = new javax.swing.JLabel();
        lableDate = new javax.swing.JLabel();
        textFieldTemperature = new javax.swing.JTextField();
        textFileldPulse = new javax.swing.JTextField();
        textFieldDate = new javax.swing.JTextField();
        textFieldBP = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Pulse"
            }
        ));
        table.setEnabled(false);
        jScrollPane2.setViewportView(table);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 70, 420, 90);

        bttonViewDetails.setText("View Details");
        bttonViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonViewDetailsActionPerformed(evt);
            }
        });
        jPanel1.add(bttonViewDetails);
        bttonViewDetails.setBounds(213, 190, 110, 30);

        bttonDelete.setText("Delete");
        bttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(bttonDelete);
        bttonDelete.setBounds(333, 190, 100, 30);

        lableTemperature.setText("Temperature:");
        jPanel1.add(lableTemperature);
        lableTemperature.setBounds(50, 280, 120, 20);

        lableBP.setText("Blood Pressure:");
        jPanel1.add(lableBP);
        lableBP.setBounds(50, 330, 130, 20);

        lablePulse.setText("Pulse:");
        jPanel1.add(lablePulse);
        lablePulse.setBounds(50, 390, 80, 20);

        lableDate.setText("Date:");
        jPanel1.add(lableDate);
        lableDate.setBounds(50, 450, 80, 20);

        textFieldTemperature.setEditable(false);
        jPanel1.add(textFieldTemperature);
        textFieldTemperature.setBounds(190, 270, 220, 30);

        textFileldPulse.setEditable(false);
        textFileldPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFileldPulseActionPerformed(evt);
            }
        });
        jPanel1.add(textFileldPulse);
        textFileldPulse.setBounds(190, 380, 220, 30);

        textFieldDate.setEditable(false);
        jPanel1.add(textFieldDate);
        textFieldDate.setBounds(190, 440, 220, 30);

        textFieldBP.setEditable(false);
        jPanel1.add(textFieldBP);
        textFieldBP.setBounds(190, 320, 220, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Abnormal VitalSign");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(170, 0, 141, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bttonViewDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttonViewDetailsActionPerformed
        // TODO add your handling code here:
        int selectedrow = table.getSelectedRow();       //return integer. tell the user which row he selected
        if(selectedrow >= 0 )
        {
          VitalSigns vs = (VitalSigns)table.getValueAt(selectedrow,0);
          textFieldTemperature.setText(String.valueOf(vs.getTemperature()));
          textFieldBP.setText(String.valueOf(vs.getBloodPressure()));
          textFileldPulse.setText(String.valueOf(vs.getPulse()));
          textFieldDate.setText(vs.getDate());            
        }
        else
            JOptionPane.showMessageDialog(null," please select any row");
    }//GEN-LAST:event_bttonViewDetailsActionPerformed

    private void bttonDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttonDeleteActionPerformed
        // TODO add your handling code here:
        int selectedrow = table.getSelectedRow();       //return integer. tell the user which row he selected
        if(selectedrow >= 0 )
        {
             VitalSigns vs = (VitalSigns)table.getValueAt(selectedrow,0);
             vsh.deleteVitals(vs);
              JOptionPane.showMessageDialog(null," VitalSign Deleted");
              populateTable();
        }
        else
            JOptionPane.showMessageDialog(null," please select any row");
        
                                             
    }//GEN-LAST:event_bttonDeleteActionPerformed

    private void textFileldPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFileldPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFileldPulseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttonDelete;
    private javax.swing.JButton bttonViewDetails;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lableBP;
    private javax.swing.JLabel lableDate;
    private javax.swing.JLabel lablePulse;
    private javax.swing.JLabel lableTemperature;
    private javax.swing.JTable table;
    private javax.swing.JTextField textFieldBP;
    private javax.swing.JTextField textFieldDate;
    private javax.swing.JTextField textFieldTemperature;
    private javax.swing.JTextField textFileldPulse;
    // End of variables declaration//GEN-END:variables
}
