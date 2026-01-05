import java.util.*;
class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum = 0;
        int turns = 0;
        for(int i=happiness.length-1;i>=0 && turns<k;i--) {
            int curr = happiness[i]-turns;
            if(curr>0) {
                sum+=curr;
            }
            turns++;
        }
        return sum;
    }
}