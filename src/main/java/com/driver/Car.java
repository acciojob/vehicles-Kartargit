package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;
    public void setGears(int gears){this.gears = gears;}
    public int getGears(){return gears;}
    public void setDoors(int doors) {this.doors = doors;}
    public int getDoors() {return doors;}

    public void setSeats(int seats) {this.seats = seats;}
    public int getSeats() {return seats;}

    public void setWheels(int wheels) {this.wheels = wheels;}

    public int getWheels() {return wheels;}

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setManual(boolean manual) {
        this.isManual = manual;
    }

    public boolean isManual() {
        return isManual;
    }

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        //Hint: Car extends Vehicle
        super("name");
       this.wheels = wheels;
       this.gears = gears;
       this.type = type;
       this.doors = doors;
       this.seats = seats;
       this.isManual = isManual;
        currentGear = 1;
    }

    public void changeGear(int newGear){
        setGears(newGear);
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        super.move(newSpeed,newDirection);
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }
}
