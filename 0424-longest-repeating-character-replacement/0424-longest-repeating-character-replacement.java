class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0, r = 0;
        int[] hash = new int[26];
        int maxlen = 0, maxf = 0;
        ;
        while (r < s.length()) {
            hash[s.charAt(r) - 'A']++;
            maxf = Math.max(maxf, hash[s.charAt(r) - 'A']);
            while ((r - l + 1) - maxf > k) {
                hash[s.charAt(l) - 'A']--;
                l++;
                for (int i = 0; i < 26; i++) {
                    maxf = Math.max(maxf, hash[i]);
                }
            }
            if ((r - l + 1) - maxf <= k)
                maxlen = Math.max(r - l + 1, maxlen);
            r++;
        }
        return maxlen;
    }
}