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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0)
            return null;
        ListNode result=lists[0];
        for(int i=1;i<lists.length;i++)
        {
            result=mergenode(result,lists[i]);
        }
        return result;
    }
    public static ListNode mergenode(ListNode l1,ListNode l2)
    {
        ListNode head=null;
        ListNode temp=null;
        if(l1==null) return l2;
        if(l2==null) return l1;
        while(l1!=null&&l2!=null)
        {
            if(l1.val<=l2.val)
            {
                if(head==null)
                {
                    head=new ListNode(l1.val);
                    temp=head;
                }
                else
                {
                    temp.next=new ListNode(l1.val);
                    temp=temp.next;
                }
                l1=l1.next;
            }
            else
            {
                if(head==null)
                {
                    head=new ListNode(l2.val);
                    temp=head;
                }
                else
                {
                    temp.next=new ListNode(l2.val);
                    temp=temp.next;
                }
                l2=l2.next;
            }
            
        }
        while(l1!=null)
        {
            temp.next=new ListNode(l1.val);
            temp=temp.next;
            l1=l1.next;
        }
        while(l2!=null)
        {
            temp.next=new ListNode(l2.val);
            temp=temp.next;
            l2=l2.next;
        }
        return head;
    }
}