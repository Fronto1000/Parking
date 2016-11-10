package com.program.parking;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by user on 08.11.2016.
 */
public class Program {
    public static void main(String [] args) {
        Transport kawasaki = new Motorcycle("Красный","Е 456 ЕН","Дорожный");
        Transport toyota = new Car("Черный","Р 458 ЛВ",5);
        Transport vaz = new Car("Белый","Е 894 ОЛ",4);
        Parking parking = new Parking();
        parking.showTransportOnParking();
        parking.add(kawasaki);
        parking.add(toyota);
        parking.add(vaz);
        parking.showTransportOnParking();
        parking.remove(vaz);
        parking.showTransportOnParking();
        parking.removeAll();
        parking.showTransportOnParking();




    }
}
