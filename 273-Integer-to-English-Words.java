class Solution {
        String[] ones = {\\, \One\, \Two\, \Three\, \Four\, \Five\, \Six\, \Seven\, \Eight\, \Nine\, \Ten\,\Eleven\, \Twelve\, \Thirteen\, \Fourteen\, \Fifteen\, \Sixteen\, \Seventeen\, \Eighteen\, \Nineteen\ };
        String[] tens = {\\,\\, \Twenty\, \Thirty\, \Forty\, \Fifty\, \Sixty\, \Seventy\, \Eighty\, \Ninety\ };
        String[] hun = {\\, \Thousand\, \Million\, \Billion\ };
    public String numberToWords(int num) {
        if(num==0)
            return \Zero\;
        String word=\\;
        int i=0;
        while(num>0)
        {
            if(num%1000!=0)
            {
                word=count(num%1000)+hun[i]+\ \+word;
            }
            num/=1000;
            i++;
        }
        return word.trim();
    }
    public String count(int num)
    {
        if(num==0)
            return \\;
        else if(num<20)
        {
            return ones[num]+\ \;
        }
        else if(num<100)
        {
            return tens[num/10]+\ \+count(num%10);
        }
        else
        {
            return ones[num/100]+\ Hundred \+count(num%100);
        }

    }
}