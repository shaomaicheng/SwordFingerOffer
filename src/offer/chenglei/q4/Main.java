package offer.chenglei.q4;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode treeNode = solution.reConstructBinaryTree(new int[]{1,2,3,4,5,6,7},
                new int[]{3,2,4,1,6,5,7});
        foreachTree(treeNode);

    }


    private static void foreachTree(TreeNode treeNode) {
       if (treeNode!=null){
           System.out.print(treeNode.val + ",");
           foreachTree(treeNode.left);
           foreachTree(treeNode.right);
       }
    }
}
