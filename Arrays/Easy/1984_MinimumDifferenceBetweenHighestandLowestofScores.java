import java.util.*;
class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff=Integer.MAX_VALUE;
        int left=0;
        int right=k-1;
        while(right<nums.length){
            int currDiff = nums[right]-nums[left];
            minDiff=Math.min(minDiff,currDiff);
            left++;
            right++;
        }
        return minDiff;
    }
}