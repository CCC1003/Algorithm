package dataStructure;

/**
 * @author cong
 * @create 2022-02-15 15:59
 */
public class MyQueue {
    private int[] array;
    private int front;
    private int rear;
    public MyQueue(int capacity){
        this.array=new int[capacity];
    }
    public void enQueue(int element)throws Exception{
        if ((rear+1)%array.length==front){
            throw new Exception("队列已满！");
        }
        array[rear]=element;
        rear=(rear+1)%array.length;
    }
    public int deQueue()throws Exception {
        if (rear==front){
            throw new Exception("队列已空");
        }
        int deQueueElement=array[front];
        front=(front+1)%array.length;
        return deQueueElement;
    }
    public void output(){
        for(int i=front;i!=rear;i=(i+1)%array.length){
            System.out.println(array[i]);
        }
    }
    public static void main(String[] args) throws Exception{
        MyQueue myQueue=new MyQueue(6);
        myQueue.enQueue(3);
        myQueue.enQueue(5);
        myQueue.enQueue(6);
        myQueue.enQueue(8);
        myQueue.enQueue(1);
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.deQueue();
        myQueue.enQueue(2);
        myQueue.enQueue(4);
        myQueue.enQueue(9);
        myQueue.output();
    }
}
