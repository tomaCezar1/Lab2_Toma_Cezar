package com.lab2;

import com.lab2.inheritance.*;
import com.lab2.encapsulation.*;

public class Main {

    public static void main(String[] args) {
        //Hierarchical Inheritance
        Manufacturer Ford = new Manufacturer("USA", 100_000, "Transport", "Ford", 2.5f);
        Vehicle Mustang = new Vehicle("USA", 25_000, "Automotive", "Ford", 0.4f,
                "Mustang", 1960, 500, false);
        Motorcycle Ducati = new Motorcycle("Italy", 20_000,
                "Motorcycles", "Ducati", 0.7f, 680, 6000, true);

        System.out.println();
        System.out.println("----------- Hierarchical Inheritance -----------");
        System.out.println("Manufacturer : ");
        System.out.println(Ford.getBrand());
        System.out.println(Ford.getMarketValue());
        System.out.println();
        System.out.println("Vehicle class");
        System.out.println(Mustang.getTorque());
        System.out.println(Mustang.getModel());
        System.out.println(Mustang.getYearOfProduction());
        System.out.println(Mustang.isEcologic());
        System.out.println();
        System.out.println("Motorcycle class :");
        System.out.println(Ducati.getHorsepower());
        System.out.println(Ducati.getRpm());
        System.out.println(Ducati.isLegal());

        System.out.println();
        System.out.println();


        System.out.println("----------- Single Inheritance -----------");
        Bank bank1 = new Bank("Chisinau", 8.0d);
        Customer customer1 = new Customer("Buiucani", 8.0,
                "Victoriabank", 10000, "Cesar", 5000, false);

        System.out.println("Bank 1 :");
        System.out.println(bank1.getBankName());
        System.out.println(bank1.getLocation());
        System.out.println(bank1.getMarketCap());
        System.out.println();
        System.out.println("Customer 1");
        System.out.println(customer1.getName());
        System.out.println(customer1.getDepositAmount());
        customer1.setIs18(true);
        System.out.println(customer1.isIs18());
        System.out.println(customer1.getBankName());
        System.out.println();

        System.out.println("----------- Encapsulation example 1 -----------");
        //First Object
        Factory Porsche = new Factory("Germany", 20_000, "Automotive", "Porsche", 1.5f);

        //Getter
        String location = Porsche.getLocation();
        System.out.println(location);

        //Setter
        Porsche.setIndustry("Luxury");
        System.out.println(Porsche.getIndustry());

        //Print all values
        System.out.println(Porsche.print());

        System.out.println();


        System.out.println("----------- Encapsulation example 2 -----------");
        //Second Object
        Watch Guess = new Watch("Silver", "Guess", 200, 1_500_000);

        String color = Guess.getColor();
        System.out.println(color);

        //Setter
        Guess.setPrice(150);
        System.out.println(Guess.getPrice());

        //Print all values
        System.out.println(Guess.print());

    }
}
