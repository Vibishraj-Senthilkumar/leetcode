class Solution {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    int k;
    public int findKthLargest(int[] nums, int k) { 
        this.k=k;
       for(int n:nums)
            add(n);
    return pq.peek(); 
    }
    public void add(int val)
    {
        if(pq.size()==k)
        {
            if(pq.peek()<val)
            {
                pq.poll();
                pq.offer(val);
            }
        }
        else
        {
            pq.offer(val);
        }
    }
}