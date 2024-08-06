class Solution {
    public String removeStars(String s) {
        Stack<Character> s1=new Stack<>();
        for(char c:s.toCharArray())
        {
            if(c=='*')
            {
                s1.pop();
            }
            else
                s1.push(c);
        }
        StringBuffer sb=new StringBuffer();
        for(char i:s1)
            sb.append(i);
        return String.valueOf(sb);
    }
}