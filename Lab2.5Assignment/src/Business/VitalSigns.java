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
public class VitalSigns {
    private double temperature;
    private double bloodPressure;
    private int pulse;
    private String date;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {  //Takes input of temperature and assign to the local variable temperature declared above
        this.temperature = temperature;
    }

    public double getBloodPressure() {  
        return bloodPressure;
    }

    public void setBloodPressure(double bloodPressure) {  //Takes input of bloodPressure and assign to the local variable bloodPressure declared above
        this.bloodPressure = bloodPressure;
    }

    public int getPulse() {
        return pulse;
    }

    public void setPulse(int pulse) {  //Takes input of pulse and assign to the local variable pulse declared above
        this.pulse = pulse;
    }

    public String getDate() {  
        return date;
    }

    public void setDate(String date) {  //Takes input of date and assign to the local variable date declared above
        this.date = date;
    }
    
    @Override       //runtime polymorphism, changing something during runtime.Override changes the property of any attibute
    public String toString()
    {
    
    return this.date;
}
}