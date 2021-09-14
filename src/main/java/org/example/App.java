/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Sarim Jatt
 */
package org.example;
import java.util.Scanner;
import java.text.DecimalFormat;
public class App {
    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your weight, in pounds? ");
        while (!in.hasNextInt()) in.next();
        int w = in.nextInt();
        System.out.print("What is your height, in inches? ");
        while (!in.hasNextInt()) in.next();
        int h = in.nextInt();
        double bmi = ((double)w / (h * h)) * 703;
        DecimalFormat df = new DecimalFormat("#.#");
        System.out.println("Your BMI is " + df.format(bmi) + ".");

        if(bmi > 25) {
            System.out.println("You are overweight. You should see your doctor.");
        }
        else if(bmi < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        }
        else {
            System.out.println("You are within the ideal weight range.");
        }
        in.close();
    }
}