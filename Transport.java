package com.program.parking;

/**
 * Created by user on 08.11.2016.
 */
class Transport {

    private final String DEFAULT_COLOR = "Черный";
    private final String DEFAULT_NUMBER = "А001АА";

    protected String color;
    protected String number;

    public Transport(){
        this.color = DEFAULT_COLOR;
        this.number = DEFAULT_NUMBER;
    }

    public Transport(String color, String number) {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void drive(){
        System.out.println("Транспортное средство едет");
    }
    public void brokeDown() {
        System.out.println("Транспортное средство сломалось");
    }
}
