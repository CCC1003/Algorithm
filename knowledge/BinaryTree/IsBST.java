package knowledge.BinaryTree;

import java.util.LinkedList;

/**
 * @author cong
 * @create 2022-11-16 12:10
 */
public class IsBST {

    public static class Node {
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value = data;
        }
    }

    public static boolean isBST1(Node head) {
        if (head == null) {
            return true;
        }
        LinkedList<Node> inOrderList = new LinkedList<>();
        process1(head, inOrderList);
        int pre = Integer.MIN_VALUE;
        for (Node cur : inOrderList) {
            if (pre >= cur.value) {
                return false;
            }
            pre = cur.value;
        }
        return true;
    }

    public static void process1(Node node, LinkedList<Node> inOrderList) {
        if (node == null) {
            return;
        }
        process1(node.left, inOrderList);
        inOrderList.add(node);
        process1(node.right, inOrderList);
    }
    public static boolean isBST2(Node head) {
        return process2(head).isBST;
    }
    public static class ReturnData{
        public boolean isBST;
        public int min;
        public int max;

        public ReturnData(boolean isBST, int min, int max) {
            this.isBST = isBST;
            this.min = min;
            this.max = max;
        }
    }
    private static ReturnData process2(Node head) {
        if (head==null) {
            return null;
        }
        ReturnData leftData=process2(head.left);
        ReturnData rightData=process2(head.right);

        int min=head.value;
        int max=head.value;

        if (leftData!=null){
            max=Math.max(max, leftData.max);
        }
        if (rightData!=null) {
            min=Math.min(min, rightData.min);
        }

        boolean isBST=true;
        if (leftData!=null&&(!leftData.isBST||leftData.max>=head.value)){
            isBST=false;
        }
        if (rightData!=null&&(!rightData.isBST||head.value>=rightData.min)){
            isBST=false;
        }
        return new ReturnData(isBST,min,max);
    }


}

