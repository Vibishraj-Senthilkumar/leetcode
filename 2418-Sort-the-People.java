class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        TreeMap<Integer,String> tm=new TreeMap<>(Comparator.reverseOrder());
        int j=0;
        for(int i=0;i<names.length;i++)
        {
            tm.put(heights[i],names[i]);
        }
        for(Map.Entry<Integer,String> t:tm.entrySet())
        {
            names[j++]=t.getValue();
        }
        return names;
    }
}