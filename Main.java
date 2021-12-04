package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> items = new ArrayList<>();
        items.add("Red-Hot Spicy Doritos");
        items.add("Cool Ranch Doritos");
        items.add("Coke");
        items.add("Pepsi");
        items.add("Diet Coke");
        items.add("Five Hour Energy");
        items.add("Sunflower Seeds");
        items.add("Peanuts");
        items.add("Mac Charger");
        items.add("Dell Charger");


        ArrayList<Double> prices = new ArrayList<>();
        prices.add(2.99);
        prices.add(2.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(3.99);
        prices.add(0.99);
        prices.add(0.99);
        prices.add(120.0);
        prices.add(50.0);

        System.out.println("Welcome to Cobis Convenience Store!\n");
        System.out.println("The items we offer are displayed below: ");
        System.out.println("Red-Hot Spicy Doritos" +
                "\nCool ranch Doritos" +
                "\nCoke" +
                "\nPepsi" +
                "\nDiet Coke" +
                "\nFive Hour Energy" +
                "\nSunflower Seeds" +
                "\nPeanuts" +
                "\nMac Book Chargers" +
                "\nDell Chargers");

        ArrayList<String> custOrder = new ArrayList<>();
        ArrayList<Integer> itemQuantity = new ArrayList<>();
        String input;
        Scanner response = new Scanner(System.in);

        String output = "";
        double total;
        double GrandTotal = 0;
        System.out.print("\nEnter the name of the customer: \n");
        while(!(input = response.nextLine()).equalsIgnoreCase("done")){
            output += "\n" + input;
            total = 0;
            System.out.println("Enter the name of items: ('done' to exit at any time)");
            while(!(input = response.nextLine()).equalsIgnoreCase("done")) {
                for(String i:items) {
                    if(i.contains(input) || i.equalsIgnoreCase(input)) {
                        total += prices.get(items.indexOf(i));
                        output += "\n\t"+input;
                        if(!custOrder.contains(input)) {
                            custOrder.add(input);
                            itemQuantity.add(1);
                        }
                        else {
                            int index = custOrder.indexOf(input);
                            itemQuantity.set(index, itemQuantity.get(index) + 1);
                        }
                        break;
                    }
                }
            }
            output += "\n\t\t"+total+"\n";
            GrandTotal += total;
            System.out.print("\nEnter the name of the next customer (done to exit): \n");
        }
        System.out.println("Receipts: \n" + output);
        System.out.println("\nInventory Sold: ");
        for(String i:custOrder) {
            System.out.println("\t" + i + " ("+ itemQuantity.get(custOrder.indexOf(i)) +")");
        }
        System.out.println("\nGrand Total: " + GrandTotal);
    }
}

