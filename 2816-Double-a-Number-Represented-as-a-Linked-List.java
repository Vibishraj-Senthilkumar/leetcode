class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length-1;
        int l=0;
        while(l<=n)
        {
         char t = arr[l] <= arr[n] ? arr[l] : arr[n];
            arr[l++]=t;
            arr[n--]=t;
        }

        return new String(arr);
    }
}