/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.*;
import javax.swing.*;
/**
 *
 * @author hp
 */
public class UpdatePanel extends javax.swing.JPanel {

    /**
     * Creates new form UpdatePanel
     */
    private Product product;
    public UpdatePanel(Product product) {
        initComponents();
        this.product = product;
        loadfieldvalues(product);
    }

    private void loadfieldvalues(Product product){
        nameTextFieldupdate.setText(product.getName());
        priceTextField1.setText(product.getPrice());
        availNumTextField1.setText(product.getAvailNum());
        descriptionTextField1.setText(product.getDescription());
        SupplierName.setText(product.getSupplier().getSupplierName());
        SupplierAddress.setText(product.getSupplier().getSupplierAddress());
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTextFieldupdate = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Updatebutton = new javax.swing.JButton();
        priceTextField1 = new javax.swing.JTextField();
        availNumTextField1 = new javax.swing.JTextField();
        descriptionTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        SupplierName = new javax.swing.JTextField();
        SupplierAddress = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);
        add(nameTextFieldupdate);
        nameTextFieldupdate.setBounds(150, 70, 230, 30);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Update Your Product");
        add(jLabel2);
        jLabel2.setBounds(170, 20, 228, 29);

        jLabel3.setText("Name:");
        add(jLabel3);
        jLabel3.setBounds(20, 79, 70, 20);

        jLabel6.setText("Price:");
        add(jLabel6);
        jLabel6.setBounds(20, 117, 60, 20);

        jLabel7.setText("Availabity Number:");
        add(jLabel7);
        jLabel7.setBounds(20, 155, 130, 20);

        Updatebutton.setText("Update");
        Updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdatebuttonActionPerformed(evt);
            }
        });
        add(Updatebutton);
        Updatebutton.setBounds(220, 380, 80, 23);
        add(priceTextField1);
        priceTextField1.setBounds(150, 110, 230, 30);
        add(availNumTextField1);
        availNumTextField1.setBounds(150, 150, 230, 30);
        add(descriptionTextField1);
        descriptionTextField1.setBounds(150, 190, 230, 30);

        jLabel8.setText("Description:");
        add(jLabel8);
        jLabel8.setBounds(20, 193, 90, 20);
        add(jSeparator2);
        jSeparator2.setBounds(0, 350, 560, 10);

        jLabel9.setText("Supplier Name:");
        add(jLabel9);
        jLabel9.setBounds(20, 240, 130, 20);
        add(SupplierName);
        SupplierName.setBounds(150, 230, 230, 30);
        add(SupplierAddress);
        SupplierAddress.setBounds(150, 270, 230, 30);

        jLabel10.setText("Supplier Address:");
        add(jLabel10);
        jLabel10.setBounds(20, 280, 90, 20);
    }// </editor-fold>//GEN-END:initComponents

    private void UpdatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdatebuttonActionPerformed
        // TODO add your handling code here:
        product.setName(nameTextFieldupdate.getText());
        product.setPrice(priceTextField1.getText());
        product.setAvailNum(availNumTextField1.getText());
        product.setDescription(descriptionTextField1.getText());
        
        String SuplierName = product.getSupplier().getSupplierName();
        SupplierName.setText(SuplierName);
        
        String SuplierAddress = product.getSupplier().getSupplierAddress();
        SupplierAddress.setText(SuplierAddress);
        
        
        //promt a dialog box for successful submit
        JOptionPane.showMessageDialog(null, "Updated Successfully");
    }//GEN-LAST:event_UpdatebuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SupplierAddress;
    private javax.swing.JTextField SupplierName;
    private javax.swing.JButton Updatebutton;
    private javax.swing.JTextField availNumTextField1;
    private javax.swing.JTextField descriptionTextField1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nameTextFieldupdate;
    private javax.swing.JTextField priceTextField1;
    // End of variables declaration//GEN-END:variables
}
