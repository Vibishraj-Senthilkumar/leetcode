class Solution {
    public String sortSentence(String s) {
        String[] s1=s.split(" ");
        StringBuffer sb= new StringBuffer();
        TreeMap<Integer,String> tm=new TreeMap<>();
        for(String i:s1)
        {
            tm.put(Integer.parseInt(i.substring(i.length()-1)),i.substring(0,i.length()-1));
        }
        for(String i:tm.values())
        {
            sb.append(i);
            sb.append(" ");
        }
        return String.valueOf(sb).trim();
    }
}