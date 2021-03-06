/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hp
 */
public class View extends javax.swing.JPanel {

    /**
     * Creates new form View
     */
    private VitalSignsHistory vsh;      //Global Variables
    public View(VitalSignsHistory vsh) {       //Local Variables
        initComponents();
        this.vsh = vsh;     //assigning local variable to the global variable
        populateTable(); 
    }

        public void populateTable() //display all the records present currently in arrayList in table
        {
           DefaultTableModel dtm = (DefaultTableModel)table.getModel();                 //inbuilt classs
            dtm.setRowCount(0);     //refres the row in table
            for (VitalSigns vs : vsh.getVitalSignsHistory())
            {
                Object row[] = new Object[2];   //2 is the col no.
                row[0] = vs;        //0 is index no.
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

        lableVitalSign = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
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

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        lableVitalSign.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lableVitalSign.setText("View Vital Sign");
        add(lableVitalSign);
        lableVitalSign.setBounds(160, 0, 249, 63);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Pulse"
            }
        ));
        jScrollPane1.setViewportView(table);

        add(jScrollPane1);
        jScrollPane1.setBounds(20, 70, 420, 90);

        bttonViewDetails.setText("View Details");
        bttonViewDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonViewDetailsActionPerformed(evt);
            }
        });
        add(bttonViewDetails);
        bttonViewDetails.setBounds(213, 190, 110, 30);

        bttonDelete.setText("Delete");
        bttonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttonDeleteActionPerformed(evt);
            }
        });
        add(bttonDelete);
        bttonDelete.setBounds(333, 190, 100, 30);

        lableTemperature.setText("Temperature:");
        add(lableTemperature);
        lableTemperature.setBounds(50, 280, 120, 20);

        lableBP.setText("Blood Pressure:");
        add(lableBP);
        lableBP.setBounds(50, 330, 130, 20);

        lablePulse.setText("Pulse:");
        add(lablePulse);
        lablePulse.setBounds(50, 390, 80, 20);

        lableDate.setText("Date:");
        add(lableDate);
        lableDate.setBounds(50, 450, 80, 20);

        textFieldTemperature.setEditable(false);
        add(textFieldTemperature);
        textFieldTemperature.setBounds(190, 270, 220, 30);

        textFileldPulse.setEditable(false);
        textFileldPulse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFileldPulseActionPerformed(evt);
            }
        });
        add(textFileldPulse);
        textFileldPulse.setBounds(190, 380, 220, 30);

        textFieldDate.setEditable(false);
        add(textFieldDate);
        textFieldDate.setBounds(190, 440, 220, 30);

        textFieldBP.setEditable(false);
        add(textFieldBP);
        textFieldBP.setBounds(190, 320, 220, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void textFileldPulseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFileldPulseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFileldPulseActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttonDelete;
    private javax.swing.JButton bttonViewDetails;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lableBP;
    private javax.swing.JLabel lableDate;
    private javax.swing.JLabel lablePulse;
    private javax.swing.JLabel lableTemperature;
    private javax.swing.JLabel lableVitalSign;
    private javax.swing.JTable table;
    private javax.swing.JTextField textFieldBP;
    private javax.swing.JTextField textFieldDate;
    private javax.swing.JTextField textFieldTemperature;
    private javax.swing.JTextField textFileldPulse;
    // End of variables declaration//GEN-END:variables
}
