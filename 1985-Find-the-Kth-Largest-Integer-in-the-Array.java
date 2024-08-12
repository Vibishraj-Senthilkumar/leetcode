import java.math.BigInteger;
class Solution {
    PriorityQueue<BigInteger> pq=new PriorityQueue<>();
    int k;
    public String kthLargestNumber(String[] nums, int k) {
        this.k=k;
       for(String n:nums)
            add(new BigInteger(n));
    return String.valueOf(pq.peek()); 
    }
    public void add(BigInteger val)
    {
        if(pq.size()==k)
        {
            if(pq.peek().compareTo(val)<=0)
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