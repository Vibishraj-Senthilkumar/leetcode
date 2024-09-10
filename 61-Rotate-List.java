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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
        ListNode temp1=head;
        ListNode temp=head;
        ListNode prev=null;
        ListNode head1=null;
        int len=1;
        while(temp1.next!=null)
        {
            len++;
            temp1=temp1.next;
        }
        k=k%len;
        if(k==0)
            return head;
        temp=head;
        while(temp!=null&&k!=0)
        {
            if(len==k)
            {
                head1=temp;
                break;
            }
            prev=temp;
            temp=temp.next;
            len--;
        }
        prev.next=null;
        temp1.next=head;
        return head1;
    }
}