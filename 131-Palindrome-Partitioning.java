class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans=new ArrayList<>();
       palindrome(0,s,new ArrayList<>(),ans);
       return ans; 
    }
    public static void palindrome(int index,String s,List<String>li,List<List<String>> ans)
    {
        if(index==s.length())
        {
            ans.add(new ArrayList<>(li));
            return ;
        }
        for(int i=index;i<s.length();i++)
        {
            if(ispalindrome(s.substring(index,i+1)))
                {
                li.add(s.substring(index,i+1));
                palindrome(i+1,s,li,ans);
                li.remove(li.size()-1);
                }
        }
    }
    public static boolean ispalindrome(String s1)
    {
        return s1.equals(new StringBuffer(s1).reverse().toString());
    }
}