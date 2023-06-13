package knowledge.LinkedList;

/**
 * @author cong
 * @create 2022-04-07 15:53
 */
public class LinkedListToStack {
    public static class Node<V>{
        public V value;
        public Node<V> next;

        public Node(V v) {
            value = v;
            next = null;
        }
        public static class MyStack<V>{
            private Node<V> head;
            private int size;
            public MyStack(){
                head=null;
                size=0;
            }
            //判断是否为空
            public boolean isEmpty(){
                return size==0;
            }
            //得到栈的长度
            public int size(){
                return size;
            }
            //推入栈顶
            public void push(V value){
                Node<V> cur=new Node<>(value);
                if (head!=null){
                    cur.next=head;
                    head=cur;
                }else{
                    head=cur;
                }
                size++;
            }
            //出栈
            public V pop(){
                V ans=null;
                while (head!=null){
                    ans=head.value;
                    head=head.next;
                    size--;
                }
                return ans;
            }
            //得到节点的数据
            public V peek(){
                return head!=null?head.value:null;
            }
        }
    }
}
