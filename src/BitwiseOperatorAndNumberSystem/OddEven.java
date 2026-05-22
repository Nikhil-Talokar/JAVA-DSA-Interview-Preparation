package BitwiseOperatorAndNumberSystem;

//Given a number n, find if it is even or odd.
//Point : Evert number is calculated in binary form internally.
//Ex : 12 + 7 = 19 ==> (1 0 0 1 1) => Leaving LSB(Least Significant Bit), every other is a power of 2 and this will always be even.
//If LSB is 1 i.e. 2^0 == 1 then entire answer is odd otherwise even
//If we AND any number with 1 then we get that same number. We will AND 1 with LSB only. So, n&1 == 1 then odd else even
public class OddEven {
    public static void main(String[] args) {
        int n = 68;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
