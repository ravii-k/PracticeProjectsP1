package com.mphasis.calculator;

import java.util.Scanner;

public class Calculator {
	

	public static void main(String[] args) {
		System.out.println("---------------------------------- \n" +
				  "Welcome to Basic Calculator \n" +
				  "----------------------------------");
				System.out.println("Following operations are supported : \n" +
				  "1. Addition (+) \n" +
				  "2. Subtraction (-) \n" +
				  "3. Multiplication (*) \n" +
				  "4. Division (/) \n");
		
		float a, b, choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		a = sc.nextFloat();
		System.out.println("Enter second number: ");
		b = sc.nextFloat();
		System.out.println("1->Add 2->Sub-> 3->Mul 4->Div. ");
		System.out.println("Enter Your Choice: ");
		choice = sc.nextFloat();
		if (choice == 1)
			System.out.println("Addition Of Given Numbers= " + (a + b));
		else if (choice == 2)
			System.out.println("Subtraction Of Given Numbers= " + (a - b));
		else if (choice == 3)
			System.out.println("Multiplication Of Given Numbers= " + (a * b));
		else if (choice == 4)
			System.out.println("Division Of Given Numbers= " + (a / b));
		else
			System.out.println(" Invalid Choice ");
	}

}
