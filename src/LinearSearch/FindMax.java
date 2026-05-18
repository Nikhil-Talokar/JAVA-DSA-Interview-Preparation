package LinearSearch;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {2, 64, 8, 10, 99, 32, 45, 5};

        int result = maxNum(arr);
        System.out.println(result);

    }

    static int maxNum(int[] arr){
        if(arr.length == 0){
            return -1;
        }

        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
