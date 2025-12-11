class Solution {
    public int majorityElementSolution1(int[] nums) {
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

    public int majorityElementSolution2(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums) {
            if(map.containsKey(num)) map.put(num,map.getOrDefault(num,0)+1);
            else map.put(num,1);
        }
        for(int num:nums) {
            if(map.get(num)>n/2) return num;
        }
        return -1;
    }
}
