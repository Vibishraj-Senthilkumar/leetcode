class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Set<List<Integer>> ans=new HashSet<>();
        List<Integer> li=new ArrayList<>();
        Arrays.sort(candidates);
        sum(candidates,target,0,candidates.length,li,ans,0);
        List<List<Integer>> res=new ArrayList<>(ans);
        return res;
    }
        public void sum(int[] nums,int sum,int ind,int n,List<Integer> li, Set<List<Integer>> ans,int temp)
    {
        if(temp>=sum||ind>=n)
        {
            if(temp==sum)
            {
                ans.add(new ArrayList<>(li));
            }
            return;
        }
        li.add(nums[ind]);
        sum(nums,sum,ind+1,n,li,ans,temp+nums[ind]);
        li.remove(li.size()-1);
        while (ind + 1 < n && nums[ind] == nums[ind + 1]) {
            ind++;
        }
        sum(nums,sum,ind+1,n,li,ans,temp);
    }
}