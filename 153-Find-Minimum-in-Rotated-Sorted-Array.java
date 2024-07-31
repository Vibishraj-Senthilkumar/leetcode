class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if(nums[low]<nums[high])
            return nums[0];
        return bs(nums,low,high);        
    }
    public int bs(int[] nums,int low,int high)
    {  int min=5001; 
        while(low<=high)
        {   
            int mid=low+(high-low)/2;
            if(nums[mid]<min)
                min=nums[mid];
            else if(nums[mid]>=nums[high])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return min;
    }
}