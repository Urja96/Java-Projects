package Interface;

import Business.Person;
import java.io.File;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class JPanelLiscence extends javax.swing.JPanel {

    /**
     * Creates new form Liscence
     */
    private Person person;
    public JPanelLiscence(Person person) {
        initComponents();
         this.person = person;
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
        Number = new javax.swing.JLabel();
        Issue = new javax.swing.JLabel();
        Expiration = new javax.swing.JLabel();
        bloodtype = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        browse = new javax.swing.JButton();
        TFnumber = new javax.swing.JTextField();
        TFIssueMonth = new javax.swing.JTextField();
        TFblood = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TFissuedate = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TFissueyear = new javax.swing.JTextField();
        SubmitLis = new javax.swing.JButton();
        TFexpiarymonth = new javax.swing.JTextField();
        TFexpiarydate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFexpiaryyear = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        picturelabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Driver’s License Information");
        add(jLabel1);
        jLabel1.setBounds(160, 20, 194, 15);

        Number.setText("License number:");
        add(Number);
        Number.setBounds(50, 70, 130, 14);

        Issue.setText("Date of Issue:");
        add(Issue);
        Issue.setBounds(50, 110, 110, 14);

        Expiration.setText("Date of Expiration:");
        add(Expiration);
        Expiration.setBounds(50, 150, 130, 14);

        bloodtype.setText("Blood Type:");
        add(bloodtype);
        bloodtype.setBounds(50, 190, 100, 14);

        picture.setText("Upload your Image");
        add(picture);
        picture.setBounds(50, 230, 150, 23);

        browse.setText("Browse");
        browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseActionPerformed(evt);
            }
        });
        add(browse);
        browse.setBounds(230, 230, 93, 23);

        TFnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFnumberActionPerformed(evt);
            }
        });
        add(TFnumber);
        TFnumber.setBounds(200, 60, 250, 30);

        TFIssueMonth.setText("MM");
        TFIssueMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFIssueMonthActionPerformed(evt);
            }
        });
        add(TFIssueMonth);
        TFIssueMonth.setBounds(200, 100, 60, 30);

        TFblood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFbloodActionPerformed(evt);
            }
        });
        add(TFblood);
        TFblood.setBounds(200, 180, 60, 30);

        jLabel2.setText("/");
        add(jLabel2);
        jLabel2.setBounds(270, 100, 30, 30);

        TFissuedate.setText("DD");
        TFissuedate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFissuedateActionPerformed(evt);
            }
        });
        add(TFissuedate);
        TFissuedate.setBounds(290, 100, 60, 30);

        jLabel3.setText("/");
        add(jLabel3);
        jLabel3.setBounds(360, 100, 40, 30);

        TFissueyear.setText("YYYY");
        add(TFissueyear);
        TFissueyear.setBounds(380, 100, 70, 30);

        SubmitLis.setText("Submit");
        SubmitLis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitLisActionPerformed(evt);
            }
        });
        add(SubmitLis);
        SubmitLis.setBounds(230, 390, 93, 23);

        TFexpiarymonth.setText("MM");
        add(TFexpiarymonth);
        TFexpiarymonth.setBounds(200, 140, 60, 30);

        TFexpiarydate.setText("DD");
        add(TFexpiarydate);
        TFexpiarydate.setBounds(290, 140, 60, 30);

        jLabel5.setText("/");
        add(jLabel5);
        jLabel5.setBounds(360, 140, 40, 30);

        TFexpiaryyear.setText("YYYY");
        add(TFexpiaryyear);
        TFexpiaryyear.setBounds(380, 140, 70, 30);

        jLabel6.setText("/");
        add(jLabel6);
        jLabel6.setBounds(270, 140, 40, 30);

        picturelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        picturelabel.setText("image");
        picturelabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(picturelabel);
        picturelabel.setBounds(220, 270, 120, 98);
    }// </editor-fold>//GEN-END:initComponents

    private void TFbloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFbloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFbloodActionPerformed

    private void browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseActionPerformed
        JFileChooser jf =  new JFileChooser();
        jf.showOpenDialog(null);
        File imagefile = jf.getSelectedFile();
        String filepath = imagefile.getAbsolutePath();
        ImageIcon imagelabel = new ImageIcon(filepath);
       picturelabel.setIcon(imagelabel);
       person.getClasslis().setPicture(filepath);
        
    }//GEN-LAST:event_browseActionPerformed

    private void TFnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFnumberActionPerformed

    private void TFissuedateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFissuedateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFissuedateActionPerformed

    private void TFIssueMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFIssueMonthActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_TFIssueMonthActionPerformed

    private void SubmitLisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitLisActionPerformed
        // TODO add your handling code here:
        person.getClasslis().setLiscencenumb(TFnumber.getText());
        person.getClasslis().setBlood(TFblood.getText());
        person.getClasslis().setIssueMonth(TFIssueMonth.getText());
        person.getClasslis().setIssuedate(TFissuedate.getText());
        person.getClasslis().setIssueyear(TFissueyear.getText());
        person.getClasslis().setExpiryMonth(TFexpiarymonth.getText());
        person.getClasslis().setExpirydate(TFexpiarydate.getText());
        person.getClasslis().setExpiryyear(TFexpiaryyear.getText());
        
         //Promt the user that the data successfuly created
         JOptionPane.showMessageDialog(null,"Successfully Submited");
        
                
    }//GEN-LAST:event_SubmitLisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Expiration;
    private javax.swing.JLabel Issue;
    private javax.swing.JLabel Number;
    private javax.swing.JButton SubmitLis;
    private javax.swing.JTextField TFIssueMonth;
    private javax.swing.JTextField TFblood;
    private javax.swing.JTextField TFexpiarydate;
    private javax.swing.JTextField TFexpiarymonth;
    private javax.swing.JTextField TFexpiaryyear;
    private javax.swing.JTextField TFissuedate;
    private javax.swing.JTextField TFissueyear;
    private javax.swing.JTextField TFnumber;
    private javax.swing.JLabel bloodtype;
    private javax.swing.JButton browse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel picture;
    private javax.swing.JLabel picturelabel;
    // End of variables declaration//GEN-END:variables
}
