class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] arr={-1,-1};
        int l=0,r=nums.length-1;
        arr[0]=bs(nums,l,r,true,target);
        arr[1]=bs(nums,l,r,false,target);
        return arr;
    }
    public int bs(int[] arr,int l,int r,boolean flag,int x)
    {   int ind=-1;
        while(l<=r)
        {
            int m=l+(r-l)/2;
            if(arr[m]>x)
                r=m-1;
            else if(arr[m]<x)
                l=m+1;
            else
            {
                ind=m;
                if(flag)
                    r=m-1;
                else
                    l=m+1;
            }
        }
        return ind;
    }
}