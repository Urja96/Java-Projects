/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import business.*;

/**
 *
 * @author hp
 */

public class Airline {
    
    private String flightName;
    public FlightDirectory flightDirectory;

    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }
    
    public Airline() {
        flightDirectory = new FlightDirectory();
    }
   

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    
    @Override
    public String toString() {
        return flightName;
    }
}
