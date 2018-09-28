/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hp
 */

//This class will store the collection of Vital Signs
//Using ArrayList to store VitalSigns.
public class VitalSignsHistory {
    private ArrayList<VitalSigns> vitalSignsHistory;  //store all the objects of VitalSigns and rectrict if different object added
    
    
    public VitalSignsHistory(){
        
        vitalSignsHistory = new ArrayList<VitalSigns>();  //Initiaizing ArrayList
                    
    }

    public ArrayList<VitalSigns> getVitalSignsHistory() {
        return vitalSignsHistory;
    }

    public void setVitalSignsHistory(ArrayList<VitalSigns> vitalSignsHistory) {
        this.vitalSignsHistory = vitalSignsHistory;
    }
    
    public VitalSigns addVitals() {     //datatype is VitalSign, ensure object ceated in arrayList come in front end
        VitalSigns vs = new VitalSigns();
        vitalSignsHistory.add(vs);      //Add new VitalSign into an ArrayList
        return vs;                     //Object is returned back to method
    }

    
   
    
    public void deleteVitals(VitalSigns v){        //deletes or removes the object 
        vitalSignsHistory.remove(v);
    }
    public ArrayList<VitalSigns>getVitalSignsList(){
            return vitalSignsHistory;
}
    public List<VitalSigns> getAbnormalList(double maxbp, double minbp){
        List<VitalSigns> abnList = new ArrayList<>();
            for (VitalSigns vs: vitalSignsHistory){
                if (vs.getPulse() >70 || vs.getPulse() < 35){
                abnList.add(vs);
                }
            }
                return abnList;
            }
    
}

