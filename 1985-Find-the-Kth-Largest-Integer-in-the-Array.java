import java.math.BigInteger;
class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Arrays.sort(nums,(a,b)->
        {
            int l=Integer.compare(b.length(),a.length());
            if(l==0)
            {
                return b.compareTo(a);
            }
            else
            {
                return l;
            }
        });
        return nums[k-1];
    }
}