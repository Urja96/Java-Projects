/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.*;

/**
 *
 * @author hp
 */
public class DisplayPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayPanel
     */
    
    //Decleration
    private Person person;
    private Address workaddress;
    private Address localaddress;
    private Address homeaddress;
    
    public DisplayPanel(Person person) {
        initComponents();
        this.person = person;
        this.localaddress = person.getLocalAddress();
        this.workaddress = person.getWorkAddress();
        this.homeaddress = person.getHomeAddress();
        display();
    }

   private void display(){
       //Personal Information
       System.out.println("Person:");  //console
     person.setFirstname("Urja");
     person.setLastname("Jain");
     person.setDoB("05/ 27/ 1996");
     person.setStreetAddress("360 Huntington Ave \n Boston \n MA \n USA");
     
     //Setting Entries in TextFields of Personal Information
     jTextFieldFirstName.setText(person.getFirstname());
        System.out.println(person.getFirstname());   //console
     jTextFieldLastName1.setText(person.getLastname());
        System.out.println(person.getLastname());  //console
     jTextFieldDateOfBirth.setText(person.getDoB());
        System.out.println(person.getDoB());  //console
     TAStreetAddress.setText(person.getStreetAddress());
        System.out.println(person.getStreetAddress());  //console
     
     workaddress = new Address(); //initializing address object
     
     //Work Address
        System.out.println("Work Address");  //console
     workaddress.setStreetLine1("360 Huntington Ave");
     person.setWorkAddress(workaddress); 
            
     workaddress.setStreetLine2("130 Snell Engineering");
     person.setWorkAddress(workaddress);
             
     workaddress.setCity("Boston");
     person.setWorkAddress(workaddress);
             
     workaddress.setState("MA");
     person.setLocalAddress(workaddress);
             
     workaddress.setZipCode("02115");
     person.setWorkAddress(workaddress);
             
     workaddress.setCountry("USA");
     person.setWorkAddress(workaddress);
             
     //Setting Entries in TextFields of Work Address
     TFWAStreetLine1.setText(workaddress.getStreetLine1());
        System.out.println(workaddress.getStreetLine1());  //console
     TFWAStreetAddress.setText(workaddress.getStreetLine2());
        System.out.println(workaddress.getStreetLine2()); //console
     jTextWAFieldCity.setText(workaddress.getCity());
        System.out.println(workaddress.getCity());  //console
     TFWAState.setText(workaddress.getState());
        System.out.println(workaddress.getState());  //console
     TFWAZip2.setText(workaddress.getZipCode());
        System.out.println(workaddress.getZipCode());  //console
     TFWACountry.setText(workaddress.getCountry());
        System.out.println(workaddress.getCountry());  //console
     
        
        //Local Address     
        localaddress = new Address();
        System.out.println("Local Address");  //console
     localaddress.setStreetLine1("Boylston Street");
     person.setLocalAddress(localaddress);
     
     localaddress.setCity("Boston");
     person.setLocalAddress(localaddress);
     
     localaddress.setState("MA");     
     person.setLocalAddress(localaddress);
     
     localaddress.setZipCode("02115");
     person.setLocalAddress(localaddress);
     
     localaddress.setCountry("USA");
     person.setLocalAddress(localaddress); 
     
     //Setting Entries in TextFields of Local Address
     TFLAStreetLine1.setText(localaddress.getStreetLine1());
        System.out.println(localaddress.getStreetLine1());  //console
     TFLAStreetLine2.setText(null);
        
     TFLACity.setText(localaddress.getCity());
        System.out.println(localaddress.getCity());  //console
     TFLAState.setText(localaddress.getState());
        System.out.println(localaddress.getState());  //console
     TFLAZip.setText(localaddress.getZipCode());
        System.out.println(localaddress.getZipCode());  //console
     TFLACountry.setText(localaddress.getCountry());
        System.out.println(localaddress.getCountry());  //console
     
     
     //Home Address
        homeaddress = new Address();
        System.out.println("Home Address");  //console
        homeaddress.setStreetLine1("Palace Orchard");
     person.setHomeAddress(homeaddress);
     
     homeaddress.setStreetLine2(null);
     person.setHomeAddress(homeaddress);
     
     homeaddress.setCity("Bhopal");
     person.setHomeAddress(homeaddress);
     
     homeaddress.setState("MP");
     person.setHomeAddress(homeaddress);
     
     homeaddress.setZipCode("462042");
     person.setHomeAddress(homeaddress);
     
     homeaddress.setCountry("INDIA");
     person.setHomeAddress(homeaddress);
     
     //Setting Entries in TextFields of Home Address
     TFHAStreetLine1.setText(homeaddress.getStreetLine1());
        System.out.println(homeaddress.getStreetLine1());  //console
     TFHAStreetLine2.setText(null);
        
     TFHACity.setText(homeaddress.getCity());
        System.out.println(homeaddress.getCity());  //console
     TFHAState.setText(homeaddress.getState());
        System.out.println(homeaddress.getState());  //console
     TFHAZip.setText(homeaddress.getZipCode());
        System.out.println(homeaddress.getZipCode());  //console
    TFHACountry.setText(homeaddress.getCountry());
        System.out.println(homeaddress.getCountry());  //console
         
     
     
     
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
        jPanel1 = new javax.swing.JPanel();
        jLabelProfile = new javax.swing.JLabel();
        jLabelPersonalInformation = new javax.swing.JLabel();
        jLabelDateofBirth = new javax.swing.JLabel();
        jTextFieldDateOfBirth = new javax.swing.JTextField();
        jLabelFirstName1 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jLabeStreetAddress = new javax.swing.JLabel();
        jLabelMDY = new javax.swing.JLabel();
        jLabelLastName1 = new javax.swing.JLabel();
        jTextFieldLastName1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TAStreetAddress = new javax.swing.JTextArea();
        LabelWorkAddress = new javax.swing.JLabel();
        jLabelFirstName2 = new javax.swing.JLabel();
        jTextWAFieldCity = new javax.swing.JTextField();
        TFWAState = new javax.swing.JTextField();
        jLabelFirstName3 = new javax.swing.JLabel();
        TFWAStreetLine1 = new javax.swing.JTextField();
        jLabelFirstName4 = new javax.swing.JLabel();
        TFWAStreetAddress = new javax.swing.JTextField();
        jLabelFirstName5 = new javax.swing.JLabel();
        TFLACountry = new javax.swing.JTextField();
        jLabelFirstName6 = new javax.swing.JLabel();
        LabelWorkAddress1 = new javax.swing.JLabel();
        jLabelFirstName7 = new javax.swing.JLabel();
        TFLAStreetLine1 = new javax.swing.JTextField();
        jLabelFirstName8 = new javax.swing.JLabel();
        TFLAStreetLine2 = new javax.swing.JTextField();
        TFLACity = new javax.swing.JTextField();
        jLabelFirstName9 = new javax.swing.JLabel();
        jLabelFirstName10 = new javax.swing.JLabel();
        TFLAState = new javax.swing.JTextField();
        jLabelFirstName11 = new javax.swing.JLabel();
        TFLAZip = new javax.swing.JTextField();
        LabelWorkAddress2 = new javax.swing.JLabel();
        jLabelFirstName12 = new javax.swing.JLabel();
        TFHAStreetLine1 = new javax.swing.JTextField();
        TFHAStreetLine2 = new javax.swing.JTextField();
        jLabelFirstName13 = new javax.swing.JLabel();
        jLabelFirstName14 = new javax.swing.JLabel();
        TFHACity = new javax.swing.JTextField();
        TFHAState = new javax.swing.JTextField();
        jLabelFirstName15 = new javax.swing.JLabel();
        jLabelFirstName16 = new javax.swing.JLabel();
        TFHAZip = new javax.swing.JTextField();
        jLabelFirstName17 = new javax.swing.JLabel();
        TFHACountry = new javax.swing.JTextField();
        jLabelFirstName18 = new javax.swing.JLabel();
        TFWAZip2 = new javax.swing.JTextField();
        jLabelFirstName19 = new javax.swing.JLabel();
        TFWACountry = new javax.swing.JTextField();

        setLayout(null);

        jScrollPane1.setBorder(null);
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1500, 600));
        jPanel1.setLayout(null);

        jLabelProfile.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelProfile.setText("Profile");
        jPanel1.add(jLabelProfile);
        jLabelProfile.setBounds(20, 20, 120, 17);

        jLabelPersonalInformation.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPersonalInformation.setText("Personal Information:");
        jPanel1.add(jLabelPersonalInformation);
        jLabelPersonalInformation.setBounds(20, 60, 130, 15);

        jLabelDateofBirth.setText("Date of Birth:");
        jPanel1.add(jLabelDateofBirth);
        jLabelDateofBirth.setBounds(460, 110, 120, 20);

        jTextFieldDateOfBirth.setEditable(false);
        jTextFieldDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDateOfBirthActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldDateOfBirth);
        jTextFieldDateOfBirth.setBounds(580, 100, 120, 30);

        jLabelFirstName1.setText("First Name: ");
        jPanel1.add(jLabelFirstName1);
        jLabelFirstName1.setBounds(20, 100, 120, 20);

        jTextFieldFirstName.setEditable(false);
        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldFirstName);
        jTextFieldFirstName.setBounds(140, 90, 250, 30);

        jLabeStreetAddress.setText("Street Address:");
        jPanel1.add(jLabeStreetAddress);
        jLabeStreetAddress.setBounds(20, 180, 120, 20);

        jLabelMDY.setText("MM/ DD/ YYYY");
        jPanel1.add(jLabelMDY);
        jLabelMDY.setBounds(720, 110, 110, 20);

        jLabelLastName1.setText("Last Name:");
        jPanel1.add(jLabelLastName1);
        jLabelLastName1.setBounds(20, 140, 120, 20);

        jTextFieldLastName1.setEditable(false);
        jTextFieldLastName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLastName1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldLastName1);
        jTextFieldLastName1.setBounds(140, 130, 250, 30);

        TAStreetAddress.setEditable(false);
        TAStreetAddress.setColumns(20);
        TAStreetAddress.setRows(5);
        TAStreetAddress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(TAStreetAddress);

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(140, 170, 166, 96);

        LabelWorkAddress.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        LabelWorkAddress.setText("Work Address:");
        jPanel1.add(LabelWorkAddress);
        LabelWorkAddress.setBounds(30, 310, 71, 14);

        jLabelFirstName2.setText("City:");
        jPanel1.add(jLabelFirstName2);
        jLabelFirstName2.setBounds(30, 420, 120, 20);

        jTextWAFieldCity.setEditable(false);
        jTextWAFieldCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextWAFieldCityActionPerformed(evt);
            }
        });
        jPanel1.add(jTextWAFieldCity);
        jTextWAFieldCity.setBounds(150, 410, 210, 30);

        TFWAState.setEditable(false);
        TFWAState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFWAStateActionPerformed(evt);
            }
        });
        jPanel1.add(TFWAState);
        TFWAState.setBounds(150, 450, 210, 30);

        jLabelFirstName3.setText("State:");
        jPanel1.add(jLabelFirstName3);
        jLabelFirstName3.setBounds(30, 460, 120, 20);

        TFWAStreetLine1.setEditable(false);
        TFWAStreetLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFWAStreetLine1ActionPerformed(evt);
            }
        });
        jPanel1.add(TFWAStreetLine1);
        TFWAStreetLine1.setBounds(150, 330, 210, 30);

        jLabelFirstName4.setText("Street Line 1:");
        jPanel1.add(jLabelFirstName4);
        jLabelFirstName4.setBounds(30, 340, 120, 20);

        TFWAStreetAddress.setEditable(false);
        TFWAStreetAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFWAStreetAddressActionPerformed(evt);
            }
        });
        jPanel1.add(TFWAStreetAddress);
        TFWAStreetAddress.setBounds(150, 370, 210, 30);

        jLabelFirstName5.setText("Street Line 2:");
        jPanel1.add(jLabelFirstName5);
        jLabelFirstName5.setBounds(30, 380, 120, 20);

        TFLACountry.setEditable(false);
        TFLACountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFLACountryActionPerformed(evt);
            }
        });
        jPanel1.add(TFLACountry);
        TFLACountry.setBounds(520, 530, 210, 30);

        jLabelFirstName6.setText("Country:");
        jPanel1.add(jLabelFirstName6);
        jLabelFirstName6.setBounds(400, 540, 120, 20);

        LabelWorkAddress1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        LabelWorkAddress1.setText("Local Address:");
        jPanel1.add(LabelWorkAddress1);
        LabelWorkAddress1.setBounds(400, 310, 140, 14);

        jLabelFirstName7.setText("Street Line 1:");
        jPanel1.add(jLabelFirstName7);
        jLabelFirstName7.setBounds(400, 340, 120, 20);

        TFLAStreetLine1.setEditable(false);
        TFLAStreetLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFLAStreetLine1ActionPerformed(evt);
            }
        });
        jPanel1.add(TFLAStreetLine1);
        TFLAStreetLine1.setBounds(520, 330, 210, 30);

        jLabelFirstName8.setText("Street Line 2:");
        jPanel1.add(jLabelFirstName8);
        jLabelFirstName8.setBounds(400, 380, 120, 20);

        TFLAStreetLine2.setEditable(false);
        TFLAStreetLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFLAStreetLine2ActionPerformed(evt);
            }
        });
        jPanel1.add(TFLAStreetLine2);
        TFLAStreetLine2.setBounds(520, 370, 210, 30);

        TFLACity.setEditable(false);
        TFLACity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFLACityActionPerformed(evt);
            }
        });
        jPanel1.add(TFLACity);
        TFLACity.setBounds(520, 410, 210, 30);

        jLabelFirstName9.setText("City:");
        jPanel1.add(jLabelFirstName9);
        jLabelFirstName9.setBounds(400, 420, 120, 20);

        jLabelFirstName10.setText("State:");
        jPanel1.add(jLabelFirstName10);
        jLabelFirstName10.setBounds(400, 460, 120, 20);

        TFLAState.setEditable(false);
        TFLAState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFLAStateActionPerformed(evt);
            }
        });
        jPanel1.add(TFLAState);
        TFLAState.setBounds(520, 450, 210, 30);

        jLabelFirstName11.setText("Zip Code:");
        jPanel1.add(jLabelFirstName11);
        jLabelFirstName11.setBounds(400, 500, 120, 20);

        TFLAZip.setEditable(false);
        TFLAZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFLAZipActionPerformed(evt);
            }
        });
        jPanel1.add(TFLAZip);
        TFLAZip.setBounds(520, 490, 210, 30);

        LabelWorkAddress2.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        LabelWorkAddress2.setText("Home Address:");
        jPanel1.add(LabelWorkAddress2);
        LabelWorkAddress2.setBounds(770, 310, 110, 14);

        jLabelFirstName12.setText("Street Line 1:");
        jPanel1.add(jLabelFirstName12);
        jLabelFirstName12.setBounds(770, 340, 120, 20);

        TFHAStreetLine1.setEditable(false);
        TFHAStreetLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFHAStreetLine1ActionPerformed(evt);
            }
        });
        jPanel1.add(TFHAStreetLine1);
        TFHAStreetLine1.setBounds(890, 330, 210, 30);

        TFHAStreetLine2.setEditable(false);
        TFHAStreetLine2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFHAStreetLine2ActionPerformed(evt);
            }
        });
        jPanel1.add(TFHAStreetLine2);
        TFHAStreetLine2.setBounds(890, 370, 210, 30);

        jLabelFirstName13.setText("Street Line 2:");
        jPanel1.add(jLabelFirstName13);
        jLabelFirstName13.setBounds(770, 380, 120, 20);

        jLabelFirstName14.setText("City:");
        jPanel1.add(jLabelFirstName14);
        jLabelFirstName14.setBounds(770, 420, 120, 20);

        TFHACity.setEditable(false);
        TFHACity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFHACityActionPerformed(evt);
            }
        });
        jPanel1.add(TFHACity);
        TFHACity.setBounds(890, 410, 210, 30);

        TFHAState.setEditable(false);
        TFHAState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFHAStateActionPerformed(evt);
            }
        });
        jPanel1.add(TFHAState);
        TFHAState.setBounds(890, 450, 210, 30);

        jLabelFirstName15.setText("State:");
        jPanel1.add(jLabelFirstName15);
        jLabelFirstName15.setBounds(770, 460, 120, 20);

        jLabelFirstName16.setText("Zip Code:");
        jPanel1.add(jLabelFirstName16);
        jLabelFirstName16.setBounds(770, 500, 120, 20);

        TFHAZip.setEditable(false);
        TFHAZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFHAZipActionPerformed(evt);
            }
        });
        jPanel1.add(TFHAZip);
        TFHAZip.setBounds(890, 490, 210, 30);

        jLabelFirstName17.setText("Country:");
        jPanel1.add(jLabelFirstName17);
        jLabelFirstName17.setBounds(770, 540, 120, 20);

        TFHACountry.setEditable(false);
        TFHACountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFHACountryActionPerformed(evt);
            }
        });
        jPanel1.add(TFHACountry);
        TFHACountry.setBounds(890, 530, 210, 30);

        jLabelFirstName18.setText("Zip Code:");
        jPanel1.add(jLabelFirstName18);
        jLabelFirstName18.setBounds(30, 500, 120, 20);

        TFWAZip2.setEditable(false);
        TFWAZip2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFWAZip2ActionPerformed(evt);
            }
        });
        jPanel1.add(TFWAZip2);
        TFWAZip2.setBounds(150, 490, 210, 30);

        jLabelFirstName19.setText("Country:");
        jPanel1.add(jLabelFirstName19);
        jLabelFirstName19.setBounds(30, 540, 120, 20);

        TFWACountry.setEditable(false);
        TFWACountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFWACountryActionPerformed(evt);
            }
        });
        jPanel1.add(TFWACountry);
        TFWACountry.setBounds(150, 530, 210, 30);

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 1380, 620);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDateOfBirthActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jTextFieldLastName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLastName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLastName1ActionPerformed

    private void jTextWAFieldCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextWAFieldCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextWAFieldCityActionPerformed

    private void TFWAStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFWAStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFWAStateActionPerformed

    private void TFWAStreetLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFWAStreetLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFWAStreetLine1ActionPerformed

    private void TFWAStreetAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFWAStreetAddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFWAStreetAddressActionPerformed

    private void TFLACountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFLACountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFLACountryActionPerformed

    private void TFLAStreetLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFLAStreetLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFLAStreetLine1ActionPerformed

    private void TFLAStreetLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFLAStreetLine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFLAStreetLine2ActionPerformed

    private void TFLACityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFLACityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFLACityActionPerformed

    private void TFLAStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFLAStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFLAStateActionPerformed

    private void TFLAZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFLAZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFLAZipActionPerformed

    private void TFHAStreetLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFHAStreetLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFHAStreetLine1ActionPerformed

    private void TFHAStreetLine2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFHAStreetLine2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFHAStreetLine2ActionPerformed

    private void TFHACityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFHACityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFHACityActionPerformed

    private void TFHAStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFHAStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFHAStateActionPerformed

    private void TFHAZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFHAZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFHAZipActionPerformed

    private void TFHACountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFHACountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFHACountryActionPerformed

    private void TFWAZip2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFWAZip2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFWAZip2ActionPerformed

    private void TFWACountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFWACountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFWACountryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelWorkAddress;
    private javax.swing.JLabel LabelWorkAddress1;
    private javax.swing.JLabel LabelWorkAddress2;
    private javax.swing.JTextArea TAStreetAddress;
    private javax.swing.JTextField TFHACity;
    private javax.swing.JTextField TFHACountry;
    private javax.swing.JTextField TFHAState;
    private javax.swing.JTextField TFHAStreetLine1;
    private javax.swing.JTextField TFHAStreetLine2;
    private javax.swing.JTextField TFHAZip;
    private javax.swing.JTextField TFLACity;
    private javax.swing.JTextField TFLACountry;
    private javax.swing.JTextField TFLAState;
    private javax.swing.JTextField TFLAStreetLine1;
    private javax.swing.JTextField TFLAStreetLine2;
    private javax.swing.JTextField TFLAZip;
    private javax.swing.JTextField TFWACountry;
    private javax.swing.JTextField TFWAState;
    private javax.swing.JTextField TFWAStreetAddress;
    private javax.swing.JTextField TFWAStreetLine1;
    private javax.swing.JTextField TFWAZip2;
    private javax.swing.JLabel jLabeStreetAddress;
    private javax.swing.JLabel jLabelDateofBirth;
    private javax.swing.JLabel jLabelFirstName1;
    private javax.swing.JLabel jLabelFirstName10;
    private javax.swing.JLabel jLabelFirstName11;
    private javax.swing.JLabel jLabelFirstName12;
    private javax.swing.JLabel jLabelFirstName13;
    private javax.swing.JLabel jLabelFirstName14;
    private javax.swing.JLabel jLabelFirstName15;
    private javax.swing.JLabel jLabelFirstName16;
    private javax.swing.JLabel jLabelFirstName17;
    private javax.swing.JLabel jLabelFirstName18;
    private javax.swing.JLabel jLabelFirstName19;
    private javax.swing.JLabel jLabelFirstName2;
    private javax.swing.JLabel jLabelFirstName3;
    private javax.swing.JLabel jLabelFirstName4;
    private javax.swing.JLabel jLabelFirstName5;
    private javax.swing.JLabel jLabelFirstName6;
    private javax.swing.JLabel jLabelFirstName7;
    private javax.swing.JLabel jLabelFirstName8;
    private javax.swing.JLabel jLabelFirstName9;
    private javax.swing.JLabel jLabelLastName1;
    private javax.swing.JLabel jLabelMDY;
    private javax.swing.JLabel jLabelPersonalInformation;
    private javax.swing.JLabel jLabelProfile;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldDateOfBirth;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldLastName1;
    private javax.swing.JTextField jTextWAFieldCity;
    // End of variables declaration//GEN-END:variables
}
