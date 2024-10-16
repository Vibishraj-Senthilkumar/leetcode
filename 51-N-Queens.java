class Solution {
    boolean[][] visited;
    public List<List<String>> solveNQueens(int n) {
        visited=new boolean[n][n];
        List<List<String>> ans=new ArrayList<>();
        nqueen(ans,n,0,0);
        return ans;
    }
    public void nqueen(List<List<String>> ans,int n,int i,int j)
    {
        if(i==n)
        {   
            convertor(n,ans);
            return;
        }
        if(j>=n)
            return;
        if (isSafe(i, j, n)) {
            visited[i][j] = true; 
            nqueen(ans, n, i + 1, 0);
            visited[i][j] = false;
        }
        nqueen(ans,n,i,j+1);
    }
    public void convertor(int n,List<List<String>> ans){
        boolean[][] tempArr = new boolean[n][n];
        StringBuffer sb = new StringBuffer();
        List<String> inner = new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(visited[i][j]){
                    sb.append(\Q\);
                }
                else{
                    sb.append(\.\);
                }
            }
            inner.add(sb.toString());
            sb.setLength(0);
        }
        ans.add(new ArrayList<>(inner));
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