class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        Set<List> set=new HashSet<>();
        backtrack(nums,0,new ArrayList<>(),set);
        List<List<Integer>>res=new ArrayList<>();
        for(List s:set)
        {
            res.add(s);
        }
        return res;
    }
    public void backtrack(int[] nums,int start,List<Integer>li,Set<List> set)
    {
        set.add(new ArrayList<>(li));
        for(int i=start;i<nums.length;i++)
        {
            li.add(nums[i]);
            backtrack(nums,i+1,li,set);
            li.remove(li.size()-1);
        }
    }
}