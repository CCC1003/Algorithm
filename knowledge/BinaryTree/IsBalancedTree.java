package knowledge.BinaryTree;

/**
 * @author cong
 * @create 2022-11-16 16:39
 */
public class IsBalancedTree {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    public static boolean isBalancedTree(Node head){
        return process(head).isBalanced;
    }

    public static class ReturnType{
        public boolean isBalanced;
        public int height;

        public ReturnType(boolean isBalanced, int height) {
            this.isBalanced = isBalanced;
            this.height = height;
        }
    }
    private static ReturnType process(Node head) {
        if (head == null) {
            return new ReturnType(true,0);
        }
        ReturnType leftData=process(head.left);
        ReturnType rightData=process(head.right);

        int height=Math.max(leftData.height,rightData.height)+1;

        boolean isBalanced=leftData.isBalanced&&rightData.isBalanced
                &&Math.abs(leftData.height- rightData.height)<2;

        return new ReturnType(isBalanced,height);
    }
}
