package Exercises;
import java.util.Scanner;
// Justin Natividad CIS 35A
// This code asks for the user string, and determines if it is a palindrome or not 
public class Mod0_Ex8 
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String userString = input.nextLine();
        String revUserString = "";

        for (int i = userString.length(); i > 0; --i) 
        {
            revUserString = revUserString + (userString.charAt(i-1));
        }
        
        System.out.println(userString.equals(revUserString));
    }
}

/*
Enter a string: kim
false
*/