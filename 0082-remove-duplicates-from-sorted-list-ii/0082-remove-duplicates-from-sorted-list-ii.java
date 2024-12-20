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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null)
            return null;
        ListNode temp=head;
        ListNode temp1=head;
        ListNode prev=head;
        int[] freq=new int[201];
        boolean flag=true;
        while(temp!=null)
        {
            freq[temp.val+100]++;
            temp=temp.next;
        }
        temp=head;
        while(temp!=null)
        {
            if(freq[temp.val+100]==1)
            {
                temp1.val=temp.val;
                prev=temp1;
                flag=false;
                temp1=temp1.next;
            }
            temp=temp.next;
        }
        if(flag)
            return null;
        prev.next=null;
        return head;
    }
}