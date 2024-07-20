class Solution {
    public String findDifferentBinaryString(String[] nums) {
        StringBuffer sb= new StringBuffer();
        for(int i=0;i<nums.length;i++)
        {   if(nums[i].charAt(i)=='0')
            sb.append('1');
            else
            sb.append('0');
        }
        return sb.toString();
    }
}