class Solution {
    public void sortColors(int[] nums) {
        int zero=0;
        int ones=0;
        int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            zero++;
            else if(nums[i]==1)
            ones++;
        }
        for(int i=0;i<zero;i++)
        {
            nums[j++]=0;
        }
        for(int i=0;i<ones;i++)
        {
            nums[j++]=1;
        }
        for(int i=j;i<nums.length;i++)
        {
            nums[j++]=2;
        }
    }

}
