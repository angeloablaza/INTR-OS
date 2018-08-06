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
public class Train implements Runnable {

    public ArrayList<Passenger> passengers;
    public int trainNo;
    public int capacity;
    
    public Train(int trainNo, int capacity) {
        passengers = new ArrayList<>();
        this.trainNo = trainNo;
        this.capacity = capacity;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(ArrayList<Passenger> passengers) {
        this.passengers = passengers;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    
    
    
     public void display(){
        for(int i=0; i<passengers.size(); i++){
            System.out.println(passengers.get(i).id);
        }
    }

    @Override
    public void run() {
        System.out.println("Train is running");
    }
}
