class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li=new ArrayList<>();
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        while(top<=bottom && left<=right)
        {
            for(int i=left;i<=right;i++)
            {
                li.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++)
            {
                li.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    li.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right)
            {
                for(int i= bottom;i>=top;i--)
                {
                    li.add(matrix[i][left]);
                }
                left++;
            }
        }
        return li;
    }
}