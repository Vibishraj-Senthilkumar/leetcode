class Solution {
    public int mySqrt(int x) {
        return bs(0,x,x);
    }
    \t int bs(long low,long high,long x)
\t {  
\t     while(low<=high)
\t     {
\t         long mid=low+(high-low)/2;
\t         if(mid*mid==x)
\t         {
\t             return (int)mid;
\t         }
\t         else if(mid*mid<x)
\t         {
\t             low=mid+1;
\t         }
\t         else
\t         {
\t             high=mid-1;
\t         }
\t     }
\t     return (int)high;
}
}