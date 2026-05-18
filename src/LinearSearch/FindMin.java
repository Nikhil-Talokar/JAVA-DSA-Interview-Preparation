package LinearSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr = {12, 4, 45, -8, 25, 38, 5};

        int result = linearSearch(arr);
        System.out.println(result);


    }

    // return the minimum value in the array
    static int linearSearch(int[] arr) {
        if(arr.length == 0){
            return -1;
        }

        int min = arr[0];
        for(int i=1; i< arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
