class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] freq=new int[1001];
        int max=0;
        for(int i=0;i<nums.length-1;i++)
            if(nums[i]==key)
                freq[nums[i+1]]++;
        int target=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max<freq[nums[i]])
            {
                target=nums[i];
                max=freq[nums[i]];
            }
        }
        return target;
        
    }
}