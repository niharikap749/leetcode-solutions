class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = 9;
        for(int i=0;i<n;i++) {
            boolean[] seen = new boolean[10];
            for(int j=0;j<n;j++) {
                char c = board[i][j];
                if(c!='.') {
                    int num = c-'0';
                    if(seen[num]) return false;
                    seen[num] = true;
                }
            }
        }
        for(int j=0;j<n;j++) {
            boolean[] seen = new boolean[10];
            for(int i=0;i<n;i++) {
                char c = board[i][j];
                    if(c!='.') {
                        int num = c-'0';
                        if(seen[num]) return false;
                        seen[num] = true;
                    }
            }
        }
        for(int i=0;i<n;i+=3) {
            for(int j=0;j<n;j+=3) {
                boolean[] seen = new boolean[10];
                for(int row=0;row<3;row++) {
                    for(int col=0;col<3;col++) {
                        char c = board[i+row][j+col];
                        if(c!='.') {
                            int num = c-'0';
                            if(seen[num]) return false;
                            seen[num] = true;
                        }
                    }
                }
            }
        }
        return true;
    }
}