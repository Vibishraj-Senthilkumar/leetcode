class Solution {
    public long subArrayRanges(int[] nums) {
        return max(nums)-min(nums);
    }

    public static long min(int[] arr) {
        Stack<Integer> st;
        st = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n];
        int[] nge = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();
            nge[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        st = new Stack<Integer>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i])
                st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        long mod = (1000000007);
        long total = 0;
        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nge[i] - i;
            total =total + (left * right * arr[i]);
        }
        return total;
    }

    public static long max(int[] arr) {
        Stack<Integer> st;
        st = new Stack<>();
        int n = arr.length;
        int[] pse = new int[n]; // Previous Smaller Element
        int[] nse = new int[n]; // Next Smaller Element

        // Calculate Previous Greater Element (PGE) and Next Greater Element (NGE)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i])
                st.pop();
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i])
                st.pop();
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // Calculate the sum of subarray maximums
        long mod = 1000000007;
        long total = 0;
        for (int i = 0; i < n; i++) {
            long left = i - pse[i];
            long right = nse[i] - i;
            total = total + (left * right * arr[i]);
        }
        return  total;

    }
}