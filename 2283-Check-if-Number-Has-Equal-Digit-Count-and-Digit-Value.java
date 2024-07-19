class Solution {
    public boolean digitCount(String num) {
        int[] freq = new int[10];
        for(int i=0;i<num.length();i++)
        {
            freq[Character.getNumericValue(num.charAt(i))]++;
        }
        for(int i=0;i<num.length();i++)
        {   int a=Character.getNumericValue(num.charAt(i));
            if(freq[i]==a)
            continue;
            return false;
        }
        return true;
    }
}