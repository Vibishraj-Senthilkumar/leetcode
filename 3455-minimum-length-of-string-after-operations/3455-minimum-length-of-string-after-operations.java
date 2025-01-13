class Solution {
    public int minimumLength(String s) {
        char[] c=s.toCharArray();
        boolean[] b=new boolean[c.length];
        int ans=c.length;
        int f=0;
        for(int i=1;i<c.length;i++)
        {   if(!(b[i]))
        {
            int flag=0;
            for(int j=i-1;j>=0;j--)
            {
            if(c[i]==c[j]&&b[j]==false)
                {   
                    flag=1;
                    f=j;
                    break;
                }
            }
            if(flag==1)
            {
            for(int k=i+1;k<c.length;k++)
            {
                if(c[i]==c[k]&&b[k]==false)
                {
                    b[k]=true;
                    b[f]=true;
                    ans=ans-2;
                    break;
                }
            }
            }
        }
        }
        return ans;
    }
}