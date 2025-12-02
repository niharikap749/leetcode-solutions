import java.util.*;

class Solution {
    HashMap<Integer,Integer> map = new HashMap<>();
    public int fibHelper(int n) {
        if(map.containsKey(n)) return map.get(n);
        if(n<=1) return n;
        int res = fibHelper(n-1) + fibHelper(n-2);
        map.put(n,res);
        return map.get(n);
    }
    public int fib(int n) {
        return fibHelper(n);
    }
}