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
public class Station implements Runnable{

    public ArrayList<Passenger> passengers;
    public int stationNo;
    public boolean isOccupied;

    public Station(int stationNo) {
        this.stationNo = stationNo;
        passengers = new ArrayList<>();
        isOccupied = false;
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

    public int getStationNo() {
        return stationNo;
    }

    public void setStationNo(int stationNo) {
        this.stationNo = stationNo;
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public void display(){
        for(int i=0; i<passengers.size(); i++){
            System.out.println(passengers.get(i).id);
        }
    }

    @Override
    public void run() {
        System.out.println("Station is running");
    }
}
