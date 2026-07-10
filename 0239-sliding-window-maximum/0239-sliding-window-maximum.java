class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>queue= new ArrayDeque<>();
        int []max= new int [nums.length-k+1];

        int low=0;int high=0;

        while(high<k){
           maintainMonotonicQueue(queue,nums,high);
            high++;
        }

        max[0]=queue.peek();
        int indx=1;

        while(high<nums.length){
            if(nums[low]==queue.peek()){
                queue.poll();
            }
            maintainMonotonicQueue(queue ,nums,high);
            max[indx++]=queue.peek();

            low++;
            high++;
        }
        return max;
        
    }
    void maintainMonotonicQueue(Deque<Integer>queue, int []nums,int high){
         while(!queue.isEmpty()&&queue.peekLast()<nums[high]){
                queue.pollLast();
            }
            queue.offer(nums[high]);

    }
}