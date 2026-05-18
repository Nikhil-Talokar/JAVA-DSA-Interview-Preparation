package BinarySearch;

public class OrderAgnosticBS {

    public static void main(String[] args) {
//        int[] array = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] array = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = 22;

        int ans = orderAgnosticBS(array, target);
        System.out.println(ans);

    }

    static int orderAgnosticBS(int[] arr, int target){

        int start = 0;
        int end = arr.length - 1;

        //if we don't know array is sorted but in ascending order or descending order then
        boolean isAsc;

        if(arr[start] < arr[end]) {
                isAsc = true;
        } else {
            isAsc = false;
        }

        while(start <= end) {
            //find the middle of array

            int mid = start + (end-start)/2;

            //we have 3 conditions in both orders but mid === target is common one so

            if(arr[mid] == target) {
                return mid;
            }

            if(isAsc){
                //Ascending order
                if(arr[mid] < target){
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            }else {
                //Descending order
                if(arr[mid] < target) {
                    end = mid -1;
                }else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        }
        //if none of the condition matched from while loop then break and return -1
        return  -1;
    }
}
