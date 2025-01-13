class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] max=new int[nums.length-k+1];
        int j=0;
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!dq.isEmpty()&&dq.getFirst()<=i-k)
                dq.pollFirst();
            while(!dq.isEmpty()&&nums[i]>=nums[dq.getLast()])
                dq.pollLast();
            dq.offerLast(i);
            if(i>=k-1)
                max[j++]=nums[dq.getFirst()];
        }
        return max;
    }
}