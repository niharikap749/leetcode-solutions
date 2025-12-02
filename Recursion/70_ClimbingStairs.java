import  java.util.*;

class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        return climbStairsHelper(n);
    }
    public int climbStairsHelper(int n) { 
        
        if(map.containsKey(n)) {
            return map.get(n);
        }   
       if(n==0) {
        return 1;
       } 
       if(n<1) {
        return 0;
       }
       int res = climbStairsHelper(n-1) + climbStairsHelper(n-2);
       map.put(n,res);
       return map.get(n);
    }
}