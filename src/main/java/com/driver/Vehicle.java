package com.driver;

public class Vehicle {

    private String name;
    private int currentSpeed;
    private int currentDirection;

    public Vehicle(String name) {
       setName(name);
//        this.name = name;
       setCurrentSpeed(0);
       setCurrentDirection(0);
    }
    private void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void setCurrentSpeed(int newSpeed){
        this.currentSpeed = newSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
    private void setCurrentDirection(int newDir){
        this.currentDirection = newDir;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void steer(int direction){
        //direction is in degrees, add it to the current direction
        currentDirection += direction;
        System.out.println("steer method called - The direction is changed to: " + currentDirection + " degrees");
    }

    public void move(int speed, int direction){
        //set the values of currentSpeed and currentDirection
        setCurrentSpeed(speed);
        setCurrentDirection(direction);
        System.out.println("move method called - The speed is changed to: " + currentSpeed + ", and the direction is changed to: " + currentDirection + " degrees");
    }

    public void stop(){
        currentSpeed = 0;
        System.out.println("stop method called - The vehicle is stopped");
    }

}
