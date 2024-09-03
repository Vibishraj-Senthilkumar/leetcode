class Solution {
    public int getLucky(String s, int k) {
        int sum=0;
        for(char s1:s.toCharArray())
        {
           sum=sum+ sumdigit(s1-96);
        }
        for(int i=1;i<k;i++)
        {
            sum=sumdigit(sum);
        }
        return sum;
    }
    public int sumdigit(int num)
    {
        int sum=0;
        while(num!=0)
        {
            sum=sum+num%10;
            num/=10;
        }
        return sum;
    }
}