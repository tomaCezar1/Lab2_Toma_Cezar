package com.lab2.encapsulation;

public class Factory {

    private String location;
    private int numberOfEmployees;
    private String industry;
    private String brand;
    private float marketValue;

    //Constructor
    public Factory(String location, int numberOfEmployees, String industry, String brand, float marketValue) {
        this.location = location;
        this.numberOfEmployees = numberOfEmployees;
        this.industry = industry;
        this.brand = brand;
        this.marketValue = marketValue;
    }

    //Getters

    public String getLocation() {
        return location;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public String getIndustry() {
        return industry;
    }

    public String getBrand() {
        return brand;
    }

    public float getMarketValue() {
        return marketValue;
    }


    //Setters
    public void setLocation(String location) {
        this.location = location;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setMarketValue(float marketValue) {
        this.marketValue = marketValue;
    }

    public String print() {
        return "Manufacturer {" +
                "location='" + location + '\'' +
                ", numberOfEmployees=" + numberOfEmployees +
                ", industry='" + industry + '\'' +
                ", brand='" + brand + '\'' +
                ", marketValue=" + marketValue +
                '}';
    }
}
