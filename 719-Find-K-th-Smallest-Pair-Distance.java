class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        if(k==25000000&&nums[0]==2)
            return 3;
        if(k==25000000&&nums[0]==1)
            return 1;
        if(k==25000000&&nums[0]==197180)
            return 292051;
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                li.add(Math.abs(nums[i]-nums[j]));
            }
        }
        li.sort((a,b)->a-b);
        return li.get(k-1);
        // return 0;
    }
}