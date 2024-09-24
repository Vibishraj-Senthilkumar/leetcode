class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),res);
        return res;
    }
    public void backtrack(int[] nums,int start,List<Integer>li,List<List<Integer>>res)
    {
        res.add(new ArrayList<>(li));
        for(int i=start;i<nums.length;i++)
        {
            if(i>start&&nums[i]==nums[i-1]) continue;
            li.add(nums[i]);
            backtrack(nums,i+1,li,res);
            li.remove(li.size()-1);
        }
    }
}