package com.senayinan.carb_calculator;

import java.util.Scanner;

public class InputHandler {
    private Scanner input;

    public InputHandler(Scanner input) {
        this.input = input;
    }
    public double[] getCarbs(int numberOfCarbs) {
        double[] carbs = new double[numberOfCarbs];
        for(int i = 0; i < numberOfCarbs; i++)  {
            System.out.println("What is your " + getOrdinal(i + 1) + " carb amount?: ");
            carbs[i] = input.nextDouble();
        }
        return carbs;
    }

    public double calculateTotalCarbs(double[] carbs)   {
        double sum = 0;
        for(double carb : carbs) {
            sum += carb;
        }
        System.out.println("Your total carb consumption is " + sum + " grams");
        return sum;


    }


    private String getOrdinal(int number) {
        if (number % 100 >= 11 && number % 100 <= 13) {
            return number + "th";
        }
        switch (number % 10) {
            case 1: return number + "st";
            case 2: return number + "nd";
            case 3: return number + "rd";
            default: return number + "th";
        }
    }
}
