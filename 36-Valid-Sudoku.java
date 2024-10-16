class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<9;i++)
        {
            set=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[i][j]>='1'&&board[i][j]<='9')
                {
                    if(!(set.add(board[i][j])))
                        return false;
                }
            }
            set=new HashSet<>();
            for(int j=0;j<9;j++)
            {
                if(board[j][i]>='1'&&board[j][i]<='9')
                {
                    if(!(set.add(board[j][i])))
                        return false;
                }
            }
        }
        for(int i=0;i<9;i+=3)
        {
            for(int j=0;j<9;j+=3)
            {
                set=new HashSet<>();
                for(int a=i;a<i+3;a++)
                {
                    for(int b=j;b<j+3;b++)
                    {
                        if(board[a][b]!='.')
                            {
                                if(!(set.add(board[a][b])))
                                    return false;
                            }
                    }
                }
            }
        }
        return true;
    }
}