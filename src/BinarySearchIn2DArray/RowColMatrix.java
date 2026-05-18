package BinarySearchIn2DArray;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        //We have to consider lower bound as 10 and last column element as upper bound i.e. 40 This is our search space initially
        //if element is > target col-- and if element is < target row++
        //time complexity is N + N = 2N i.e. O(N) because row start from 0 to last and column from last to 0
        int[][] array = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };

        int[] result = search(array, 37);
        System.out.println(Arrays.toString(result));

    }

    static int[] search(int[][] arr, int target) {
        int row = 0; // from start
        int col = arr.length -1; // length - 1

        //we will loop till row is less than length -1 and column is equal to 0
        while(row < arr.length && col >= 0) {

            if(arr[row][col] ==  target) {
                return new int[] {row, col};
            }

            if(arr[row][col] < target) {
                row++;
            }else {
                col--;
            }
        }
        return new int[] {-1, -1};
    }
}
