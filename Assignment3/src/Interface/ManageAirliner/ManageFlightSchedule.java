/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliner;

import business.*;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class ManageFlightSchedule extends javax.swing.JPanel {

    /**
     * Creates new form ManageFlightSchedule
     */
    JPanel DisplayPanel;
    Flight flight;
    Airline airline;
    public ManageFlightSchedule(JPanel dp, Airline a) {
        initComponents();
        DisplayPanel = dp;
        airline = a;
        Label.setText(airline.getFlightName());
        refreshTable();
    }
    public ManageFlightSchedule(JPanel displayPanel, Flight f) {
        flight = f;
        this.DisplayPanel =displayPanel;
    Label.setText(airline.getFlightName());
        refreshTable();
    }
public void refreshTable() {
        int rowCount = Table.getRowCount();
        DefaultTableModel model = (DefaultTableModel)Table.getModel();
        for(int i=rowCount-1;i>=0;i--) {
            model.removeRow(i);
        }
        
        for(Flight fly : airline.getFlightDirectory().getFlightDir()) {     //get object and then get the list.
            Object row[] = new Object[5];
            row[0] = fly;
            row[1] = fly.getFromDest();
            row[2] = fly.getToDest();
            row[3] = fly.getTime();
            row[4]= fly.getSeats();
            model.addRow(row);
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

        lableFlightschedule = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        perviousbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        Removebtn = new javax.swing.JButton();
        Label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 6));
        setLayout(null);

        lableFlightschedule.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lableFlightschedule.setText("Manage Flight Schedule Catalog");
        add(lableFlightschedule);
        lableFlightschedule.setBounds(97, 11, 273, 32);

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Flight Name", "From", "To", "Time", "Seats"
            }
        ));
        jScrollPane1.setViewportView(Table);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 100, 410, 95);

        perviousbtn.setText("<< previous");
        perviousbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perviousbtnActionPerformed(evt);
            }
        });
        add(perviousbtn);
        perviousbtn.setBounds(20, 210, 93, 23);

        jButton2.setText("View Flight");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2);
        jButton2.setBounds(280, 210, 110, 23);

        jButton1.setText("Add Flight");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(280, 250, 110, 23);

        Removebtn.setText("Remove Flight");
        Removebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemovebtnActionPerformed(evt);
            }
        });
        add(Removebtn);
        Removebtn.setBounds(130, 210, 130, 23);
        add(Label);
        Label.setBounds(20, 60, 110, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void perviousbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perviousbtnActionPerformed
        // TODO add your handling code here:
         DisplayPanel.remove(this);
        CardLayout layout = (CardLayout)DisplayPanel.getLayout();
        layout.previous(DisplayPanel);
    }//GEN-LAST:event_perviousbtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       // AddFlightSchedule afs = new AddFlightSchedule(DisplayPanel,airline);
        AddFlightSchedule afs = new AddFlightSchedule(DisplayPanel,flight, airline);
        DisplayPanel.add("SupplierWorkAreaJPanel",afs);
        CardLayout layout = (CardLayout)DisplayPanel.getLayout();
        layout.next(DisplayPanel);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RemovebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemovebtnActionPerformed
        // TODO add your handling code here:
         int row = Table.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight air = (Flight)Table.getValueAt(row, 0);
        airline.getFlightDirectory().removeFlight(air);
        refreshTable();
                                       
    }//GEN-LAST:event_RemovebtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         int row = Table.getSelectedRow();
        if(row<0) {
             JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Flight fligh = (Flight)Table.getValueAt(row, 0);
        ViewFlight vf = new ViewFlight(DisplayPanel, fligh);
        DisplayPanel.add("ViewFlightDetail", vf);
        CardLayout layout = (CardLayout)DisplayPanel.getLayout();
        layout.next(DisplayPanel);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Label;
    private javax.swing.JButton Removebtn;
    private javax.swing.JTable Table;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lableFlightschedule;
    private javax.swing.JButton perviousbtn;
    // End of variables declaration//GEN-END:variables
}
