package Patterns;

public class Pattern28 {
    public static void main(String[] args) {
//        *
//       * *
//      * * *
//     * * * *
//    * * * * *
//     * * * *
//      * * *
//       * *
//        *

        pattern28(5);
    }

    static void pattern28(int n) {
        for(int row=0; row<n; row++) {
                for (int col = 0; col <= row; col++) {
                    for(int space=0; space<n-col; space++) {
                        System.out.print(" ");
                    }
                    System.out.print("* ");
            }
            System.out.println();
            }
        }

}
