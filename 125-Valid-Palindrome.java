class Solution {
    public boolean isPalindrome(String s) {
        StringBuffer sb=new StringBuffer();
        String s1=s.toLowerCase();
        for(char c:s1.toCharArray())
        {
            if(c>='a'&&c<='z'||c>='0'&&c<='9')
                sb.append(c);
        }
        return (sb.toString()).equals(sb.reverse().toString());
    }
}