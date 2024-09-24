class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),result);
        return result;
    }
    public void backtrack(int[] nums,int start,List<Integer>li,List<List<Integer>> result)
    {
        result.add(new ArrayList<>(li));
        for(int i=start;i<nums.length;i++){
            li.add(nums[i]);
            backtrack(nums,i+1,li,result);
            li.remove(li.size()-1);
        }
    }
}