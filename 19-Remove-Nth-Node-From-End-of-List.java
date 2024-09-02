/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int tail=0;;
        if(head==null||head.next==null)
            return null;
        ListNode temp=head;
        ListNode prev=null;
        ListNode front=null;
        while(temp!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
            tail++;
        }
        temp=prev;
        int c=0;
        boolean flag=false;
        if(n==tail)
        {
            while(temp!=null)
            {
                if(temp.next.next==null)
                {
                    temp.next=null;
                    break;
                }
                temp=temp.next;
            }
        }
        else
        {
        while(temp!=null)
        {
            c++;
            if(c==n)
            {  
                while(temp.next!=null)
                {
                    
                temp.val=temp.next.val;
                if(temp.next.next==null)
                {
                    temp.next=null;
                    break;
                }
                temp=temp.next;
                flag=true;
                }
            }
            if(flag)
                break;
            temp=temp.next;
            
        }
        }
        ListNode prev1=null;
        front=null;
        while(prev!=null)
        {
            front=prev.next;
            prev.next=prev1;
            prev1=prev;
            prev=front;
        }
        return prev1;
    }
}