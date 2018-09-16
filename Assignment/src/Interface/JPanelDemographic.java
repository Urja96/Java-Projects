package Interface;

import Business.Person;
import Business.Classdemographic.*;
import javax.swing.*;
public class JPanelDemographic extends javax.swing.JPanel {

   
    private Person person;
    public JPanelDemographic(Person person) {
        initComponents();
        this.person = person;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LDOB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        LWeight = new javax.swing.JLabel();
        ssn = new javax.swing.JLabel();
        SSNtf = new javax.swing.JTextField();
        weight = new javax.swing.JTextField();
        heighttf = new javax.swing.JTextField();
        Agetf = new javax.swing.JTextField();
        Phonenumbertf = new javax.swing.JTextField();
        Lastnametf = new javax.swing.JTextField();
        Fistnametf = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jComboBoxMonth = new javax.swing.JComboBox<>();
        jComboBoxDate = new javax.swing.JComboBox<>();
        jComboBoxYear = new javax.swing.JComboBox<>();
        Submitdemo = new javax.swing.JButton();
        Header = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setName("Demographic Information"); // NOI18N
        setLayout(null);

        jLabel1.setText("First Name:");
        add(jLabel1);
        jLabel1.setBounds(50, 60, 120, 14);

        jLabel2.setText("Last Name:");
        add(jLabel2);
        jLabel2.setBounds(50, 100, 100, 14);

        jLabel3.setText("Phone Number:");
        add(jLabel3);
        jLabel3.setBounds(50, 140, 130, 14);

        LDOB.setText("Date of Birth:");
        add(LDOB);
        LDOB.setBounds(50, 180, 110, 14);

        jLabel5.setText("Age:");
        add(jLabel5);
        jLabel5.setBounds(50, 210, 80, 20);

        jLabel6.setText("Height");
        add(jLabel6);
        jLabel6.setBounds(50, 250, 80, 14);

        LWeight.setText("Weight:");
        add(LWeight);
        LWeight.setBounds(50, 290, 80, 20);

        ssn.setText("Social Security number:");
        add(ssn);
        ssn.setBounds(40, 330, 170, 14);

        SSNtf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SSNtfActionPerformed(evt);
            }
        });
        add(SSNtf);
        SSNtf.setBounds(180, 320, 160, 30);

        weight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightActionPerformed(evt);
            }
        });
        add(weight);
        weight.setBounds(180, 280, 90, 30);

        heighttf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heighttfActionPerformed(evt);
            }
        });
        add(heighttf);
        heighttf.setBounds(180, 240, 90, 30);

        Agetf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgetfActionPerformed(evt);
            }
        });
        add(Agetf);
        Agetf.setBounds(180, 200, 90, 30);

        Phonenumbertf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PhonenumbertfActionPerformed(evt);
            }
        });
        add(Phonenumbertf);
        Phonenumbertf.setBounds(180, 130, 220, 30);

        Lastnametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastnametfActionPerformed(evt);
            }
        });
        add(Lastnametf);
        Lastnametf.setBounds(180, 90, 220, 30);

        Fistnametf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FistnametfActionPerformed(evt);
            }
        });
        add(Fistnametf);
        Fistnametf.setBounds(180, 50, 220, 30);

        jLabel9.setText("lb");
        add(jLabel9);
        jLabel9.setBounds(280, 280, 40, 30);

        jLabel10.setText("cm");
        add(jLabel10);
        jLabel10.setBounds(280, 250, 40, 20);

        jComboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "Janurary", "February ", "March ", "April", "May", "June", "July", "August", "September", "October", "November", "December", " " }));
        jComboBoxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMonthActionPerformed(evt);
            }
        });
        add(jComboBoxMonth);
        jComboBoxMonth.setBounds(180, 170, 70, 20);

        jComboBoxDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDateActionPerformed(evt);
            }
        });
        add(jComboBoxDate);
        jComboBoxDate.setBounds(250, 170, 60, 20);

        jComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1901", "1902", "1903", "1904", "1905", "1906", "1907", "1908", "1909", "1910", "1911", "1912", "1913", "1914", "1915", "1916", "1917", "1918", "1919", "1920", "1921", "1922", "1923", "1924", "1925", "1926", "1927", "1928", "1929", "1930", "1931", "1932", "1933", "1934", "1935", "1936", "1937", "1938", "1939", "1940", "1941", "1942", "1943", "1944", "1945", "1946", "1947", "1948", "1949", "1950", "1951", "1952", "1953", "1954", "1955", "1956", "1957", "1958", "1959", "1960", "1961", "1962", "1963", "1964", "1965", "1966", "1967", "1968", "1969", "1970", "1971", "1972", "1973", "1974", "1975", "1976", "1977", "1978", "1979", "1980", "1981", "1982", "1983", "1984", "1985", "1986", "1987", "1988", "1989", "1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018" }));
        jComboBoxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxYearActionPerformed(evt);
            }
        });
        add(jComboBoxYear);
        jComboBoxYear.setBounds(310, 170, 70, 20);

        Submitdemo.setText("Submit");
        Submitdemo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitdemoActionPerformed(evt);
            }
        });
        add(Submitdemo);
        Submitdemo.setBounds(190, 370, 90, 23);

        Header.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Header.setText("Demographic Information");
        add(Header);
        Header.setBounds(150, 20, 158, 15);
    }// </editor-fold>//GEN-END:initComponents

    private void FistnametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FistnametfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FistnametfActionPerformed

    private void weightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightActionPerformed
        person.getClassdemo().setWeight(weight.getText());
    }//GEN-LAST:event_weightActionPerformed

    private void jComboBoxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonthActionPerformed
       
    }//GEN-LAST:event_jComboBoxMonthActionPerformed

    private void jComboBoxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxYearActionPerformed

    private void SubmitdemoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitdemoActionPerformed
        // TODO add your handling code here:
        //Binding User Input to person object
        person.getClassdemo().setFirstname(Fistnametf.getText());
        person.getClassdemo().setLastname(Lastnametf.getText());
        person.getClassdemo().setPhonenumb(Phonenumbertf.getText());
        person.getClassdemo().setMonth((String) jComboBoxMonth.getSelectedItem());
        person.getClassdemo().setDate((String) jComboBoxDate.getSelectedItem());
        person.getClassdemo().setYear((String) jComboBoxYear.getSelectedItem());
        person.getClassdemo().setAge(Agetf.getText());
        person.getClassdemo().setHeight(heighttf.getText());
        person.getClassdemo().setWeight(weight.getText());
        person.getClassdemo().setSsn(SSNtf.getText());
        
        //Promt the user that the data successfuly created
        JOptionPane.showMessageDialog(null, "Successfully Submited");
    }//GEN-LAST:event_SubmitdemoActionPerformed

    private void LastnametfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastnametfActionPerformed
       
    }//GEN-LAST:event_LastnametfActionPerformed

    private void PhonenumbertfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PhonenumbertfActionPerformed
        
    }//GEN-LAST:event_PhonenumbertfActionPerformed

    private void AgetfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgetfActionPerformed

    }//GEN-LAST:event_AgetfActionPerformed

    private void heighttfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heighttfActionPerformed
        
    }//GEN-LAST:event_heighttfActionPerformed

    private void SSNtfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SSNtfActionPerformed
        
    }//GEN-LAST:event_SSNtfActionPerformed

    private void jComboBoxDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Agetf;
    private javax.swing.JTextField Fistnametf;
    private javax.swing.JLabel Header;
    private javax.swing.JLabel LDOB;
    private javax.swing.JLabel LWeight;
    private javax.swing.JTextField Lastnametf;
    private javax.swing.JTextField Phonenumbertf;
    private javax.swing.JTextField SSNtf;
    private javax.swing.JButton Submitdemo;
    private javax.swing.JTextField heighttf;
    private javax.swing.JComboBox<String> jComboBoxDate;
    private javax.swing.JComboBox<String> jComboBoxMonth;
    private javax.swing.JComboBox<String> jComboBoxYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel ssn;
    private javax.swing.JTextField weight;
    // End of variables declaration//GEN-END:variables
}
