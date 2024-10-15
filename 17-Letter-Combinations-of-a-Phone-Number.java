class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> li=new ArrayList<>();
        if(digits.length()==0)
            return li;
        StringBuffer sb=new StringBuffer();
        String[] str = {"", "","abc", "def","ghi","jkl", "mno", "pqrs", "tuv", "wxyz"};
        phone(li,str,sb,digits,0,0);
        return li;
    }
    public void phone(List<String> li,String[] str,StringBuffer sb,String digits,int i,int j)
    {
        if(i>=digits.length()||j>=str[digits.charAt(i)-'0'].length()||digits.length()==sb.length())
        {
            if(digits.length()==sb.length())
            {
                li.add(sb.toString());   
            }
            return;
        }
        sb.append(str[digits.charAt(i)-'0'].charAt(j));
        phone(li,str,sb,digits,i+1,0);
        sb.deleteCharAt(sb.length()-1);
        phone(li,str,sb,digits,i,j+1);
    }
}