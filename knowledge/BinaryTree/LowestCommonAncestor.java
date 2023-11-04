package knowledge.BinaryTree;

/**
 * @author cong
 * @create 2022-11-18 21:57
 */
public class LowestCommonAncestor {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    //两种情况
    //1、o1是o2的最低公共祖先或者o2是o1的最低公共祖先
    //2、o1和o2不互为最低公共祖先，需要向上汇聚查找
    public static Node lowestAncestor(Node head, Node o1, Node o2) {
        if (head == null || head == o1 || head == o2) { //遇到谁返回谁（null、o1、o2）
            return head;
        }
        Node left = lowestAncestor(head.left, o1, o2);
        Node right = lowestAncestor(head.right, o1, o2);
        if (left != null && right != null) {
            return head;
        }
        return left != null ? left : right;
    }
}
