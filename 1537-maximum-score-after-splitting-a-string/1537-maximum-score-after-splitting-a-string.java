class Solution {
    public int maxScore(String s) {
        int totalones=0;
        int onescount=0;
        int zerocount=0;
        int current=0;
        int best=0;
        for(char c:s.toCharArray())
            if(c=='1')
                totalones++;
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == '0') zerocount++;
            else onescount++;
            current=zerocount+totalones-onescount;
            best=Math.max(current,best);
        }
        return best;
    }
}