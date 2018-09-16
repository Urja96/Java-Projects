package Interface;

import Business.Person;
import javax.swing.JOptionPane;


public class JPanelAddressi extends javax.swing.JPanel {

    private Person person;
    public JPanelAddressi(Person person) {
        initComponents();
        this.person = person;
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Laddress = new javax.swing.JLabel();
        Lapt = new javax.swing.JLabel();
        addresstf = new javax.swing.JTextField();
        apartmenttf = new javax.swing.JTextField();
        Lcity = new javax.swing.JLabel();
        Citytf = new javax.swing.JTextField();
        Lstate = new javax.swing.JLabel();
        statetf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ziptf = new javax.swing.JTextField();
        submitAdd = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        Laddress.setText("Street Address:");
        add(Laddress);
        Laddress.setBounds(50, 70, 140, 14);

        Lapt.setText("Apt/ suit:");
        add(Lapt);
        Lapt.setBounds(50, 110, 90, 14);

        addresstf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addresstfActionPerformed(evt);
            }
        });
        add(addresstf);
        addresstf.setBounds(160, 60, 280, 30);

        apartmenttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apartmenttfActionPerformed(evt);
            }
        });
        add(apartmenttf);
        apartmenttf.setBounds(160, 100, 70, 30);

        Lcity.setText("City:");
        add(Lcity);
        Lcity.setBounds(50, 150, 70, 20);

        Citytf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitytfActionPerformed(evt);
            }
        });
        add(Citytf);
        Citytf.setBounds(160, 140, 160, 30);

        Lstate.setText("State:");
        add(Lstate);
        Lstate.setBounds(50, 190, 80, 20);

        statetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statetfActionPerformed(evt);
            }
        });
        add(statetf);
        statetf.setBounds(160, 180, 160, 30);

        jLabel5.setText("Zip Code:");
        add(jLabel5);
        jLabel5.setBounds(50, 230, 110, 20);
        add(ziptf);
        ziptf.setBounds(160, 220, 160, 30);

        submitAdd.setText("Submit");
        submitAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitAddActionPerformed(evt);
            }
        });
        add(submitAdd);
        submitAdd.setBounds(180, 290, 120, 23);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Address Information");
        add(jLabel6);
        jLabel6.setBounds(170, 20, 127, 15);
    }// </editor-fold>//GEN-END:initComponents

    private void addresstfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addresstfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addresstfActionPerformed

    private void CitytfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitytfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CitytfActionPerformed

    private void statetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statetfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statetfActionPerformed

    private void apartmenttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apartmenttfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_apartmenttfActionPerformed

    private void submitAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitAddActionPerformed
        person.getClassadd().setStreetaddress(addresstf.getText());
        person.getClassadd().setApt(apartmenttf.getText());
        person.getClassadd().setCity(Citytf.getText());
        person.getClassadd().setState(statetf.getText());
        person.getClassadd().setZip(ziptf.getText());
        
       //Promt the user that the data successfuly created
        JOptionPane.showMessageDialog(null, "Successfully Submited");
    }//GEN-LAST:event_submitAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Citytf;
    private javax.swing.JLabel Laddress;
    private javax.swing.JLabel Lapt;
    private javax.swing.JLabel Lcity;
    private javax.swing.JLabel Lstate;
    private javax.swing.JTextField addresstf;
    private javax.swing.JTextField apartmenttf;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField statetf;
    private javax.swing.JButton submitAdd;
    private javax.swing.JTextField ziptf;
    // End of variables declaration//GEN-END:variables
}
