class Solution {
    public long subArrayRanges(int[] nums) {
        Deque<Integer>stack= new ArrayDeque<>();

        int[]leftGreater=findPrevGreater(stack,nums);
        stack.clear();
        int[]rightGreater=findNextGreater(stack,nums);
        stack.clear();
        int[]leftSmaller=findPrevSmaller(stack,nums);
        stack.clear();
        int[]rightSmaller=findNextSmaller(stack,nums);

        long sum=0;

        for(int i=0;i<nums.length;i++){
            long maxCount=(long)(i-leftGreater[i])*(rightGreater[i]-i);
            long minCount=(long)(i-leftSmaller[i])*(rightSmaller[i]-i);

            //contribution in sum
            sum+=(maxCount-minCount)*nums[i];
        }
        return sum;
    }

    int [] findPrevGreater(Deque<Integer>stack,int []nums){
        int []res= new int [nums.length];

        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i]){
                stack.pop();
            }
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }

   int[] findNextGreater(Deque<Integer>stack,int []nums){
        int []res= new int [nums.length];

        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]<=nums[i]){
                stack.pop();
            }
            res[i]=stack.isEmpty()?nums.length:stack.peek();
            stack.push(i);
        }
        return res;

    }

    int []findPrevSmaller(Deque<Integer>stack,int []nums){
        int []res= new int [nums.length];

        for(int i=0;i<nums.length;i++){
            while(!stack.isEmpty() && nums[stack.peek()]>nums[i]){
                stack.pop();
            }
            res[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        return res;
    }
   int[] findNextSmaller(Deque<Integer>stack,int []nums){
        int []res= new int [nums.length];

        for(int i=nums.length-1;i>=0;i--){
            while(!stack.isEmpty() && nums[stack.peek()]>=nums[i]){
                stack.pop();
            }
            res[i]=stack.isEmpty()?nums.length:stack.peek();
            stack.push(i);
        }
        return res;

    }
}