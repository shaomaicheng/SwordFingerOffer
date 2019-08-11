package offer.chenglei.q1;


import java.util.Arrays;


/**
 * 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */

class Solution {
    public boolean Find(int target, int [][] array) {
        if (array == null || array.length == 0) {
            return false;
        }
        int[] hor = array[0];

        if (hor.length == 0) {
            return false;
        }

        // 二分查找横


        int horSearch = Arrays.binarySearch(hor, target);
        if (horSearch >= 0) {
            return true;
        }

        int[] ver = new int[array.length];
        for (int i = 0; i< ver.length; i++) {
            ver[i] = array[i][0];
        }

        int horIndex = (-horSearch) - 1;

        int verSearch = Arrays.binarySearch(ver, target);

        if (verSearch >= 0) {
            return true;
        }

        int verIndex = (-verSearch) - 1;
        for (int i = 0; i < verIndex; i++) {
            for (int j = 0; j < horIndex; j++) {
                if (array[i][j] == target) {
                    return true;
                }
            }
        }

        return false;
    }
}
