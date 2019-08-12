package offer.chenglei.q9;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 * fn = f(n-1)+f(n-2)+ .... + f(3) + f(2) + f(1)
 * f(1) = 1
 */
public class Solution {
    private int[] dp;
    public int JumpFloorII(int target) {
        if (target == 1) {
            return 1;
        }
        if (dp == null) {
            dp = new int[target+1];
        }

        int result=0;
        for (int i = target-1;i >= 1; i--) {
            if (dp[i] != 0) {
                result+=dp[i];
            } else {
                result += JumpFloorII(i);
            }
        }
        result++;
        dp[target] = result;
        return result;
    }
}
