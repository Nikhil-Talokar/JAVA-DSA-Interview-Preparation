package BinarySearchIn2DArray;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        //sorted matrix - strictly sorted matrix is each row starting element is greater than previous row last element
        //to find any target element => 1. normal search (N * N) 2. convert to 1D array and apply Binary search 3. this one
        //i.e. take middle col & perform BS on it and try to reduce rows. similarly, take middle row & perform BS on it and try to reduce columns

        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int[] result = search(array, 6);
        System.out.println(Arrays.toString(result));
    }

    //Normal Binary Search if array is 1D
    static int[] binarySearch(int[][] arr, int target, int row, int cStart, int cEnd) {
        while(cStart <= cEnd) {
            //find the middle element
            int mid = cStart + (cEnd - cStart)/2;

            if(arr[row][mid] == target) {
                return new int[] {row, mid};
            }

            if(target < arr[row][mid]) {
                cEnd = mid;
            } else {
                cStart = mid;
            }
        }
        return new int[] {-1,-1};
    }

    static int[] search(int[][] arr, int target) {
        //take the middle column and apply BS on it and check with following 3 conditions
        // 1. middle element == target ==> return answer
        // 2. middle element > target ==> ignore rows after it
        // 3. middle element < target ==> ignore rows before it
        //in the end 2 rows will remain then check whether the middle column you are at contains the answer
        //if not then convert others into parts to search
        //Time Complexity = row from 0 to end or size n and column from 0 to end or size m then log(n) + log(m)

        int rows = arr.length;
        int cols = arr[0].length; // be cautious matrix may be empty

        //matrix has only one row then apply normal BS
        if (rows == 1) {
            return binarySearch(arr, target, 0, 0, cols - 1);
        }

        //start will be row start i.e. row = 0 & end will be last row i.e. row = rows - 1
        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        //run the loop till 2 rows are remaining
        while (rStart < (rEnd - 1)) { //while this is true it will have more than 2 rows

            //find the mid
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (target < arr[mid][cMid]) {
                rEnd = mid - 1;
            } else {
                rStart = mid + 1;
            }
        }
        //Now we have 2 rows remaining
        //check whether the target is in col of 2 rows
        if (arr[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }

        if (arr[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }
        //search in 1st half
        if (target <= arr[rStart][cMid - 1]) {
            return binarySearch(arr, target, 0, 0, cMid - 1);
        }
        //search in 2nd half
        if (target >= arr[rStart][cMid + 1] && target <= arr[rStart][cols - 1]) {
            return binarySearch(arr, target, 0, cMid + 1, cols - 1);
        }
        //search in 3rd half
        if (target <= arr[rStart + 1][cMid - 1]) {
            return binarySearch(arr, target, rStart + 1, 0, cMid - 1);
        } else {
            return binarySearch(arr, target, rStart + 1, cMid + 1, cols - 1);
        }
    }

}
