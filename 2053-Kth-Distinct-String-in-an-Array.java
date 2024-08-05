class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm=new LinkedHashMap<>();
        int c=0;
        for(String i: arr)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(String key:hm.keySet())
        {
            if(hm.get(key)==1)
                c++;
            if(c==k)
                return key;
        }
        return "";
    }
}