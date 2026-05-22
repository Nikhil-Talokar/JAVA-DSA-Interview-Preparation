package Recursion;

// Recursion : 1. Function calling another function
              //2. All function have one thing is common that is definition and body. Taking 1 parameter & doing same thing just name is different

//while the function is not finished executing, it will remain in the stack.
//When a function finishes executing, it is removed from the stack and the flow of program restored to where function was called

public class NumberExampleRecursion {
    public static void main(String[] args) {
        //write a function that takes in a number and prints it
        //print first 5 numbers : 1 2 3 4 5
//        Conditions : without modifying the function and without calling it 5 times. Don't add each number in one function separately.

        print(1);
    }

    static void print(int n) {

        //Doubt 1 - What is this check ? and Why are we adding this check ?
        //Doubt 2 - How the flow of program works in recursion ?
        //Doubt 3 - What is Recursion and why are we using it ?
        //Doubt 4 - What was that error ?

        //Base condition in Recursion : It is a condition where our recursion will stop making new calls.
        //If No Base Condition then function calls will keep happening & stack will be keep getting filled again & again ==> memory of comp will exceed the limit ==> stackoverflow error
        //Even though it is a same function, every function call will take some memory
        //when n = 5, then it is only printing and not calling so,
        if(n == 5) {
            System.out.println(5);
            return; //Don't call anything or execute just return from here. It will return to from where it was called.
        }

        System.out.println(n);
        //Recursive call
        //If you are calling a function again and again, we can treat it as a separate function call
        //When we passed n then it is calling n + 1
        print(n + 1);
        //This is tail recursion call and this is the last function call
    }

    //Why Recursion ?
    //It helps us to solving bigger or complex problems in simpler way.
    //We can convert recursion ino iteration and vice versa. Because directly solving problem in iteration can be difficult. So, we use recursion.4
    //Space complexity is not constant because of recursive calls.

    //Visualization of Recursion or Recursion Tree :

    //Problem Start             main()               Problem End
    //                           ⬇   ⬆
    //                          print(1)
    //                           ⬇   ⬆
    //                          print(2)
    //                           ⬇   ⬆
    //                          print(3)
    //                           ⬇   ⬆
    //                          print(4)
    //                           ⬇   ⬆
    //                          print(5)



}
