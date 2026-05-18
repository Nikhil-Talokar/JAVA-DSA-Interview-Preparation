package BinarySearch.Questions;

/*
Rotation means ?
arr = [2 ,4, 5, 7, 8, 9, 10, 12]
After 1st Rotation => [12, 2 ,4, 5, 7, 8, 9, 10] -> 1st Rotation
                      [10, 12, 2 ,4, 5, 7, 8, 9] -> 2nd Rotation
   We are going to solve this problem with 2 approaches
   Approach 1 => find the pivot in the array
   pivot means where this particular thing getting changed or from where your next elements are ascending
   Ex : [3, 4, 5, 6, 7, 0, 1, 2] => pivot is 7
   1. find the pivot
   2. find in the first half -> simple BS (0, peak)
   3. Otherwise, find in the second half -> simple BS (peak+1 ,end)

   Q. How to find the pivot ?
   arr = [3, 4, 5, 6, 7, 0, 1, 2]
          s           |___|    e   --> only 2 elements will be descending
          when we find that mid > (mid + 1) element i.e. pivot [case 1]

          when we find mid < (mid - 1) element i.e. pivot [case 2]

          start >= mid element i.e. pivot [case 3]
          [4, 5, 6, 3, 2, 1, 0]
           s        m  |_____|e    --> smaller than start and all element will be less than equal to start so we can ignore by end = mid -1

           start < mid element i.e. pivot [case 4]
           [3, 4, 5, 6, 2]
            s     m     e
            if mid is pivot this would have been returned in case 1 and 2. Hence, proved that bigger element lie ahead.
            So, ignore mid and put start = mid + 1
*/
public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] array = {3, 4, 5, 6, 7, 0, 1, 2};
//        System.out.println(findPivot(array));

    }

    //search method to find that target element
    static int search(int[] nums, int target) {

        int pivot = findPivot(nums);

        //if you did not find the pivot, means array is not rotated then apply simple Binary search
        if (pivot == -1) {
            //just apply simple binary search
            return binarySearch(nums, target, 0, nums.length - 1);
        }

        //if pivot found, we have 2 asc sorted array, again need to check 3 cases
        //case 1 - pivot = target
        if (nums[pivot] == target) {
            return pivot;
        }
        //case 2 - target > start element [4, 5, 6 = t, 7 = p, 0, 1, 2] then search space  = (start, pivot -1) after pivot all are < start
        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }
        //case 3 - target < start element [4, 5, 6, 7 = p, 0, 1 = t, 2] then search space = (pivot + 1, end) from start to pivot all elements are going to be bigger than target
        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    //binary search algorithm after finding pivot
    static int binarySearch(int[] arr, int target, int start, int end) {

        while (start <= end) {
            //find the middle of array
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    //this will not work for duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            //find the middle element
            int mid = start + (end - start) / 2;

            //case 1
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }

            //case 2
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }

            //case 3
            if (arr[start] >= arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}

