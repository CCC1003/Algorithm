package knowledge.Morris;

import sun.nio.cs.ext.MS874;

/**
 * @author cong
 * @create 2023-07-04 20:46
 */
public class MorrisTraversal {
    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void morris(Node head) {
        if (head == null) {
            return;
        }
        Node cur = head;
        Node mostRight = null;
        while (cur != null) {
            mostRight = cur.left;
            if (mostRight != null) {
                while (mostRight.right != null || mostRight.right != cur) {
                    mostRight = mostRight.right;
                }
                if (mostRight == null) {
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                } else { //mostRight == cur
                    mostRight.right = null;
                }
            }
            cur = cur.left;
        }
    }
}
