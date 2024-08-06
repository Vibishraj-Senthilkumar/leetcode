class Solution {
    public int countAsterisks(String s) {
        int flag=0;
        int c=0;
        for(int i=0;i<s.length();i++)
        {
            if(flag%2==0)
            {
                if(s.charAt(i)=='*')
                    c++;
            }
            if(s.charAt(i)=='|')
                flag++;
            
        }
        return c;
    }
}