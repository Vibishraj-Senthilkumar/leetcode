class Solution {
    public int minLength(String s) {
        Stack<Character> st=new Stack<Character>();
        for(char c:s.toCharArray())
        {   if(st.isEmpty()==false)
            {
                if((c=='B'&&st.peek()=='A') || (c=='D'&&st.peek()=='C') )
                {
                    st.pop();
                }
                else
                {
                    st.push(c);
                }
            }
            else
            {
                st.push(c);
            }
        }
        return st.size();
    }
}