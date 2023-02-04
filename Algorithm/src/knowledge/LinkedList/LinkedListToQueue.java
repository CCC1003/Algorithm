package knowledge.LinkedList;

/**
 * @author cong
 * @create 2022-04-07 15:19
 */
public class LinkedListToQueue {
    //单链表实现队列结构
    public static class Node<V>{
        public V value;
        public Node<V> next;

        public Node(V v){
            value=v;
            next=null;
        }
    }
    public static class MyQueue<V>{
        private Node<V> head;
        private Node<V> tail;
        private int size;
        //初始化
        public MyQueue(){
            head=null;
            tail=null;
            size=0;
        }
        //判断是否为空
        public boolean isEmpty(){
            return size==0;
        }
        //得到链表的长度
        public int size(){
            return size;
        }
        //入队
        public void offer( V value){
            Node<V> cur=new Node<>(value);
            if (tail==null){
                head=cur;
                tail=cur;
            }else {
                tail.next=cur;
                tail=cur;
            }
            size++;
        }
        //出队
        public V poll(){
            V ans=null;
            if (head!=null){
                ans=head.value;
                head=head.next;
                size--;
            }
            if (head == null){
                tail=null;
            }
            return ans;
        }
        //返回队头的数据
        public V peek() {
            V ans=null;
            if (head!=null){
                ans=head.value;
            }
            return ans;
        }
    }
}
