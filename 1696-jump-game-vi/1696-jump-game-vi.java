class Solution {
    public int maxResult(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<Integer>();
        dq.offer(0);
        for(int i = 1; i < nums.length; ++i){
            if(dq.peekFirst() + k < i) dq.pollFirst();
            nums[i] += nums[dq.peekFirst()];
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) dq.pollLast();
            dq.addLast(i);
        }
        return nums[nums.length - 1];
    }
}