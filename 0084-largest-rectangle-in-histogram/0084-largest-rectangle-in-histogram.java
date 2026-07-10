class Solution {
    public int largestRectangleArea(int[] heights) {

        int [] prevSmaller=findPrevSmaller(heights);
        int [] nextSmaller=findNextSmaller(heights);

        for(int i=0;i<heights.length;i++){
            System.out.print(prevSmaller[i]);
            System.out.print("  "+nextSmaller[i]);
            System.out.println();
        }

        int max=0;
        for(int i=0;i<heights.length;i++){
            int area= (nextSmaller[i]-prevSmaller[i]-1) *heights[i];

            max=Math.max(max,area);
        }
        return max;

        
    }
    int[] findPrevSmaller(int []heights){
        int n=heights.length;
        int []prev= new int[n];
        Deque<Integer>stack= new ArrayDeque<>();

        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty())prev[i]=-1;
            else prev[i]=stack.peek();
            stack.push(i);

        }
        return prev;

    }
    int[] findNextSmaller(int []heights){
        int n=heights.length;
        int []next= new int[n];
        Deque<Integer>stack= new ArrayDeque<>();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty())next[i]=n;
            else next[i]=stack.peek();
            stack.push(i);

        }
        return next;

    }
}