//Solution 1
class Solution1 {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int row = 0;
        int col = n-1;
        int count = 0;
        while(row<m && col>=0) {
            if(grid[row][col]<0) {
                count+= (m-row);
                col--;
            }
            else {
                row++;
            }
        }
        return count;
    }
}

//Solution 2
class Solution2 {
    public int countNegatives(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        for(int i=0;i<m;i++) {
            int left = 0;
            int right = n-1;
            int firstNeg = n;
            while(left<=right) {
                int mid = left+(right-left)/2;
                if(grid[i][mid]<0) {
                    firstNeg = mid;
                    right = mid-1;
                }
                else {
                    left = mid+1;
                }
            }
            count+=(n-firstNeg);
        }
        return count;
    }
}