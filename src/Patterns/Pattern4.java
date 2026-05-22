package Patterns;

public class Pattern4 {
    public static void main(String[] args) {

//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
        pattern4(5);
    }

    static void pattern4(int n) {
        for (int row=0; row<n; row++) {
            for(int col=0; col<=row; col++) {
                System.out.print(col+1 + " ");
            }
            System.out.println();
        }
    }
}
