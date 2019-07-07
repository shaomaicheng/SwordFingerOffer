package offer.chenglei.q1;


import java.util.Arrays;

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
