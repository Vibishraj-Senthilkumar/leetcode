class Solution {
    public int minimumChairs(String s) {
        int c=0;
        int max=-1;
        for(char c1:s.toCharArray())
        {
            if(c1=='E')
                c++;
            if(c>max)
            {
                max=c;
            }
            if(c1=='L')
            {
                c--;
            }
        }
        return max;
    }
}