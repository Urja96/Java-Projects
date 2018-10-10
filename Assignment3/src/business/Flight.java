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
public class Flight {
   private String filghtName;
   private String fromDest;
   private String toDest;
   private String time;
   private  int seats = 5;
   Customer customer;

   public void seatdecrease(){
   seats--;
   
   }
    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
   private FlightDirectory flightdirect;
   
   public Flight() {
        flightdirect = new FlightDirectory();
    }
    public String getFilghtName() {
        return filghtName;
    }

    public void setFilghtName(String filghtName) {
        this.filghtName = filghtName;
    }
    
    public FlightDirectory getFlightdirect() {
        return flightdirect;
    }

     
    public String getFromDest() {
        return fromDest;
    }

    public void setFromDest(String fromDest) {
        this.fromDest = fromDest;
    }

    public String getToDest() {
        return toDest;
    }

    public void setToDest(String toDest) {
        this.toDest = toDest;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
     
    
    @Override
    public String toString() {
        return filghtName;
    }
    
}

