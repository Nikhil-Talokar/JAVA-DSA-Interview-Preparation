package Patterns;

public class Pattern2 {
    public static void main(String[] args) {
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *

        pattern2(5);

    }

    static void pattern2(int n){
        //Step 1: No of lines = No of rows = No of times outer loop will run
        for (int row=0; row < n; row++) {
            //Step 2: for every row, how many columns are there or types of element in column
            for (int col=0; col<=row; col++) {
                //step 3: What do you need to print
                System.out.print("* ");
            }
        //after every row go to new line so,
        System.out.println();
        }
    }
}
