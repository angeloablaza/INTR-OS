/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

import java.util.ArrayList;

/**
 *
 * @author Angelo Ablaza
 */
public class Train {

    public ArrayList<Passenger> passengers;
    public int trainNo;
    public int capacity;
    
    public Train(int trainNo, int capacity) {
        passengers = new ArrayList<>();
        this.trainNo = trainNo;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
    
     public void display(){
        for(int i=0; i<passengers.size(); i++){
            System.out.println(passengers.get(i).id);
        }
    }
}
