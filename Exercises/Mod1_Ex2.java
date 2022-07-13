// Justin Natividad
// This program builds upon the previous module by introducing methods, in order to make an accessible readible code.
package Exercises;
import java.util.Scanner;
public class Mod1_Ex2 
{
    public static void main(String[] args) 
    {
     Scanner input = new Scanner(System.in);

     getInputs("hours");
     int userWorkHours = input.nextInt();
     getInputs("rate");
     int userHourRate = input.nextInt();
    
    double userPaid = calculatePay(userWorkHours, userHourRate);
    
    printPay(userPaid);
    }
    
    public static void getInputs(String prompt)
    {
        System.out.print("Enter " + prompt + ": ");
    }
    
    public static double calculatePay(int hours, int rate)
    {
        double worked = 0.0;
        if (hours > 40)
        {
            worked = (40 * rate) + (hours - 40) * rate * 1.5;
        }
        else if (hours < 40)
        {
            worked = hours * rate;
        }

        return worked;
        
    }

    public static void printPay(double calculatedPay)
    {
        System.out.println(calculatedPay);
    }
}
/*
Enter hours: 50
Enter rate: 50
2750.0
*/