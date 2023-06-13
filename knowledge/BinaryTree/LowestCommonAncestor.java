package knowledge.BinaryTree;

/**
 * @author cong
 * @create 2022-11-18 21:57
 */
public class LowestCommonAncestor {
    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public static Node lowestAncestor(Node head,Node o1,Node o2) {
        if (head==null||head==o1||head==o2){
            return head;
        }
        Node left=lowestAncestor(head.left,o1,o2);
        Node right=lowestAncestor(head.right,o1,o2);
        if (left!=null&&right!=null){
            return head;
        }
        return left!=null?left:right;
    }
}
