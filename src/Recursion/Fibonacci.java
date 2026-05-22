package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int ans = fibo(6);
        System.out.println(ans);

    }

    static int fibo(int n) {

        //base condition ==> it is given or ans
        if( n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}

//Steps to understand recursion :
//1. Identify if you can break down the problem into smaller problem.
//2. Write the recurrence relation if needed
//3. Draw the recursive tree
//4. About the tree
   //4.1 See the flow of function, how they are getting in stack
   //4.2 Draw the tree and pointer again and again using pen and paper
   //4.3 Use debugger to see the flow and what type of values (int, String, etc)
//5. See how the values are returned at each step.
//See where the function call will come out.
//In end, you will come out of the main function

//Working with variables in recursion
//1. Arguments
//2. Returned type
//3. Body of function