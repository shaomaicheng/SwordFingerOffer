package offer.chenglei.q7;

/***
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 */


// fn = f(n-2)+f(n-1)
// f4 = f2+f3 = f0+f1+f1+f2 = f0+f1+f1+f0+f1
// f3 = f1+f2
// f2 = f0+f1
public class Solution {
    private int[] dp = null;
    public int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        if (dp == null) {
            dp = new int[n+1];
        }
        if (dp[n] != 0) {
            return dp[n];
        } else {
            int result;
            if (dp[n-2]!=0 && dp[n-1]!=0) {
                result =  dp[n-2]+dp[n-1];
            } else {
                result =  Fibonacci(n - 2) + Fibonacci(n - 1);
            }
            dp[n] = result;
            return result;
        }
    }

}
