class Solution {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(int num:nums) {
            pq.add((long) num);
        }
        int steps = 0;
        while(pq.peek()<k && pq.size()>=2) {
            long least = pq.poll();
            long secondLeast = pq.poll();
            long required = least * 2 + secondLeast;
            pq.add(required);
            steps++;
        }
        return steps;
    }
}