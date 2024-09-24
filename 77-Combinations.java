class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,new ArrayList<>(),1,n,k);
        return ans;
    }
    public void backtrack(List<List<Integer>> ans,List<Integer> li,int start,int n,int k)
    {
        if(li.size()==k)
        {
            ans.add(new ArrayList<>(li));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            li.add(i);
            backtrack(ans,li,i+1,n,k);
            li.remove(li.size()-1);
        }
    }
}