import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Q. store a roll number
        int rollNo = 25;

        //Q. store a person's name
        String name = "Nikhil Talokar";

        //Q. store 5 roll numbers
        int rollNo1 = 7;
        int rollNo2 = 9;
        int rollNo3 = 15;
        int rollNo4 = 47;
        int rollNo5 = 74;
        //If there are such more 1000 roll numbers then we would do it => No Use Array

        //Syntax
        // datatype[]  variable_name = new datatype[size];

        //store 5 roll numbers :
        int[] rollNums = new int[5];
        // or directly
        int[] array = {12, 5, 45, 68, 50};

        int[] array1; //declaration of an array. array is getting defined in the stack
        array1 = new int[5]; //initialization of an array. Actually, object is being created in the memory(heap)

        System.out.println(rollNums[0]);  // 0

        String[] arr = new String[4]; // null --> special literal

        String a = null; // ✅
        // int num = null; // ❌

        //Array of primitives
        int[] counts = new int[5];
        counts[0] = 14;
        counts[1] = 78;
        counts[2] = 23;
        counts[3] = 45;
        counts[4] = 65;

        System.out.println(counts[3]);

        //How to take input and store in an array
        Scanner input = new Scanner(System.in);
//        int[] marks = new int[5];

//        for(int i=0; i<marks.length; i++) {
//            marks[i] = input.nextInt();
//        }

        // 1st way to print an array
//        for(int i=0; i< marks.length; i++){
//            System.out.print(marks[i] + " ");
//        }

        // 2nd way to print an array
        //Enhanced for loop
//        for (int num : marks) { // for every element in array, print the element
//            System.out.print(num + " "); // here num represents element of an array
//        }

        // 3rd way to print an array using Array's toString method
//        System.out.println(Arrays.toString(marks));


//        System.out.println(marks[5]); // Error => ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5


        //Array of objects
//        String[] str = new String[4];
//
//        for (int i=0; i<str.length; i++) {
//            str[i] = input.next();
//        }
//
//        System.out.println(Arrays.toString(str));
//
//        //modify
//        str[1] = "Queen";
//
//        System.out.println(Arrays.toString(str));


        //2D Arrays

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

//        int[][] mat = new int[3][2];

        //input
//        for(int row=0; row<mat.length; row++){
//            //for each col in every row
//            for(int col=0; col<mat[row].length; col++){
//                mat[row][col] = input.nextInt();
//            }
//        }

        //output
//        for(int row=0; row<mat.length; row++){
//            //for each col in every row
//            for(int col=0; col<mat[row].length; col++){
//                System.out.print(mat[row][col] + " ");
//            }
//            System.out.println(); //print new row on every new line
//        }

        //Arrays.toString() method
//        for(int row=0; row<mat.length; row++){
//                System.out.println(Arrays.toString(mat[row]));
//        }

        //Enhanced for loop to output
//        for(int[] ele : mat){
//            System.out.println(Arrays.toString(ele));
//        }

        int[][] matrix2 = {
                {1, 2, 3, 4},
                {5, 6},
                {7, 8, 9}
        };

        //Output
        for(int row=0; row<matrix2.length; row++){
            for(int col=0; col<matrix2[row].length; col++){
                System.out.print(matrix2[row][col] + " ");
            }
            System.out.println();
        }
    }

}
