class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        double min=Double.MAX_VALUE;
        int a=0;
        int b=nums.length-1;
        while(a<=b)
        {
            double c=(nums[a]+nums[b])/2.;
            a++;
            b--;
            if(min>c)
            {
                min=c;
            }
        }
        return min;
    }
}