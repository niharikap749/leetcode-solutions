import java.util.*;
class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;
        int candidate = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums) {
            if(!set.contains(num)) set.add(num);
            else candidate = num;
        }
        return candidate;
    }
}