class Solution {
    public int maxDepth(String s) {
        int max=0,c=0,l=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                l++;
            }
            else if(s.charAt(i)==')')
            {
                c=l;
                l=l-1;
                if (max <c)
                {
                    max=c;
                }
            }
        }
        return max;
    }
}