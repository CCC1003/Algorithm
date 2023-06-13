package knowledge.BinaryTree;

/**
 * @author cong
 * @create 2022-11-16 17:16
 */
public class IsFBT {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static boolean isFBT(Node head) {
        if (head == null) {
            return true;
        }
        /**
         * 判断是否符合二叉树的公式
         */
        return process(head).nodes == (1 << process(head).height - 1);
    }

    public static class ReturnType {
        public int height;
        public int nodes;

        public ReturnType(int height, int nodes) {
            this.height = height;
            this.nodes = nodes;
        }
    }

    public static ReturnType process(Node node) {
        if (node == null) {
            return new ReturnType(0, 0);
        }
        /**
         * 递归求出左右子树的高度和节点总数
         */
        ReturnType leftData = process(node.left);
        ReturnType rightData = process(node.right);

        /**
         * 得到深度和节点总数
         */
        int height = Math.max(leftData.height, rightData.height) + 1;

        int nodes = leftData.nodes + rightData.nodes + 1;

        return new ReturnType(height, nodes);
    }
}
