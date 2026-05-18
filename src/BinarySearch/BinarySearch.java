package BinarySearch;

//Binary Search - sorted array
//1. find the middle element
//2. target > middle then search it on right side otherwise search it on left side
//3. if not found return -1

public class BinarySearch {
    public static void main(String[] args) {

        int[] array = {-18, -12, -4, 0, 2, 4, 15, 16, 18, 22, 45, 89};
        int target = 2;

        int ans = binarySearch(array, target);
        System.out.println(ans);

    }

    //Ascending Order Algorithm 1
    //return the index or return -1 if does not exist
    static int binarySearch(int[] arr, int target){
        int start = 0; // start will be at 0th index of an array
        int end = arr.length - 1; //end will be at last index of an array

        while(start <= end) { //keep finding until start become less than end or end
            //find the middle element
//            int mid = (start + end)/2; //might exceed the range of integer cause error so modify as below
            int mid = start + (end - start)/2;

            //3 possible conditions
            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            } else {
                //target found
                return mid;
            }
        }
        //if none of the condition matched from while loop then break and return -1
        return -1;
    }
}
