package Recursion;

// Recursion : 1. Function calling another function
              //2. All function have one thing is common that is definition and body. Taking 1 parameter & doing same thing just name is different

//while the function is not finished executing, it will remain in the stack.
//When a function finishes executing, it is removed from the stack and the flow of program restored to where function was called

public class NumberExample {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers : 1 2 3 4 5
//        Conditions : without modifying the function and without calling it 5 times. Don't add each number in one function separately.

        print1(1);
    }

    static void print1(int n) {
        System.out.println(n);
        print2(2);
    }

    static void print2(int n) {
        System.out.println(n);
        print3(3);
    }

    static void print3(int n) {
        System.out.println(n);
        print4(4);
    }

    static void print4(int n) {
        System.out.println(n);
        print5(5);
    }

    //function body is changed, it is just printing not calling.
    static void print5(int n) {
        System.out.println(n);
    }

}
