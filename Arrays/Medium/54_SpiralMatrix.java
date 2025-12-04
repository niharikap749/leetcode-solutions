import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        if(matrix==null || matrix.length==0) return result;
        int m = matrix.length, n = matrix[0].length;
        int rowStart = 0, rowEnd = m-1, colStart = 0, colEnd = n-1;
        while(rowStart<=rowEnd && colStart<=colEnd) {
            for(int col=colStart;col<=colEnd;col++) {
                result.add(matrix[rowStart][col]);
            }
            rowStart++;
            if(rowStart<=rowEnd) {
                for(int row=rowStart;row<=rowEnd;row++) {
                  result.add(matrix[row][colEnd]);
                }
            }
            colEnd--;
            if(rowStart<=rowEnd && colStart<=colEnd) {
                for(int col=colEnd;col>=colStart;col--) {
                  result.add(matrix[rowEnd][col]);
                }
            }
            rowEnd--;
            if(rowStart<=rowEnd && colStart<=colEnd) {
                for(int row=rowEnd;row>=rowStart;row--) {
                  result.add(matrix[row][colStart]);
                }
            }
            colStart++;
        }
        return result;
    }
}

