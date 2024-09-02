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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
            return null;
        ListNode a=head;
        ListNode prev=head;
        ListNode b=head;
        while(a!=null&&a.next!=null)
        {
            a=a.next.next;
            prev=b;
            b=b.next;
        }
            prev.next=b.next;
        return head;
    }
}