package knowledge.LinkedList;

import javax.management.ListenerNotFoundException;
import java.util.List;

/**
 * @author cong
 * @create 2022-06-17 11:29
 */
public class AddTwoNumbers {
    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int val){
            this.val=val;
        }
        public ListNode(int val,ListNode next) {
            this.val=val;
            this.next=next;
        }
        public static ListNode addTwoNumbers(ListNode head1,ListNode head2){
            int len1=listLength(head1);
            int len2=listLength(head2);

            ListNode l=len1>=len2?head1:head2;
            ListNode s=l==head1?head2:head1;
            ListNode curL=l;
            ListNode curS=s;
            ListNode last=curL;
            int carry=0;
            int curNum=0;

            while (curS!=null){
                curNum=curL.val+curS.val+carry;
                curL.val=curNum%10;
                carry=curNum/10;
                last=curL;
                curL=curL.next;
                curS=curS.next;
            }
            while (curL!=null) {
                curNum=curL.val+carry;
                curL.val=curNum%10;
                carry=curNum/10;
                last=curL;
                curL=curL.next;
            }
            if (carry!=0){
                last.next=new ListNode(1);
            }
                return l;

        }
        public static int listLength(ListNode head){
            int len=0;
            while (head!=null){
                head=head.next;
                len++;
            }
            return len;
        }
    }
}
