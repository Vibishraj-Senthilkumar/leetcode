class Solution {
    public int equalPairs(int[][] grid) {
        int sum=0;
        for(int i=0;i<grid.length;i++)
        {   for(int k=0;k<grid.length;k++){
            int flag=0;
            for(int j=0;j<grid.length;j++)
            {
                if(grid[i][j]==grid[j][k])
                {
                    flag=1;
                }
                else
                {
                flag=0;
                break;
                }
            }
            if(flag==1)
            sum++;
        }
        }
        return sum;
    }
}