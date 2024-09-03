class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) {
            return head;
        }
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy, prev = dummy, next = dummy;
        
        // Count the number of nodes in the list
        int count = 0;
        while (curr.next != null) {
            curr = curr.next;
            count++;
        }
        
        // Repeat the process for each group of size k
        while (count >= k) {
            curr = prev.next; // The current node
            next = curr.next; // The next node to be processed
            // Reverse k nodes
            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }
            prev = curr;
            count -= k;
        }
        return dummy.next;
    }
}
