class Solution {
    public int minimumPushes(String word) {
        int[] freq=new int[26];
        for(char c:word.toCharArray())
            freq[c-'a']++;
        Arrays.sort(freq);
        int c=0;
        int mul=1;
        int ans=0;
        for(int i=25;i>=0;i--)
        {  
            if(freq[i]!=0)
            {
                if(c==8)
                {
                    c=0;
                    mul++;
                }
                ans+=(freq[i]*mul);
                c++;
            }
            else
            {
                break;
            }
        }
        return ans;
    }
}