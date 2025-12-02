import java.util.*;
class Solution {
    HashMap<String,Integer> map = new HashMap<>();
    public int generateHelper(int row,int col) {
        if(row==0 || col==0 || row==col) return 1;
        String key = Integer.toString(row) + " " + Integer.toString(col);
        if(map.containsKey(key)) return map.get(key);
        int res =  generateHelper(row-1,col-1) + generateHelper(row-1,col);
        map.put(key,res);
        return map.get(key);
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for(int row=0;row<numRows;row++) {
            List<Integer> curr = new ArrayList<>();
            for(int col=0;col<=row;col++) {
                curr.add(generateHelper(row,col));
            }
            res.add(curr);
        }
        return res;
    }
}
