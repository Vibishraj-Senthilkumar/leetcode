class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int temp=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                ++count;
            else if(s.charAt(i)==')')
            {
                --count;
                if(count<0)
                {
                    temp++;
                    count=0;
                }
            }
        }
        return count+temp;
    }
}