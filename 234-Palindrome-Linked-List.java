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
    public boolean isPalindrome(ListNode head) {
        ListNode a=head;
        ListNode b=head;
        Stack<Integer>st=new Stack<>();
        while(a!=null&&a.next!=null)
        {   st.push(b.val);
            a=a.next.next;
            b=b.next;
        }
        if(a!=null)
            b=b.next;
        while(b!=null)
        {
            if(st.pop()!=b.val)
                return false;
            b=b.next;
        }
        return true;
    }
}