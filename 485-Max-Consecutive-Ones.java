class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int one=0,max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            one++;
            else
            {
            if(max<one)
                max=one;
                one=0;
            }
        }
            if(max<one)
                max=one;
    return max;
    }
}