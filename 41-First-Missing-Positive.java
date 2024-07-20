class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set=new TreeSet<>();
        for(int num:nums)
        set.add(num);
        int a=1;
        for(int i:set)
        {
            if(i>0)
            {
                if(i!=a)
                return a;
                a++;
            }
        }
        return a;
    }
}