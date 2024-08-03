class Solution {
    public int maxProfit(int[] nums) {
        int max=0;
        int a=nums[0];
        for(int i=0;i<nums.length-1;i++)
        {
            if(a>nums[i])
                a=nums[i];
            if(max<(nums[i+1])-a)
            max=nums[i+1]-a;
        }
        return max;
    }
}