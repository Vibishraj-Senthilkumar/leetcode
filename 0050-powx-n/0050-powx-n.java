class Solution {
        static double pow=1;
    public double myPow(double x, int n) {
        if(n==0)
            return 1;
        else if(n>0)
        return pos(x,x,n);
        else
        return 1/pos(x,x,(long)n*-1);
    }
    public double pos(double x,double ans, long n) {
        if(n==1)
            return ans;
        if(n%2==0)
            return pos(x*x,ans*x,n/2);
        else
            return x*pos(x*x,x*ans,n/2);
        
    }

}