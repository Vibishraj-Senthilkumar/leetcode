class Solution {
    public int sumSubarrayMins(int[] arr) {
        Stack<Integer> st;
        st=new Stack<>();
        int n=arr.length;
        int[] pse=new int[n];
        int[] nge=new int[n];
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty()&&arr[st.peek()]>=arr[i])
                st.pop();
            nge[i]=st.isEmpty()?n:st.peek();
            st.push(i);
        }
        st=new Stack<Integer>();
        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty()&&arr[st.peek()]>arr[i])
                st.pop();
            pse[i]=st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        long mod=(1000000007);
        long total=0;
        for(int i=0;i<n;i++)
        {
           long left=i-pse[i];
           long right=nge[i]-i;
            total=(total+(left*right*arr[i])%mod)%mod;
        }
        return (int)total;
    }
}