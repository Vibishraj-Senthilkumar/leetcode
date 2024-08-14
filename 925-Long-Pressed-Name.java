class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i=0,j=0;
        while(i<typed.length())
        {
            if(j<name.length()&&typed.charAt(i)==name.charAt(j))
            {
                i++;
                j++;
            }
            else if(j>0&&typed.charAt(i)==name.charAt(j-1))
            {
                i++;
            }
            else
            {
                return false;
            }
        }
        if(j!=name.length()||i!=typed.length())
        {
            return false;
        }
        return true;
    }
}