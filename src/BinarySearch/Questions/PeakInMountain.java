package BinarySearch.Questions;

//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//Return the index of the peak element.
//Your task is to solve it in O(log(n)) time complexity.
//Input: arr = [0,10,5,2]
//Output: 1
//Input: arr = [0,1,0]
//Output: 1
public class PeakInMountain {
    public static void main(String[] args) {

        int[] array = {0,10,5,2};

        int ans = binarySearch(array);
        System.out.println(ans);

    }

    //Here, we don't have target. We need to check 3 condition as follow
    //1. e[mid] > e[mid+1] i.e. we are in decreasing order and need to check only left side of array so end = mid
    //2. e[mid] < e[mid+1] i.e. we are in increasing order and need to check only right side of array so start = mid + 1
    //3. when will loop break ? -> start = end i.e. in end both will point to the same element means answer
    static int binarySearch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end){

            int mid = start + (end - start)/2;

            if(arr[mid] > arr[mid+1]) {
                //we are in decreasing order and need to check only left side of array for possible ans so end = mid
                end = mid;
            } else { //arr[mid] < arr[mid+1]
                //we are in increasing order and need to check only right side of array so start = mid + 1
                start = mid + 1;
            }
        }
        //in the end, start = end and pointing to the largest element because of the 2 checks
        //start and end are always trying to find the max element in the above 2 checks
        //hence, they are pointing to the just one element, that is max one
        //at every time start and end they are finding the best possible ans till that time

        return start; // or end because both are equal
    }
}
