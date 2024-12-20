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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=null;
        if(list1==null||list2==null)
        {
            if(list1==null)
                return list2;
            else
                return list1;
        }
        if(list1.val<=list2.val)
        {
            temp=list1;
            list1=list1.next;
        }
        else
        {
            temp=list2;
            list2=list2.next;
        }
        ListNode head=temp;
        while(list1!=null&&list2!=null)
        {
            if(list1.val<=list2.val)
            {
                head.next=list1;
                list1=list1.next;
            }
            else
            {
                head.next=list2;
                list2=list2.next;
            }
            head=head.next;
        }
        while(list1!=null)
        {
            head.next=list1;
            list1=list1.next;
            head=head.next;
        }
        while(list2!=null)
        {
            head.next=list2;
            list2=list2.next;
            head=head.next;
        }
        return temp;
    }
}