class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(x==nums[i])
            {
                li.add(i);
            }
        }
        for(int i=0;i<queries.length;i++)
        {
            try
            {
                queries[i]=li.get(queries[i]-1);
            }
            catch(Exception e)
            {
                queries[i]=-1;
            }
        }
        return queries;
    }
}