class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr=new int[2];
        int max=-1;
        for(int i=0;i<mat.length;i++)
        {   
            int c=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            if(c>max)
            {
                arr[0]=i;
                arr[1]=c;
                max=c;
            }
        }
        return arr;
    }
}