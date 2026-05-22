package BitwiseOperatorAndNumberSystem;

//Find the ith bit of a number. 10110110
//AND with that specific bit so we will get an answer and others with 0s. But how to do this ?
//Ex : 10110110
//   & 00010000  This is called mask.
// n=> mask with n-1 zeroes. we need n-1 zeroes on LHS so, Left Shift like 1 << 4 ==> 10000
//Ans : n&(1 << (n-1))
public class FindBit {
    public static void main(String[] args) {

    }

    static int iTHBit(int n) {
        return 0;

    }
}
