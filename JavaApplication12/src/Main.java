/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Angelo Ablaza
 */
import java.util.Random;
import java.util.concurrent.Semaphore;
//from  www. j  a  va  2 s .co m

class Train {

    private Semaphore seats;

    public Train(int seatsCount) {
        this.seats = new Semaphore(seatsCount);
    }

    public void getTrain(int passengerID) {
        try {
            System.out.println("Passenger  #" + passengerID
                    + "  is waiting for a train...");
            seats.acquire();
            System.out.println("Passenger #" + passengerID + "  boarded a train");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void returnTrain(int passengerID) {
//        System.out.println("Passneger #" + passengerID + "  returned a  table.");
        System.out.println("Passneger #" + passengerID + "  got off the train");
        seats.release();
    }
}

class Passenger extends Thread {

    private Train t;
    private int passengerID;
    private static final Random random = new Random();

    public Passenger(Train t, int passengerID) {
        this.t = t;
        this.passengerID = passengerID;
    }

    public void run() {
        t.getTrain(this.passengerID); // Get a table
        try {
            int eatingTime = random.nextInt(30) + 1;
            System.out.println("Passenger #" + this.passengerID
                    + "  will travel for " + eatingTime + "  seconds.");
            Thread.sleep(eatingTime * 1000);
//            System.out.println("Passenger #" + this.passengerID
//                    + "  is done  eating.");
            System.out.println("Passenger #" + this.passengerID
                    + " arrived at destination");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            t.returnTrain(this.passengerID);
        }
    }
}

public class Main {

    public static void main(String[] args) {
        Train train = new Train(2);
        for (int i = 1; i <= 5; i++) {
            Passenger p = new Passenger(train, i);
            p.start();
        }
    }
}
