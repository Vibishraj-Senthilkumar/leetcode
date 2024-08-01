class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> st=new Stack<>();
        StringBuffer s1= new StringBuffer();
        int count=0;
        for(char i:s.toCharArray())
        {
            if(i=='(')
            {
                st.push(i);
                count++;
            }
            else
            {
                st.push(i);
                count--;
            }
            if(count==0)
                {
                for(int j=1;j<=st.size()-2;j++)
                        {
                            s1.append(st.get(j));
                        }
                        st.clear();
                }

        }
        return String.valueOf(s1);
    }
}