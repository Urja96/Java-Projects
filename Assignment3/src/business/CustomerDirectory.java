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
public class CustomerDirectory {
    private ArrayList<Customer> customerDir;      //declaring List
    public CustomerDirectory() {
        customerDir = new ArrayList<Customer>();      //initializing List
    }

    public ArrayList<Customer> getAirlineDir() {
        return customerDir;
    }
public Customer addCustomer() {        //method to add airline
        Customer c = new Customer();      //creating new object
        customerDir.add(c);
        return c;
   }
}
