package Assignments;

// Justin Natividad CIS 35A
// This program demonstrates a simulation involving students opening lockers.
// In addition, (students after the first), open every other locker which would form a perfect square.

public class Mod1_Ass3 
{
    public static void main(String[] args) 
    {
        boolean[] locker = new boolean[101];    

        // By default all lockers are closed
        for (int i = 1; i < locker.length; i++) {
            System.out.println("Locker " + i + (locker[i] ? " Open" : " Closed"));
        }

        // S1 opens every locker
        for (int i = 1; i < locker.length; i++) {
            locker[i] = true;
            // System.out.println("Locker " + i + (locker[i] ? " Open" : " Closed") + " by S1");
        }
        
        // The next S lockers are opened based on the assigned number they are given.
        for (int i = 1; i <= 100; i++) {
            for (int j = i; j <= 100; j += i) {
                locker[j] = !locker[j];
            }
        }
        
        // All the output would give a perfect square on open lockers 
        for (int i = 1; i <= 100; i++) {
            System.out.println("Locker " + i + (locker[i] ? " Closed" : " Open"));
        }
        
        
       
    }
    
}