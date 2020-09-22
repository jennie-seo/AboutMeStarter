/*
Programmer: Jennie
Date: September 22, 2020
Purpose: Stores information about me in variables and prints them out
 */

public class AboutMe {
    public static void main (String [] args) {
        // Declaring the variables
    	String myName = "Jennie";
    	int myAge = 16;
    	double myHeightInMetres = 1.59;

        // Print the values
        System.out.println("Hi, my name is " + myName + ".");
        System.out.println("I am " + myAge + " years old.");
        System.out.println("My height is " + myHeightInMetres + " m.");

        // Change the variables
        myAge = 20;
        myHeightInMetres = 1.65;

        // Print the new values
        System.out.println("Some time passes...");
        System.out.println("I am now " + myAge + " years old.");
        System.out.println("I have grown and am " + myHeightInMetres + " m tall.");
    }
}
