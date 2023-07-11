package knowledge.Morris;

import knowledge.KMP.TreeEqual;

/**
 * @author cong
 * @create 2023-07-11 20:31
 */
public class MinDepth {
    public static class TreeNode{
        public int val;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //常规递归方法
    public static int minDepth1(TreeNode head) {
        if (head==null) {
            return 0;
        }
        return process(head);
    }

    private static int process(TreeNode x) {
        if (x.left==null&&x.right==null) {
            return 1;
        }
        //左右子树有一个不为空
        int leftH=Integer.MAX_VALUE;
        if (x.left!=null) {
            leftH=process(x.left);
        }
        int rightH=Integer.MAX_VALUE;
        if (x.right!=null) {
            rightH=process(x.right);
        }
        return 1+Math.min(leftH,rightH);
    }
    //morris遍历

}
