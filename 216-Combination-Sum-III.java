class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> li=new ArrayList<>();
        sum3(1,n,k,0,li,ans);
        return ans;
    }
    public void sum3(int i,int n,int k,int sum,List<Integer> li, List<List<Integer>> ans)
    {
        if(i>9|sum>=n||li.size()==k)
        {
            if(li.size()==k&&sum==n)
                ans.add(new ArrayList<>(li));
            return;
        }
        li.add(i);
        sum3(i+1,n,k,sum+i,li,ans);
        li.remove(li.size()-1);
        sum3(i+1,n,k,sum,li,ans);
    }
}