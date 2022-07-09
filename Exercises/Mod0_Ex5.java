package Exercises;
import java.util.Scanner;

public class Mod0_Ex5 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Giving input
        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        System.out.println("Original: " + userString);

        // 1. Trim any white-Spaces
        String whiteString = userString.replaceAll("\\s","");
        System.out.println("Trimmed white space: " + whiteString);

        // 2. Show the length of the string
        System.out.println("The length of original string is " + userString.length());
        
        // 3. Change the string to all caps
        System.out.println("If your string were all in caps: " + userString.toUpperCase());

        // 4. Print the first character of the string
        System.out.println("The first character of your string is: " + userString.charAt(0));
        
        // 5. Concatenate the string to "Your input string was "
        System.out.println("Your input string was: " + userString);
        

    }
}

/*
Enter a string: Holy moly I love you
Original: Holy moly I love you
Trimmed white space: HolymolyIloveyou
The length of original string is 20
If your string were all in caps: HOLY MOLY I LOVE YOU
The first character of your string is: H
Your input string was Holy moly I love you
*/