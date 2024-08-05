class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hm=new HashMap<>();
        for(char c: s.toCharArray())
            hm.put(c,hm.getOrDefault(c,0)+1);
        List<Character> li = new ArrayList<>(hm.keySet());
        li.sort((a, b) -> hm.get(b) - hm.get(a));
        StringBuffer ans=new StringBuffer();
        for(char c: li)
        {
            for(int i=0;i<hm.get(c);i++)
            {
                ans.append(c);
            }
        }
        return String.valueOf(ans);
    }
}