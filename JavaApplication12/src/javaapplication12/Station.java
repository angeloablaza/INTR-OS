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
public class Station {

    public ArrayList<Passenger> passengers = new ArrayList<>();
    public int stationNo;

    public Station(int stationNo) {
        this.stationNo = stationNo;
    }

    public void addPassenger(Passenger passenger) {
        passengers.add(passenger);
    }
}
