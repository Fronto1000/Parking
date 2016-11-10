package com.program.parking;

/**
 * Created by user on 09.11.2016.
 */
class Motorcycle extends Transport {
    private String type;

    public Motorcycle(String color, int number, String type) {
        super(color, number);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void drive() {
        System.out.println("Мотоцикл едет");
    }

    @Override
    public void brokeDown() {
        System.out.println("Мотоцикл сломался");
    }
}
