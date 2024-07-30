class Solution {
    public int search(int[] nums, int k) {
        return bs(nums,0,nums.length-1,k);
    }
    public int bs(int[] nums,int left,int right,int k)
    {
        while(left<=right)
        {
            int mid=left+right-left/2;
            if(nums[mid]==k)
                return mid;
            else if(nums[left]<=nums[mid])
            {
                if(k>=nums[left]&&k<=nums[mid])
                    right=mid-1;
                else
                    left=mid+1;
            }
            else 
            {
                if(k>=nums[mid]&&nums[right]>=k)
                        left=mid+1;
                else
                     right=mid-1;
            }
        }
        return -1;
    }
}