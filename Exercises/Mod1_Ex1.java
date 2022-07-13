package Exercises;

import java.util.Scanner;

public class Mod1_Ex1
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        // User inputs the amount of scores with arrays for size
        System.out.print("How many scores do you want: ");
        int userTotalElement = input.nextInt();
        float[] userScoresList = new float[userTotalElement];
        
        
        // User inputs their scores in the quarter and filling the array with entered scores
        for (int i = 0; i < userScoresList.length; i++) {
            System.out.print("Enter " + userScoresList.length + " scores for the quarter: ");
            userScoresList[i] = input.nextFloat();
        }
        
        // Find the greatest score
        float maxScore = userScoresList[0];
        for (int j = 1; j < userScoresList.length; j++) {
            if (userScoresList[j] > maxScore) {
                maxScore = userScoresList[j];
            }
        }
        System.out.println("Your max score was "+ maxScore);

        // Show the average 
        float userTotalScores = 0;
        for (int k = 0; k < userScoresList.length; k++) {
            userTotalScores += userScoresList[k];
        }

        float userAverageScore = (userTotalScores / userScoresList.length);
        System.out.println("Your average score is " + userAverageScore);


        // Show the final grade based on the average (Refer back to ex 3 mod 0)
        if (userAverageScore == 100 ) {
            System.out.print("A+");
        }
        else if (userAverageScore >= 95) {
            System.out.print("A");
        }
        else if (userAverageScore >= 90) {
            System.out.print("A-");
        }
        else if (userAverageScore <= 89 && userAverageScore >= 85) {
            System.out.print("B+");
        }
        else if (userAverageScore <= 85 && userAverageScore >= 83) {
            System.out.print("B");
        }
        else if (userAverageScore <= 83 && userAverageScore >= 80) {
            System.out.print("B-");
        }
        else if (userAverageScore <= 79 && userAverageScore >= 75) {
            System.out.print("C+");
        }
        else if (userAverageScore <= 75 && userAverageScore >= 73) {
            System.out.print("C");
        }
        else if (userAverageScore <= 73 && userAverageScore >= 70) {
            System.out.print("C-");
        }
        else if (userAverageScore <= 69 && userAverageScore >= 65) {
            System.out.print("D+");
        }
        else if (userAverageScore <= 65 && userAverageScore >= 63) {
            System.out.print("D");
        }
        else if (userAverageScore <= 63 && userAverageScore >= 60) {
            System.out.print("D-");
        }
        
    }
}
