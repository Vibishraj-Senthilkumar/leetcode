class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> li=new ArrayList<>();
            for(int i=1;i<=numRows;i++)
        {   
            List<Integer> al=new ArrayList<>();
            int k=1;
            for(int j=1;j<=i;j++)
            {
                al.add(k);
                k=k*(i-j)/j;
            }
            li.add(al);
        }
        return li;
    }
}