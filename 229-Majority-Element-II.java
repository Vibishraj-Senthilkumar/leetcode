class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int k=nums.length/3;
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {   int c=0;
            for(int j=i;j<nums.length;j++)
            {   if(li.contains(nums[i]))
                    break;
                if(nums[i]==nums[j])
                {
                    c++;
                    if(c>k)
                    {
                        li.add(nums[i]);
                    }
                }
                else
                {
                    break;
                }
            }
        }
        return li;
    }
}