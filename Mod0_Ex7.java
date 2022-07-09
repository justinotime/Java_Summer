// Justin Natividad CIS 35A
// This code builds on the previous exercise by adding a switch statement, 
// and a random number generator.
import java.util.Scanner;
public class Mod0_Ex7 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your message: ");
        String userMessage = input.nextLine();
        System.out.print("How many times do you want to print this message: ");
        int userIteration = input.nextInt();
        System.out.println("What type of loop do you want?\n1- while\n2- do while\n3- for loop");
        int userLoop = input.nextInt();
        
        switch (userLoop)
        {
            // While loop
            case 1:
                int counter = 1;
                System.out.println("Using While Loop: ");
                while (counter <= userIteration)
                {
                    System.out.println(counter + "=> " + userMessage);
                    counter++;
                }
                break;

            // Do-While
            case 2:
                counter = 1; 
                System.out.println("Using Do-While Loop: ");
                do 
                {
                    System.out.println(counter + "=> " + userMessage);
                    counter++;
                } while (counter <= userIteration);
                break;

            // For-Loop
            case 3:
                int i;
                System.out.println("Using For-Loop");
                for (i = 1; i <= userIteration; i++) 
                {
                    System.out.println(i + "=> " + userMessage);
                }
                break;
            
            // Default case
            default: 
                System.out.println("Invalid loop...");
                break;
        }

        // Generating a random number between 1000 to 1499
        int docNumber = 1000 + (int)(Math.random() * 500);
        System.out.print(docNumber);
    }
}
/*
Enter your message: I love my girlfriend!!!
How many times do you want to print this message: 3 
What type of loop do you want?
1- while
2- do while
3- for loop
2
Using Do-While Loop: 
1=> I love my girlfriend!!!
2=> I love my girlfriend!!!
3=> I love my girlfriend!!!
1049
*/