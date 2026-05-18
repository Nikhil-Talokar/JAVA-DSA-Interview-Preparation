package BubbleSort;

import java.util.Arrays;

//Bubble Sort : Bubble Sort says that in each step compare each element with its adjacent element and if 1st element is greater than 2nd then swap.
//it is also known as sinking or exchanged or in placed sorting algorithm.
//In the 1st pass, the largest element will be at its correct position or last or first index depending on order.
//In the 2nd pass, the second-largest element is at 2nd position from last index.
//Time complexity : Best Case :  O(N) and Worst Case : O(N2) because asc <--> desc N => No. of comparisons
//As the size of array is growing, the no. of comparison is also growing.
//Note : When j never swaps for the value of i (ith pass), it means array is sorted. Here, i runs once and j runs N-1(swaps) times. So N times const is ignored.
public class BubbleSort {
    public static void main(String[] args) {

//        int[] array = {3, 1, 5, 4, 2};
        int[] array = {-1, 7, 32, 89, 0, 2};

        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    static void bubbleSort(int[] array) {
        //we will loop through all elements one by one and will compare each element with adjacent one
        //We will use 2 loops here 1st for counter and 2nd for moving from 1 to unsorted position not upto last i.e. <length-i

        boolean swapped;
        //run the steps n-1 times
        for (int i=0; i< array.length; i++) {
            swapped = false;
            //for each step, max item will come at the last respective index
            for(int j=1; j< array.length - i; j++) {
                //swap if the item is smaller than the previous item
                if(array[j] < array[j-1]) {
                    //swap
                    int temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                    swapped = true;
                }
            }
            //if you did not swap for a particular value of i, it means the array is sorted hence stop the program
            if(!swapped){   //!false = true
                break;
            }
        }

    }
}
