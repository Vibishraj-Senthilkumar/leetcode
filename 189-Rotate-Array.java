class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    public void rev(int[]arr,int a,int b)
    {
        while(a<=b)
        {
            int t= arr[a];
            arr[a++]=arr[b];
            arr[b--]=t;
        }
    }
}