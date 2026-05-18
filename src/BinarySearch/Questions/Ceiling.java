package BinarySearch.Questions;

//arr = {2, 3, 5, 9, 14, 16, 18} , target = 14
//Ceiling => smallest element in array greater than or equal to target
//Ceiling (arr, target = 14 ) = 14
//Ceiling (arr, target = 15 ) = 16
//Ceiling (arr, target = 4 ) = 5
//Ceiling (arr, target = 9 ) = 9

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 4;

        int ans = ceiling(arr, target);
        System.out.println(ans);

    }

    static int ceiling(int[]arr, int target) {

        //what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        while(start <= end ) {

            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return start;
    }
}
