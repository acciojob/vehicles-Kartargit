package com.driver;

public class Boat implements WaterVehicle{
    String name;
    int Capacity;

    public Boat(String name, int capacity){
        this.name = name;
        this.Capacity = capacity;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCapacity(int capacity) {
        this.Capacity = capacity;
    }

    public int getCapacity() {
        return Capacity;
    }

    @Override
    public String getVehicleName() {
        return name;
    }

    @Override
    public int getVehicleCapacity() {
        return Capacity;
    }
}
