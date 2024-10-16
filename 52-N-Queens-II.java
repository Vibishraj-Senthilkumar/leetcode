class Solution {
    int ans;
    boolean[][] visited;
    public int totalNQueens(int n) {
        visited=new boolean[n][n];
        nqueen(n,0,0);
        return ans;
    }
    public void nqueen(int n,int i,int j)
    {
        if(i==n)
        {   
            ans++;
            return;
        }
        if(j>=n)
            return;
        if (isSafe(i, j, n)) {
            visited[i][j] = true; 
            nqueen( n, i + 1, 0);
            visited[i][j] = false;
        }
        nqueen(n,i,j+1);
    }
     public boolean isSafe(int i,int j,int n)
    {
        int temp1=i,temp2=j;
        while(temp1>=0&&temp2<n)
        {
            if(visited[temp1--][temp2++])
                return false;
        }
        temp1=i;temp2=j;
        while(temp1<n&&temp2>=0)
        {
            if(visited[temp1++][temp2--])
                return false;
        }
        temp1=i;temp2=j;
        while(temp2<n&&temp1<n)
        {
            if(visited[temp1++][temp2++])
                return false;
        }
        temp1=i;temp2=j;
        while(temp1>=0&&temp2>=0)
        {
            if(visited[temp1--][temp2--])
                return false;
        }
        for(int len=0;len<n;len++)
        {
            if(visited[len][j])
                return false;
        }
        for(int len=0;len<n;len++)
        {
            if(visited[i][len])
                return false;
        }

        return true; 
    }
}