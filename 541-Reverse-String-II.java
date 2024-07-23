class Solution {
    public String reverseStr(String s, int k) {
        StringBuffer s1=new StringBuffer();
        StringBuffer s2=new StringBuffer();
        int c=0;
        for(int i=0;i<s.length()-k+1;i+=k)
        {
            s1.append(s.substring(i,i+k));
            if(c%2==0)
            s1.reverse();
            s2.append(s1);
            s1=new StringBuffer();
            c++;
        }
        // if(s.length()%2!=0)
        // s2.append(s.charAt(s.length()-1));
        // int i=s2.length();
        if(s.length()!=s2.length())
        {
            s1.append(s.substring(s2.length()));
            if(c%2==0)
            s1.reverse();
            s2.append(s1);
        }
        return String.valueOf(s2);
    }
}