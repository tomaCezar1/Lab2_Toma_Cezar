package com.lab2.encapsulation;

public class Watch {

    private String color;
    private String brand;
    private int price;
    private int numberOfProduction;

    //Constructor
    public Watch(String color, String brand, int price, int numberOfProduction) {
        this.color = color;
        this.brand = brand;
        this.price = price;
        this.numberOfProduction = numberOfProduction;
    }

    //Getters
    public String getColor() {
        return color;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    public int getNumberOfProduction() {
        return numberOfProduction;
    }

    //Setters

    public void setColor(String color) {
        this.color = color;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setNumberOfProduction(int numberOfProduction) {
        this.numberOfProduction = numberOfProduction;
    }


    public String print() {
        return "Watch{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                ", numberOfProduction=" + numberOfProduction +
                '}';
    }
}
