class Solution {
    public char findTheDifference(String s, String t) {
        int x=0;
        for(char s1:s.toCharArray()) x^=s1;
        for(char t1:t.toCharArray()) x^=t1;
        return (char)x;
    }
}