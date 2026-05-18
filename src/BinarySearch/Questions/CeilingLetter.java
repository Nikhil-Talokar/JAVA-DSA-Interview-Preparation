package BinarySearch.Questions;

//You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.
//Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

//Input: letters = ["c","f","j"], target = "a"
//Output: "c"
//Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.

public class CeilingLetter {
    public static void main(String[] args) {
        char[] letters = {'c','f','j'};

        char target = 'a';

        char ans = ceilingLetter(letters, target);
        System.out.println(ans);
    }

    static char ceilingLetter(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;


        while( start <= end) {

        int mid = start + (end - start)/2;

            if(target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        //we need to return actual letter not an index so,
        return letters[start % letters.length];
    }

}
