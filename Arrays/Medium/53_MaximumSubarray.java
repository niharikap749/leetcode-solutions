class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int maxSum=nums[0];
        int i=0;
        while(i<nums.length){
            sum+=nums[i];
            i++;
            if(sum>maxSum){
                maxSum=sum;
            }if(sum<0) sum=0;
        }
        return maxSum;
    }
}