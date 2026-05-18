package LinearSearch;

//You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i+ customer has in the j+ bank. Return the wealth that the richest customer has.
//A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//Example 1:
//Input: accounts = [[1,2,3],[3,2,1]]
//Output: 6
//Example 2:
//Input: accounts = [[1,5],[7,3],[3,5]]
//Output: 10

public class MaxWealth {
    public static void main(String[] args) {

        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5},
                {5, 8, 12}
        };

        int wealth = maximumWealth(accounts);
        System.out.println(wealth);

    }

    static int maximumWealth(int[][] accounts) {
        //iterate over an array to calculate the sum of each row by adding each column value
//        person = row and account = column
        int maxSum = Integer.MIN_VALUE;
        for(int person=0; person < accounts.length; person++){
            int rowSum = 0;
            for(int account = 0; account < accounts[person].length; account++){
                rowSum = rowSum + accounts[person][account];
                }
            // we have sum of accounts of person so we will check it with maxSum
        if(rowSum > maxSum){
            maxSum = rowSum;
            }
        }
        return maxSum;
    }
}
