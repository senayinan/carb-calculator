package com.senayinan.carb_calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CarbCalculatorApplication {

	public static void main(String[] args) {SpringApplication.run(CarbCalculatorApplication.class, args);
		Scanner input = new Scanner(System.in);
		InputHandler inputHandler = new InputHandler(input);
		System.out.println("Enter number of the food items you've consumed in this meal: ");
		int numOfCarbs = input.nextInt();
		double[] carbs = inputHandler.getCarbs(numOfCarbs);


		double totalCarbs = inputHandler.calculateTotalCarbs(carbs);

	}

}
