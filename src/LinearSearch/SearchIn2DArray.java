package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {

        int[][] array = {
                {2, 4, 6},
                {3, 5, 7, 1},
                {8, 9},
                {12, 32, 45, 78, 91}
        };

        int target = 7;

        int[] result = search(array, target); // format of return value {row, column} so used int[]
        System.out.println(Arrays.toString(result));

        int maxNumber = maxInArray(array);
        System.out.println(maxNumber);

    }

    static int[] search(int[][] arr, int target){
        if(arr.length == 0){
            return new int[]{-1, -1};
        }

        //iterate over an 2D array
        //1st for loop for rows
        for(int row=0; row<arr.length; row++) {
            //2nd for loop for column
            for(int col=0; col<arr[row].length; col++){
                if(target == arr[row][col]){
                    //want to return new or another array which contains row, column
                    return new int[]{row, col};
                    //can't return like this because we need to create new object and
                    //array is not initialised here or above so
//                    return {row,col};

//                    return arr[row][col]; // want to return number
                }
            }
        }
        return new int[] {-1, -1};
    }

    //Find the maximum in 2D array
    static int maxInArray(int[][] arr) {

        if(arr.length == 0){
            return -1;
        }

        //iterate over an 2D array
        int max = Integer.MIN_VALUE;
        //1st for loop for rows
        for(int row=0; row<arr.length; row++){
            //2nd for loop for column
            for(int col=0; col<arr[row].length; col++){
                    if(arr[row][col] > max){
                        max = arr[row][col];
                    }
            }
        }
        return max;
    }

}
