package BinarySearch.Questions;

//You may recall that an array arr is a mountain array if and only if:
//arr.length >= 3
//There exists some i with 0 < i < arr.length - 1 such that:
//arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
//arr[i] > arr[i + 1] > ... > arr[arr.length - 1]
//Given a mountain array mountainArr, return the minimum index such that mountainArr.get(index) == target. If such an index does not exist, return -1.
public class SearchInMountain {
    public static void main(String[] args) {

        int[] array = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89, 75, 63, 50, 15, 4};
//        int target = 22;

    }

    static int search(int[] arr, int target){
        int peak = peakInMountain(arr);
//        System.out.println(peak);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        //try to search in second half
        return  orderAgnosticBS(arr, target, peak, arr.length -1);
    }

    //to find the element in the mountain array we will find the peak element from and arrays like asce or des and then use agnosticBS

    static int peakInMountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {

            //find the middle of array
            int mid = start  + (end - start)/2;

            if(arr[mid] < arr[mid+1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
            return start;
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {

        //we don't want to start from 0 and till the end. we will pass start and end. so no start and end in code
        boolean isAsc;

        if(arr[start] < arr[end]) {
            isAsc = true;
        } else {
            isAsc = false;
        }

        while(start <= end) {

            int mid = start + (end - start)/2;

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                //Asc
                if(target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                //Desc
                if(target < arr[mid]) {
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }
            }

        }
        //if none of the condition matched from while loop then break and return -1
        return -1;
    }
}
