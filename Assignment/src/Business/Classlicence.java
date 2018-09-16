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
public class Classlicence {
   private String liscencenumb;
   private String Blood;
   private String issueMonth;
   private String issuedate;
   private String issueyear;
   private String expiryMonth;
   private String expirydate;
   private String expiryyear;
   private String picture;

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPicture() {
        return picture;
    }

    public void setIssueMonth(String issueMonth) {
        this.issueMonth = issueMonth;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate;
    }

    public void setIssueyear(String issueyear) {
        this.issueyear = issueyear;
    }

    public void setExpiryMonth(String expiryMonth) {
        this.expiryMonth = expiryMonth;
    }

    public void setExpirydate(String expirydate) {
        this.expirydate = expirydate;
    }

    public void setExpiryyear(String expiryyear) {
        this.expiryyear = expiryyear;
    }

    public String getIssueMonth() {
        return issueMonth;
    }

    public String getIssuedate() {
        return issuedate;
    }

    public String getIssueyear() {
        return issueyear;
    }

    public String getExpiryMonth() {
        return expiryMonth;
    }

    public String getExpirydate() {
        return expirydate;
    }

    public String getExpiryyear() {
        return expiryyear;
    }

    public String getLiscencenumb() {
        return liscencenumb;
    }

    public String getBlood() {
        return Blood;
    }

    public void setLiscencenumb(String liscencenumb) {
        this.liscencenumb = liscencenumb;
    }

    public void setBlood(String Blood) {
        this.Blood = Blood;
    }
   
   
}
