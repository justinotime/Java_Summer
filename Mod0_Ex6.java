import java.util.Scanner;
// Justin Natividad
// This code explores for loops, in their usages.
public class Mod0_Ex6
 {
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter your message: ");
        String userMessage = input.nextLine();
        System.out.print("How many times do you want to print this message: ");
        int userIteration = input.nextInt();

        // While loop
        int counter = 1;
        System.out.println("Using While Loop: ");
        while (counter <= userIteration)
        {
            System.out.println(counter + "=> " + userMessage);
            counter++;
        }

        // Do-While
        counter = 1; 
        System.out.println("Using Do-While Loop: ");
        do 
        {
            System.out.println(counter + "=> " + userMessage);
            counter++;
        } while (counter <= userIteration);

        // For-Loop
        int i;
        System.out.println("Using For-Loop");
        for (i = 1; i <= userIteration; i++) 
        {
            System.out.println(i + "=> " + userMessage);
        }
    }
}

/*
Enter your message: LOL
How many times do you want to print this message: 8
Using While Loop: 
1=> LOL
2=> LOL
3=> LOL
4=> LOL
5=> LOL
6=> LOL
7=> LOL
8=> LOL
Using Do-While Loop:
1=> LOL
2=> LOL
3=> LOL
4=> LOL
5=> LOL
6=> LOL
7=> LOL
8=> LOL
Using For-Loop
1=> LOL
2=> LOL
3=> LOL
4=> LOL
5=> LOL
6=> LOL
7=> LOL
8=> LOL
*/