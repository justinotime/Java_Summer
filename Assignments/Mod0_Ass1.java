package Assignments;
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

                        if (userTaxIncome > 171550) {
                            if (userTaxIncome <= 372950){
                                userTaxAmount += (userTaxIncome - 171550) * 0.33;
                            }
                            else {
                                userTaxAmount += 201400 * 0.33;
                            }
                        }

                        if (userTaxIncome > 372950) {
                            userTaxAmount += (userTaxIncome - 372950) * 0.35;
                        }
                        break;

                    case 1:
                        if (userTaxIncome <= 16700) {
                            userTaxAmount += userTaxIncome * 0.10;
                        }
                        else {
                            userTaxAmount += 16700 * 0.10;
                        }

                        if (userTaxIncome > 16700) {
                            if (userTaxIncome <= 67900) {
                                userTaxAmount += (userTaxIncome - 16700) * 0.15;
                            }
                            else {
                                userTaxAmount += 51200 * 0.15;
                            }
                        }
                        
                        if (userTaxIncome > 67900) {
                            if (userTaxIncome <= 137050) {
                                userTaxAmount += (userTaxIncome - 67900) * 0.25;
                            }
                            else {
                                userTaxAmount += 69150 * 0.25;
                            }
                        }
                        
                        if (userTaxIncome > 137050) {
                            if (userTaxIncome <= 208850) {
                                userTaxAmount += (userTaxIncome - 137050) * 0.28;
                            }
                            else {
                                userTaxAmount += 71800 * 0.28;
                            }
                        }

                        if (userTaxIncome > 208850) {
                            if (userTaxIncome <= 372950) {
                                userTaxAmount += (userTaxIncome - 208850) * 0.33;
                            }
                            else {
                                userTaxAmount += 164100 * 0.33;
                            }
                        }

                        if (userTaxIncome > 372950) {
                            userTaxAmount += (userTaxIncome - 372950) * 0.35;
                        }
                        break;

                    case 2:
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
                            if (userTaxIncome <= 68525) {
                                userTaxAmount += (userTaxIncome - 33950) * 0.25;
                            }
                            else {
                                userTaxAmount += 34575 * 0.25;
                            }
                        }

                        if (userTaxIncome > 68525) {
                            if (userTaxIncome <= 104425) {
                                userTaxAmount += (userTaxIncome - 68525) * 0.28;
                            }
                            else {
                                userTaxAmount += 35900 * 0.28;
                            }
                        }

                        if (userTaxIncome > 104425) {
                            if (userTaxIncome <= 186475) {
                                userTaxAmount += (userTaxIncome - 104425) * 0.33;
                            }
                            else {
                                userTaxAmount += 82050 * 0.33;
                            }
                        }

                        if (userTaxIncome > 185475) {
                            userTaxAmount += (userTaxIncome - 186476) * 0.35;
                        }

                        break;

                    case 3:

                        if (userTaxIncome <= 11950) {
                            userTaxAmount += userTaxIncome * 0.10;
                        }
                        else {
                            userTaxAmount += 11950 * 0.10;
                        }

                        if (userTaxIncome > 11950) {
                            if (userTaxIncome <= 45500) {
                                userTaxAmount += (userTaxIncome - 11950) * 0.15;
                            }
                            else {
                                userTaxAmount += 33950 * 0.15;
                            }
                        }

                        if (userTaxIncome > 45500) {
                            if (userTaxIncome <= 117450) {
                                userTaxAmount += (userTaxIncome - 45500) * 0.25;
                            }
                            else {
                                userTaxAmount += 71950 * 0.25;
                            }
                        }

                        if (userTaxIncome > 117450) {
                            if (userTaxIncome <= 190200) {
                                userTaxAmount += (userTaxIncome - 117450) * 0.28;
                            }
                            else {
                                userTaxAmount += 72750 * 0.28;
                            }
                        } 

                        if (userTaxIncome > 190200) {
                            if (userTaxIncome <= 372950) {
                                userTaxAmount += (userTaxIncome - 190200) * 0.33;
                            }
                            else {
                                userTaxAmount += 182750 * 0.33;
                            }
                        }

                        if (userTaxIncome > 372950) {
                            userTaxAmount += (userTaxIncome - 372950) * 0.35;
                        }

                        break;
                    default : System.out.println("Failure...");
                }
                System.out.println("You owe " + userTaxAmount);
            } 
        }
    }
    /* 
     Enter the filing status: 1
     Enter the taxable income: 300339
     You owe 76932.87
    */
    