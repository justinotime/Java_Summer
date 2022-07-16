package Testing;

import java.util.Scanner;

public class TestMod1_Ex2 {
    public static void main(String[] args) 
    {
        getInputs();
        /*
        calculatePay();
        printPay();
         */
    }

    public static void getInputs()
    {
        Scanner input = new Scanner(System.in);
        int inHours = 0;
        int inRate = 0;
        System.out.print("Enter hours: ");
        inHours = input.nextInt();
        System.out.println("The number of hours is: " + inHours);
        System.out.print("Enter rate: ");
        inRate = input.nextInt();
        System.out.println("The rate is: " + inRate);
        
    }   

    public static void calculatePay()
    {
        
    }

}
