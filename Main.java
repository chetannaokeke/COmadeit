package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner key = new Scanner(System.in);
        System.out.println("Text:");
        String text = key.nextLine();


        int countletters = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                countletters++;
        }
        System.out.println(countletters + " letter(s)");


        int countwords = 0;
        for (int i = 0; i <text.length() ; i++) {
            if(text.charAt(i) == ' ') countwords ++;
        }
        System.out.println(countwords + " word(s)");


        int countsentences = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!' ) countsentences++;
        }
        System.out.println(countsentences + " sentence(s)");

        double level = (double)countletters / (double)countwords * 100;
        double sentence = (double)countsentences / (double)countwords * 100;
        double grade = 0.0588 * level - 0.296 * sentence - 15.8;

        if (grade >= 16) {
            System.out.println("Grade 16+");
        }
        if (grade < 1) {
            System.out.println("Before Grade 1");
        }
        else{
            System.out.println("Grade " + Math.round(grade));}
    }
}