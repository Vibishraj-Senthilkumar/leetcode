class Solution {
    public int reverse(int x) {
        long rev=0;
        while(x!=0)
        {
            rev=rev*10+(x%10);
            x/=10;
        }
        int min= -2147483648;
        int max= 2147483647;
        if(rev<min ||rev>max)
            return 0;
        return (int)rev;
    }
}