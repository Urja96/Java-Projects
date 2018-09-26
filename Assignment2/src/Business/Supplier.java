/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author hp
 */
public class Supplier {
    private String SupplierNameobj;
    private String SupplierAddressobj;

    public String getSupplierName() {
        return SupplierNameobj;
    }

    public void setSupplierName(String SupplierName) {
        this.SupplierNameobj = SupplierName;
    }

    public String getSupplierAddress() {
        return SupplierAddressobj;
    }

    public void setSupplierAddress(String SupplierAddress) {
        this.SupplierAddressobj = SupplierAddress;
    }
    
    public Supplier(){
        SupplierNameobj = "URJA JAIN";
        SupplierAddressobj = "Boston Massachusetts" ;       
        
    }
    
}
