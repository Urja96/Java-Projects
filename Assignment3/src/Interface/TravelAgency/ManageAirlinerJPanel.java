/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.TravelAgency;


import business.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ManageAirlinerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageAirlinerJPanel
     */
    JPanel DisplayPanel;
    private AirlineDirectory airlineDirectory;
    Airline airline;
    Flight flight;
    public ManageAirlinerJPanel(JPanel dp, AirlineDirectory ad) {
        initComponents();
        DisplayPanel = dp;
        airlineDirectory = ad;
        refreshTable();
    }
public void refreshTable() {
        int rowCount = TableAirliner.getRowCount();
        DefaultTableModel model = (DefaultTableModel)TableAirliner.getModel();
        for(int i = rowCount - 1; i >=0; i--) {
            model.removeRow(i);
        }
        for(Airline a : airlineDirectory.getAirlineDir()) {
            Object row[] = new Object[1];
            row[0] = a;
            model.addRow(row);
        }}
    
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ManageAirlinerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableAirliner = new javax.swing.JTable();
        Addbtn = new javax.swing.JButton();
        selectbtn = new javax.swing.JButton();
        Deletebtn = new javax.swing.JButton();
        Backbtn = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 6));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ManageAirlinerLabel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ManageAirlinerLabel.setText("MANAGE AIRLINER");
        add(ManageAirlinerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 21, 219, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Airliners ");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 72, -1, -1));

        TableAirliner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Airliner Name"
            }
        ));
        jScrollPane1.setViewportView(TableAirliner);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 93, 398, 93));

        Addbtn.setText("Add Airliner");
        Addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddbtnActionPerformed(evt);
            }
        });
        add(Addbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 264, 103, -1));

        selectbtn.setText("Select");
        selectbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectbtnActionPerformed(evt);
            }
        });
        add(selectbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 223, 103, -1));

        Deletebtn.setText("Delete");
        Deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletebtnActionPerformed(evt);
            }
        });
        add(Deletebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 223, -1, -1));

        Backbtn.setText("<<Back");
        Backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackbtnActionPerformed(evt);
            }
        });
        add(Backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 264, -1, -1));

        jButton4.setText("Master schedule");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void selectbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectbtnActionPerformed
        // TODO add your handling code here:
    int row = TableAirliner.getSelectedRow();
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Airline air = (Airline)TableAirliner.getValueAt(row, 0);
        ViewAirliner va = new ViewAirliner(DisplayPanel, air);
        DisplayPanel.add("ViewAirliner", va);
        CardLayout layout = (CardLayout)DisplayPanel.getLayout();
        layout.next(DisplayPanel);
                                               
    }//GEN-LAST:event_selectbtnActionPerformed

    private void AddbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddbtnActionPerformed
        // TODO add your handling code here:
        AddAirliner as = new AddAirliner(DisplayPanel, airlineDirectory);
        DisplayPanel.add("AddSupplier", as);
        CardLayout layout = (CardLayout)DisplayPanel.getLayout();
        layout.next(DisplayPanel);
    }//GEN-LAST:event_AddbtnActionPerformed

    private void BackbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackbtnActionPerformed
        // TODO add your handling code here:
        DisplayPanel.remove(this);
        CardLayout layout = (CardLayout)DisplayPanel.getLayout();
        layout.previous(DisplayPanel);
    }//GEN-LAST:event_BackbtnActionPerformed

    private void DeletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletebtnActionPerformed
        // TODO add your handling code here:
         int row = TableAirliner.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Airline a = (Airline)TableAirliner.getValueAt(row, 0);
        airlineDirectory.removeAirline(a);
        refreshTable();
                        
    }//GEN-LAST:event_DeletebtnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        MasterSchedule ms = new MasterSchedule(DisplayPanel);
         DisplayPanel.add("AddSupplier", ms);
        CardLayout layout = (CardLayout)DisplayPanel.getLayout();
        layout.next(DisplayPanel);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addbtn;
    private javax.swing.JButton Backbtn;
    private javax.swing.JButton Deletebtn;
    private javax.swing.JLabel ManageAirlinerLabel;
    private javax.swing.JTable TableAirliner;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectbtn;
    // End of variables declaration//GEN-END:variables
}