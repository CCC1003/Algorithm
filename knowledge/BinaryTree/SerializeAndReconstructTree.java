package knowledge.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author cong
 * @create 2022-11-19 10:38
 */
public class SerializeAndReconstructTree {
    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int value) {
            this.value = value;
        }
    }
    //序列化:内存里的一棵树如何变成字符串形式
    public static String serialByPre(Node head) {
        if (head==null) {
            return "#!";
        }
        String res=head.value+"!";
        res+=serialByPre(head.left);
        res+=serialByPre(head.right);
        return res;
    }
    //反序列化：从字符串形式变成内存里的树
    public static Node reconByPreString(String preStr){
        String[] strings = preStr.split("!");
        Queue<String> queue=new LinkedList<String>();
        for (String string : strings) {
            queue.offer(string);
        }
        return reconPreOrder(queue);

    }
    private static Node reconPreOrder(Queue<String> queue) {
        String s=queue.poll();
        if (s.equals("#")){
            return null;
        }
        Node head=new Node(Integer.valueOf(s));
        head.left=reconPreOrder(queue);
        head.right=reconPreOrder(queue);
        return head;
    }
}
