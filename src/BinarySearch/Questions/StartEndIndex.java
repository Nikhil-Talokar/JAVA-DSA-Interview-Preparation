package BinarySearch.Questions;

//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//If target is not found in the array, return [-1, -1].
//You must write an algorithm with O(log n) runtime complexity.
//Example 1:
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]

import java.util.Arrays;

public class StartEndIndex {
    public static void main(String[] args) {

        int[] nums = {5,7,7,8,8,10};
        int target = 8;

        int[] ans = searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
    }

    //here we are going to run binary search 2 times 1. to find the 1st index of target 2. to find the last index of target
    static int[] searchRange(int[] nums, int target) {

        //Initially or if not found then return
        int[] ans = {-1, -1};

        // check for 1st occurrence of target
        int start =  search(nums, target, true);
        // check for last occurrence of target
        int end = search(nums, target, false);

        //update the ans
        ans[0] = start;
        ans[1] = end;

        return ans;
    }

    //need to run the binary search twice so created separate function
    static int search(int[] nums, int target, boolean firstIndex) {
        
        int ans = -1;

        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {

            int mid = start + (end - start)/2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                //potential ans found
                ans = mid;
                //there may be possibility that number can be on left side of mid and right side of mid again so
                if(firstIndex) {
                    end = mid - 1;
                } else {
                    start =  mid + 1;
                }
            }
        }
        return ans;
    }

}
