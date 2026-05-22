package StringsAndStringBuilder;

public class Palindrome {
    public static void main(String[] args) {

        String str = "";
//        String str = "abccba";
//        String str = "abcyba";
//        String str = "n";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        //if string is empty it will give an error like Index 0 out of bounds for length 0 so,
        if(str == null || str.length() == 0) {
            return true;  //false if interviewer said
        }
        str = str.toLowerCase();
        for(int i=0; i <= str.length()/2; i++) {
        char start = str.charAt(i);
        char end = str.charAt(str.length() - 1 - i);

        if(start != end) {
            return  false;
         }
        }
        return true;
    }
}
