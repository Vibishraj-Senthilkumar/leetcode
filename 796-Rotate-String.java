class Solution {
    public boolean rotateString(String s, String goal) {
        if(goal.length()!=s.length())
            return false;
        StringBuffer s1=new StringBuffer(goal);
        for(int i=1;i<=s.length();i++)
        {
            if(String.valueOf(s1).equals(s))
            return true;
            else
            {   
                s1.insert(0,s1.substring(s1.length()-1));
                s1.delete(s1.length()-1,s1.length());
            }
        }
        return false;
    }
}