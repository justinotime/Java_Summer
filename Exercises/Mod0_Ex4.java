package Exercises;
import java.util.Scanner;

// Justin Natividad | CIS 35A
// This program calculates labor pay rate.
public class Mod0_Ex4 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Variables
        int userWorkHours = 0;
        int workPayRate = 0;
        double userpaid = 0.0;

        // Giving input
        System.out.print("Enter hours: ");
        userWorkHours = input.nextInt();
        System.out.print("Enter rate: ");
        workPayRate = input.nextInt();

        //Computation
        if (userWorkHours > 40) {
            userpaid = (40 * workPayRate) + (userWorkHours - 40) * workPayRate * 1.5;
        }
        else if (userWorkHours < 40) {
            userpaid = userWorkHours * workPayRate;
        }

        System.out.println(userpaid);





    }
}
/*
    Enter hours: 55
    Enter rate: 16
    1000.0
*/