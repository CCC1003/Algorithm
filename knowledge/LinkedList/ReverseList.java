package knowledge.LinkedList;

import jdk.nashorn.internal.objects.NativeFloat32Array;

/**
 * @author cong
 * @create 2022-04-01 20:34
 */
public class ReverseList {
    //单链表反转
    public static class Node{
        public int value;
        public Node next;
        public Node(int data){
            value=data;
        }
    }
    public static Node reverseLinkedList(Node head){
        Node pre=null;
        Node next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
    //双链表反转
    public static class DoubleNode{
        public int value;
        public DoubleNode last;
        public DoubleNode next;
        public DoubleNode(int data){
            value=data;
        }
    }
    public static DoubleNode reverseDoubleList(DoubleNode head){
        DoubleNode pre=null;
        DoubleNode next=null;
        while (head!=null){
            next=head.next;
            head.next=pre;
            head.last=next;
            pre=head;
            head=next;
        }
        return pre;
    }

    public static void main(String[] args) {
        Node n1=new Node(1);
        n1.next=new Node(2);
        n1.next.next=new Node(3);
        System.out.println(reverseLinkedList(n1).next.next);
    }

}
