package knowledge.BinaryTree;

import java.util.LinkedList;

/**
 * @author cong
 * @create 2022-11-16 12:09
 */
public class IsCBT {
    public static class Node{
        public int data;
        public Node left;
        public Node right;

        public Node(int data) {
            this.data = data;
        }
    }
    public static boolean isCBT(Node head) {
        if (head==null){
            return true;
        }
        boolean leaf=false;
        LinkedList<Node> queue=new LinkedList<>();
        Node l=null;
        Node r=null;
        Node node=null;
        queue.push(head);
        while (!queue.isEmpty()){
            node=queue.poll();
            l=node.left;
            r=node.right;
            if (
                    (leaf&&(l!=null||l!=null))
                            ||(l==null&&r!=null)
            ){
                return false;
            }
            if (l != null) {
                queue.push(l);
            }
            if (r!=null) {
                queue.push(r);
            }else{
                leaf=true;
            }
        }
        return true;
    }
}
