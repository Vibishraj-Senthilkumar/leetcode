class Solution {
    public void nextPermutation(int[] nums) {
    int ind=-1;
    int n=nums.length;
    int min=-1;
    int max=0;
    for(int i=n-2;i>=0;i--)
    {
        if(nums[i]<nums[i+1])
        {    min=i;
            break;
        }
    }
    if(min==-1){
        reverse(0,n-1,nums);
        return;
    }
    for(int i=n-1;i>=0;i--)
    {
        if(nums[min]<nums[i]){
        ind=i;
        break;
        }
    }
    int t=nums[ind];
    nums[ind]=nums[min];
    nums[min]=t; 
    reverse(min+1,n-1,nums); 
    }
    public void reverse(int left,int right,int[] nums)
    {
        while(left<=right)
        {
            int t=nums[left];
             nums[left++]=nums[right];
             nums[right--]=t;
        }
    }
}