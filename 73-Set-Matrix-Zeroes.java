class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row =new HashSet<>(); 
        Set<Integer> column =new HashSet<>(); 
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    row.add(i);
                    column.add(j);
                }
            }
        }
        for(int i:row)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                matrix[i][j]=0;
            }
        }
        for(int i:column)
        {
            for(int j=0;j<matrix.length;j++)
            {
                matrix[j][i]=0;
            }
        }
    }
}