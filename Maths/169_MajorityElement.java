class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int num:nums) {
            if(count==0) {
                candidate = num;
                count = 1;
            }
            else if(candidate==num) {
                count++;
            }
            else {
                count--;
            }
        }
        for(int num:nums) {
            if(candidate==num) count++;
        }
        if(count>nums.length/2) return candidate;
        return -1;
    }
}
