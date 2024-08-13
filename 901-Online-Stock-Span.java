class StockSpanner {
List<Integer> li;
    public StockSpanner() {
        li=new ArrayList<>();
    }
    
    public int next(int price) {
        
        int count=1;
        for(int i=li.size()-1;i>=0;i--)
        {
            if(price>=li.get(i))
                count++;
            else
                break;
        }
        li.add(price);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */