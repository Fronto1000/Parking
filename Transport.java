package com.program.parking;

/**
 * Created by user on 08.11.2016.
 */
class Transport {

    private final String DEFAULT_COLOR = "black";
    private final int DEFAULT_NUMBER = 000;

    protected String color;
    protected int number;

    public Transport(){
        this.color = DEFAULT_COLOR;
        this.number = DEFAULT_NUMBER;
    }

    public Transport(String color, int number) {
        this.number = number;
        this.color = color;
    }

    public Transport(Transport original){
        this.color = original.color;
        this.number = original.number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void drive(){
        System.out.println("Транспортное средство едет");
    }
    public void brokeDown() {
        System.out.println("Транспортное средство сломалось");
    }
}
