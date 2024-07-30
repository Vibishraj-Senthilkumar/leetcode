class Solution {
    public int search(int[] nums, int target) {
        return bs(nums,0,nums.length-1,target);
    }
    public int bs(int[] nums,int left,int right,int key)
    {
        while(left<=right)
        {
            int mid=left+right-left/2;
            if(nums[mid]==key)
                return mid;
            else if(nums[mid]>key)
                right=mid-1;
            else if(nums[mid]<key)
                left=mid+1;
        }
        return -1;
    }
}