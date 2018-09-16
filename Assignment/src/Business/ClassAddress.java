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
public class ClassAddress {

    private String streetaddress;
    private String apt;
    private String city;
    private String state;
    private String zip;

    public String getStreetaddress() {
        return streetaddress;
    }

    public String getApt() {
        return apt;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public void setStreetaddress(String streetaddress) {
        this.streetaddress = streetaddress;
    }

    public void setApt(String apt) {
        this.apt = apt;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
    
}
