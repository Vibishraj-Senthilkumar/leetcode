class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        StringBuffer sb=new StringBuffer();
        paranthesis(0,0,ans,n,sb);
        return ans;
    }
    public void paranthesis(int left,int right,List<String> ans,int n,StringBuffer sb)
    {
        if(left==n&&right==n)
        {
            ans.add(sb.toString());
            return;
        }
        if(left<n)
        {
            sb.append('(');
            paranthesis(left+1,right,ans,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right<n&&right<left)
        {
            sb.append(')');
            paranthesis(left,right+1,ans,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}