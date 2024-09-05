class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
       int m=rolls.length;
       int totalrolls=n+m;
       int totalsum=mean*totalrolls;
       int rollsum=0;
       for(int i:rolls)
           rollsum+=i;
        int missing=totalsum-rollsum;
        if(missing<n||missing>6*n)
            return new int[0];
        int[] ans=new int[n];
        int base=missing/n;
        int extra=missing%n;
        for(int i=0;i<n;i++)
        {
            ans[i]=base+(i<extra?1:0);
        }
        return ans;


    }
}