/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import java.util.ArrayList;

/**
 *
 * @author hp
 */
public class AirlineDirectory {
    private ArrayList<Airline> airlineDir;      //declaring List
    public AirlineDirectory() {
        airlineDir = new ArrayList<Airline>();      //initializing List
    }

    public ArrayList<Airline> getAirlineDir() {
        return airlineDir;
    }

   public Airline addAirline() {        //method to add airline
        Airline a = new Airline();      //creating new object
        airlineDir.add(a);
        return a;
   }
    public void removeAirline(Airline a) {      //method to remove airline
        airlineDir.remove(a);
    }
}
