class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer>li=new ArrayList<>();
        for(int i=0;i<matrix.length;i++)
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==min(matrix,i)&&matrix[i][j]==max(matrix,j))
                li.add(matrix[i][j]);
            }
            return li;
        }
    
    public int min(int matrix [][],int i)
    {
        int m=Integer.MAX_VALUE;
        for(int j=0;j<matrix[0].length;j++)
        {
            if(m>matrix[i][j])
            m=matrix[i][j];
        }
        return m;
    }
    public int max(int matrix [][],int j)
    {
        int m=0;
        for(int i=0;i<matrix.length;i++)
        {
            if(m<matrix[i][j])
            m=matrix[i][j];
        }
        return m;
    }
}