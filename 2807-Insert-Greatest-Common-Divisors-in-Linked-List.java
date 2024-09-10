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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode temp=head;
        ListNode front=null;
        while(temp.next!=null)
        {
            front=temp.next;
            ListNode gcd=new ListNode(GCD(temp.val,front.val));
            temp.next=gcd;
            gcd.next=front;
            temp=front;
        }
        return head;
    }
    public int GCD(int m,int n)
    {
        if(n==0)
            return m;
        return GCD(n,m%n);
    }
}