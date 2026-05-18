package BinarySearch.Questions;

//arr = {2, 3, 5, 9, 14, 16, 18} , target = 14
//Floor => greatest element in array smaller than or equal to target
//Floor (arr, target = 14 ) = 14
//Floor (arr, target = 15 ) = 11
//Floor (arr, target = 4 ) = 3
//Floor (arr, target = 9 ) = 9
public class Floor {
    public static void main(String[] args) {

        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        int ans = floor(arr, target);
        System.out.println(ans);

    }

    static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end ){

            int mid = start + (end - start)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return end;
    }
}
