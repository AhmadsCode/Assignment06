/*
@author Ahmad Wahedi
 * CSC 201-004N
 * Assignment 6
 * Problem 6.5
(Sort three numbers) Write a method with the following header to display three
numbers in increasing order:
public static void displaySortedNumbers(
double num1, double num2, double num3)
Write a test program that prompts the user to enter three numbers and invokes the
method to display them in increasing order.
*/

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates Scanner

        System.out.print("Enter 3 numbers: "); // Prompts the user to enter three #'s
        double number1 = input.nextDouble();
        double number2 = input.nextDouble();
        double number3 = input.nextDouble();

        displaySortedNumbers(number1, number2, number3); // Displays numbers in ascending order
    }

    public static void displaySortedNumbers(            //Method displays 3 numbers in ascending order.
            double num1, double num2, double num3) {
            double swap; // Hold number to swap

        if (num2 < num1 && num2 < num3){
            swap = num1;
            num1 = num2;
            num2 = swap;
        }
        else if (num3 < num1 && num3 < num2) {
            swap = num1;
            num1 = num3;
            num3 = swap;
        }
        if (num3 < num2) {
            swap = num2;
            num2 = num3;
            num3 = swap;
        }

        System.out.println(num1 + " " + num2 + " " + num3); // Displays the result
    }
}
