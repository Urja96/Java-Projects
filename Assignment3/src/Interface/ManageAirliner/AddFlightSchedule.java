/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageAirliner;

import business.*;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author hp
 */
public class AddFlightSchedule extends javax.swing.JPanel {

    /**
     * Creates new form FlightSchedule
     */
    JPanel DisplayPanel;
    Flight flight;
   Airline airline;
    //public AddFlightSchedule(JPanel DisplayPanel, Airline airline) {
    public AddFlightSchedule(JPanel DisplayPanel, Flight flight, Airline airline){  
    initComponents();
        this.DisplayPanel = DisplayPanel;
       this.airline = airline;
        this.flight= flight;
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
        jLabel2 = new javax.swing.JLabel();
        textfieldFlightname = new javax.swing.JTextField();
        textfieldFrom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        textfieldTo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        textfiledTime = new javax.swing.JTextField();
        backbtn = new javax.swing.JButton();
        addFlightbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 0, 0), 6));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Add new Flight Schedule");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, 222, -1));

        jLabel2.setText("Flight Name:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, -1));

        textfieldFlightname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldFlightnameActionPerformed(evt);
            }
        });
        add(textfieldFlightname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 230, -1));
        add(textfieldFrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 230, -1));

        jLabel5.setText("From:");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 70, -1));

        jLabel6.setText("To:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 70, -1));
        add(textfieldTo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 230, -1));

        jLabel7.setText("Time:");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 70, -1));
        add(textfiledTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 230, -1));

        backbtn.setText("<<previous");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });
        add(backbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 100, -1));

        addFlightbtn.setText("Add Flight");
        addFlightbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFlightbtnActionPerformed(evt);
            }
        });
        add(addFlightbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, 110, -1));
    }// </editor-fold>//GEN-END:initComponents
private void backAction() {
        DisplayPanel.remove(this);
        Component[] componentArray = DisplayPanel.getComponents();
        Component component = componentArray[componentArray.length - 1];
        ManageFlightSchedule manageProductCatalogJPanel = (ManageFlightSchedule) component;
        manageProductCatalogJPanel.refreshTable();
        CardLayout layout = (CardLayout) DisplayPanel.getLayout();
        layout.previous(DisplayPanel);
        }
    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        // TODO add your handling code here:
        backAction();
    }//GEN-LAST:event_backbtnActionPerformed

    private void addFlightbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightbtnActionPerformed
        // TODO add your handling code here:
        if (textfieldFlightname.getText().isEmpty() || textfieldFrom.getText().isEmpty() ||textfieldTo.getText().isEmpty() || textfiledTime.getText().isEmpty() ){
            JOptionPane.showMessageDialog(null,"Fields can't be empty");
        }
        else {
         Flight fly = airline.getFlightDirectory().addFlight();
           fly.setFilghtName(textfieldFlightname.getText());
           fly.setFromDest(textfieldFrom.getText());
           fly.setToDest(textfieldTo.getText());
           //fly.setSeats(Integer.parseInt(textFieldSeats.getText()));             
         
           fly.setTime(textfiledTime.getText());
           JOptionPane.showMessageDialog(null, "Flight successfully added", "Warning", JOptionPane.INFORMATION_MESSAGE);
           textfieldFlightname.setText(" ");
           textfieldFrom.setText(" ");
           textfieldTo.setText(" ");
           textfiledTime.setText(" ");
           //textFieldSeats.setText(" ");
        }
    }//GEN-LAST:event_addFlightbtnActionPerformed

    private void textfieldFlightnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldFlightnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldFlightnameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addFlightbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField textfieldFlightname;
    private javax.swing.JTextField textfieldFrom;
    private javax.swing.JTextField textfieldTo;
    private javax.swing.JTextField textfiledTime;
    // End of variables declaration//GEN-END:variables
}
