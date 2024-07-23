class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=-2,n=-1;
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                arr[p+=2]=nums[i];
            else
                arr[n+=2]=nums[i];
        }
        return arr;
    }
}
