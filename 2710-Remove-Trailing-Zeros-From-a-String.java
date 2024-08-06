class Solution {
    public String removeTrailingZeros(String num) {
        int c=0;
        for(int i=num.length()-1;i>=0;i--)
        {
            if(num.charAt(i)=='0')
                c++;
            else
                break;
        }
        return num.substring(0,num.length()-c);
    }
}