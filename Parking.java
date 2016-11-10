package com.program.parking;

import java.util.ArrayList;

/**
 * Created by user on 08.11.2016.
 */
class Parking {

    private ArrayList <Transport> transportsArray;

    public Parking() {
        transportsArray = new ArrayList <Transport>();
    }

    public void showTransportOnParking(){
        System.out.println("Количество транспортных средств на стоянке: " + transportsArray.size());
    }
    public void add(Transport transport){
        transportsArray.add(transport);
    }
    public void remove(Transport transport){
        transportsArray.remove(transport);
        transport.drive();
    }
    public void removeAll() {
        transportsArray.clear();
    }
}
