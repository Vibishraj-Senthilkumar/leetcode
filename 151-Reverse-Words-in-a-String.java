class Solution {
    public String reverseWords(String s) {
        String[] s1=s.split("\\s+");
        StringBuilder s2=new StringBuilder();
        for(int i=s1.length-1;i>=0;i--)
        {  
            s2.append(s1[i]);
            s2.append(" ");
        }
        System.out.println(Arrays.toString(s1));
        return String.valueOf(s2).trim();
    }
}