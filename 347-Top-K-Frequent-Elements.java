class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hm=new HashMap<>();
        for(int n:nums)
        {
            hm.put(n,hm.getOrDefault(n,0)+1);
        }
        List<Integer>li=new ArrayList<>(hm.keySet());
        li.sort((a,b)->hm.get(b)-hm.get(a));
        int[] res=new int[k];
        for(int i=0;i<k;i++)
            res[i]=li.get(i);
        return res;
    }
}