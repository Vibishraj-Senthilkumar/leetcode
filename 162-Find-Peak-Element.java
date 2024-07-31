class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1)
            return 0;
        if(nums[0] > nums[1]) 
            return 0;
        if(nums[nums.length-2]<nums[nums.length-1])
            return nums.length-1;
        return bs(nums,0,nums.length-1); 
    }
    public int bs(int[] nums,int low,int high)
    {
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[mid+1])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return low;
    }
}