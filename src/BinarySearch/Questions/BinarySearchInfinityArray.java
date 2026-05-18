package BinarySearch.Questions;

//Q => Find position of an element in a sorted array of infinite numbers

//Given a sorted array arr[] of infinite numbers. The task is to search for an element k in the array.
//Examples:
//Input: arr[] = [3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170], k = 10
//Output: 4
//Explanation: 10 is at index 4 in array.

// In case of infinity array, we don't know the end i.e. we can't use method array.length but in BS search we require start and end
//hence, we will check target in chunks like start at 1st element or end at 2nd element of an array or end at some other element to increase the size of chunks.
//Without the chunks we can do one more thing that is double the size of start and end every time to find the target
//In BS we divide the array N/2 now we can do opposite i.e. multiply the array with same time complexity log(n)

public class BinarySearchInfinityArray {
    public static void main(String[] args) {

        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        int target = 10;

        System.out.println(ans(arr, target));

    }

    static int ans(int[] arr, int target) {
        //first find the range
        //so, we will start from size 2 i.e. index 0 and index 1
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target > arr[end]) {

            int newStart = end + 1; //this is new start
            //double teh box size
            //end = previous end + sizeofbox * 2
            end = end + (end - start + 1) * 2;
            //we want old start in formula so start updated after calculation of end
            start = newStart;
        }
    return binarySearch(arr, target, start, end);

    }
    static int binarySearch(int[] arr, int target, int start, int end) {

        while(start <= end) {

            int mid = start + (end-start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return  mid;
            }

        }
        return -1;
    }
}
