/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;
import business.*;
import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class FlightDirectory {
     private ArrayList<Flight> flightDir;      //declaring List
     
    public FlightDirectory() {
        flightDir = new ArrayList<Flight>();      //initializing List
    }
         
    public ArrayList<Flight> getFlightDir() {
        return flightDir;
    }
    
   public Flight addFlight() {        //method to add airline
       Flight a = new Flight();      //creating new object
        flightDir.add(a);
        return a;
   }
    public void removeFlight(Flight a) {      //method to remove airline
        flightDir.remove(a);
    }
    public Flight searchFlight(String from, String to) {
        //ArrayList<Product> result = new ArrayList<Product>();
        for(Flight f : flightDir) {
            if(f.getFromDest()== from && f.getToDest()== to) {
                return f;
            }
        }
        return null;
    }
}
    
    

