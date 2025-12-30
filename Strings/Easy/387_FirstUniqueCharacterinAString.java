class Solution {
    public int firstUniqChar(String s) {
        Queue<Integer> queue = new LinkedList<>();
        int [] freq = new int [256];
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            freq[c]++;
            queue.offer(i);
            while(!queue.isEmpty() && freq[s.charAt(queue.peek())]>1) {
                queue.poll();
            }
        }
        return queue.isEmpty() ? -1 : queue.peek();
    }
}