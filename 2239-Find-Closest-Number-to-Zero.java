class Solution {
    public int findClosestNumber(int[] nums) {
        int min=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(min+nums[i]==0)
                min=min>0?min:nums[i];
            else if(Math.abs(min)>Math.abs(nums[i]))
                min=nums[i];
        }
        return min;
    }
}