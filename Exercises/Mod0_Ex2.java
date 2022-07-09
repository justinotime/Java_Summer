package Exercises;
import java.util.Scanner;
// Justin Natividad CIS 35A
// This code allows the user to input any Fahrenheit degree,
// and converts the users input with the celcius degree.
public class Mod0_Ex2 {
    public static void main(String[]args) {
    // Creating Scanner object and Variables
    Scanner input = new Scanner(System.in);
    double celcius;
     
    // Storing input by keyboard
    System.out.print("Give me Fahrenheit Degree: ");
    int userInput = input.nextInt();
    
    // The "Algorithm" for celcius
    celcius = (5.0/9) * (userInput - 32);
    
    // Printing out results....
    System.out.println("The celcius degree of " + userInput + " degree \nin Fahrenheit is: " + celcius);
    
    }
}

/* 
Give me Fahrenheit Degree: {100}
the celcius degree of {100} degree
in Fahrenheit is: 37.77777777777777778  
*/