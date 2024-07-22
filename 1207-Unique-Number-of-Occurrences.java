class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1); 
        }
        for(int key: hm.keySet())
        {
            if(!(set.add(hm.get(key))))
            return false;
        }
        return true;
    }
}