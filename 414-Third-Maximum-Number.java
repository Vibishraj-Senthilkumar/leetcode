class Solution {
    PriorityQueue<Integer> pq=new PriorityQueue<>();
    public int thirdMax(int[] nums) {
        for(int n:nums)
            add(n);
        if(pq.size()==2)
        {
            pq.poll();
        }
        return pq.peek();
    }
    public void add(int val)
    {
        if(!(pq.contains(val)))
        {
            if(pq.size()==3)
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
}