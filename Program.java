package com.program.parking;

import java.util.Arrays;

/**
 * Created by user on 08.11.2016.
 */
public class Program {
    public static void main(String [] args) {
        Parking parking = new Parking();
        parking.showTransportOnParking();
        Transport motorcycle = new Motorcycle("Красный",123,"Дорожный");
        parking.add(motorcycle);
        parking.showTransportOnParking();
        parking.remove(motorcycle);
        parking.showTransportOnParking();
        Transport car = new Car("Черная",2345,5);
        parking.add(car);
        parking.showTransportOnParking();
        parking.remove(car);
        parking.showTransportOnParking();
        parking.add(car);
        parking.add(motorcycle);
        parking.showTransportOnParking();
        parking.removeAll();
        parking.showTransportOnParking();




    }
}
