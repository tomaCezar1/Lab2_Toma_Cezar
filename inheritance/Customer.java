package com.lab2.inheritance;

public class Customer extends Bank {

    private int ID;
    private String name;
    private double depositAmount;
    private boolean is18;

    public Customer(String location, double marketCap, String bankName, int ID, String name, double depositAmount, boolean is18) {
        super(location, marketCap, bankName);
        this.ID = ID;
        this.name = name;
        this.depositAmount = depositAmount;
        this.is18 = is18;
    }

    //Getters
    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public boolean isIs18() {
        return is18;
    }

    //Setters
    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public void setIs18(boolean is18) {
        this.is18 = is18;
    }

    public String print() {
        return "Customer{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", depositAmount=" + depositAmount +
                ", is18=" + is18 +
                '}';
    }
}
