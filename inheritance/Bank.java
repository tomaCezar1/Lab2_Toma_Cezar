package com.lab2.inheritance;

public class Bank {

    private String location;
    private double marketCap;
    private String bankName = "Scotiabank";

    public Bank(String location, double marketCap, String bankName) {
        this.location = location;
        this.marketCap = marketCap;
        this.bankName = bankName;
    }

    public Bank(String location, double marketCap) {
        this.location = location;
        this.marketCap = marketCap;

    }



    //Getters
    public String getLocation() {
        return location;
    }

    public double getMarketCap() {
        return marketCap;
    }

    public String getBankName() {
        return bankName;
    }

    //Setters
    public void setLocation(String location) {
        this.location = location;
    }

    public void setMarketCap(double marketCap) {
        this.marketCap = marketCap;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String print() {
        return "Bank{" +
                "location='" + location + '\'' +
                ", marketCap=" + marketCap +
                ", bankName='" + bankName + '\'' +
                '}';
    }
}
