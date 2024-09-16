class Solution {
    public int findMinDifference(List<String> timePoints) {
       int value=0,minutes=0,abs=0,min=1440;
       List<Integer>li=new ArrayList<>();
        for(String s:timePoints)
        {
            value= (s.charAt(0)-'0')*1000+(s.charAt(1)-'0')*100+(s.charAt(3)-'0')*10+(s.charAt(4)   -'0');
            minutes=((value/100)*60)+(value%100);
            li.add(minutes);
        }
        Collections.sort(li);
        for(int i=1;i<li.size();i++)
        {
            if(min>li.get(i)-li.get(i-1))
                min=li.get(i)-li.get(i-1);
        }
        if(min>1440-(li.get(li.size()-1)-li.get(0)))
            min=1440-(li.get(li.size()-1)-li.get(0));
        return min;
    }
}