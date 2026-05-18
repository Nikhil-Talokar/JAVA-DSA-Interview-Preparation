package Insertionsort;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] array = {4, 5, 1, 2, 3};
//        int[] array = {5, 3, 4, 1, 2};
        int[] array = {56, -32, 88, 97, -16};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void insertionSort(int[] arr) {
        //for insertion sorting we will loop till n-2
        for (int i=0; i<= arr.length-2; i++) {
            //j will start from i+1 and will reduce every time by 1
            for (int j=i+1; j>0; j--) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                } else {
                    //when element j is not smaller than element j-1 and it does not make any sense to check all LHS element
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
