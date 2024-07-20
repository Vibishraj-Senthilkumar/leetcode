class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int max=-1;
        int ans=0;
        for(int i=0;i<divisors.length;i++)
        {   int c=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j]%divisors[i]==0)
                {
                    c++;
                }
            }
                if(c>max)
                {
                max=c;
                ans= divisors[i];
                }
                else if(c==max)
                ans=Math.min(ans,divisors[i]);
        }
        return ans;
    }
}