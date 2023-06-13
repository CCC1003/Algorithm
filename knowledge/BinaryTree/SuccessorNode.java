package knowledge.BinaryTree;

/**
 * @author cong
 * @create 2022-11-18 22:38
 */
public class SuccessorNode {
    public static class Node{
        public int value;
        public Node left;
        public Node right;
        public Node parent;

        public Node(int value) {
            this.value = value;
        }
    }
    public static Node getSuccessorNode(Node node){
        if (node == null) {
            return null;
        }
        if (node.right!=null){
            return getLeftMost(node.right);
        }else {
            Node parent=node.parent;
            while (parent!=null&&parent.left!=node){
                node=parent;
                parent=node.parent;
            }
            return parent;
        }
    }

    private static Node getLeftMost(Node node) {
        if (node.left!=null){
            node=node.left;
        }
        return node;
    }
}
