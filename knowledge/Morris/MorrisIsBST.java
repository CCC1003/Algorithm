package knowledge.Morris;

/**
 * @author cong
 * @create 2023-07-13 20:12
 */
public class MorrisIsBST {
    public static class TreeNode{
        private int val;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    //morris遍历实现
    public static boolean isBST(TreeNode head) {
        if (head == null) {
            return true;
        }
        TreeNode cur =head;
        TreeNode mostRight=null;
        boolean ans = true;
        Integer pre = null;

        while (cur!=null) {
            mostRight=cur.left;
            if (mostRight!=null) {
                while (mostRight.right!=null&&mostRight.right!=cur) {
                    mostRight=mostRight.right;
                }
                if (mostRight.right==null) {
                    mostRight.right=cur;
                    cur=cur.left;
                    continue;
                }else {
                    mostRight.right=null;
                }
            }if (pre!=null&&pre>=cur.val){
                ans=false;
            }
            pre=cur.val;
            cur=cur.right;
        }
        return ans;
    }
}
