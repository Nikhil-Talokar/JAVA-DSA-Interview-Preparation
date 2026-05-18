package CyclicSort;

//In cyclic sort, we are checking the element is at correct index or not. If not swap the number with correct index.
//Time complexity is (N-1) for linear search and N for swapping. 2N-1 ==> o(N) Linear

//Tip : If range is (0, N) ==> every element will be at index = value
//If range is (1, N) ==> every element will be at index = value - 1.

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {

        int[] array = {3, 5, 2, 1, 4};
        cyclicSort(array);
        System.out.println(Arrays.toString(array));

    }

    static void cyclicSort(int[] arr) {
        int i = 0;
        while(i < arr.length) { //swap until all elements get swapped
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }
    }

    private static void swap(int[] arr, int first, int second ) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
