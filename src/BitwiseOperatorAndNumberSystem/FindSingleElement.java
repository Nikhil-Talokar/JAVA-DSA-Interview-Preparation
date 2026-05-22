package BitwiseOperatorAndNumberSystem;


//Given an array of numbers, in that array every number appears twice and only one number appears once find that number.
//XOR ^ exclusive OR : Both same then false otherwise true.
//Observations : 1. a ^ 1 = ~a 2. a ^ 0 = a 3. a ^ a = 0 IMP (a is any number)
public class FindSingleElement {
    public static void main(String[] args) {
        int[] array = {2, 3, 4, 1, 2, 1, 3, 6, 4};  //Ans = 6
        System.out.println(findUniqueNumber(array));

    }

    static int findUniqueNumber(int[] arr ){
        //if we XOR all array then we will get single element because duplicates will give 0 and remaining one with XOR is answer.
        // Work with negative number array as well and order of numbers do nor matters
        int unique = 0;

        for(int n : arr) {
            unique ^= n;
        }

        return unique;
    }

}
