class Solution {
    public int pivotInteger(int n) {
        int left=1,right=n;
        int sum=(n*(n+1))/2;
        while(left<=right)
        {
            int mid=left+(right-left)/2;
            int arrsum=(mid*(mid+1))/2;
            if(arrsum==(sum-arrsum+mid))
                return mid;
            else if(arrsum<(sum-arrsum+mid))
                left=mid+1;
            else
                right=mid-1;
        }
        return -1;
    }
}