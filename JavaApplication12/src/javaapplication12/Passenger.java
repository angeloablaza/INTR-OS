/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication12;

/**
 *
 * @author Angelo Ablaza
 */
public class Passenger implements Runnable{
    
    public int id;
    public int initial;
    public int destination;
    
    public Passenger(int id, int initial, int destination){
        this.id = id;
        this.initial = initial;
        this.destination = destination;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getInitial() {
        return initial;
    }

    public void setInitial(int initial) {
        this.initial = initial;
    }

    public int getDestination() {
        return destination;
    }

    public void setDestination(int destination) {
        this.destination = destination;
    }

    @Override
    public void run() {
        System.out.println("Passenger is waiting");
    }
    
    
    
}
