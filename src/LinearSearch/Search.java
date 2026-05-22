package LinearSearch;

public class Search {
    public static void main(String[] args) {

        int[] nums = {2, 7, 8, 12, 17, -6, 78, 35, 5, -1, 9, 3};

        int target = 17;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

//    3. search the target and return true o false
    static boolean linearSearch3(int[] arr, int target){
        if( arr.length == 0){
            return  false;
        }

        for(int element : arr){
            if(element == target){
                return true;
            }
        }

        return false;
    }

//    2. search the target and return the number
    static int linearSearch2(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        //run a for loop or enhanced for loop if want to return an element
        for (int num : arr){
            if(num == target) {
                return num;
            }
        }

        return Integer.MAX_VALUE; // why not -1 because -1 may be the element in the array

    }

    //   1. search the target and return the index
    //search in an array; return index if the target element found otherwise return -1
    static int linearSearch(int[] arr, int target){

        if( arr.length == 0) {
            return -1;
        }

        //run a for loop
        for(int index=0; index< arr.length; index++){
            //check element at every index in an array  if it is == target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        //this line will execute if none of the return statement is above have executed means target element is not found
        return -1;
    }
}
