class Solution {
    public void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix.length;j++)
            {
                int t=matrix[i][j];
               matrix[i][j]=matrix[j][i];
               matrix[j][i]=t;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {  int a=0,b=matrix.length-1;
             while(a<b)
             {
                int t=matrix[i][a];
               matrix[i][a]=matrix[i][b];
               matrix[i][b]=t;
               a++;
               b--; 
             }
        }    
    }
}