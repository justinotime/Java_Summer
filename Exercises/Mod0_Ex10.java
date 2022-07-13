package Exercises;

// Justin Natividad CIS 35A
// This program demonstrates the implementation for overloading a method.

public class Mod0_Ex10 {
    public static void main(String[] args) {
        Mod0_Ex10 t = new Mod0_Ex10();
        t.methodX(5,9,2.2);
        t.methodX(5,9,"Hi");
        t.methodX(5,9,2);
        t.methodX(5,9);
        t.methodX(0.24, 2, 1);
    }

    public void methodX(int a) {
        System.out.println("This is the method X with 1 parameters!");
    }

    public void methodX(int a,int b) {
        System.out.println("This is the method X with 2 parameters!");
    }

    public void methodX(int a, int b, int c) {
        System.out.println("This is the method X with 3 parameters!");
     }

    public void methodX(int a, int b, double c) {
        System.out.println("This is the method X with 3 parameter but last is a double!");
    }

    public void methodX(int a, int b, String c) {
        System.out.println("This is the method X with 3 parameter but last is a string!");
    }
    
    // Added overload which is basically adding different variation to the same method.
    public void methodX(double a, int b, int c) {
        System.out.println("This is the method X with 3 parameter but first is a double!");
    }





}
