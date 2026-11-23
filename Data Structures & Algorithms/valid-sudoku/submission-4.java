class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for(int row=0; row<9; row++)
        {
            for(int col=0; col<9; col++)
            {
                char num = board[row][col];
                if(num == '.')
                {
                    continue;
                }

                String rowkey = "row" + row + num;
                String colkey = "col" + col + num;
                String boxkey = "box" + (row/3) + (col/3) + num;
                if(!set.add(rowkey) || !set.add(colkey) || !set.add(boxkey))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
