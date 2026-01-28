import java.util.*;
class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int maxPairSum = 0;
        int left = 0, right = n-1;
        while(left<right) {
            int sum = nums[left]+nums[right];
            maxPairSum = Math.max(sum,maxPairSum);
            left++;
            right--;
        }
        return maxPairSum;
    }
}