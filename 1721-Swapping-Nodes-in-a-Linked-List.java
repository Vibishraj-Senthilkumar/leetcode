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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        ListNode first=head;
        ListNode last=head;
        int first1=0;
        int last1=0;
        int c=1;
        while(temp!=null)
        {
            if(c==k)
            {
                first=temp;
                first1=temp.val;
            }
            c++;
            temp=temp.next;
        }
        temp=head;
        c-=1;
        while(temp!=null)
        {
            if(c==k)
            {
                last=temp;
                last1=temp.val;
                break;
            }
            c--;
            temp=temp.next;
        }
        first.val=last1;
        last.val=first1;
        return head;
    }
}