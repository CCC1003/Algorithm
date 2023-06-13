package knowledge.LinkedList;

import java.util.List;

/**
 * @author cong
 * @create 2022-06-14 21:12
 */
//K个节点的组内逆序调整
public class ReverseNodesInKGroup {
  public static class ListNode{
      public ListNode next;
  }
  public static ListNode reverseKGroup(ListNode head,int k){
      ListNode start=head;
      ListNode end=getKGroupEnd(start,k);
      if(end==null){
          return head;
      }
      head=end;
      reverse(start,end);
      //标记上一组的结尾节点
      ListNode LastEnd=start;
      while (LastEnd.next!=null) {
          start=LastEnd.next;
          end=getKGroupEnd(start,k);
          while (end==null) {
              return head;
          }
          reverse(start,end);
          LastEnd.next=end;
          LastEnd=start;
      }
      return head;
  }
  public static ListNode getKGroupEnd(ListNode start,int k){
      while (--k!=0&&start!=null){
          start=start.next;
      }
      return start;
  }
  public static void reverse(ListNode start,ListNode end) {
      end= end.next;
      ListNode pre=null;
      ListNode cur=start;
      ListNode next=null;
      while (cur!=end){
          next=cur.next;
          cur.next=pre;
          pre=cur;
          cur=next;
      }
      start.next=end;
  }
}
