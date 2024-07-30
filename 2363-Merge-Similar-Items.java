class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer,Integer> tm=new TreeMap<Integer,Integer>() ;
        for(int i=0;i<items1.length;i++)
        {
                tm.put(items1[i][0],tm.getOrDefault(items1[i][0],0)+items1[i][1]);
        }
        for(int i=0;i<items2.length;i++)
        {
                tm.put(items2[i][0],tm.getOrDefault(items2[i][0],0)+items2[i][1]);
        }
        List<List<Integer>> list = new ArrayList<>();
        for(int key:tm.keySet())
        {  
            list.add(List.of(key,tm.get(key)));
        }
        return list;
    }
}