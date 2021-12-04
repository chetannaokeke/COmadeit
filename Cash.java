package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner changeowed = new Scanner(System.in);
        int count = 0;
        float changeamt;
        do {
            System.out.println("How much change is owed?: ");
            changeamt = changeowed.nextFloat();
        }
        while (changeamt <= 0.00);

        int cents = Math.round(changeamt * 100);

        while (cents >= 25)
        { count++;
            cents -= 25;
        }
        while (cents >= 10)
        { count++;
            cents -= 10;
        }
        while (cents >= 5)
        { count++;
            cents -= 5;
        }
        while (cents >= 1)
        { count++;
            cents -= 1;
        }
        System.out.println("Number of coins required: \n" + count);
    }
}
