public class maxNumber {
    public static void main(String[] args) {
        int[] array = {2, 55, 9, 15, 45, 23, 12, 65};

        int maxNum = getMaxNumber(array);
        System.out.println(maxNum);

        int maxNumRange = getMaxNumberRange(array, 1, 4);
        System.out.println(maxNumRange);

    }

    //edge case => imagine that array is not empty
    static int getMaxNumber(int[] arr) {

        //consider 1st element of an as a max number
        int max = arr[0];

        for(int i=1; i< arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
            return max;
    }

    //work on edge cases like array is not null
    static int getMaxNumberRange(int[] arr, int start, int end){

        //consider the max value of array as a start index value
        int max = arr[start];

        for(int i=start; i<=end; i++){
            if(arr[i] > arr[start]){
                max = arr[i];
            }
        }
        return max;
    }
}
