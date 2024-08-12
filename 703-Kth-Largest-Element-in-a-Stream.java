class KthLargest {
    PriorityQueue<Integer> pq;
    int k;
    public KthLargest(int k, int[] nums) {
        pq=new PriorityQueue<>(k);
        this.k=k;
        for(int i=0;i<nums.length;i++)
        {
            if(i<k)
            {
                pq.offer(nums[i]);
            }
            else
            {
                if(pq.peek()<nums[i])
                    {
                        pq.poll();
                        pq.offer(nums[i]);
                    }
            }
        }
    }
    
    public int add(int val) {
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
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */