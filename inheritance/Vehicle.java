package com.lab2.inheritance;

public class Vehicle extends Manufacturer {

    private String model;
    private int yearOfProduction;
    private int torque;
    private boolean ecologic;

    //Constructor
    public Vehicle(String location, int numberOfEmployees, String industry, String brand,
                   float marketValue, String model, int yearOfProduction, int torque, boolean ecologic) {
        super(location, numberOfEmployees, industry, brand, marketValue);
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.torque = torque;
        this.ecologic = ecologic;
    }

    //Getters
    public String getModel() {
        return model;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public int getTorque() {
        return torque;
    }

    public boolean isEcologic() {
        return ecologic;
    }


    //Setters
    public void setModel(String model) {
        this.model = model;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public void setEcologic(boolean ecologic) {
        this.ecologic = ecologic;
    }

    @Override
    public String print() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", torque=" + torque +
                ", ecologic=" + ecologic +
                '}';
    }
}
