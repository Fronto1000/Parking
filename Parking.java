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
        if(transportsArray.size() != 0)
        System.out.println("Номера транспортных средств:");
        for (Transport transport: transportsArray) {
            System.out.println(transport.number);
        }
    }
    public void add(Transport transport){
        transportsArray.add(transport);
        System.out.println("На стоянку заехало транспортное средство с номером: " + transport.number);
    }
    public void remove(Transport transport){
        transportsArray.remove(transport);
        System.out.println("Стоянку покинуло транспортное стредство с номером: " + transport.number);
    }
    public void removeAll() {
        transportsArray.clear();
        System.out.println("Все транспортные средства покинули стоянку");
    }
}
