class Solution {
    public String generateTheString(int n) {
       StringBuffer s=new StringBuffer();
        if(n%2==0)
        {
            s.repeat('a',n-1);
            s.append('b');
        }
        else
        {
            s.repeat('a',n);
        }
        return s.toString();
    }
}