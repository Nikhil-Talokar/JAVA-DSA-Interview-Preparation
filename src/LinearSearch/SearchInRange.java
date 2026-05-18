package LinearSearch;

public class SearchInRange {
    public static void main(String[] args) {

        int[] array = {5, 9, 4, 22, 14, 34, 12, 25};
        int target = 14; // in the range 2 to 5

        int result = searchInRange(array, 2, 5, target);
        System.out.println(result);
    }

    static int searchInRange(int[] arr, int start, int end, int target){

        if(arr.length == 0){
            return -1;
        }

        for(int index=start; index<=end; index++) {
            if(target == arr[index]) {
                return index;
            }
        }

        return -1;

    }
}
