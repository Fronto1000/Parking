package com.program.parking;

/**
 * Created by user on 09.11.2016.
 */
class Car extends Transport {
    private int quantityDoors;

    public Car(String color, String number, int quantityDoors) {
        super(color, number);
        this.quantityDoors = quantityDoors;
    }

    public int getQuantityDoors() {
        return quantityDoors;
    }

    @Override
    public void drive() {
        System.out.println("Автомобиль едет");
    }

    @Override
    public void brokeDown() {
        System.out.println("Автомобиль сломался");
    }
}
