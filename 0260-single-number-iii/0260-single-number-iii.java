class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        List<Integer> li=new ArrayList<>();
        int n=nums.length;
        int i=1;
        while(i<n)
        {
            if(nums[i]!=nums[i-1])
            {
                li.add(nums[i-1]);
                i++;
            }
            else
                i+=2;
        }
        if((nums[n-1]^nums[n-2])!=0)
            li.add(nums[n-1]);
        int[] ans=new int[li.size()];
        for(int j=0;j<li.size();j++)
        {
            ans[j]=li.get(j);
        }
        return ans;
    }
}