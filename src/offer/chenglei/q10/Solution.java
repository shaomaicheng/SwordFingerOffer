package offer.chenglei.q10;


/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * @解析 因为是 2*1 覆盖 2*n，看单边其实和🐸跳台阶一样。是个裴波那契数列
 */
public class Solution {
    private int[] record;
    public int RectCover(int target) {
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
            result = RectCover(target-1)+RectCover(target-2);
        }
        record[target] = result;
        return result;

    }
}
