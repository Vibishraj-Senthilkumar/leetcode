/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode>set=new HashSet<>();
        while(headA!=null&&headB!=null)
        {
            if(!(set.add(headA)))
            {
                return headA;
                
            }
            if(!(set.add(headB)))
            {
                return headB;
                
            }
            headA=headA.next;
            headB=headB.next;
        }
        while(headA!=null)
        {
            if(!(set.add(headA)))
            {
                return headA; 
            }
            headA=headA.next;
        }
        while(headB!=null)
        {
            if(!(set.add(headB)))
            {
                return headB; 
            }
            headB=headB.next;
        }
        return null;
    }
}