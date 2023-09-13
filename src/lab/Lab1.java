package lab;

//AUTHOR: KRISTOPHER WALSH
//FILENAME: Lab1.java
//SPECIFICATION: THIS PROGRAM WILL READ THREE TEST GRADES AND THEN CALCULATE THE AVERAGE AND PRINT IT OUT.
//FOR: CS 1400- Lab #1
//TIME SPENT: 3 HOURS

import java.util.Scanner;
public class Lab1{
	
	public static void main(String[] args) 
	
	{
		Scanner scan = new Scanner(System.in);
	
		System.out.print("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.print("Enter the second number: ");
		double num2 = scan.nextDouble();
		System.out.print("Enter the third number: ");
		double num3 = scan.nextDouble();
		scan.close();
		System.out.print("Your average test score is: " + avr(num1, num2, num3) );
		
	}
	
	public static double avr(double a, double b, double c)
	{
		
		final double NUM_TEST = 3;
		return (a + b + c) / NUM_TEST;
		
	}
}






