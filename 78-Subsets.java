class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),result);
        return result;
    }
    public void backtrack(int[] nums,int ind,List<Integer>li,List<List<Integer>> result)
    {
        if(ind==nums.length)
        {
            result.add(new ArrayList<>(li));
            return;
        }
            li.add(nums[ind]);
            backtrack(nums,ind+1,li,result);
            li.remove(li.size()-1);
            backtrack(nums,ind+1,li,result);
        
    }
}