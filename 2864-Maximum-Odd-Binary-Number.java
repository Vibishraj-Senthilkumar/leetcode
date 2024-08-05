class Solution {
    public String maximumOddBinaryNumber(String s) {
        int one=0; 
        int zero=0;
        StringBuffer sb=new StringBuffer();
        for(char c:s.toCharArray())
        {
            if(c-'0'==1)
                one++;
            else
                zero++;
        }
        while(one>1)
        {
            sb.append('1');
            one--;
        }
        while(zero>0)
        {
            sb.append('0');
            zero--;
        }
        sb.append('1');
        return String.valueOf(sb);
    }
}