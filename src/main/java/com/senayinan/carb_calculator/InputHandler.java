package com.senayinan.carb_calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputHandler {
    private Scanner input;

    public InputHandler(Scanner input) {
        this.input = input;
    }
    public List<Double> getCarbs(int numberOfCarbs) {
        List<Double> carbs = new ArrayList<>();
        for(int i = 0; i < numberOfCarbs; i++)  {
            System.out.println("What is your " + getOrdinal(i + 1) + " carb amount?: ");
            double carbAmount = input.nextDouble();
            carbs.add(carbAmount);
        }
        return carbs;
    }

    public double calculateTotalCarbs(List<Double>carbs)   {
        double totalCarbs = 0;
        for(double carb : carbs) {
            totalCarbs += carb;
        }
        System.out.println("Your total carb consumption is " + totalCarbs + " grams");
        return totalCarbs;


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
