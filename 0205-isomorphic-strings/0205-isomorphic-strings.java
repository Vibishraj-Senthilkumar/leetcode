class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] ori=new int[256];
        int[] dup=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(ori[a]!=dup[b])
                return false;
            else
                ori[a]=i+1;
                dup[b]=i+1;
        }
        return true;
    }
}