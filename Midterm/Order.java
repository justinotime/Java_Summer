package Midterm;

import java.text.BreakIterator;
import java.util.Scanner;

public class Order 
{
    private double PRICE1 = 5.25;
    private double PRICE2 = 5.75;
    private double PRICE3 = 5.95;
    private double PRICE4 = 5.95;
    private double PRICE5 = 5.95;
    public int num = 0;
    public int food = 0;
    public double preTotal = 0.0;
    public double officialTotal = 0.0;
    public double staffTax = 0.09;
    public String decision;
    boolean yn = true;
    
    public void displayMenu()
    {
        System.out.println("De Anza Food Menu");
        System.out.println("1. De Anza Burger " + PRICE1);
        System.out.println("2. Bacon Cheese " + PRICE2);
        System.out.println("3. Mushroom Swiss " + PRICE3);
        System.out.println("4. Western Burger " + PRICE4);
        System.out.println("5. Don Cali Burger " + PRICE5);
        System.out.println("6. Exit ");
    }

    public void getInputs()
    {
        do 
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number accordingly to the food: ");
            num = input.nextInt();
            if (num == 6)
            {
                break;
            }
            while (num <=0 || num >= 7)
            {
                System.out.println("Invalid, please select again");
                System.out.print("Enter the number accordingly to the food: ");
                Scanner input1 = new Scanner(System.in);
                num = input1.nextInt();
            }

            Scanner inQuantity = new Scanner(System.in);
            switch (num)
            {
                case 1:
                    System.out.println("You've selected De Anza Burger for " + PRICE1);
                    System.out.print("Please enter the quantity: ");
                    food = inQuantity.nextInt();
                    while (food <= 0)
                    {
                        System.out.println("Invalid, please select again");
                        System.out.print("Please enter the quantity: ");
                        Scanner inQuantity1 = new Scanner(System.in);
                        food = inQuantity1.nextInt();
                    }
                    preTotal = PRICE1 * food;
                    break;
                case 2:
                    System.out.println("You've selected Bacon Cheese Burger for " + PRICE2);
                    System.out.print("Please enter the quantity: ");
                    food = inQuantity.nextInt();
                    while (food <= 0)
                    {
                        System.out.println("Invalid, please select again");
                        System.out.print("Please enter the quantity: ");
                        Scanner inQuantity1 = new Scanner(System.in);
                        food = inQuantity1.nextInt();
                    }
                    preTotal = PRICE2 * food;
                    break;
                case 3:
                    System.out.println("You've selected Mushroom Swiss Burger for " + PRICE3);
                    System.out.print("Please enter the quantity: ");
                    food = inQuantity.nextInt();
                    while (food <= 0)
                    {
                        System.out.println("Invalid, please select again");
                        System.out.print("Please enter the quantity: ");
                        Scanner inQuantity1 = new Scanner(System.in);
                        food = inQuantity1.nextInt();
                    }
                    preTotal = PRICE3 * food;
                    break;
                case 4:
                    System.out.println("You've selected Western Burger for " + PRICE4);
                    System.out.print("Please enter the quantity: ");
                    food = inQuantity.nextInt();
                    while (food <= 0)
                    {
                        System.out.println("Invalid, please select again");
                        System.out.print("Please enter the quantity: ");
                        Scanner inQuantity1 = new Scanner(System.in);
                        food = inQuantity1.nextInt();
                    }
                    preTotal = PRICE4 * food;
                    break;
                case 5:
                    System.out.println("You've selected Don Cali Burger for " + PRICE5);
                    System.out.print("Please enter the quantity: ");
                    food = inQuantity.nextInt();
                    while (food <= 0)
                    {
                        System.out.println("Invalid, please select again");
                        System.out.print("Please enter the quantity: ");
                        Scanner inQuantity1 = new Scanner(System.in);
                        food = inQuantity1.nextInt();
                    }
                    preTotal = PRICE5 * food;
                    break;
            }
        } while (num == 0 && food == 0);
    }


    public void calculate()
    {
        Scanner yesOrNoIn = new Scanner(System.in);
            System.out.println("Are you a student? Type Yes/No: ");
            decision = yesOrNoIn.nextLine();
            
            switch (decision)
            {
                case "Yes":
                    yn = true;
                    staffTax = 0;
                    officialTotal += preTotal;
                    break;
                case "No":
                    yn = false;
                    officialTotal += preTotal + (preTotal * staffTax);
                    break;
                default:
                    System.out.println("Please try again ");
                    boolean repeat = true;

                    while (repeat)
                    {
                        System.out.println();
                        System.out.println("Are you a student or a staff? Type Yes/No: ");
                        decision = yesOrNoIn.nextLine();
                        
                        switch (decision)
                        {
                            case "Yes":
                                yn = true;
                                repeat = false;
                                officialTotal = preTotal;
                                break;
                            case "No":
                                yn = repeat = false;
                                officialTotal += preTotal + (preTotal * staffTax);
                                break;
                            default:
                                repeat = true;
                        }
                        
                    }
            }
    }

    
    public void printBill()
    {
        switch (num)
        {
            case 1:
                System.out.println("--------------------------------");
                System.out.println(food + " De Anza Burger $" + PRICE1);
                System.out.println("Subtotal: $" + preTotal);
                System.out.println("Tax: $" + (preTotal * staffTax));
                System.out.println("Total: $" + officialTotal);
                System.out.println("--------------------------------");
                break;
            case 2:
                System.out.println("--------------------------------");
                System.out.println(food + " Bacon Cheese Burger $" + PRICE2);
                System.out.println("Subtotal: $" + preTotal);
                System.out.println("Tax: $" + (preTotal * staffTax));
                System.out.println("Total: $" + officialTotal);
                System.out.println("--------------------------------");
                break;
            case 3:
                System.out.println("--------------------------------");
                System.out.println(food + " Mushroom Swiss $" + PRICE3);
                System.out.println("Subtotal: $" + preTotal);
                System.out.println("Tax: $" + (preTotal * staffTax));
                System.out.println("Total: $" + officialTotal);
                System.out.println("--------------------------------");
                break;
            case 4:
                System.out.println("--------------------------------");
                System.out.println(food + " Western Burger $" + PRICE4);
                System.out.println("Subtotal: $" + preTotal);
                System.out.println("Tax: $" + (preTotal * staffTax));
                System.out.println("Total: $" + officialTotal);
                System.out.println("--------------------------------");
                break;
            case 5:
                System.out.println("--------------------------------");
                System.out.println(food + " Don Cali Burger $" + PRICE5);
                System.out.println("Subtotal: $" + preTotal);
                System.out.println("Tax: $" + (preTotal * staffTax));
                System.out.println("Total: $" + officialTotal);
                System.out.println("--------------------------------");
                break;

        }      
    }

}
