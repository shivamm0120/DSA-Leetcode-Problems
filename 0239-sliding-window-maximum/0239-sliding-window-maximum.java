class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer>queue= new ArrayDeque<>();
        int []max= new int [nums.length-k+1];

        int low=0;int high=0;
        
        int indx=0;
        while(high<nums.length){
            if(!queue.isEmpty()&&queue.peek()<low)
              queue.poll();
            
            while(!queue.isEmpty()&& nums[queue.peekLast()]<=nums[high]){
                queue.pollLast();
            }
            queue.offer(high); 
           
            if(high-low+1< k){
                high++;
              continue;
            }
            max[indx++]=nums[queue.peek()];

            low++;
            high++;

        }
        return max;
    }
}