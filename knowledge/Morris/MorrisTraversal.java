package knowledge.Morris;

import com.sun.deploy.security.MozillaSSLRootCertStore;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import jdk.nashorn.internal.ir.annotations.Ignore;
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
                if (mostRight.right == null) {
                    mostRight.right = cur;
                    cur = cur.left;
                    continue;
                } else { //mostRight == cur
                    mostRight.right = null;
                }
            }
            cur = cur.right;
        }
    }
    public static void morrisPre(Node head) {
        if (head == null){
            return;
        }
        Node cur =head;
        Node mostRight=null;
        while (cur != null) {
            mostRight=cur.left;
            if (mostRight!=null) {
                while (mostRight.right!=null||mostRight.right!=cur) {
                    mostRight=mostRight.right;
                }
                if (mostRight.right == null) {
                    System.out.println(cur.value+" ");
                    mostRight.right=cur;
                    cur=cur.left;
                    continue;
                }else {
                    mostRight.right=null;
                }
             }else {
                System.out.println(cur.value+" ");
            }
            cur=cur.right;
        }
        System.out.println();
    }
    public static void morrisIn(Node head) {
        if (head==null) {
            return;
        }
        Node cur = head;
        Node mostRight = null;
        while (cur!=null) {
            mostRight=cur.left;
            if (mostRight!=null) {
                while (mostRight.right!=null||mostRight.right!=cur) {
                    mostRight=mostRight.right;
                }
                if (mostRight.right==null) {
                    mostRight.right=cur;
                    cur=cur.left;
                    continue;
                }else {
                    mostRight.right=null;
                }
            }
            System.out.println(cur.value+" ");
            cur=cur.right;
        }
    }
}
