class Solution {
    public int findDuplicate(int[] nums) {

        //slow -fast pointer 
         // slow moves 1 step, fast moves 2 steps
        // treating array as linked list:
        // index = node, nums[index] = next pointer

        int slow=nums[0]; 
        int fast = nums[nums[0]];

        // Phase 1:
        // Find meeting point inside cycle
        while(fast!=slow){
            slow=nums[slow];        //move by 1 node 
            fast=nums[nums[fast]];  //move by 2 node



        }
        // Phase 2:
        // Put one pointer at start node (index 0)
         slow=0; 
          
        // Move both 1 step each
        // Where they meet = duplicate number
          while(fast!=slow){
                fast=nums[fast];
                slow=nums[slow];

                }
                

            
        return slow;//duplicate element
        
    }
}