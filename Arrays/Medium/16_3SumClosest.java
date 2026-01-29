import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int closestSum = nums[0]+nums[1]+nums[2];
        for(int i=0;i<n-2;i++) {
            int left = i+1;
            int right = n-1;
            while(left<right) {
               int currSum = nums[i]+nums[left]+nums[right];
                if(Math.abs(closestSum-target)>Math.abs(currSum-target)) {
                  closestSum = currSum;
                }
                if(currSum<target) left++;
                else if(currSum>target) right--;
                else return currSum;
            }        
        }
        return closestSum;
    }
}