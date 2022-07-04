import java.util.Scanner;
// Justin Natividad CIS 35A
// This code allows the user to input a number, 
// and runs through each conditional to determine the grade letter that you will receive.
public class Mod0_Ex3 {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            // Storing input by keyboard
            System.out.print("Input a grade number: ");
            int userScore = input.nextInt();
            if (userScore == 100 ) {
                System.out.print("A+");
            }
            else if (userScore >= 95) {
                System.out.print("A");
            }
            else if (userScore >= 90) {
                System.out.print("A-");
            }
            else if (userScore <= 89 && userScore >= 85) {
                System.out.print("B+");
            }
            else if (userScore <= 85 && userScore >= 83) {
                System.out.print("B");
            }
            else if (userScore <= 83 && userScore >= 80) {
                System.out.print("B-");
            }
            else if (userScore <= 79 && userScore >= 75) {
                System.out.print("C+");
            }
            else if (userScore <= 75 && userScore >= 73) {
                System.out.print("C");
            }
            else if (userScore <= 73 && userScore >= 70) {
                System.out.print("C-");
            }
            else if (userScore <= 69 && userScore >= 65) {
                System.out.print("D+");
            }
            else if (userScore <= 65 && userScore >= 63) {
                System.out.print("D");
            }
            else if (userScore <= 63 && userScore >= 60) {
                System.out.print("D-");
            }
            else {
                System.out.print ("F");
            }
        }
    }
}
/* Test 1 
Input a grade number: 1
F
*/

/* Test 2
Input a grade number: 87
B+
*/