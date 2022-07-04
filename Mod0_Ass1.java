import java.util.Scanner;
// Justin Natividad
// This program allows the user to
// compute their personal taxes
public class Mod0_Ass1 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            // input variables
            int userInFiling = 0; 
            int userTaxIncome = 0;
            double userTaxAmount = 0;
            // Storing input by keyboard
            System.out.print("Enter the filing status: ");
            userInFiling = input.nextInt();
            System.out.print("Enter the taxable income: ");
            userTaxIncome = input.nextInt();

            // Conditionals
            if (userInFiling == 0 && userTaxIncome >= 8350) {
                userTaxAmount = 8350 * 0.10;
            }
            else {
                System.out.print("Failure");
            }

        // Conditionals

        // Computation
        /* 
        Given 
        */ 
    }
}
