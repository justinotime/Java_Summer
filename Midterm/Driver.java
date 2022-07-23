package Midterm;
// Justin Natividad CIS 25A
// This program runs from the main class (Driver), which is a simulation to make an order.
 
public class Driver 
{
    public static void main(String[] args) 
    {
        Order order1 = new Order();
        order1.displayMenu();
        order1.getInputs();
        order1.calculate();
        order1.printBill();
    }    
}
/* 1st output
De Anza Food Menu
1. De Anza Burger 5.25
2. Bacon Cheese 5.75
3. Mushroom Swiss 5.95
4. Western Burger 5.95
5. Don Cali Burger 5.95
6. Exit 
Enter the number accordingly to the food: 2
You've selected Bacon Cheese Burger for 5.75
Please enter the quantity: 2
Are you a student? Type Yes/No: 
No
--------------------------------
2 Bacon Cheese Burger $5.75
Subtotal: $11.5
Tax: $1.035
Total: $12.535
-------------------------------- 
*/

/* 2nd output
De Anza Food Menu
1. De Anza Burger 5.25
2. Bacon Cheese 5.75
3. Mushroom Swiss 5.95
4. Western Burger 5.95
5. Don Cali Burger 5.95
6. Exit
Enter the number accordingly to the food: 3
You've selected Mushroom Swiss Burger for 5.95
Please enter the quantity: 3
Are you a student? Type Yes/No: 
n
Please try again 

Are you a student or a staff? Type Yes/No:
No
--------------------------------
3 Mushroom Swiss $5.95
Subtotal: $17.85
Tax: $1.6065
Total: $19.456500000000002 (I honestly did not know, if java supplemented with only placing 2 decimal points.)
--------------------------------
*/
