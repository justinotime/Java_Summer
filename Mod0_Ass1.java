import java.util.Scanner;
// Justin Natividad
// This program allows the user to
// compute their personal taxes
public class Mod0_Ass1 {
    public static void main(String[] args) {
            try (Scanner input = new Scanner(System.in)) {
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
                switch (userInFiling) 
                {
                    case 0:
                        if (userTaxIncome <= 8350) {
                            userTaxAmount += userTaxIncome * 0.10;
                        }
                        else {
                            userTaxAmount += 8350 * 0.10;
                        }

                        if (userTaxIncome > 8350) {
                            if (userTaxIncome <= 33950) {
                                userTaxAmount += (userTaxIncome - 8350) * 0.15;
                            }
                            else {
                                userTaxAmount += 25600 * 0.15;
                            }
                        }
                        
                        if (userTaxIncome > 33950) {
                            if (userTaxIncome <= 82250) {
                                userTaxAmount += (userTaxIncome - 33950) * 0.25;
                            }
                            else {
                                userTaxAmount += 48300 * 0.25;
                            }
                        }

                        if (userTaxIncome > 82250) {
                            if (userTaxIncome <= 171550) {
                                userTaxAmount += (userTaxIncome - 82250) * 0.28;
                            }
                            else {
                                userTaxAmount += 89300 * 0.28;
                            }   
                        }

                        
                        break;
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        break;
                    default : System.out.println("Failure...");
                }
                System.out.println("You owe " + userTaxAmount);
      /* 
      Given 
      */
            } 
    }
}
