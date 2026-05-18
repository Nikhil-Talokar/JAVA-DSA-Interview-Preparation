package LinearSearch;

//1295 - Find Numbers with Even Number of Digits
//Given an array nums of integers, return how many of them contain an even number of digits.
//Example 1:
//Input: nums = [12,345,2,6,7896]
//Output: 2

public class EvenDigits {
    public static void main(String[] args) {

        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));

        //we can call digit function to just count the no of digits in a number
        System.out.println(digits2(-12345678));
    }

    static int findNumbers(int[] nums){
        //take count variable and initialised to zero so that we can count the no of digits with even numbers
        int count = 0;

        //iterate over the array to get no of digits in a number with even() method
        for(int num : nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    //There are 2 ways to count the no of digits in any number
    //1. Directly count the no of digits
    //2. convert the number to string and then calculate the length of the string
    //function to check whether a number contains even number of not but for this we need to count the digits in a number so create that function
    private static boolean even(int num) {
        int noOfDigits = digits(num);

//        if(noOfDigits % 2 == 0) {
//            return true;
//        }
//        return false;

        return noOfDigits % 2 == 0;
    }

    //optimised version of digits
    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }

    //count the number of digits in a number
    private static int digits(int num){
        int count = 0;
        //if number is negative then make it positive
        if(num < 0){
            num = num * -1;
        }

        if( num == 0){
            return 1;
        }
        while(num > 0){
            count++;
            num = num/10; // num /= 10
        }
        return count;
    }


}
