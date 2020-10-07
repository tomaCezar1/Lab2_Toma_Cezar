package com.lab2.inheritance;

public class Motorcycle extends Manufacturer {

    private double horsepower;
    private double rpm;
    private boolean isLegal;

    public Motorcycle(String location, int numberOfEmployees, String industry, String brand, float marketValue,
                      double horsepower, double rpm, boolean isLegal) {
        super(location, numberOfEmployees, industry, brand, marketValue);
        this.horsepower = horsepower;
        this.rpm = rpm;
        this.isLegal = isLegal;
    }

    //Getters
    public double getHorsepower() {
        return horsepower;
    }

    public double getRpm() {
        return rpm;
    }

    public boolean isLegal() {
        return isLegal;
    }


    //Setters
    public void setHorsepower(double horsepower) {
        this.horsepower = horsepower;
    }

    public void setRpm(double rpm) {
        this.rpm = rpm;
    }

    public void setLegal(boolean legal) {
        isLegal = legal;
    }

    @Override
    public String print() {
        return "Motorcycle{" +
                "horsepower=" + horsepower +
                ", rpm=" + rpm +
                ", isLegal=" + isLegal +
                '}';
    }
}
