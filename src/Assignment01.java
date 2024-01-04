/*
 * Assessment: Assignment 01
 * Student Name: Mostapha Abdelaziz
 * Due Date: Sept 26, 2020
 * Description: Calculate the average of two numbers, the square root of the average and the numbers to the power of the average
 * Professor Name: Mohammad Patoary
 */

//importing scanner class
import java.util.Scanner;

public class Assignment01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		//Declaring variables
		double num1, num2, avg;
		
		//asking for input and storing
		System.out.print("Enter your first number ");
		num1 = input.nextDouble();
		
		System.out.print("Enter your second number ");
		num2 = input.nextDouble();
		
		//calculate the average and print
		avg = (num1 + num2)/2;
		System.out.println("The average of your two numbers is = "+avg);
		
		//Print the rest of the calculations
		System.out.println("The square root of the average (" +avg+ ") is = " +Math.sqrt(avg)); // square root of the average
		System.out.println("The first number (" +num1+ ") to the power of the average (" +avg+ ") is = " +Math.pow(num1, avg)); // number 1 to the power of the average
		System.out.println("The second number (" +num2+ ") to the power of the average (" +avg+ ") is = " +Math.pow(num2, avg)); // number 2 to the power of the average
		
		//printing my full name
		System.out.println("Brought to you by Mostapha Abdelaziz");
		
		//closing the scanner
		input.close();
	}

}
