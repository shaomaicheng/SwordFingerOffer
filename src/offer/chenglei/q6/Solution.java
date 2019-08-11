package offer.chenglei.q6;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 */
public class Solution {
    public int minNumberInRotateArray(int[] array) {
        if (array == null) {return 0;}
        int length = array.length;
        if (length == 0) {
            return 0;
        }
        int middleIndex = length/2;
        int middle = array[middleIndex];
        int last = array[length - 1];

        if (length == 1) {
            return array[0];
        } else {
            if (middle >= last) {
                // 后半部分
                int[] back = new int[length - middleIndex];
                for (int i = middleIndex, j = 0; i < length; i++, j++) {
                    back[j] = array[i];
                }
                return minNumberInRotateArray(back);
            } else {
                // 前半部分
                int size = middleIndex+1;
                int[] font = new int[size];
                for (int i = 0; i < size; i++) {
                    font[i] = array[i];
                }
                return minNumberInRotateArray(font);
            }
        }
    }

    /*public int minNumberInRotateArray(int[] array){
        if (array.length==0){return 0;}
        int left = 0;
        int right = array.length-1;
        int middle = -1;
        while (array[left] >= array[right]){
            if (right-left==1){
                middle=right;
                break;
            }
            middle=left+(right-left)/2;
            if (array[middle]>=array[left]){
                left=middle;
            }
            if (array[middle]<=array[right]){
                right=middle;
            }
        }
        return array[middle];
    }*/
}
