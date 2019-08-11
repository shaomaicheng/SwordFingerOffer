package offer.chenglei.q4;

import java.util.Arrays;


/**
 *
 输入某二叉树的前序遍历和中序遍历的结果，请重建出该二叉树。
 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */



class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {val = x;}
}

public class Solution {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre.length == 0) {
            return null;
        }
        int root = pre[0];
        TreeNode treeNode = new TreeNode(root);

        int rootIndex = -1;
        for (int i = 0;i < in.length;i++){
            if (in[i] == root) {
                rootIndex = i;
                break;
            }
        }
        if (rootIndex == 0) {
            treeNode.left = null;
        }
        if (rootIndex == in.length-1) {
            treeNode.right = null;
        }

        int rightLength = in.length-1-rootIndex;

        int[] preLeft = new int[rootIndex];
        int[] preRight = new int[rightLength];
        int[] inLeft = new int[rootIndex];
        int[] inRight = new int[rightLength];


        for (int i = 0; i < rootIndex; i++) {
            preLeft[i] = pre[i+1];
        }
        for (int i = 0; i < rootIndex;i++) {
            inLeft[i] = in[i];
        }

        for (int i = 0;i < rightLength;i++){
            preRight[i] = pre[pre.length-rightLength+i];
        }

        for (int i = 0;i < rightLength;i++){
            inRight[i] = in[in.length-rightLength+i];
        }

//        System.out.print("preleft: ");
//        for (int i : preLeft){
//            System.out.print(i + ",");
//        }
//        System.out.println();
//
//        System.out.print("inleft:");
//        for (int i : inLeft){
//            System.out.print(i + ",");
//        }
//        System.out.println();

        treeNode.left = reConstructBinaryTree(preLeft, inLeft);

//        System.out.print("preright: ");
//        for (int i : preRight){
//            System.out.print(i + ",");
//        }
//        System.out.println();
//
//        System.out.print("inright:");
//        for (int i : inRight){
//            System.out.print(i + ",");
//        }
//        System.out.println();

        treeNode.right = reConstructBinaryTree(preRight, inRight);
        return treeNode;
    }

}
