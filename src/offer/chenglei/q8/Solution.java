package offer.chenglei.q8;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 */

public class Solution {
    private int[] record = null;

    public int JumpFloor(int target) {
        if (target < 3) {
            return target;
        }
        if (record == null) {
            record = new int[target+1];
        }
        int result;
        if (record[target-1]!=0 && record[target-2]!=0){
            result = record[target-1]+record[target-2];
        } else {
            result = JumpFloor(target-1)+JumpFloor(target-2);
        }
        record[target] = result;
        return result;

    }
}
