class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(x==nums[i])
            {
                nums[k++]=i;
            }
        }
        for(int i=0;i<queries.length;i++)
        {
            if(queries[i]<=k)
            queries[i]=nums[queries[i]-1];
            else
            queries[i]=-1;
        }
        return queries;
    }
}