package knowledge.BinaryTree;

import com.sun.xml.internal.bind.v2.model.core.ID;

import javax.sound.midi.Soundbank;
import java.util.Stack;

/**
 * @author cong
 * @create 2022-08-02 21:42
 */
public class PreInPosTraversal {
    public static class Node{
        public int value;
        public Node left;
        public Node right;

        public Node(int data) {
            this.value=value;
        }
    }
    //递归方法
    //前序遍历
    public static void preOrderRecur(Node head) {
        if (head==null){
            return;
        }
        System.out.println(head.value+" ");
        preOrderRecur(head.left);
        preOrderRecur(head.right);
    }
    //中序遍历
    public static void inOrderRecur(Node head) {
        if (head==null){
            return;
        }
        inOrderRecur(head.left);
        System.out.println(head.value+" ");
        inOrderRecur(head.right);
    }
    //后序遍历
    public static void posOrderRecur(Node head) {
        if (head==null) {
            return;
        }
        posOrderRecur(head.left);
        posOrderRecur(head.right);
        System.out.println(head.value+" ");
    }
    //非递归方法
    //前序遍历
    public static void preOrderUnRecur(Node head) {
        System.out.println("pre-order: ");
        if (head!=null){
            Stack<Node> stack=new Stack<Node>();
            stack.add(head);
            while (!stack.isEmpty()) {
                head=stack.pop();
                System.out.println(head.value+" ");
                if (head.right!=null){
                    stack.push(head.right);
                }
                if (head.left!=null) {
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }
    //中序遍历
    public static void inOrderUnrecur(Node head){
        System.out.println("in-order: ");
        if (head!=null) {
            Stack<Node> stack=new Stack<Node>();
            while (!stack.isEmpty()||head!=null) {
                if (head!=null){
                    stack.push(head);
                    head=head.left;
                }
                else{
                    head=stack.pop();
                    System.out.println(head.value+" ");
                    head=head.right;
                }
            }

        }
        System.out.println();
    }
    //后序遍历
    public static void posOrderUnrecur(Node head){
        System.out.println("pos-order: ");
        if (head!=null) {
            Stack<Node> s1=new Stack<Node>();
            Stack<Node> s2=new Stack<Node>();
            s1.push(head);
            while (!s1.isEmpty()){
                head=s1.pop();
                s2.push(head);
                if (head.left!=null){
                    s1.push(head.left);
                }
                if (head.right!=null){
                    s1.push(head.right);
                }
            }
            while (!s2.isEmpty()){
                System.out.println(s2.pop().value+" ");
            }
        }
        System.out.println();
    }

}
