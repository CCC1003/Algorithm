package dataStructure;

/**
 * @author cong
 * @create 2022-02-14 16:21
 */
public class MyLinkList {
    private static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
     //头节点指针
    private Node head;
    //尾节点指针
    private Node last;
    //链表的实际长度
    private int size;
    public void insert(int data,int index) throws Exception{
        if (index<0||index>size){
            throw new IndexOutOfBoundsException("超出链表界定范围");
        }
        Node insertedNode=new Node(data);
        if (size==0){
            //空链表
            head=insertedNode;
            last=insertedNode;
        }else if (index==0){
            //插入头部
            insertedNode.next=head;
            head=insertedNode;
        } else if(size==index) {
           last.next=insertedNode;
           last=insertedNode;
        }
        else{
            //插入中间
            Node prevNode=get(index-1);
            insertedNode.next=prevNode.next;
            prevNode.next=insertedNode;
        }
        size++;
    }

 public Node get(int index) throws Exception{
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("超出链表界定啊范围");
        }
        Node temp=head;
        for (int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    public Node remove(int index)throws Exception{
        if (index<0||index>=size){
            throw new IndexOutOfBoundsException("超出链表界定啊范围");
        }
        Node removedNode=null;
        if (index==0){
            //删除头节点
            removedNode=head;
            head=head.next;
        }
        else if(index==size-1){
            //删除尾节点645
            Node prevNode=get(index-1);
            removedNode=prevNode.next;
            prevNode.next=null;
            last=prevNode;
        }else{
            //删除中间节点
            Node prevNode=get(index-1);
            Node nextNode=prevNode.next.next;
            removedNode=prevNode.next;
            prevNode.next=nextNode;
        }
        size--;
        return removedNode;
    }
    public void output(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) throws Exception {
        MyLinkList myArray=new  MyLinkList();
        myArray.insert(3,0);
        myArray.insert(7,1);
        myArray.insert(9,2);
        myArray.insert(5,3);
        myArray.insert(6,4);
        myArray.remove(2);
        System.out.println(myArray.get(1));
        myArray.output();
    }

}
