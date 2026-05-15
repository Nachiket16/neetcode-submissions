class Solution {
    public boolean isValidSudoku(char[][] board) {
        //Is valid row
        for (char[] chars : board) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < chars.length; j++) {
                char c = chars[j];
                if (c == '.') continue;
                if (!set.add(c)) {
                    return false;
                }
            }
        }

        //Is valid column
        for(int i=0; i<board[0].length; i++){
            Set<Character> set = new HashSet<>();
            for(int j=0; j<board.length; j++){
                char c = board[j][i];
                if (c == '.') continue;
                if (!set.add(c)){
                    return false;
                }
            }
        }

        for(int row=0; row<9; row+=3){
            for(int col=0; col<9; col+=3){
                Set<Character> set = new HashSet<>();
                for(int r=0; r<3; r++){
                    for(int c=0; c<3; c++){
                        char val = board[r+row][c+col];
                        if (val == '.') continue;
                        if (!set.add(val)){
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }
}
