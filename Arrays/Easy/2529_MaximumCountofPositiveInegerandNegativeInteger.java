class Solution {
    public int maximumCount(int[] nums) {
        int count = 0;
        int left = 0;
        int right = nums.length-1;
        int firstPos = nums.length;
        while(left<=right) {
            int mid = left+(right-left)/2;
            if(nums[mid]>0) {
                firstPos = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        left = 0;
         right = nums.length-1;
        int firstNeg = nums.length;
        while(left<=right) {
            int mid = left+(right-left)/2;
            if(nums[mid]>=0) {
                firstNeg = mid;
                right = mid-1;
            }
            else {
                left = mid+1;
            }
        }
        int neg = firstNeg;
        int pos = nums.length-firstPos;
        count = Math.max(neg,pos);
        return count;
    }
}