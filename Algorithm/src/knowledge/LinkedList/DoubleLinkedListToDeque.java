package knowledge.LinkedList;

import sun.awt.SunHints;

import java.io.FileReader;
import java.sql.PreparedStatement;
import java.time.temporal.ValueRange;

/**
 * @author cong
 * @create 2022-06-14 8:39
 */
public class DoubleLinkedListToDeque {
    //创建节点类
    public static class Node<V>{
        public V value;
        public Node<V> last;
        public Node<V> next;

        public Node(V v) {
            value=v;
            last=null;
            next=null;
        }
    }
    //创建队列类
    public static class MyDeque<V> {
        private Node<V> head;
        private Node<V> tail;
        private int size;

        public MyDeque(){
            head=null;
            tail=null;
            size=0;
        }
        public boolean isEmpty() {
            return size==0;
        }
        public int size() {
            return size;
        }
        //头部入队
        public void pushHead(V v){
            Node<V> cur=new Node<>(v);
            if (head==null){
                head=cur;
                tail=cur;
            }else{
                cur.next=head;
                head.last=cur;
                head=cur;
            }
            size++;
        }
        //尾部入队
        public void pushTail(V v) {
            Node<V> cur=new Node<>(v);
            if (head==null) {
                head=cur;
                tail=cur;
            }else {
                cur.last=tail;
                tail.next=cur;
                tail=cur;
            }
            size++;
        }
        //头部弹出
        public V pollHead() {
            V ans=null;
            if (head==null){
                return ans;
            }
            size--;
            ans=head.value;
            if (head==tail){
                head=null;
                tail=null;
            }else {
                head=head.next;
                head.last=null;
            }
            return ans;
        }
        //尾
        public V pollTail(){
            V ans=null;
            if (head==null){
                return ans;
            }
            size--;
            ans=tail.value;
            if (head==tail) {
                head=null;
                tail=null;
            }else {
                tail=tail.last;
                tail.next=null;
            }
            return ans;
        }
        public V peekHead(){
            V ans=null;
            if (head!=null){
                ans=head.value;
            }
            return ans;
        }
        public V peekTail(){
            V ans=null;
            if (head==null) {
                ans=tail.value;
            }
            return ans;
        }
    }
}