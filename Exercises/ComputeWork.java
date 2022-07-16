package Exercises;

import java.util.Scanner;

// Mod 2, Ex 1
// Justin Natividad
// This program deals with (OOP), which expands upon integrating all the previous exercises to create the advantages of Java in the first place.

class ComputeWork
{
    private int hours;
    private int rate;
    private double total;
    Scanner input = new Scanner(System.in);

    // Method 1
    void getInput() 
    {
        System.out.print("Enter hours: ");
        hours = input.nextInt();
        System.out.print("Enter rate: ");
        rate = input.nextInt();
    }

    // Method 2 
    void calculatePay()
    {
        if (hours > 40)
        {
            total = (40 * rate) + (hours - 40) * rate * 1.5;
        }
        else if (hours < 40)
        {
            total = hours * rate;
        }

    }
    
    // Method 3
    void printPay()
    {
        System.out.println("your total will be: " + total);
    }
    
    // Main Method
    public static void main(String[] args) 
    {
        ComputeWork computeWork = new ComputeWork();
        computeWork.getInput();
        computeWork.calculatePay();
        computeWork.printPay();
    }
}
/*
Enter hours: 32
Enter rate: 60
your total will be: 1920.0
*/