class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        boolean[] bool =new boolean[nums.length+1];
        int arrsum=0;
        for(int num:nums)
        {   arrsum+=num;
            if(bool[num])
                {
                    arr[0]=num;
                }
            bool[num]=true;
        }
        int n=nums.length;
        int total=(n*(n+1))/2;
        arr[1]=total-(arrsum-arr[0]);
        return arr;


    }
}