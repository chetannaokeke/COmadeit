package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner kb = new Scanner(System.in);
        int pin;
        do {
            System.out.println("Pick a number between 1 and 8:");
            pin = kb.nextInt();
        }
        while (pin < 1 || pin > 8);
        {
            int pins[] = new int[pin];
            for (int i = 0; i <= pins.length; i++) {

                for (int j = 0; j <= pins.length - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("/");
                }

                System.out.println(" ");
            }
        }
    }
}
