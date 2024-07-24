class Solution {
    public int[] sortJumbled(int[] mapping, int[] nums) {
        pair[] p=new pair[nums.length];
        StringBuffer s= new StringBuffer();
        for(int i=0;i<nums.length;i++)
        {   int a=nums[i];
        int f=1;
        int mapp=0;
            if(a>0)
            {   while(a>0){
                mapp+=mapping[a%10]*f;
                f*=10;
                a/=10;
                }
                p[i]=new pair(nums[i],mapp);
            }
            else
                p[i]=new pair(nums[i],mapping[0]);
        }
        Arrays.sort(p,(a,b)->a.map-b.map);
        for(int i=0;i<nums.length;i++)
            nums[i]=p[i].val;
        return nums;
    }
}
class pair
{
    int val;
    int map;
    public pair(int val,int map)
    {
        this.val=val;
        this.map=map;
    }
}