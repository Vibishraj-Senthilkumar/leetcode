class Solution {
    public int[] findArray(int[] pref) {
        int[] or=new int[pref.length];
        or[0]=pref[0];
        for(int i=1;i<pref.length;i++)
        {
            or[i]=pref[i-1]^pref[i];
        }
        return or;
    }
}