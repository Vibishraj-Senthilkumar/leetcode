class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0;    
        Queue<Character> queue = new LinkedList<>();
        int  maxLength = 0;        
        for (char c : s.toCharArray()) {
            while (queue.contains(c)) {
                queue.poll();
            }
            queue.offer(c);
            maxLength = Math.max(maxLength, queue.size());
        }
        return maxLength;
    }
}
