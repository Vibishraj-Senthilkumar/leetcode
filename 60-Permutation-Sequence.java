class Solution {
    public String getPermutation(int n, int k) {
        int[] nums=new int[n];
        for(int i=1;i<=n;i++)
        {
            nums[i-1]=i;
        }
    List<Integer>list=new ArrayList<>();
    List<List<Integer>> ans=new ArrayList<>();
    boolean[] freq=new boolean[n];
    permutate(nums,list,ans,freq,k);
    StringBuffer s=new StringBuffer();
    for(int i: ans.get(k-1))
    {
        s.append(i);
    }
    return String.valueOf(s);

    }
    public void permutate(int[] nums,List<Integer>list,List<List<Integer>> ans,boolean[] freq,int k)
    {
        if(nums.length==list.size())
        {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(ans.size()!=k)
        {
            for(int i=0;i<nums.length;i++)
            {
                if(!freq[i])
                {
                    freq[i]=true;
                    list.add(nums[i]);
                    permutate(nums,list,ans,freq,k);
                    list.remove(list.size()-1);
                    freq[i]=false;
                }
            }
        }
    }
}