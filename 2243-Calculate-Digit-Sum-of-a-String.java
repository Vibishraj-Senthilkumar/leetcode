class Solution {
    public String digitSum(String s, int k) {
        StringBuffer str= new StringBuffer(s);
        StringBuffer cal= new StringBuffer();
        while(str.length()>k)
        {  int sum=0;
            for(int i=0;i<str.length();i++)
            {   if(i!=0&&i%k==0)
                {
                    cal.append(String.valueOf(sum));
                    sum=0;
                }
                sum+=str.charAt(i)-'0';
            }
            cal.append(String.valueOf(sum));
            str=cal;
            cal=new StringBuffer();
        }
        return String.valueOf(str);
    }
}