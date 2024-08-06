class Solution {
    public boolean squareIsWhite(String coordinates) {
        int c=coordinates.charAt(0)-'a';
        c=c+coordinates.charAt(1)-'0';
        if(c%2==0)
        return true;
        return false;
    }
}