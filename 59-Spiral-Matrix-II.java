class Solution {
    public int[][] generateMatrix(int n) {
        int[][] matrix=new int[n][n];
        int top=0;
        int bottom=n-1;
        int left=0;
        int right=n-1;
        int val=1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                matrix[top][i]=val++;
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                matrix[i][right]=val++;
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    matrix[bottom][i]=val++;
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i= bottom;i>=top;i--)
                {
                    matrix[i][left] =val++;
                }
                left++;
            }
        }
        return matrix;
    }
}